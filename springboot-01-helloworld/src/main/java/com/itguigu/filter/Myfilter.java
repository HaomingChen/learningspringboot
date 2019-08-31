package com.itguigu.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author 58212
 * @date 2019-09-01 2:50
 */
public class Myfilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("MyFilter process...");
        chain.doFilter(request,response);
    }

}
