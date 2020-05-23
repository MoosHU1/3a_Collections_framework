import java.util.ArrayList;

public class getAlphabet {


    public static ArrayList<Character> getCharAlphabet(){
        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (char letter = 'a'; letter <= 'z'; letter++) {
            alphabet.add(letter);
        }
        return alphabet;

    }


}
