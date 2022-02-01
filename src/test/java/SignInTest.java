import org.testng.Assert;
import org.testng.annotations.Test;



public class SignInTest extends BaseTest{

    @Test
    public void testSignIn() {
        Assert.assertTrue(topMenu.ifTopMenuDisplayed());
    }
}
