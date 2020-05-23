import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {




    public static void main(String[] args){

        ArrayList<Character> lijst = new ArrayList<Character>();

        ArrayList<Character> alphabet = getAlphabet.getCharAlphabet();

        lijst.add(getLetter.getChar());
        lijst.add(getLetter.getChar());
        lijst.add(getLetter.getChar());
        lijst.add(getLetter.getChar());
        lijst.add(getLetter.getChar());

        System.out.println(lijst);

        boolean sorted = false;
        while (!sorted) {
            boolean swap = false;
            for (int i = 0; i < 4; i++) {
                System.out.println(lijst);
                char letter0 = lijst.get(i);
                char letter1 = lijst.get(i + 1);
                int index_letter0 = alphabet.indexOf(letter0);
                int index_letter1 = alphabet.indexOf(letter1);


                if (index_letter1 < index_letter0) {
                    swap = true;
                    Collections.swap(lijst, lijst.indexOf(letter0), lijst.indexOf(letter1));

                }
            }

            if (!swap){
                sorted = true;
            }

        }

        System.out.println(lijst);


//        List<Character> lijst2 = new ArrayList<Character>();
//        ArrayList<Character> alphabet = getAlphabet.getCharAlphabet();
//
//        lijst2.add(getLetter.getChar());
//        lijst2.add(getLetter.getChar());
//        lijst2.add(getLetter.getChar());
//        lijst2.add(getLetter.getChar());
//        lijst2.add(getLetter.getChar());
//
//        System.out.println(lijst2);
//
//        boolean sorted = false;
//        while (!sorted) {
//            boolean swap = false;
//            for (int i = 0; i < 4; i++) {
//                char letter0 = lijst2.get(i);
//                char letter1 = lijst2.get(i + 1);
//                int index_letter0 = alphabet.indexOf(letter0);
//                int index_letter1 = alphabet.indexOf(letter1);
//
//
//                if (index_letter1 < index_letter0) {
//                    swap = true;
//                    Collections.swap(lijst2, lijst2.indexOf(letter0), lijst2.indexOf(letter1));
//
//                }
//            }
//
//            if (!swap){
//                sorted = true;
//            }
//
//        }
//
//        System.out.println(lijst2);
//
//



















    }


}







