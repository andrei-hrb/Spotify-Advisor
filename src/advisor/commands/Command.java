package advisor.commands;

public class Command {

    private String name;

    private String regex;

    private boolean auth = false;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
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

    public void run() {
        System.out.println(this.getName());


    }
}
