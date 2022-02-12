package HomeWork_2;

import java.util.Objects;

public class Student {

    private final String fistName;
    private final String lastName;

    private int magic;
    private int transgression;


    public Student(String fistName, String lastName, int magic, int transgression) {
        this.fistName = fistName;
        this.lastName = lastName;

        this.magic = magic;
        this.transgression = transgression;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    public String getFistName() {
        return fistName;
    }

    public String getLastName() {
        return lastName;
    }


    @Override
    public String toString() {
        return "Хогвартс {" +
                "Имя: " + fistName + '\'' +
                ", Фамилия: " + lastName + '\'' +
                ", Колдовство = " + magic +
                ", Трансгрессирование = " + transgression +
                " ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student hogwarts = (Student) o;
        return magic == hogwarts.magic && transgression == hogwarts.transgression && Objects.equals(fistName, hogwarts.fistName) && Objects.equals(lastName, hogwarts.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fistName, lastName, magic, transgression);
    }


    public static void compare(Student a, Student b) {
        System.out.println("Сравнение " + a.getFistName() + " и " + b.getFistName() + ":");

        if (a.getMagic() == b.getMagic()) {
            System.out.println("Колдовство на ровне");
        } else if (a.getMagic() < b.getMagic()) {
            System.out.println(b.getFistName() + " Колдовство более сильное чем у  " + a.getFistName());
        } else System.out.println(a.getFistName() + " Колдовство более сильное чем у " + b.getFistName());

        if (a.getTransgression() == b.getTransgression()) {
            System.out.println("Трансгрессирование на ровне");
        } else if (a.getTransgression() < b.getTransgression()) {
            System.out.println(b.getFistName() + " Трансгрессирование более сильное чем у " + a.getFistName());
        } else System.out.println(a.getFistName() + " Трансгрессирование более сильное чем у " + b.getFistName());
    }
}


