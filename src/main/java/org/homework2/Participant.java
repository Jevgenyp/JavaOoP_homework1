package org.homework2;

abstract class Participant {
    protected String name;
    protected int maxRunDistance;
    protected int maxJumpHeight;

    public Participant(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    // Метод бега
    public boolean run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(this + " успешно пробежал " + distance + " м");
            return true;
        } else {
            System.out.println(this + " не смог пробежать " + distance + " м");
            return false;
        }
    }

    // Метод прыжка
    public boolean jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(this + " успешно перепрыгнул " + height + " м");
            return true;
        } else {
            System.out.println(this + " не смог перепрыгнуть " + height + " м");
            return false;
        }
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + name;
    }

    public String getName() {
        return name;
    }
}
