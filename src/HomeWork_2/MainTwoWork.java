package HomeWork_2;

public class MainTwoWork {

    public static void printStudents(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }


    public static void main(String[] args) {

        Hogwarts hogwarts = new Hogwarts();


        hogwarts.gryffindors = new Gryffindor[]{
                new Gryffindor(" Гарри ", " Поттер ",
                        45, 30, 95, 64, 65),
                new Gryffindor(" Гермиона ", " Грейнджер ",
                        43, 76, 90, 70, 85),
                new Gryffindor(" Рон ", " Уизли ",
                        53, 48, 74, 52, 80)};

        hogwarts.hufflepuffs = new Hufflepuff[]{
                new Hufflepuff("Захария", "Смит",
                        76, 30, 65, 73, 82),
                new Hufflepuff("Седрик", "Диггори",
                        2, 100, 90, 78, 99),
                new Hufflepuff("Джастин", "Финч-Флетчли",
                        93, 1, 65, 88, 70)};

        hogwarts.ravenclaws = new Ravenclaw[]{
                new Ravenclaw("Чжоу", "Чанг",
                        83, 15, 75, 87, 77, 65),
                new Ravenclaw("Падма", "Патил",
                        65, 66, 45, 98, 85, 100),
                new Ravenclaw("Маркус", "Белби",
                        17, 56, 68, 76, 65, 87)};

        hogwarts.slytherins = new Slytherin[]{
                new Slytherin("Драко", "Малфой", 68,
                        57, 75, 67, 68, 93),
                new Slytherin(" Грэхэм", "Монтегю",
                        54, 69, 95, 74, 77, 83),
                new Slytherin("Грегори", "Гойл",
                        98, 3, 65, 56, 55, 49),
        };
    }
}


