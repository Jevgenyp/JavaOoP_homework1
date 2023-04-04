package org.homework3.sem3;

public interface Game {

    void start(Integer sizeWord, Integer maxTry);
    Answer inputAnswer(String value);
    GameStatus getGameStatus();


    String getLog();

}