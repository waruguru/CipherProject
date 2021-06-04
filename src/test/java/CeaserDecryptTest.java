
import org.junit.Test;

import static org.junit.Assert.*;

public class CeaserDecryptTest {

    Decrypt testDecrypt = new Decrypt( 5, "N QTAJ MNPNSL ");

    @Test
    public void checkIfSavesInputText()
    {
        assertEquals("N QTAJ MNPNSL ", testDecrypt.getmInputText() );
    }

    @Test
    public void checkKeyIsSaved()
    {
        assertEquals(5,testDecrypt.getmKey());
    }

    @Test
    public void isValidInputText()
    {
        assertEquals(true, testDecrypt.isValidInputText());
    }

    @Test
    public void isValidKey()
    {
        assertEquals(true, testDecrypt.isValidKey());
    }

    @Test
    public void validDecoding()
    {
        assertEquals("KELVIN KOSGEI" , testDecrypt.decode());
    }
    }

