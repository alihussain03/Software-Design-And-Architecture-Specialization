package Structural.AdapterPattern.example3_ObjectAdapter.target;

public class VlcPlayer implements AdvancedMediaPlayerInterface {
    private String fileName;

    @Override
    public void loadFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void listen() {
        System.out.println("Playing VLC Media Player file. Name: " + fileName);
    }
}
