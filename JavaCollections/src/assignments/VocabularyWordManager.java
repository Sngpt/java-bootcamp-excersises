package assignments;


import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

// Implement the VocabularyWordManager using a SortedSet internally

public class VocabularyWordManager {

    SortedSet<String> dictionary ;

    public VocabularyWordManager(Collection<String> words) {
        dictionary = new TreeSet<>(words);
    }

    public String getFirstWord() {
       return dictionary.first();
    }

    public String getLastWord() {
        return dictionary.last();

    }

    public SortedSet<String> getWordsBefore(String word) {
        return dictionary.headSet(word);
    }

    public SortedSet<String> getWordsAfter(String word) {
        SortedSet<String> afterWords =  new TreeSet(dictionary.tailSet(word));
        afterWords.remove(afterWords.first());
        return afterWords;
    }

    public SortedSet<String> getWordsBetween(String startWord, String endWord) {
       SortedSet<String> betweenWords = new TreeSet(dictionary.subSet(startWord,endWord));

       betweenWords.remove(betweenWords.first());


       return betweenWords;
    }

    public static void main(String[] args) {
        VocabularyWordManager vocab = new VocabularyWordManager(
                Set.of("apple",
                        "banana",
                        "carrot",
                        "date",
                        "eggplant",
                        "fig",
                        "grape",
                        "honey"));

        System.out.println("First word: " + vocab.getFirstWord());
        System.out.println("Last word: " + vocab.getLastWord());

        String targetWord = "eggplant";
        SortedSet<String> wordsBefore = vocab.getWordsBefore(targetWord);
        System.out.println("Words before " + targetWord + ": " + wordsBefore);

        SortedSet<String> wordsAfter = vocab.getWordsAfter(targetWord);
        System.out.println("Words after " + targetWord + ": " + wordsAfter);

        String startWord = "carrot";
        String endWord = "grape";
        SortedSet<String> wordsBetween = vocab.getWordsBetween(startWord, endWord);
        System.out.println("Words between " + startWord + " and " + endWord + ": " + wordsBetween);
    }
}

