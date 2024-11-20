package libreria;

import libreria.shell.ShellController;


public class Main {

    public static void main(String[] args) {

        ShellController shell = new ShellController();
        shell.StartPoint();
    }
//
//
//        Libro l1 = new Libro("il cane bello", "antonio", 1999);
//        Libro l2 = new Libro("il pescatore", "marcello", 1999);
//        Libro l3 = new Libro("savino il biondo", "francesco", 2006);
//        Libro l4 = new Libro("il cane bello 2", "qualcuno", 2043);
//        Libro l5 = new Libro("il cane bello la vendetta", "cao", 1746);
//
//        catalogo = new Catalogo();
//        catalogo.setArrLibri(l1, l2, l3, l4, l5);
//        SceltaUtente();
//    }
//
//    private static void SceltaUtente() throws InterruptedException {
//
//        Thread.sleep(1000);
//        //while (true) {
//        System.out.println("********************");
//        System.out.println("GESTIONE CATALOGO LIBRI");
//        System.out.println("********************");
//        System.out.println();
//        System.out.println("1- Cerca un libro per titolo");
//        System.out.println("2- Visualizza tutti i libri");
//        System.out.println("3- Aggiungi un libro");
//        System.out.println("4- Esci");
//
//        String val = scan.nextLine();
//
//        try {
//            switch (val) {
//                case "1":
//                    CercaLibro();
//                    break;
//                case "2":
//                    VisualizzaTuttiLIbri();
//                    break;
//                case "3":
//                    AggiungiLIbro();
//                    break;
//                case "4":
//                    Esci();
//                    break;
//                default:
//                    throw new InputNonValidoExcep("input non valido. Riprova");
//            }
//        } catch (RuntimeException ex) {
//            System.out.println("Errore: " + ex.getMessage());
//        }
//        //}
//    }
//
//    private static void Esci() {
//        System.out.println("ARRIVEDERCI!");
//        System.exit(0);
//    }
//
//    private static void AggiungiLIbro() {
//
//        String nome = "";
//        String autore = "";
//        String annoPub = "";
//
//
//        while (!corretto) {
//
//            try {
//
//                System.out.println("inserisci dati libro:");
//
//                while (!corretto) {
//                    System.out.println("inserisci nome:");
//                    nome = scan.nextLine();
//                    corretto = true;
//                }
//
//                corretto = false;
//
//                while (!corretto) {
//                    System.out.println("Inserisci autore");
//                    autore = scan.nextLine();
//                    corretto = true;
//                }
//
//                corretto = false;
//
//                while (!corretto) {
//                    System.out.println("inserisci anno Pubblicazione:");
//                    annoPub = scan.nextLine();
//
//                    RuntimeException res = HandleException(annoPub);
//                    if (res != null) {
//                        throw res;
//                    }
//
//                    corretto = true;
//                }
//
//                if (nome.isEmpty()) {
//                    throw new NullPointerException("nome è null.");
//                }
//                if (autore.isEmpty()) {
//                    throw new NullPointerException("autore è null.");
//                }
//                if (annoPub.isEmpty()) {
//                    throw new NullPointerException("l'anno di pubblicazione è null.");
//                }
//
//
//                Libro newLibro = new Libro(nome, autore, Integer.parseInt(annoPub));
//
//                catalogo.AggiungiLibro(newLibro);
//                SceltaUtente();
////            System.out.println(esito);
//
//            } catch (RuntimeException | InterruptedException ex) {
//                corretto = false;
//                System.out.println("input non valido: " + ex.getMessage());
//                System.out.println("premi enter per continuare");
//                scan.nextLine();
//            }
//        }
//    }
//
//    private static void CercaLibro() {
//        try {
//            System.out.println("inserisci nome libro.");
//
//            String nomeLib = scan.nextLine();
//            String esito = catalogo.LookForLibro(nomeLib);
//            System.out.println(esito);
//            SceltaUtente();
//        } catch (InputNonValidoExcep | InterruptedException ex) {
//            throw new InputNonValidoExcep("input non valido");
//        }
//    }
//
//    private static void VisualizzaTuttiLIbri() throws InterruptedException {
//        catalogo.VisualizzaTuttiLibri();
//        SceltaUtente();
//    }
//
//    private static boolean IsParsable(String v) {
//        try {
//            Integer.parseInt(v);
//            return true;
//        } catch (NumberFormatException ex) {
//            return false;
//        }
//    }

//    public static RuntimeException HandleException(String input) {
//
//        if (!IsParsable(input)) {
//            return new NumberFormatException("anno pubblicazione libro, valore inaccettabile.");
//        }
//
//        if (Integer.parseInt(input) < 1500) {
//            return new DataNonReal("inserisci una data verosimile. Maggiore di 1500");
//        }
//        return null;
//    }
}