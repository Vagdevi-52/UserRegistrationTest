package userRegistrationTest;


import org.junit.Assert;
import org.junit.Test;
public class UserRegistrationTest
{

    UserRegistration userRegistration = new UserRegistration();

    //test case for first name should start with upper case.
    @Test
     public void givenFirstName_WhenFirstLetterUpperCase_ShouldReturnTrue()
     {
	   boolean result = userRegistration.validateFirstName("Vagdevi");
	   Assert.assertTrue(result);
	}
    
    //test case for first name which is less than three charcters.
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

     //test case for the first name which has special character.
    @Test
    public void givenFirstName_WhenHasSpecialChar_ShouldReturnFalse()
    {
	 boolean result = userRegistration.validateFirstName("V@gdevi");
	 Assert.assertFalse(result);
    }
    
    //Test case for the Last Name should start with uppercase.
    @Test
	public void givenLastName_WhenFirstLetterUpperCase_ShouldReturnTrue()
    {
	    boolean result = userRegistration.validateLastName("Dhulipala");
	    Assert.assertTrue(result);
	}
	
    //test case for the LastName which has less than three charcters.
	@Test 
	public void givenLastName_WhenLessThanThreeChar_shouldReturnFalse() 
	{
		boolean result = userRegistration.validateLastName("De");
		Assert.assertFalse(result);
	}
	
	//test case for the LastName which has a number.
	@Test
	  public void givenLastName_WhenHasNumber_ShouldReturnFalse()
	{
	      boolean result = userRegistration.validateLastName("Vagdevi52");
	      Assert.assertFalse(result);
	  }

	  //test case which has a special charcter.
	  @Test
	  public void givenLastName_WhenHasSpecialChar_ShouldReturnFalse()
	  {
	      boolean result = userRegistration.validateLastName("V@gdevi");
	      Assert.assertFalse(result);
	  }

}