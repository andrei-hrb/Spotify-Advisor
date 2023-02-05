package advisor.commands.handlers;

import advisor.commands.Command;

public class Featured extends Command {

    public Featured() {
        this.setName("---FEATURED---");
        this.setRegex("featured");
    }

    @Override
    public void run() {
        System.out.println(this.getName());
        System.out.println("""
                Mellow Morning
                Wake Up and Smell the Coffee
                Monday Motivation
                Songs to Sing in the Shower""");
    }
}
