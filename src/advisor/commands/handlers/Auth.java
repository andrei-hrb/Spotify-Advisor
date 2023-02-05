package advisor.commands.handlers;

import advisor.commands.Command;
import advisor.program.Program;

public class Auth extends Command {

    public Auth() {
        this.setBefore("""
                https://accounts.spotify.com/authorize?client_id=a19ee7dbfda443b2a8150c9101bfd645&redirect_uri=http://localhost:8080&response_type=code
                ---SUCCESS---""");
        this.setRegex("auth");
    }

    @Override
    public void run() throws Exception {
        super.run();

        Program.getInstance().setLoggedIn(true);
    }
}
