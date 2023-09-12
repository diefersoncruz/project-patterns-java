import interfaces.VideoPlayer;

public class Mp4Player implements VideoPlayer {
    @Override
    public void playVideo(String fileName) {
        System.out.println("Playing mp4. Name: "+ fileName);
    }
}