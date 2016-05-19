package User.validateCheck;

import User.exception.ThrowsException;

public class UserNameTest {
	/**
     * Username check
     * @author okamoto
     *
     */
    public boolean userNameTest(String un) {
	boolean UserFlag = false;
	try {
	    ValidateCheck.numberException(un);
	} catch (ThrowsException e) {
	    UserFlag = true;
	}
	return UserFlag;
    }

}
