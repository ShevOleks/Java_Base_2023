package ua.vodafone.lesson14;

public abstract class MusicStyles {
    private final String team;

    public MusicStyles(String team) {
        this.team = team;
    }

    public String getTeam() {
        return team;
    }

    public abstract void playMusic();
}
