package advisor.commands;

public class Command {

    private String name;

    private String regex;

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

    public void run() {
        return;
    }
}
