package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {

    private HashMap<String, String> dictionary;

    public Dictionary_Chapter21() {
        this.dictionary = new HashMap<>();

        this.dictionary.put("apple", "りんご");
        this.dictionary.put("peach", "桃");
        this.dictionary.put("banana", "バナナ");
        this.dictionary.put("lemon", "レモン");
        this.dictionary.put("pear", "梨");
        this.dictionary.put("kiwi", "キウィ");
        this.dictionary.put("strawberry", "いちご");
        this.dictionary.put("grape", "ぶどう");
        this.dictionary.put("muscat", "マスカット");
        this.dictionary.put("cherry", "さくらんぼ");
    }

    public void searchWords(String[] words) {

        for (String word : words) {

            if (this.dictionary.containsKey(word)) {
                System.out.println(
                    word + "の意味は" + this.dictionary.get(word)
                );
            } else {
                System.out.println(
                    word + "は辞書に存在しません"
                );
            }
        }
    }
}
