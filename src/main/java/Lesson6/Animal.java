package Lesson6;

public class Animal {
    public String name;
    private static int animalCount;

    public Animal(){
        this.animalCount ++;
    }
    public Animal(String name){
        this.name = name;
        this.animalCount ++;
    }
    public int getAnimalCount(){
        return this.animalCount;
    }
    public void animalInfo(){
        System.out.println("Животное: "+ name);
    }
    public void runing(int distance){
        System.out.println(ifEmptyName(name) + " пробежал " + distance + " метров");
    }
    public void swimming(int distance){
        System.out.println(ifEmptyName(name) + " проплыл "+ distance + " метров");
    }

    private String ifEmptyName(String name){
        if (name == null) {
            return  "кто-то";
        } else {
            return  name;
        }
    }
}
