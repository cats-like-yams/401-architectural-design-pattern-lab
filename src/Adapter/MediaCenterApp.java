package Adapter;

public class MediaCenterApp {
    private final MediaPlayer player;

    public MediaCenterApp(MediaPlayer player) {
        this.player = player;
    }

    public void playFile(String audioType, String fileName) {
        player.play(audioType, fileName);
    }
}
