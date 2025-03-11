package Behavioral.CommandPattern.example1;

public class CloseFileCommand implements Command {
    private FileSystemReceiver fileSystemReceiver;

    public CloseFileCommand(FileSystemReceiver fs) {
        fileSystemReceiver = fs;
    }


    @Override
    public void execute() {
        this.fileSystemReceiver.closeFile();
    }
}
