package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class authFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;
        
        String uri=request.getRequestURI();
        if (uri.endsWith(".css") || uri.endsWith(".js")) {
            chain.doFilter(request, response);
            return;         
        }
        if(uri.endsWith("login.html")||uri.endsWith("login")){
        	chain.doFilter(request, response);
        	return;
        }
        
        String userName=(String)request.getSession().getAttribute("userName");
        if (null == userName) {
            response.sendRedirect("login.html");
            return;//return可以结束当前的Filter,但是其目的不是结束当前filter,而是返回，从而"不运行"后面的"如果Session中没有用户信息就跳转" 的功能。
        }
        chain.doFilter(request, response);
	}
	

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
