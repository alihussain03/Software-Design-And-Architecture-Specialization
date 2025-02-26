package Structural.AdapterPattern.example3_ObjectAdapter.target;

public class Mp4Player implements AdvancedMediaPlayerInterface {
    private String fileName;

    @Override
    public void loadFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void listen() {
        System.out.println("Playing MP4 Media Player file. Name: " + fileName);
    }
}
