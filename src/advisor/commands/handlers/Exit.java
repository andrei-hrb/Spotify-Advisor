package advisor.commands.handlers;

import advisor.program.Program;
import advisor.commands.Command;

public class Exit extends Command {

    public Exit() {
        this.setName("---GOODBYE!---");
        this.setRegex("exit");
    }

    @Override
    public void run() {
        Program program = Program.getInstance();

        System.out.println(this.getName());

        program.exit();
    }
}
