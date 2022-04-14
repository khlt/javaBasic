package Behavioral.Template;

public class AdvancedPlayerLevel extends PlayerLevel {

    @Override
    protected void walk() {
        System.out.println("빠르게 걷습니다.");
    }

    @Override
    protected void run() {
        System.out.println("보통 속도로 달립니다.");
    }

    @Override
    protected void jump() {
        System.out.println("보통 높이로 점프합니다.");
    }

    @Override
    protected void showLevelInfo() {
        System.out.println("===== Advanced 레벨입니다. =====");
    }
}