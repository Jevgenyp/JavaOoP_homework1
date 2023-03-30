package org.homework2;

public class Wall extends Obstacle {
    private Participant competitor;

    public Wall(int height) {
        super(height, 0);
    }

    @Override
    public void run(Participant competitor) {

    }

    @Override
    public void jump(Participant competitor) {


        if (competitor.jump(getHeight())) {
            System.out.println(competitor + " успешно перепрыгнул стену высотой " + getHeight() + " метров");
        } else {
            System.out.println(competitor + " не смог перепрыгнуть стену высотой " + getHeight() + " метров");
        }
    }
}



