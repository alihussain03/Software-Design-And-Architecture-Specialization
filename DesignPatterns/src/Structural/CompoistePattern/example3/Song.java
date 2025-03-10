package Structural.CompoistePattern.example3;

public class Song implements IComponent {
    public String songName;
    public String artist;
    public float speed = 1;

    public Song(String songName, String artist) {
        this.songName = songName;
        this.artist = artist;
    }

    @Override
    public void play() {
        System.out.println("Sons is playing");
    }

    @Override
    public void setPlaybackSpeed(float speed) {
        this.speed = speed;
    }

    @Override
    public String getName() {
        return songName;
    }

    public String getArtist() {
        return artist;
    }
}
