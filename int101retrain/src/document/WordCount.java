package document;

public class WordCount {
    private static final int  NOTFOUND = -1;
    private static final int INIT_SIZE = 10;
    //private array of type "String" named "words"
    private final String[] words = new String[INIT_SIZE];
    //private array of type "int" named "frequencies"
    private final int[] frequencies = new int[INIT_SIZE];
    //private "int" named "count"
    private int count;

    //initialize words and frequencies to arrays of size INIT_SIZE = 10

    /*
    a public method "addWord" that receives a String named "Word" and
    return a "boolean". it returns true the word is not null and is not blanks.
    otherwise, its add the "words" into "words" array if "word" does not already exist.
    and increments the count.however, if the array are full, return false.
    if the "words"  has already existed, increments the frequency of that "word".
     */

    /*
    override the toString() method that return a string showing each method along with its frequencies.
     */

    public boolean addWord(String word) {
        if (word == null || word.isBlank()) return false;
        int i = positionOf(word);
        if (i == NOTFOUND) {
            if (count == words.length) return false;
            words[count++] = word;
            frequencies[count] = 1;
            count++;
            return true;
        }
        frequencies[i]++;
        return true;
    }
    private int positionOf(String word) {
        for (int i = 0; i < count; i++) {
            if (word.equals(words[i])) return i;
        }
        return NOTFOUND;
    }
    @Override
    public String toString() {
        var b = new StringBuilder();
        for (int i = 0; i < count; i++) {
            b.append(words[i]);
            b.append(" ");
            b.append(frequencies[i]);
            b.append(", ");
        }
        return b.toString();
    }
}
