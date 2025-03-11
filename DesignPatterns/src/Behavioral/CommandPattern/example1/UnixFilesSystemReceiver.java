package Behavioral.CommandPattern.example1;

public class UnixFilesSystemReceiver implements FileSystemReceiver {
    @Override
    public void openFile() {
        System.out.println("Unix open file system receiver");
    }

    @Override
    public void writeFile() {
        System.out.println("Unix write file system receiver");
    }

    @Override
    public void closeFile() {
        System.out.println("Unix close file system receiver");
    }
}
