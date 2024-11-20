package libreria.shell;

import libreria.command.interfaces.impl.AddLibroCommand;
import libreria.command.interfaces.impl.CheckAllBooksCommand;
import libreria.command.interfaces.impl.CheckBookByNameCommand;
import libreria.command.interfaces.impl.ExitCommand;
import libreria.command.interfaces.interfaces.command;
import libreria.model.Catalogo;
import libreria.model.Libro;

import java.util.HashMap;
import java.util.Scanner;

public class ShellController {

    private Scanner scan;
    private HashMap<String, command> commandMap;
    private Catalogo catalogo;

    public ShellController() {
        setScan();
        setCatalogo(InitializeBooks());
        setCommandMap(catalogo, scan);
    }

    // libri default presenti in libreria
    private Libro[] InitializeBooks() {
        Libro l1 = new Libro("bombolo", "bombolo", 1999);
        Libro l2 = new Libro("bombolo 2", "bombolo 2", 1999);
        Libro[] arr = new Libro[2];
        arr[0] = l1;
        arr[1] = l2;
        return arr;
    }

    public void setScan() {
        this.scan = new Scanner(System.in);
    }

    public void setCatalogo(Libro... lib) {
        this.catalogo = new Catalogo();
        this.catalogo.setArrLibri(lib);
    }


    public void setCommandMap(Catalogo catalogo, Scanner scan) {
        this.commandMap = new HashMap<String, command>();
        this.commandMap.put("1", new CheckBookByNameCommand(scan, catalogo));
        this.commandMap.put("2", new CheckAllBooksCommand(scan, catalogo));
        this.commandMap.put("3", new AddLibroCommand(scan, catalogo));
        this.commandMap.put("4", new ExitCommand());
    }

    public void StartPoint() {
        //while (true) {
        System.out.println("********************");
        System.out.println("GESTIONE CATALOGO LIBRI");
        System.out.println("********************");
        System.out.println();
        System.out.println("1- Cerca un libro per titolo");
        System.out.println("2- Visualizza tutti i libri");
        System.out.println("3- Aggiungi un libro");
        System.out.println("4- Esci");
        System.out.println();

        String val = scan.nextLine();
        HandleSceltaShell(val);
    }


    private void HandleSceltaShell(String input) {
        command c = this.commandMap.get(input);
        c.execute();
        StartPoint(); // richiamo ricorsivo su startPoint quando execute termina
    }
}
