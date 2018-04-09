package com.example.demospringboot.interceptor;

import org.apache.catalina.connector.RequestFacade;
import org.springframework.core.MethodParameter;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.method.support.InvocableHandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;

/**
 * 检查接口通用参数
 */
public class CheckInterceptor extends HandlerInterceptorAdapter {
    public CheckInterceptor() {
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println(request.getRequestURI());
        HandlerMethod method = (HandlerMethod)handler;
        for (MethodParameter parameter : method.getMethodParameters()) {

        }
        return false;
    }
}
