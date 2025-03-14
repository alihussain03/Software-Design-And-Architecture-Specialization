package Structural.CompoistePattern.example3;

import java.util.ArrayList;

public class Playlist implements IComponent {
    public String playlistName;
    public ArrayList<IComponent> playlist;

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
    }

    @Override
    public void play() {
        for (IComponent iComponent : playlist)
            iComponent.play();
    }

    @Override
    public void setPlaybackSpeed(float speed) {
        for (IComponent iComponent : playlist)
            iComponent.setPlaybackSpeed(speed);
    }

    @Override
    public String getName() {
        return playlistName;
    }

    public void add(IComponent iComponent) {
        playlist.add(iComponent);
    }

    public void remove(IComponent iComponent) {
        playlist.remove(iComponent);
    }
}
