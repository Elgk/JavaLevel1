package Lesson5;

public class Main {
    public static void main(String[] args) {
        Employee[] arrEmpl = new Employee[5];
        arrEmpl[0] = new Employee("Иванов Иван", 25, "ivan.ivanov@gmail.ru", "9270042477",
                "Инженер-программист", 40000);
        arrEmpl[1] = new Employee("Петров Василий", 41, "vasiliy.petrov@gmail.ru", "9342034567",
                "Инженер-программист", 55000);
        arrEmpl[2] = new Employee("Васильева Вера", 30, "Инженер-программист", 45000);
        arrEmpl[3] = new Employee("Николаев Иван", 45,  "Инженер-системотехник", 60000);
        arrEmpl[4] = new Employee("Сидоров Петр", 55,   "Менеджер", 85000);

        for (int i = 0; i < arrEmpl.length; i++){
            if (arrEmpl[i].getAge() > 40){
                System.out.print((i+1)+". ");
                arrEmpl[i].EmployeeInfo();
                System.out.println();
            }
        }

    }
}
