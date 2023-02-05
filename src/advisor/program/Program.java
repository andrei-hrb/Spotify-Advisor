package advisor.program;

public class Program {

    private static Program program = null;

    private boolean running;

    private Program() {
        this.running = true;
    }

    public static Program getInstance() {
        if (program == null) {
            program = new Program();
        }

        return program;
    }

    public boolean isRunning() {
        return this.running;
    }

    public void exit() {
        this.running = false;
    }
}
