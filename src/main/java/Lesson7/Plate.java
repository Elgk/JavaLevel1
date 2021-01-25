package Lesson7;

public class Plate {
    private int food;

    public Plate(int food){
        this.food = food;
    }
    public boolean decreaseFood(int n){
        if ((food - n) < 0){
            return false;
        }else {
            food -= n;
            return true;
        }
    }
    public void increaseFood(int n){
        food += n;
    }
    public void Info(){
        System.out.println("plate: " + food);
    }
    public int getFood(){ return food;}
}
