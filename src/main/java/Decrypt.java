public class Decrypt {

    private int mKey;
    private String mInputText;

    public Decrypt(int key, String inputText) {

        mKey = key;
        mInputText = inputText;
        }

    public int getmKey() {
        return mKey;
    }

    public String getmInputText() {
        return mInputText;
    }


        public boolean isValidInputText()
        {
            char[] chars = mInputText.toCharArray();

            for (char c : chars) {
                if(!Character.isLetter(c) && c != ' ') {
                    return false;
                }
            }
            return true;
        }
        public boolean isValidKey()
        {
            return mKey >1 && mKey < 26;
        }

        public String decode()
        {
            String decodedValue = "";
            String encodedArray[] = mInputText.split("");
            String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            for (int i = 0; i<encodedArray.length;i++)
            {
                if (mInputText.charAt(i) == ' ')
                {
                    decodedValue += " ";
                }
                else
                {
                    int charPosition = alphabet.indexOf(mInputText.charAt(i));
                    int keyVal = (charPosition - mKey) % 26;

                    if (keyVal < 0)
                    {
                        keyVal = alphabet.length() + keyVal;
                    }

                    char replaceValue = alphabet.charAt(keyVal);
                    decodedValue += replaceValue;
                }
            }
            return decodedValue;
        }
    }


