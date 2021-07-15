package userRegistrationTest;

import org.junit.Assert;
import org.junit.Test;
public class UserRegistrationTest {

UserRegistration userRegistration = new UserRegistration();

    @Test
     public void givenFirstName_WhenFirstLetterUpperCase_ShouldReturnTrue() {
	 boolean result = userRegistration.validateFirstName("Vagdevi");
	 Assert.assertTrue(result);
	}
     @Test
     public void givenFirstName_WhenLessThanThreeChars_ShouldReturnFalse() {
	 boolean result = userRegistration.validateFirstName("Va");
	Assert.assertFalse(result);
    }

     @Test
 	public void givenFirstName_WhenHasNumber_ShouldReturnFalse()
     {
 		boolean result = userRegistration.validateFirstName("Vagdevi52");
 		Assert.assertFalse(result);
 	}

    @Test
    public void givenFirstName_WhenHasSpecialChar_ShouldReturnFalse()
    {
	boolean result = userRegistration.validateFirstName("V@devi");
	Assert.assertFalse(result);
}
    @Test
	public void givenLastName_WhenFirstLetterUpperCase_ShouldReturnTrue(){
	    boolean result = userRegistration.validateLastName("Dhulipala");
	    Assert.assertTrue(result);
	}
	
	@Test 
	public void givenLastName_WhenLessThanThreeChar_shouldReturnFalse() {
		boolean result = userRegistration.validateLastName("De");
		Assert.assertFalse(result);
	}
	
	@Test
	  public void givenLastName_WhenHasNumber_ShouldReturnFalse()
	  {
	      boolean result = userRegistration.validateLastName("Dhulipala52");
	      Assert.assertFalse(result);
	  }

	  @Test
	  public void givenLastName_WhenHasSpecialChar_ShouldReturnFalse() 
	  {
	      boolean result = userRegistration.validateLastName("Dhul@pala");
	      Assert.assertFalse(result);
	  }
	  @Test
	    public void givenEmailId_WhenProper_ShouldReturnTrue()
	    {
	        boolean result = userRegistration.validateEmailid("abc.syz@bl.co.in");
	        Assert.assertTrue(result);
	    }
	  @Test
	    public void givenMobileNum_WhenSpaceIsMentioned_ShouldReturnTrue(){
	        boolean result = userRegistration.validateMobileNum("91 9993588735");
	        Assert.assertTrue(result);
	    }
	    @Test
	    public void givenMobileNum_WhenSpaceNotMentioned_ShouldReturnFalse() {
	        boolean result = userRegistration.validateMobileNum("919993588735");
	        Assert.assertFalse(result);
	    }

	    @Test
	    public void givenMobileNum_WhenLessDigits_ShouldReturnFalse() {
	        boolean result = userRegistration.validateMobileNum("9967483421");
	        Assert.assertFalse(result);
	    }

	    @Test
	    public void givenMobileNum_WhenNotStartWith91_ShouldReturnFalse() {
	        boolean result = userRegistration.validateMobileNum("1245437234");
	        Assert.assertFalse(result);
	    }
	    @Test
		public void givenPassword_WhenMin8Chars_ShouldReturnTrue() {
			boolean result = userRegistration.validatePassword("nDj1k2*jf");
			Assert.assertTrue(result);
		}

		@Test
		public void givenPassword_WhenAtleast1UpperCase_ShouldReturnTrue() {
			boolean result = userRegistration.validatePassword("3Rmdg*nK");
			Assert.assertTrue(result);
		}

		@Test
		public void givenPassword_WhenAtleast1Number_ShouldReturnTrue() {
			boolean result = userRegistration.validatePassword("Mas1bt&Bx");
			Assert.assertTrue(result);
		}

		@Test
		public void givenPassword_WhenNoNumeric_ShouldReturnFalse() {
			boolean result = userRegistration.validatePassword("mDkk%fDB");
			Assert.assertFalse(result);
		}

		@Test
		public void givenPassword_WhenHasExact1SpecialChar_ShouldReturnTrue() {
			boolean result = userRegistration.validatePassword("mDkk%fD1");
			Assert.assertTrue(result);
		}

		@Test
		public void givenPassword_WhenNoSpecialChar_ShouldReturnFlase() {
			boolean result = userRegistration.validatePassword("mDkkfD12");
			Assert.assertTrue(result);
		}

		@Test
		public void givenPassword_WhenHasMoreThan1SpecialChar_ShouldReturnFalse() {
			boolean result = userRegistration.validatePassword("mDkk%f#D1");
			Assert.assertTrue(result);
		}

	}
