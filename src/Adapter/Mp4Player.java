package Adapter;

public class Mp4Player implements UpdatedPlayer {
    public void play(String fileName){
        System.out.println("Playing mp4 file: " + fileName);
    }
}
