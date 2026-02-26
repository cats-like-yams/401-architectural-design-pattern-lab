package Adapter;

public class Demo {
    public static void main(String[] args) {
        MediaCenterApp vlcCenter = new MediaCenterApp(new MediaAdapter("vlc"));
        vlcCenter.playFile("vlc", "concert.vlc");

        MediaCenterApp mp4center = new MediaCenterApp(new MediaAdapter("mp4"));
        mp4center.playFile("mp4", "movie.mp4");
    }
}
