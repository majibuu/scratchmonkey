package test;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.caucho.hessian.client.HessianProxyFactory;

@SuppressWarnings("serial")
public class AppEngineTestServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException
	{
		resp.setContentType("text/plain");

		String url = "http://voodoodyne.appspot.com/hello";

		HessianProxyFactory factory = new HessianProxyFactory();
		factory.setHessian2Request(true);
		Hello hell = (Hello)factory.create(Hello.class, url);

		resp.getWriter().println("hello(): " + hell.hello("Jeff2"));
	}
}