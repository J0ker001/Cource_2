package HomeWork_2;

import java.util.Objects;

public class Ravenclaw extends Student {

    private int intellect;
    private int wisdom;
    private int wit;
    private int creative;


    public Ravenclaw(String fistName, String lastName, int magic, int transgression, int intellect, int wisdom, int wit, int creative) {
        super(fistName, lastName, magic, transgression);
        this.intellect = intellect;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creative = creative;
    }

    public int getIntellect() {
        return intellect;
    }

    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Ум = " + intellect +
                ", Мудрость = " + wisdom +
                ", Остроумие = " + wit +
                ", Творчество = " + creative +
                '}' + "Когтевран";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Ravenclaw ravenclaw = (Ravenclaw) o;
        return intellect == ravenclaw.intellect && wisdom == ravenclaw.wisdom && wit == ravenclaw.wit && creative == ravenclaw.creative;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), intellect, wisdom, wit, creative);
    }

    public static void compare(Ravenclaw a, Ravenclaw b) {
        System.out.println("Сравнение " + a.getFistName() + " и " + b.getFistName() + ":");

        if (a.getIntellect() == b.getIntellect()) {
            System.out.println("Ум на ровне");
        } else if (a.getIntellect() < b.getIntellect()) {
            System.out.println(b.getFistName() + " Более умен чем " + a.getFistName());
        } else System.out.println(a.getFistName() + " Более умен чем " + b.getFistName());

        if (a.getWisdom() == b.getWisdom()) {
            System.out.println("Мудрость на ровне");
        } else if (a.getWisdom() < b.getWisdom()) {
            System.out.println(b.getFistName() + " Более мудрый чем " + a.getFistName());
        } else System.out.println(a.getFistName() + " Более мудрый чем " + b.getFistName());

        if (a.getWit() == b.getWit()) {
            System.out.println("Остроумие на ровне");
        } else if (a.getWit() < b.getWit()) {
            System.out.println(b.getFistName() + " Более остроумный чем " + a.getFistName());
        } else System.out.println(a.getFistName() + " Более остроумный чем " + b.getFistName());

        if (a.getCreative() == b.getCreative()) {
            System.out.println("Творчество на ровне");
        } else if (a.getCreative() < b.getCreative()) {
            System.out.println(b.getFistName() + " Более творческий чем " + a.getFistName());
        } else System.out.println(a.getFistName() + " Более творческий чем " + b.getFistName());
    }

}


