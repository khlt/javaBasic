package Behavioral.Template;

public abstract class PlayerLevel {

    protected abstract void walk();
    protected abstract void run();
    protected abstract void jump();
    protected abstract void showLevelInfo();

    public final void go(int count) {// 템플릿 메소드

        walk();
        run();
        for (int i=0; i<count; i++) {
            jump();
        }
    }
}