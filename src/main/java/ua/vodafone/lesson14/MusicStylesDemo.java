package ua.vodafone.lesson14;

public class MusicStylesDemo {
    public static void main(String[] args) {
        MusicStyles[] teams = {
                new PopMusic("ABBA"),
                new RockMusic("HIM"),
                new ClassicMusic("Vanessa Mae")
        };
        for (MusicStyles team: teams) {
            team.playMusic();
        }

    }
}
