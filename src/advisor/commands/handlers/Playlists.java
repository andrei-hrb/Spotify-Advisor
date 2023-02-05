package advisor.commands.handlers;

import advisor.commands.Command;
import advisor.input.Input;

public class Playlists extends Command {

    private String playlist;

    public Playlists() {
        this.setRegex("playlists .*");
        this.setAuth(true);
    }

    @Override
    public void run() {
        this.setPlaylist(Input.getInstance().getData());

        super.run();

        System.out.println("""
                Walk Like A Badass
                Rage Beats
                Arab Mood Booster
                Sunday Stroll""");
    }

    public String getPlaylist() {
        return this.playlist;
    }

    public void setPlaylist(String playlist) {
        this.playlist = playlist;

        this.setName("---" + this.playlist.toUpperCase() + " PLAYLISTS---");
    }
}
