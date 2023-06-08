package command.command;

import command.MusicPlayer;

public class PlayNextTrack implements MusicPlayerCommand {

    private final MusicPlayer musicPlayer;

    public PlayNextTrack(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void play() {
        musicPlayer.playNextTrack();
    }
}