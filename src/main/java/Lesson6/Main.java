package Lesson6;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Animal animalBars  = new Animal("Барс");
        Cat catPus = new Cat("Пуся", "Белый");
        Cat catBus = new Cat("Буся", "Черный");
        Dog dogAnch = new Dog ("Анчар","бульдог");
        Dog dogArtn = new Dog("Артемон","пудель");

        animal.animalInfo();
        animalBars.animalInfo();
        catBus.animalInfo();
        catPus.animalInfo();
        dogAnch.animalInfo();
        dogArtn.animalInfo();
        System.out.println("Всего животных : " + animal.getAnimalCount());
        System.out.println("Всего собак : " + dogAnch.getDogCount());
        System.out.println("Всего котов : " + catPus.getCatCount());
        System.out.println();
        dogAnch.runing(100);
        animalBars.runing(10);
        catBus.runing(25);
        catPus.runing(201);
        dogAnch.swimming(15);
        dogArtn.runing(200);
        animal.swimming(100);
        animalBars.runing(500);
    }
}
