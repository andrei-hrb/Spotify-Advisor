package advisor.commands.handlers;

import advisor.commands.Command;
import advisor.program.Program;

public class Exit extends Command {

    public Exit() {
        this.setBefore("---GOODBYE!---");
        this.setRegex("exit");
    }

    @Override
    public void run() throws Exception {
        super.run();

        Program program = Program.getInstance();

        program.exit();
    }
}
