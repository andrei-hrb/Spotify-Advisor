package advisor.commands.handlers;

import advisor.commands.Command;

public class Categories extends Command {

    public Categories() {
        this.setBefore("---CATEGORIES---");
        this.setRegex("categories");
        this.setAuth(true);
    }

    @Override
    public void run() {
        System.out.println("""
                Top Lists
                Pop
                Mood
                Latin""");
    }
}
