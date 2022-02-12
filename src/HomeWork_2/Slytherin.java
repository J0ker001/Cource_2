package HomeWork_2;

import java.util.Objects;

public class Slytherin extends Student {

    private int trick;
    private int determination;
    private int resourcefulness;
    private int lustPower;

    public Slytherin(String fistName, String lastName, int magic, int transgression, int trick, int determination, int resourcefulness, int lustPower) {
        super(fistName, lastName, magic, transgression);
        this.trick = trick;
        this.determination = determination;
        this.resourcefulness = resourcefulness;
        this.lustPower = lustPower;
    }

    public int getTrick() {
        return trick;
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustPower() {
        return lustPower;
    }

    public void setLustPower(int lustPower) {
        this.lustPower = lustPower;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Хитрость = " + trick +
                ", Решительность = " + determination +
                ", Амбициозность = " + resourcefulness +
                ", Жажда власти = " + lustPower +
                '}' + " Слизерин";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Slytherin slytherin = (Slytherin) o;
        return trick == slytherin.trick && determination == slytherin.determination && resourcefulness == slytherin.resourcefulness && lustPower == slytherin.lustPower;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), trick, determination, resourcefulness, lustPower);
    }

    public static void compare(Slytherin a, Slytherin b) {
        System.out.println("Сравнение " + a.getFistName() + " и " + b.getFistName() + ":");

        if (a.getTrick() == b.getTrick()) {
            System.out.println("Хитрость на ровне");
        } else if (a.getTrick() < b.getTrick()) {
            System.out.println(b.getFistName() + " Более хитрый чем " + a.getFistName());
        } else System.out.println(a.getFistName() + " Более хитрый чем " + b.getFistName());

        if (a.getDetermination() == b.getDetermination()) {
            System.out.println("Решительность на ровне");
        } else if (a.getDetermination() < b.getDetermination()) {
            System.out.println(b.getFistName() + " Более решительеый чем " + a.getFistName());
        } else System.out.println(a.getFistName() + " Более решительный чем" + b.getFistName());

        if (a.getResourcefulness() == b.getResourcefulness()) {
            System.out.println("Амбициозность на ровне");
        } else if (a.getResourcefulness() < b.getResourcefulness()) {
            System.out.println(b.getFistName() + " Более амбициозный чем  " + a.getFistName());
        } else System.out.println(a.getFistName() + " Более амбициозный чем  " + b.getFistName());

        if (a.getLustPower() == b.getLustPower()) {
            System.out.println("Жажда власти на ровне");
        } else if (a.getLustPower() < b.getLustPower()) {
            System.out.println(b.getFistName() + " Более жадный до власти чем " + a.getFistName());
        } else System.out.println(a.getFistName() + " Более жадный до власти чем " + b.getFistName());
    }
}

