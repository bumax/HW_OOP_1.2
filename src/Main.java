import exercises.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo();
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите команду: \n" +
        "1 - добавить жиивотное, 2 - удалить животное, 3 - получить инфо по животному, 4 - пнуть животное\n" +
        "5 - получить инфо по всем животным, 6 - пнуть всех, 7 - попытаться запустить в небо, 8 - погладить, 9 - дрессировать:");
        int ex = scan.nextInt();
        switch (ex) {
            case 1:
                myZoo.addAnimal(new Chicken(25.1, 1.9, 0xFF0000)); // Писать диалоги под каждый вид, имхо, ту мач...
                break;
            case 2:
                System.out.println("Кого будем удалять? ");
                ex = scan.nextInt();
                myZoo.killAnimal(ex);
                break;
            case 3:
                System.out.println("Кто интересует? ");
                ex = scan.nextInt();
                myZoo.getInfo(ex);
                break;
            case 4:
                System.out.println("Кого потревожим? ");
                ex = scan.nextInt();
                myZoo.kickAnimal(ex);
                break;
            case 5:
                myZoo.printAllAnimals();
                break;
            case 6:
                myZoo.kickAllAnimals();
                break;
            case 7:
                System.out.println("Кого потревожим? ");
                ex = scan.nextInt();
                myZoo.doFly(ex);
                break;
            case 8:
                System.out.println("Кого погладим? ");
                ex = scan.nextInt();
                myZoo.toShowKindness(ex);
                break;
            case 9:
                System.out.println("Кого подрессируем? ");
                ex = scan.nextInt();
                myZoo.doTrain(ex);
                break;

        }

    }
}