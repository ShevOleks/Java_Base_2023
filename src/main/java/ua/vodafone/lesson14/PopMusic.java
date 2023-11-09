package ua.vodafone.lesson14;

public class PopMusic extends MusicStyles {
    public PopMusic(String team) {
        this.team = team;
    }

    @Override
    public void playMusic() {
        System.out.printf("\nThe %s usually plays simple POP-style", team);
    }
}
