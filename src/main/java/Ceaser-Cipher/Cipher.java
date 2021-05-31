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

        //Wrap the letters
        shifted = (char) ((shifted + cipherShift + alphaLength) % alphaLength);


        //shift back to english words
        return (char) (shifted + asciiShift);


    }
    // Here we Rotate a string k-positions
    public  String cipher() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mText.length(); i++) {
            if(mText.charAt(i) == ' ')
            {
                sb.append(" ");
            }
            else
            {
                sb.append(cipher(mText.charAt(i), mShift));
            }

        }
        return sb.toString();
    }

}