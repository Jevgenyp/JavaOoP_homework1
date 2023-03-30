package org.homework2;

public abstract class Obstacle {
    private final int length;
    private final int height;

    public Obstacle(int length, int height) {
        this.length = length;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public abstract void run(Participant competitor);

    public abstract void jump(Participant competitor);


}
