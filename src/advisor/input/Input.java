package advisor.input;

import java.util.Scanner;

public class Input {

    private static Input input = null;

    private String text;

    private Scanner scanner;

    private Input() {
        this.scanner = new Scanner(System.in);
    }

    public static Input getInstance() {
        if (input == null) {
            input = new Input();
        }

        return input;
    }

    public String getInput() {
        return this.text;
    }

    public String getData() {
        String[] parts = this.text.split(" ", 2);

        return parts[1];
    }

    public void scanInput() {
        this.text = this.scanner.nextLine();
    }
}
