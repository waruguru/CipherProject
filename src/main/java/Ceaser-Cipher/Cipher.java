//class that decrypts the encrypted message
import java.io.Console;

public class Cipher {
    //method to rotate the character position
    private String mText;
    private int mShift;

    //A constructor

    public Cipher(String mText, int mShift) {
        this.mText = mText;
        this.mShift = mShift;
    }
    //getters method


    public String getmText() {
        return mText;
    }

    public int getmShift() {
        return mShift;
    }

    public static char cipher(char c, int k){
        final int alphaLength = 26;
        final char asciiShift = Character.isUpperCase(c) ? 'A' : 'a';
        final int cipherShift = k % alphaLength;

        char shifted = (char) (c - asciiShift);//shift

    }
}