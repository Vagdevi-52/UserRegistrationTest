package userRegistrationTest;


import org.junit.Assert;
import org.junit.Test;
public class UserRegistrationTest
{

    UserRegistration userRegistration = new UserRegistration();
  
     //Test For First name where it should with upper case.
    @Test
     public void givenFirstName_WhenFirstLetterUpperCase_ShouldReturnTrue() 
    {
	  boolean result = userRegistration.validateFirstName("Vagdevi");
	  Assert.assertTrue(result);
	}
    
    //Test For first name when it has less than three charcters
     @Test
     public void givenFirstName_WhenLessThanThreeChars_ShouldReturnFalse()
     {
	   boolean result = userRegistration.validateFirstName("Va");
	   Assert.assertFalse(result);
    }
   
     //first name when it has number
     @Test
 	public void givenFirstName_WhenHasNumber_ShouldReturnFalse() 
     {
 		boolean result = userRegistration.validateFirstName("Vagdevi52");
 		Assert.assertFalse(result);
 	}

     //first name when it has a special charcter
    @Test
    public void givenFirstName_WhenHasSpecialChar_ShouldReturnFalse()
    {
	 boolean result = userRegistration.validateFirstName("V@gdevi");
	 Assert.assertFalse(result);
   }
    
    //Test case for last name should start uppercase.
    @Test
	public void givenLastName_WhenFirstLetterUpperCase_ShouldReturnTrue()
    {
	    boolean result = userRegistration.validateLastName("Dhulipala");
	    Assert.assertTrue(result);
	}
	
    //Test case for last name it has less than three charcters.
	@Test 
	public void givenLastName_WhenLessThanThreeChar_shouldReturnFalse()
	{
		boolean result = userRegistration.validateLastName("De");
		Assert.assertFalse(result);
	}
	
	//Test case for last name when it has number. 
	@Test
	  public void givenLastName_WhenHasNumber_ShouldReturnFalse() {
	      boolean result = userRegistration.validateLastName("Dhulipala72");
	      Assert.assertFalse(result);
	  }

	  //Test case for last name when it has special charcter
	  @Test
	  public void givenLastName_WhenHasSpecialChar_ShouldReturnFalse() {
	      boolean result = userRegistration.validateLastName("dhul@pala");
	      Assert.assertFalse(result);
	  }
	  //test case for emailid
	  @Test
	    public void givenEmailId_WhenProper_ShouldReturnTrue(){
	        boolean result = userRegistration.validateEmailid("abc.syz@bl.co.in");
	        Assert.assertTrue(result);
	    }
	  
	  //test case for the mobile number where the space is mentioned
	  @Test
	    public void givenMobileNum_WhenSpaceIsMentioned_ShouldReturnTrue()
	  {
	        boolean result = userRegistration.validateMobileNum("91 9959506738");
	        Assert.assertTrue(result);
	    }
	  
	    //test case for the mobile number where the space is mentioned
	    @Test
	    public void givenMobileNum_WhenSpaceNotMentioned_ShouldReturnFalse() {
	        boolean result = userRegistration.validateMobileNum("9197894527");
	        Assert.assertFalse(result);
	    }
        //test case for mobile number it has less digits.
	    @Test
	    public void givenMobileNum_WhenLessDigits_ShouldReturnFalse() 
	    {
	        boolean result = userRegistration.validateMobileNum("99674");
	        Assert.assertFalse(result);
	    }
       //test case for mobile number it should not start with 91 code.
	    @Test
	    public void givenMobileNum_WhenNotStartWith91_ShouldReturnFalse()
	    {
	        boolean result = userRegistration.validateMobileNum("12345678");
	        Assert.assertFalse(result);
	    }


}
