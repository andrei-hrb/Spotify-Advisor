package advisor.commands;

public class Commands {

    private int size = 0;

    private Command[] commands;

    public void addCommand(Command command) {
        Command[] tempCommands = new Command[this.size + 1];
        for (int i = 0; i < this.size; i++) {
            tempCommands[i] = this.commands[i];
        }
        tempCommands[this.size] = command;
        this.commands = tempCommands;

        this.size++;
    }

    public void run(String name) throws Exception {
        for (Command command : this.commands) {
            if (name.matches(command.getRegex())) {
                command.run();
                return;
            }
        }

        throw new Exception("Command doesn't exists.");
    }
}
