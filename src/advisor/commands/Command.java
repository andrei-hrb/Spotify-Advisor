package advisor.commands;

import advisor.program.Program;

public class Command {

    private String before;

    private String regex;

    private boolean auth = false;

    public String getBefore() {
        return this.before;
    }

    public void setBefore(String before) {
        this.before = before;
    }

    public String getRegex() {
        return this.regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }

    public boolean hasAuth() {
        return this.auth;
    }

    public void setAuth(boolean auth) {
        this.auth = auth;
    }

    public void run() throws Exception {
        if (this.hasAuth() && !Program.getInstance().isLoggedIn()) {
            throw new Exception("Please, provide access for application.");
        }

        System.out.println(this.getBefore());
    }
}
