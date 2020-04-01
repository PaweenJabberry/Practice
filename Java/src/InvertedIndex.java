//  invertedIndex
//  Create map index for word occur by select only important word
//  Search on the map for decreasing the length of search
//
import java.util.*;

public class InvertedIndex {
    public static void InvertedIndex() { }
    public static List<String> stopWords = Arrays.asList("a", "able", "about",
            "across", "after", "all", "almost", "also", "am", "among", "an",
            "and", "any", "are", "as", "at", "be", "because", "been", "but",
            "by", "can", "cannot", "could", "dear", "did", "do", "does",
            "either", "else", "ever", "every", "for", "from", "get", "got",
            "had", "has", "have", "he", "her", "hers", "him", "his", "how",
            "however", "i", "if", "in", "into", "is", "it", "its", "just",
            "least", "let", "like", "likely", "may", "me", "might", "most",
            "must", "my", "neither", "no", "nor", "not", "of", "off", "often",
            "on", "only", "or", "other", "our", "own", "rather", "said", "say",
            "says", "she", "should", "since", "so", "some", "than", "that",
            "the", "their", "them", "then", "there", "these", "they", "this",
            "tis", "to", "too", "twas", "us", "wants", "was", "we", "were",
            "what", "when", "where", "which", "while", "who", "whom", "why",
            "will", "with", "would", "yet", "you", "your");
    public static Map<String, List<Integer>> index = new HashMap<String, List<Integer>>();
    public static List<String> movies = new ArrayList<>();

    public static void indexFile() {

        movies.add("The Glorious Fool Lady");
        movies.add("Single Lady");
        movies.add("The Glorious Fool");
        movies.add("The Game");
        movies.add("A Man");

        for (int id = 0;id<movies.size();id++) {
            String currentLine = movies.get(id);
            for (String wordSplit : currentLine.split(" ")) {
                String word = wordSplit.toLowerCase();
                if (stopWords.contains(word)) {
                    continue;
                }
                List<Integer> idx = index.get(word);
                if (idx == null) {
                    idx = new LinkedList<>();
                    index.put(word,idx);
                }
                idx.add(id+1);
            }
        }

//        Check Created Map
//        for (Map.Entry map :index.entrySet()) {
//            System.out.println("Word : "+map.getKey());
//            System.out.println("Movie : "+map.getValue());
//        }
    }

    public static void search(List<String> words) {

        List<Integer> answer = new ArrayList<>();
        for (String currentWord: words) {
            List<Integer> idx = index.get(currentWord.toLowerCase());
            if (idx != null) {
                answer.addAll(idx);
            } else {
                System.out.println("Null");
            }
        }
        Collections.sort(answer);

        int countDuplication = 0;
        int currentNumber = 0;
        currentNumber = answer.get(0);
        System.out.println("Word Occur at line : ");
        for (int i=0;i<answer.size();i++) {
            if (currentNumber == answer.get(i)) {
                countDuplication++;
            } else {
                currentNumber = answer.get(i);
                countDuplication = 1;
            }

            if (countDuplication == words.size()) {
                System.out.println(currentNumber);
            }
        }

    }

    public static void main(String args[]) {
        indexFile();
        String test = "Glorious Fool";
        search(Arrays.asList(test.split(" ")));

    }


}
