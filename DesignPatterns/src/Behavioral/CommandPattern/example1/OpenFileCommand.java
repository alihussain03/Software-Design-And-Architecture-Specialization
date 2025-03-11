package Behavioral.CommandPattern.example1;

public class OpenFileCommand implements Command {
    private FileSystemReceiver fileSystemReceiver;

    public OpenFileCommand(FileSystemReceiver fs) {
        fileSystemReceiver = fs;
    }


    @Override
    public void execute() {
        this.fileSystemReceiver.openFile();
    }
}
