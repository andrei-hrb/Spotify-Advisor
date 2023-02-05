package advisor.commands.handlers;

import advisor.commands.Command;

public class New extends Command {

    public New() {
        this.setName("---NEW RELEASES---");
        this.setRegex("new");
    }

    @Override
    public void run() {
        System.out.println(this.getName());
        System.out.println("""
                Mountains [Sia, Diplo, Labrinth]
                Runaway [Lil Peep]
                The Greatest Show [Panic! At The Disco]
                All Out Life [Slipknot]""");
    }
}
