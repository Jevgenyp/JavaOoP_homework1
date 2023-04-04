package org.homework3.sem3;

import java.util.Scanner;

public class RunApplication {
    public static void main(String[] args) {
        boolean playAgain = true;
        Scanner in = new Scanner(System.in);

        while (playAgain) {
            System.out.println("1 - Числа");
            System.out.println("2- Слова EN");
            System.out.println("3- Слова RU");
            System.out.println("Выберите игру");
            int choice = in.nextInt();
            Game game = null;
            switch (choice) {
                case 1:
                    game = new NumberGame();
                    break;
                case 2:
                    game = new WordGame();
                    break;
                case 3:
                    game = new WordRussianGame();
                    break;
                default:
                    System.out.println("Нет такой игры");
                    break;
            }


            if (game != null) {

                game.start(4, 2);
                System.out.println(((AbstractGame) game).getLog());
                System.out.println("Хотите сыграть еще раз? (y/n)");
                String answer = in.next();
                if (game instanceof AbstractGame & answer.equals("n")) {
                    ((AbstractGame) game).exit();
                    playAgain = answer.equalsIgnoreCase("y");
                }
            }

        }
    }
}
