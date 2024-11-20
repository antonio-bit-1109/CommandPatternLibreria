package libreria.command.interfaces.impl;

import libreria.command.interfaces.interfaces.command;

public class ExitCommand implements command {

    public ExitCommand() {
    }

    @Override
    public void execute() {
        System.out.println("ARRIVEDERCI!");
        System.exit(0);
    }

}
