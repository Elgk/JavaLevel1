package Lesson6;

public class Cat extends Animal{
    String color;
    private static int catCount;

    public Cat (String name, String color){
        super(name);
        this.color = color;
        this.catCount ++;
    }
    public int getCatCount(){
        return this.catCount;
    }
    @Override
    public void animalInfo(){
        System.out.println("Кот: " + name + " цвет: " + color);
    }

    @Override
    public void runing(int distance){
        if (distance > 200){
            System.out.println(name + " не может пробежать " + distance + " метров");
            return;
        }
        super.runing(distance);
    }
    @Override
    public void swimming(int distance){
        System.out.println("Коты не умеют плавать");
    }
}
