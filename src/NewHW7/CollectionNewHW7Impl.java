package NewHW7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CollectionNewHW7Impl implements CollectionNewHW7 {
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
    public HashSet<Integer> evenUniqueNumbers(List<Integer> nums) {
        HashSet<Integer> result = new HashSet<>();
        for (int i = 0; i < nums.size(); i++) {
            if (isEven(nums.get(i))) {
                result.add(nums.get(i));
            }
        }
        return result;
    }

    @Override
    public HashSet<String> uniqueWords(List<String> words) {
        HashSet<String> result = new HashSet<>();
        for (int i = 0; i < words.size(); i++) {
            result.add(words.get(i));
        }
        return result;
    }

    @Override
    public int calculationDuplicates(List<String> words) {
        HashSet<String> result = new HashSet<>();
        for (int i = 0; i < words.size(); i++) {
            result.add(words.get(i));
        }
        int counterDuplicates = words.size() - result.size();
        return counterDuplicates;
    }
}
