package advisor.commands.handlers;

import advisor.commands.Command;

public class Featured extends Command {

    public Featured() {
        this.setName("---FEATURED---");
        this.setRegex("featured");
        this.setAuth(true);
    }

    @Override
    public void run() {
        super.run();

        System.out.println("""
                Mellow Morning
                Wake Up and Smell the Coffee
                Monday Motivation
                Songs to Sing in the Shower""");
    }
}
