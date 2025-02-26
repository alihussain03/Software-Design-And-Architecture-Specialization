package Structural.AdapterPattern.example3_ObjectAdapter;

import Structural.AdapterPattern.example3_ObjectAdapter.adaptee.AudioPlayer;
import Structural.AdapterPattern.example3_ObjectAdapter.adaptee.MediaPlayerInterface;
import Structural.AdapterPattern.example3_ObjectAdapter.target.Mp4Player;
import Structural.AdapterPattern.example3_ObjectAdapter.target.VlcPlayer;
import Structural.AdapterPattern.example3_ObjectAdapter.adapter.AdvancedMediaPlayerAdapter;
import Structural.AdapterPattern.example3_ObjectAdapter.target.AdvancedMediaPlayerInterface;

public class Client {
    public static void main(String[] args) {
        MediaPlayerInterface audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "a.mp3");

        AdvancedMediaPlayerInterface mp4Player = new Mp4Player();
        MediaPlayerInterface advancedMediaPlayerAdapter1 = new AdvancedMediaPlayerAdapter(mp4Player);
        advancedMediaPlayerAdapter1.play("mp4", "alone.mp4");

        AdvancedMediaPlayerInterface vlcPlayer = new VlcPlayer();
        MediaPlayerInterface advancedMediaPlayerAdapter2 = new AdvancedMediaPlayerAdapter(vlcPlayer);
        advancedMediaPlayerAdapter2.play("vlc", "far far away.vlc");

        audioPlayer.play("vlc", "far far away.vlc");
    }
}
