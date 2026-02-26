package Adapter;

public class VlcPlayer implements UpdatedPlayer {
    public void play(String fileName){
        System.out.println("Playing Vlc file: " + fileName);
    }
}
