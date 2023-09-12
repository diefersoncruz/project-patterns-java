import interfaces.VideoPlayer;

// Adaptees
public class VlcPlayer implements VideoPlayer {
    @Override
    public void playVideo(String fileName) {
// TODO Auto-generated method stub
        System.out.println("Playing vlc. Name: "+ fileName);
    }
}