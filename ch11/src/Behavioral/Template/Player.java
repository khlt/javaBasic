package Behavioral.Template;
//Template : 공통 메소드를 상위 클래스에서 정의, 세부 사항은 하위 클래스에서 구현하는 패턴
public class Player {
    private PlayerLevel level;

    public Player() {
        
        level = new BeginnerPlayerLevel();
        System.out.println("플레이어가 생성되었습니다.");
        level.showLevelInfo();
    }

    public void play(int count) {
        level.go(count);
    }

    public void levelUp(PlayerLevel level) {

        this.level = level;
        System.out.println("Level Up!!");
        this.level.showLevelInfo();
    }
}