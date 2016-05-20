package User.validateCheck;

import User.exception.ThrowsException;

public class PasswordCheck {
	/**
     * パスワード文字列長
     * @author okamoto
     */
    public boolean passWordCheck(String pass) {
	boolean PassFlag = false;
	try {
	    ValidateCheck.passwordException(pass);
	} catch (ThrowsException e) {
	    PassFlag = true;
	}
	return PassFlag;

    }

}
