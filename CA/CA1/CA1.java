package CA1;
import Lab05.SpellCheck;

import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class CA1 extends SpellCheck {
    public static void main(String[] args) throws FileNotFoundException {
        //HashSet<String> dictionaryWords = readDictionary("C:\\Users\\Anna\\IdeaProjects\\MTUSep24DSC\\CA\\CA1\\randomWords.txt");
        //Set<String> documentWords = readWords("C:\\Users\\Anna\\IdeaProjects\\MTUSep24DSC\\CA\\CA1\\Robinson.txt");

        /*int numberMisspeltWords = 0;
        for (String word : documentWords) {
            if (!dictionaryWords.contains(word)) {
                numberMisspeltWords++;
            }
        }*/

        //FindMisspeltWords(dictionaryWords, documentWords);
        //System.out.println("Number of misspelt words: " + FindMisspeltWords(dictionaryWords, documentWords));
        //System.out.println("Number of misspelt words: " + numberMisspeltWords);
    }

    public static int FindMisspeltWords(HashSet<String> dictionaryWords, Set<String> documentWords) {
        int numberMisspeltWords = 0;
        for (String word : documentWords) {
            if (!dictionaryWords.contains(word)) {
                numberMisspeltWords++;
            }
        }
        return numberMisspeltWords;
    }
}
