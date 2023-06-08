package command.command;

import command.MusicPlayer;

public class PlayRandomTrack implements MusicPlayerCommand {

    private final MusicPlayer musicPlayer;

    public PlayRandomTrack(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void play() {
        musicPlayer.playRandomTrack();
    }
}