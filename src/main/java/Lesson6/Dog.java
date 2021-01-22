package Lesson6;

public class Dog extends Animal{
    String breed;
    private static int dogCount;

    public Dog(String name, String breed){
        super(name);
        this.breed = breed;
        this.dogCount ++;
    }

    public int getDogCount(){
        return this.dogCount;
    }

    @Override
    public void animalInfo(){
        System.out.println("Собака: "+ name + " порода: " + breed);
    }
    @Override
    public  void runing(int distance){
        if (distance > 500){
            System.out.println(name + " не может пробежать " + distance + " метров");
            return;
        }
        super.runing(distance);
    }
    @Override
    public void swimming(int distance){
        if (distance > 10){
            System.out.println(name + " не может проплыть " + distance + " метров");
            return;
        }
        super.runing(distance);
    }
}
