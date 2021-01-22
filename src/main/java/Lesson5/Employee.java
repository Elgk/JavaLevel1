package Lesson5;

public class Employee {
    private String name;
    private int age;
    private String email;
    private String phone;
    private String position;
    private int salary;

    public Employee(String name, int age, String email, String phone, String position, int salary){
        this.name = name;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.position = position;
        this.salary = salary;
    }
    public Employee(String name, int age,  String position, int salary){
        this.name = name;
        this.age = age;
        this.position = position;
        this.salary = salary;
    }

    public int getAge(){
        return this.age;
    }
    public void EmployeeInfo(){
        System.out.printf("ФИО: %s; Возраст: %d; Email: %s; Тел.: %s; Должность: %s; Зарплата %d ",
                this.name, this.age, this.email, this.phone, this.position, this.salary);
    }

}
