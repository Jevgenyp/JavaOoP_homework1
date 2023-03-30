package org.homework2;
////Домашнее задание на закрепление :
////
////1)Создайте три класса: Человек, Кот, Робот, которые не наследуются от одного класса. Эти классы должны уметь бегать и прыгать, все также с выводом информации о действии в консоль.
////2) Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники
////должны выполнять соответствующие действия (бежать или прыгать), результат выполнения
////печатаем в консоль (успешно пробежал, не смог пробежать и т.д.). У препятствий есть длина
////(для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
////3) Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти
////этот набор препятствий. Если участник не смог пройти одно из препятствий, то дальше по
////списку он препятствий не идет.

public class Main {
    public static void main(String[] args) {
        // Создаем массив участников
        Participant[] participants = {new Human("John", 500, 2),
                new Cat("Barsik", 300, 3),
                new Robot("Robo", 1000, 1)};

        // Создаем массив препятствий
        Obstacle[] obstacles = new Obstacle[3];
        obstacles[0] = new Treadmill(1000);
        obstacles[1] = new Wall(2);
        obstacles[2] = new Wall(5);


        // Проходимся по всем участникам и препятствиям
        for (Participant participant : participants) {
            boolean isFailed = false; // флаг для проверки провала участника

            for (Obstacle obstacle : obstacles) {
                if (obstacle instanceof Treadmill) {
                    if (!participant.run(obstacle.getLength())) {
                        isFailed = true;
                        System.out.println(participant.getName() + " не смог пробежать дистанцию " + obstacle.getLength() + " метров.");
                        break;
                    } else {
                        System.out.println(participant.getName() + " успешно пробежал дистанцию " + obstacle.getLength() + " метров.");
                    }
                } else if (obstacle instanceof Wall) {
                    if (!participant.jump(obstacle.getHeight())) {
                        isFailed = true;
                        System.out.println(participant.getName() + " не смог перепрыгнуть стену высотой " + obstacle.getHeight() + " метров.");
                        break;
                    } else {
                        System.out.println(participant.getName() + " успешно перепрыгнул стену высотой " + obstacle.getHeight() + " метров.");
                    }
                }

                // Если участник провалил одно из препятствий, то он выбывает
                if (isFailed) {
                    System.out.println(participant.getName() + " выбывает из соревнований.");
                    break;
                }
            }

            if (!isFailed) {
                System.out.println(participant.getName() + " прошел все препятствия!");
            }

            System.out.println("-----------------------");

        }
    }
}
