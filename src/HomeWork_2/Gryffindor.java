package HomeWork_2;

import java.util.Objects;

public class Gryffindor extends Student {


    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String fistName, String lastName, int magic, int transgression, int nobility, int honor, int bravery) {
        super(fistName, lastName, magic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Благородство = " + nobility +
                ", Честь = " + honor +
                ", Храбрость = " + bravery +
                '}' + "Гриффиндор";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Gryffindor that = (Gryffindor) o;
        return nobility == that.nobility && honor == that.honor && bravery == that.bravery;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nobility, honor, bravery);
    }


    public static void compare(Gryffindor a, Gryffindor b) {
        System.out.println("Сравнение " + a.getFistName() + " и " + b.getFistName() + ":");

        if (a.getBravery() == b.getBravery()) {
            System.out.println("Храбрость на ровне");
        } else if (a.getBravery() < b.getBravery()) {
            System.out.println(b.getFistName() + " Более храбрый чем " + a.getFistName());
        } else System.out.println(a.getFistName() + " Более храбрый чем " + b.getFistName());

        if (a.getHonor() == b.getHonor()) {
            System.out.println("Честь на ровне");
        } else if (a.getHonor() < b.getHonor()) {
            System.out.println(b.getFistName() + " Более честный чем " + a.getFistName());
        } else System.out.println(a.getFistName() + " Более честный чем " + b.getFistName());

        if (a.getNobility() == b.getNobility()) {
            System.out.println("Благородство на ровне");
        } else if (a.getNobility() < b.getNobility()) {
            System.out.println(b.getFistName() + " Более благороден чем " + a.getFistName());
        } else System.out.println(a.getFistName() + " Более благороден чем " + b.getFistName());
    }
}