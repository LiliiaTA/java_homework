import java.util.ArrayList;
import java.util.List;

public class SyllableSplitter {
    public static void main(String[] args) {
        String word = "трансформация";
        String[] syllables = splitIntoSyllables(word);
        
        System.out.println("Разбиение на слоги:");
        for (String syllable : syllables) {
            System.out.println(syllable);
        }
    }
    
    public static String[] splitIntoSyllables(String word) {
        String[] glas = { "а", "у", "е", "ы", "о", "я", "и", "э", "ю" };
        List<Integer> glasIndexes = new ArrayList<>();
        
        for (int i = 0; i < word.length(); i++) {
            String symbol = word.substring(i, i + 1);
            
            for (int j = 0; j < glas.length; j++) {
                if (symbol.equals(glas[j])) {
                    glasIndexes.add(i);
                    break;
                }
            }
        }
        
        StringBuilder resultBuilder = new StringBuilder();
        
        for (int i = glasIndexes.size() - 1; i > 0; i--) {
            if (glasIndexes.get(i) - glasIndexes.get(i - 1) == 1) {
                continue;
            }
            
            int n = glasIndexes.get(i) - glasIndexes.get(i - 1) - 1;
            resultBuilder.insert(0, "-" + word.substring(glasIndexes.get(i - 1) + 1 + n / 2));
            word = word.substring(0, glasIndexes.get(i - 1) + 1 + n / 2);
        }
        
        String result = word + resultBuilder.toString();
        return result.split("-");
    }
}