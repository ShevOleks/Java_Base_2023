package ua.vodafone.lesson14;

public class PopMusic extends MusicStyles {
    public PopMusic(String team) {
        super(team);
    }

    @Override
    public void playMusic() {
        System.out.printf("\nThe %s usually plays simple POP-style", getTeam());
    }
}
