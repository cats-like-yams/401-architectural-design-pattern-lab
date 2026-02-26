package Adapter;

public class MediaAdapter implements MediaPlayer {
    private final UpdatedPlayer player;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("mp4")) {
            player = new Mp4Player();
        } else if (audioType.equalsIgnoreCase("vlc")) {
            player = new VlcPlayer();
        } else {
            throw new IllegalArgumentException("Unsupported audio type");
        }
    }

    public void play(String audioType, String fileName) {
        player.play(fileName);
    }
}
