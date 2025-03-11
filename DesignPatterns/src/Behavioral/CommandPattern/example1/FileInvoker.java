package Behavioral.CommandPattern.example1;

public class FileInvoker {

    public Command command;

    public FileInvoker(Command command) {
        this.command = command;
    }

    public void execute() {
        command.execute();
    }
}
