package User.validateCheck;

import User.exception.ThrowsException;

public class ValidateCheck {

    public static void numberException(String un) throws ThrowsException {
	// 定数クラスで設定----
	int NUM_MAX_NAME = 15;
	// -----
	int userNameLength = un.length();
	if (userNameLength <= 0 || userNameLength >= NUM_MAX_NAME) {
	    throw new ThrowsException();
	}
    }

    public static void passwordException(String pass) throws ThrowsException {
	// 定数クラスで設定-----
	int NUM_MAX_PASS = 8;
	// -------------------------
	int passwordLength = pass.length();
	if (passwordLength <= 0 || passwordLength >= NUM_MAX_PASS) {
	    throw new ThrowsException();
	}

    }

    public static void wordException(String word) throws ThrowsException {
	// 定数クラスで設定-----
	int NUM_MAX_WORD = 8;
	// -------------------------
	int wordLength = word.length();
	if (wordLength <= 0 || wordLength >= NUM_MAX_WORD) {
	    throw new ThrowsException();
	}

    }

}
