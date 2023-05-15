/*
package com.questionnaire_system.web.filter;

import jakarta.servlet.Filter;
import jakarta.servlet.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@CrossOrigin(origins = {"http://localhost:8081"}, maxAge = 3600)
public class CorsFilter implements Filter {
    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;
        // 响应头设置
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "Content-Type,Access-Token");
        chain.doFilter(req, res);
    }
    @Override
    public void init(FilterConfig filterConfig) {
    }
    @Override
    public void destroy() {
    }
}
*/
