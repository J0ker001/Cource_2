package NewHW7;

import java.util.HashSet;
import java.util.List;

public interface CollectionNewHW7 {

    List<Integer> oddNumbers(List<Integer> nums);

    HashSet<Integer> evenUniqueNumbers(List<Integer> nums);

    HashSet<String> uniqueWords(List<String> words);

    int calculationDuplicates(List<String> words);
}
