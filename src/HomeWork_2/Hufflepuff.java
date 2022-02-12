package HomeWork_2;

import java.util.Objects;

public class Hufflepuff extends Student {
    private int industriousness;
    private int right;
    private int honesty;

    public Hufflepuff(String fistName, String lastName, int magic, int transgression, int industriousness, int right, int honesty) {
        super(fistName, lastName, magic, transgression);
        this.industriousness = industriousness;
        this.right = right;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Трудолюбие = " + industriousness +
                ", Верность =" + right +
                ", Честность = " + honesty +
                '}' + "Пуффендуй";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Hufflepuff that = (Hufflepuff) o;
        return industriousness == that.industriousness && right == that.right && honesty == that.honesty;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), industriousness, right, honesty);
    }

    public static void compare(Hufflepuff a, Hufflepuff b) {
        System.out.println("Сравнение " + a.getFistName() + " и " + b.getFistName() + ":");

        if (a.getIndustriousness() == b.getIndustriousness()) {
            System.out.println("Трудолюбие на ровне");
        } else if (a.getIndustriousness() < b.getIndustriousness()) {
            System.out.println(b.getFistName() + " Более трудолюбив чем " + a.getFistName());
        } else System.out.println(a.getFistName() + " Более трудолюбив чем " + b.getFistName());

        if (a.getRight() == b.getRight()) {
            System.out.println("Верность на ровне");
        } else if (a.getRight() < b.getRight()) {
            System.out.println(b.getFistName() + " Более верный чем " + a.getFistName());
        } else System.out.println(a.getFistName() + " Более верный чем " + b.getFistName());

        if (a.getHonesty() == b.getHonesty()) {
            System.out.println("Честность на ровне");
        } else if (a.getHonesty() < b.getHonesty()) {
            System.out.println(b.getFistName() + " Более честный чем " + a.getFistName());
        } else System.out.println(a.getFistName() + " Более честный чем " + b.getFistName());
    }

}

