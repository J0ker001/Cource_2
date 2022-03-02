package HomeWork_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionImpl implements Collection {

    private boolean isEven(Integer x) {
        return x % 2 == 0;
    }

    private boolean isOdd(Integer x) {
        return !isEven(x);
    }

    @Override
    public List<Integer> oddNumbers(List<Integer> nums) {
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer num : nums) {
            if (isOdd(num)) {
                result.add(num);
            }
        }
        return result;
    }

    @Override
    public List<Integer> evenUniqueNumbers(List<Integer> nums) {
        ArrayList<Integer> result = new ArrayList<>();
        Collections.sort(nums);
        if (!nums.isEmpty() && isEven(nums.get(0))) {
            result.add(nums.get(0));
        }
        for (int i = 1; i < nums.size(); i++) {
            if (isEven(nums.get(i)) && !(nums.get(i - 1).equals(nums.get(i)))) {
                result.add(nums.get(i));
            }
        }
        return result;
    }

    @Override
    public List<String> uniqueWords(List<String> words) {
        ArrayList <String> result = new ArrayList<>();
        Collections.sort(words);
        if (!words.isEmpty() ){
            result.add(words.get(0));
        }
        for (int i = 1; i < words.size(); i++) {
            if (!(words.get(i - 1).equals(words.get(i)))) {
                 result.add(words.get(i));
            }
        }
        return result;
    }

    @Override
    public int calculationDuplicates(List<String> words) {
        int counterDuplicates = 0;
        Collections.sort(words);
        for (int i = 1; i < words.size(); i++) {
            if (words.get(i - 1).equals(words.get(i))) {
                counterDuplicates++;
            }
        }
        return counterDuplicates;


    }

}

