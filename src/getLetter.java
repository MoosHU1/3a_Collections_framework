import java.util.Random;

public class getLetter {


    public static char getChar(){
        Random r = new Random();
        char c = (char) (r.nextInt(26) + 'a');
        return c;
    }


}
