package userRegistrationTest;

import org.junit.Assert;
import org.junit.Test;
public class UserRegistrationTest 
{

  UserRegistration userRegistration = new UserRegistration();

   //test case for first name when first letter  should start upper case 
    @Test
     public void givenFirstName_WhenFirstLetterUpperCase_ShouldReturnTrue() {
	 boolean result = userRegistration.validateFirstName("Vagdevi");
	 Assert.assertTrue(result);
	}
    
    //test case for first name when it is less than three charcters.
     @Test
     public void givenFirstName_WhenLessThanThreeChars_ShouldReturnFalse() {
	 boolean result = userRegistration.validateFirstName("Va");
	Assert.assertFalse(result);
    }
     
   //test case for first name when it has a number.
     @Test
 	public void givenFirstName_WhenItHasNumber_ShouldReturnFalse() {
 		boolean result = userRegistration.validateFirstName("Vagdevi52");
 		Assert.assertFalse(result);
 	}

    @Test
    public void givenFirstName_WhenHasSpecialChar_ShouldReturnFalse() {
	boolean result = userRegistration.validateFirstName("V@gdevi");
	Assert.assertFalse(result);
}
}