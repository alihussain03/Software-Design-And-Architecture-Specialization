package Behavioral.CommandPattern.example1;

public class WindowFilesSystemReceiver implements FileSystemReceiver {
    @Override
    public void openFile() {
        System.out.println("Window open file system receiver");
    }

    @Override
    public void writeFile() {
        System.out.println("Window write file system receiver");
    }

    @Override
    public void closeFile() {
        System.out.println("Window close file system receiver");
    }
}
