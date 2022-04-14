package Behavioral.Template;

public class IntermediatePlayerLevel extends PlayerLevel {

    @Override
    protected void walk() {
        System.out.println("보통 속도로 걷습니다.");
    }

    @Override
    protected void run() {
        System.out.println("천천히 달립니다.");
    }

    @Override
    protected void jump() {
        System.out.println("IntermediatePlayer는 점프할 수 없습니다.");
    }

    @Override
    protected void showLevelInfo() {
        System.out.println("===== Intermediate 레벨입니다. =====");
    }
}