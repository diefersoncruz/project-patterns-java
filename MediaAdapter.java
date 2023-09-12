import interfaces.AudioPlayer;
import interfaces.VideoPlayer;

// Adapter
public class MediaAdapter implements AudioPlayer, VideoPlayer {
    VideoPlayer videoPlayer;
    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc") ){
            videoPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")){
            videoPlayer = new Mp4Player();
        }
    }
    @Override
    public void play(String audioType, String fileName) {
        playVideo(fileName);
    }
    @Override
    public void playVideo(String fileName) {
        videoPlayer.playVideo(fileName);
    }
}