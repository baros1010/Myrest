package myrest.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFilter implements Filter{

	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest)req;
		HttpServletResponse response = (HttpServletResponse)res;
		// TODO 自動生成されたメソッド・スタブ
		if("http".equals(request.getScheme().toLowerCase())){
			System.out.println("Scheme is " + request.getScheme());
			response.sendRedirect("http://localhost:9081/myrest/");
		}else{
			System.out.println("Scheme is " + request.getScheme());
			//chain.doFilter(request, response);
			chain.doFilter(req, res);
		}
		
	}

	public void destroy() {
		// TODO 自動生成されたメソッド・スタブ
		
	}

}
