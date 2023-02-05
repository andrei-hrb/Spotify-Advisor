package advisor.commands.handlers;

import advisor.commands.Command;

public class Categories extends Command {

    public Categories() {
        this.setName("---CATEGORIES---");
        this.setRegex("categories");
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
