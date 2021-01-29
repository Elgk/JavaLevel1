package Lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean wellFed;

    public Cat(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
        wellFed = false;
    }

    public void info(){
        String messOut;
        if (wellFed){
            messOut = name + " сыт, порция " + appetite;
        }else {
            messOut = name + " голоден, недосталось, порция " + appetite;
        }
        System.out.println(messOut);
    }

    public void eat(Plate p){
        wellFed = p.decreaseFood(appetite);
    }
}
