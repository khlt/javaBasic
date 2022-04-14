package Behavioral.Template;

public class BeginnerPlayerLevel extends PlayerLevel {

    @Override
    protected void walk() {
        System.out.println("천천히 걷습니다.");
    }

    @Override
    protected void run() {
        System.out.println("BeginnerPlayer는 달릴 수 없습니다.");
    }

    @Override
    protected void jump() {
        System.out.println("BeginnerPlayer는 점프할 수 없습니다.");
    }

    @Override
    protected void showLevelInfo() {
        System.out.println("===== Beginner 레벨입니다. =====");
    }
}