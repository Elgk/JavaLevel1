package Lesson7;

import java.util.Random;

public class Main {
    private static Random random = new Random();
    public static void main(String[] args) {

        int appetiteLimit = 15;
        int foodLimit = 30;
        Plate plate = new Plate(getTheNumber(10, foodLimit));
        Cat[] catArr = new Cat[3];
        catArr[0] = new Cat("Кузя", getTheNumber(3,appetiteLimit));
        catArr[1] = new Cat("Тима", getTheNumber(3,appetiteLimit));
        catArr[2] = new Cat("Яша",  getTheNumber(3,appetiteLimit));
        plate.Info();
        for (Cat cat: catArr){
            cat.eat(plate);
            cat.info();
            if (plate.getFood() < 3) {
                plate.increaseFood(getTheNumber(10, foodLimit));
            }
            plate.Info();
        }
    }

    public static int getTheNumber(int min, int max){
        int res;
        do {
            res = random.nextInt(max);
        }while (res < min);
        return res;
    }
}
