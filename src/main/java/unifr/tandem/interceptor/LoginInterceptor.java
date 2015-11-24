package main.java.unifr.tandem.interceptor;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import com.opensymphony.xwork2.interceptor.Interceptor;
import main.java.unifr.tandem.domain.User;
import org.apache.struts2.StrutsStatics;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Checks if it is valid session after login
 */
public class LoginInterceptor implements Interceptor, StrutsStatics, Preparable, ModelDriven<User> {

	User user;

	@Override
	public void destroy() {
	}

	@Override
	public void init() {
	}

	/*
	 * Check if it is valid user session.
	 */
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		final ActionContext context = invocation.getInvocationContext();
		HttpServletRequest request = (HttpServletRequest) context.get(HTTP_REQUEST);
		HttpSession session = request.getSession(true);
		Object user = session.getAttribute("user");
		if (user == null) {
			return "error";
		} else {
			return invocation.invoke();
		}
	}

	@Override
	public User getModel() {
		return user;
	}

	@Override
	public void prepare() throws Exception {
		user = new User();
	}
}
