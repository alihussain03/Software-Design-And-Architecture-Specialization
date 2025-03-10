package Structural.AdapterPattern.example3_ObjectAdapter.adaptee;

public class AudioPlayer implements MediaPlayerInterface {
    @Override
    public void play(String audioType, String filename) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: " + filename);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
