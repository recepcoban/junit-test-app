package junit.app;

public class FindLetter {
	
	public static String SONANT = "aeiouAEIOU";
    int total = 0;

    public int sonant(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (SONANT.indexOf(word.charAt(i)) != -1) {
                total++;
            }
        }
        return total;
    }

    public int consonant(String word) {
        total = word.length() - sonant(word);
        return total;
    }

}
