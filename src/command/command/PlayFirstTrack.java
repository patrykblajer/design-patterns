package command.command;

import command.MusicPlayer;

public class PlayFirstTrack implements MusicPlayerCommand {

    private final MusicPlayer musicPlayer;

    public PlayFirstTrack(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void play() {
        musicPlayer.playFirstTrack();
    }
}