package userRegistrationTest;

import org.junit.Assert;
import org.junit.Test;
public class UserRegistrationTest
{

    UserRegistration userRegistration = new UserRegistration();

    //Test case For first name when first letter start with upper case.
    @Test
     public void givenFirstName_WhenFirstLetterUpperCase_ShouldReturnTrue()
    {
	 boolean result = userRegistration.validateFirstName("Vagdevi");
	 Assert.assertTrue(result);
	}
    
    //Test case for first name which is less tha three charcters.
     @Test
     public void givenFirstName_WhenLessThanThreeChars_ShouldReturnFalse()
     {
	   boolean result = userRegistration.validateFirstName("Va");
	   Assert.assertFalse(result);
    }
    
     //test case for first name which has a number.
     @Test
 	public void givenFirstName_WhenHasNumber_ShouldReturnFalse()
     {
 		boolean result = userRegistration.validateFirstName("Vagdevi52");
 		Assert.assertFalse(result);
 	}

     //Test case for first name which has a special character.
    @Test
    public void givenFirstName_WhenHasSpecialChar_ShouldReturnFalse()
    {
	  boolean result = userRegistration.validateFirstName("V@gdevi");
	  Assert.assertFalse(result);
   }
    
    //Test case for entering a valid email.
    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue(){
        boolean result = userRegistration.validateEmailid("abc.syz@bl.co.in");
        Assert.assertTrue(result);
    }
}    