package advisor;

import advisor.commands.Commands;
import advisor.commands.handlers.*;
import advisor.input.Input;
import advisor.program.Program;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Program program = Program.getInstance();

        Commands commands = new Commands();
        commands.addCommand(new New());
        commands.addCommand(new Featured());
        commands.addCommand(new Categories());
        commands.addCommand(new Playlists());
        commands.addCommand(new Exit());

        Input input = Input.getInstance();

        while(program.isRunning()) {
            input.scanInput();

            try {
                commands.run(input.getInput());
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
    }
}
