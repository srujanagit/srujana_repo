package com.mms.interceptor;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.mms.dto.User;

public class UserInterceptor extends HandlerInterceptorAdapter {



	public boolean postHandle(HttpServletRequest request, HttpServletResponse response,
            Object handler)throws Exception
	{
		
		User u1= new User();
		String s1 = u1.getState();
		if(s1 != "kansas"){
			response.getWriter().write("Students From " + s1 +" are Not Eligible ");
			return false;
		}
		else {
			return true;
		}
		
	}
}
