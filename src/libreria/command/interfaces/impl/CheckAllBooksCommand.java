package libreria.command.interfaces.impl;

import libreria.command.interfaces.interfaces.command;
import libreria.model.Catalogo;

import java.util.Scanner;

public class CheckAllBooksCommand implements command {

    private Catalogo catalogo;
    private Scanner scan;

    public void setCatalogo(Catalogo catalogo) {
        this.catalogo = catalogo;
    }

    public void setScan(Scanner scan) {
        this.scan = scan;
    }

    // costr
    public CheckAllBooksCommand(Scanner scan, Catalogo catalogo) {
        setCatalogo(catalogo);
        setScan(scan);
    }


    @Override
    public void execute() {
        catalogo.VisualizzaTuttiLibri();
    }
}
