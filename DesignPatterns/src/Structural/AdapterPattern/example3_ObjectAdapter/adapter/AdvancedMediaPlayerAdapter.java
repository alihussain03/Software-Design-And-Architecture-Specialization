package Structural.AdapterPattern.example3_ObjectAdapter.adapter;

import Structural.AdapterPattern.example3_ObjectAdapter.adaptee.MediaPlayerInterface;
import Structural.AdapterPattern.example3_ObjectAdapter.target.AdvancedMediaPlayerInterface;

public class AdvancedMediaPlayerAdapter implements MediaPlayerInterface {
    AdvancedMediaPlayerInterface advanceMediaPlayer;

    public AdvancedMediaPlayerAdapter(AdvancedMediaPlayerInterface advanceMediaPlayer) {
        this.advanceMediaPlayer = advanceMediaPlayer;
    }

    @Override
    public void play(String audioType, String fileName) {
        advanceMediaPlayer.loadFileName(fileName);
        advanceMediaPlayer.listen();
    }
}
