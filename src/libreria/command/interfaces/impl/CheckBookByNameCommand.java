package libreria.command.interfaces.impl;

import libreria.command.interfaces.interfaces.command;
import libreria.exceptions.InputNonValidoExcep;
import libreria.model.Catalogo;

import java.util.Scanner;

public class CheckBookByNameCommand implements command {

    private Scanner scan;
    private Catalogo catalogo;
    private boolean corretto;

    public CheckBookByNameCommand(Scanner scan, Catalogo catalogo) {
        setCatalogo(catalogo);
        setScan(scan);
        setCorretto(false);
    }

    public void setCorretto(boolean corretto) {
        this.corretto = corretto;
    }

    public void setCatalogo(Catalogo catalogo) {
        this.catalogo = catalogo;
    }

    public void setScan(Scanner scan) {
        this.scan = scan;
    }

    @Override
    public void execute() {
        
        setCorretto(false);

        do {
            try {
                System.out.println("inserisci nome libro.");

                String nomeLib = scan.nextLine();
                String esito = catalogo.LookForLibro(nomeLib);
                System.out.println(esito);
                setCorretto(true);
            } catch (InputNonValidoExcep ex) {
                throw new InputNonValidoExcep("input non valido");
            }
        } while (!corretto);


    }
}
