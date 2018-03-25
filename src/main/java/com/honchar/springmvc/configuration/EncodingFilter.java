package com.honchar.springmvc.configuration;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
// Class enconding page on utf-8
public class EncodingFilter implements Filter {

	private String encoding = "utf-8";

	public void doFilter(ServletRequest request,

	ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
		request.setCharacterEncoding(encoding);
		filterChain.doFilter(request, response);
	}

	public void init(FilterConfig filterConfig) throws ServletException {
		String encodingParam = filterConfig.getInitParameter("encoding");
		if (encodingParam != null) {
			encoding = encodingParam;
		}
	}

	public void destroy() {
		// nothing todo
	}

	

}

//<filter>
//<filter-name>EncodingFilter</filter-name>
//<filter-class>
//	org.apache.catalina.filters.SetCharacterEncodingFilter
//</filter-class>

//<init-param>
//	<param-name>encoding</param-name>
//	<param-value>utf-8</param-value>
//</init-param>

//</filter>
//<filter-mapping>
//<filter-name>EncodingFilter</filter-name>
//<url-pattern></url-pattern>
//</filter-mapping>