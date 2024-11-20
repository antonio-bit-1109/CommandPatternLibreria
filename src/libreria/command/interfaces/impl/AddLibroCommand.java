package libreria.command.interfaces.impl;

import libreria.command.interfaces.interfaces.command;
import libreria.exceptions.DataNonReal;
import libreria.model.Catalogo;
import libreria.model.Libro;

import java.util.Scanner;

public class AddLibroCommand implements command {

    private Catalogo catalogo;
    private Scanner scan;
    private static boolean corretto;

    public AddLibroCommand(Scanner scanner, Catalogo cata) {
        setCatalogo(cata);
        setScan(scanner);
        setCorretto(false);
    }


    public void setCatalogo(Catalogo catalogo) {
        this.catalogo = catalogo;
    }

    public void setScan(Scanner scan) {
        this.scan = scan;
    }

    public static void setCorretto(boolean corretto) {
        AddLibroCommand.corretto = corretto;
    }

    @Override
    public void execute() {


        String nome = "";
        String autore = "";
        String annoPub = "";


        while (!corretto) {

            try {

                System.out.println("inserisci dati libro:");

                while (!corretto) {
                    System.out.println("inserisci nome:");
                    nome = scan.nextLine();
                    corretto = true;
                }

                corretto = false;

                while (!corretto) {
                    System.out.println("Inserisci autore");
                    autore = scan.nextLine();
                    corretto = true;
                }

                corretto = false;

                while (!corretto) {
                    System.out.println("inserisci anno Pubblicazione:");
                    annoPub = scan.nextLine();

                    RuntimeException res = HandleException(annoPub);
                    if (res != null) {
                        throw res;
                    }

                    corretto = true;
                }

                if (nome.isEmpty()) {
                    throw new NullPointerException("nome è null.");
                }
                if (autore.isEmpty()) {
                    throw new NullPointerException("autore è null.");
                }
                if (annoPub.isEmpty()) {
                    throw new NullPointerException("l'anno di pubblicazione è null.");
                }


                Libro newLibro = new Libro(nome, autore, Integer.parseInt(annoPub));

                catalogo.AggiungiLibro(newLibro);

            } catch (RuntimeException ex) {
                corretto = false;
                System.out.println("input non valido: " + ex.getMessage());
                System.out.println("premi enter per continuare");
                scan.nextLine();
            }
        }
    }

    private RuntimeException HandleException(String input) {

        if (!IsParsable(input)) {
            return new NumberFormatException("anno pubblicazione libro, valore inaccettabile.");
        }

        if (Integer.parseInt(input) < 1500) {
            return new DataNonReal("inserisci una data verosimile. Maggiore di 1500");
        }
        return null;
    }


    private boolean IsParsable(String v) {
        try {
            Integer.parseInt(v);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
}
