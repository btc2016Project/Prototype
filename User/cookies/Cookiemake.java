package cookies;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cookiemake {

    public static String getCookie(HttpServletRequest request, String un) {
	Cookie[] cookies = request.getCookies();
	String result = null;
	if (cookies != null) {
	    for (Cookie cookie : cookies) {
		if (un.equals(cookie.getName())) {
		    result = cookie.getValue();
		    break;
		}
	    }
	}
	return result;
    }

    public static void setCookie(HttpServletRequest request,
	    HttpServletResponse response, String path, String un, String value,
	    int maxAge) {
	Cookie cookie = new Cookie(un, value);
	cookie.setMaxAge(maxAge);
	cookie.setPath(path);
	if ("https".equals(request.getScheme())) {
	    cookie.setSecure(true);
	}
	response.addCookie(cookie);

    }
}
