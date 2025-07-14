package text.kadai21;

public class DictionaryExec_Chapter21 {
    public static void main(String[] args) {
    	
        Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();

        String[] wordsToSearch = { "apple", "banana", "grape", "orange" };

        for (String word : wordsToSearch) {
            String meaning = dictionary.search(word);
            
            if (meaning != null) {
                System.out.println(word + " の意味は " + meaning + " です。");
            } else {
                System.out.println(word + " は辞書に登録されていません。");
            }
        }
    }
}
