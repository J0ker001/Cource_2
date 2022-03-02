package HomeWork_7;


import java.util.ArrayList;
import java.util.List;

public class Main_hw7 {

    private static void printArrayNumbers(List<Integer> nums) {
        for (Integer num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static void printArrayWords(List<String> words) {
        for (String word : words) {
            System.out.print(word + " ");
        }
        System.out.println();
    }

    private static void printInt(String str, int x) {
        System.out.println(str + x);
    }


    public static void main(String args[]) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> words = new ArrayList<>(List.of("Хлеб", "Булка", "Вода", "Вода", "Печенье",
                "Мороженное", "Стакан", "Стакан"));

        Collection collection = new CollectionImpl();


        printArrayNumbers(collection.oddNumbers(nums));
        printArrayNumbers(collection.evenUniqueNumbers(nums));


        printArrayWords(collection.uniqueWords(words));
        printInt("Дубликаты: ", collection.calculationDuplicates(words));
    }
}
