package ua.vodafone.lesson14;

public class ClassicMusic extends MusicStyles {
    public ClassicMusic(String team) {
        this.team = team;
    }

    @Override
    public void playMusic() {
        System.out.printf("\nNot every one loves classic music, but all loves %s", team);
    }
}
