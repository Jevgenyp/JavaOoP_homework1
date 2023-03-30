package org.homework2;

public class Treadmill extends Obstacle {
    public Treadmill(int length) {
        super(length, 0);
    }

    @Override
    public void run(Participant competitor) {
        if (competitor.run(getLength())) {
            System.out.println(competitor + " успешно пробежал дорожку длиной " + getLength() + " м");
        } else {
            System.out.println(competitor + " не смог пробежать дорожку длиной " + getLength() + " м и выбывает из соревнования");

        }
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



