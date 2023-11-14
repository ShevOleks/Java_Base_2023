package ua.vodafone.lesson14;

public class RockMusic extends MusicStyles {
    public RockMusic(String team) {
        super(team);
    }

    @Override
    public void playMusic() {
        System.out.printf("\nThe %s plays only hard rock style", getTeam());
    }
}
