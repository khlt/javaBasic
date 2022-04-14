package Behavioral.Template;

public class PlayerLevelEx {

    public static void main(String[] args) {

        Player player = new Player();
        player.play(1);

        player.levelUp(new IntermediatePlayerLevel());
        player.play(2);

        player.levelUp(new AdvancedPlayerLevel());
        player.play(3);
    }

}
