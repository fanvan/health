package com.health.web.interceptor;


import java.util.HashSet;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class PermissionInterceptor extends HandlerInterceptorAdapter {

	public static final String ADMIN_LOGIN = "admin_login";

	private Set<String> exclude = new HashSet<String>();

	public PermissionInterceptor() {
		this.exclude.add("/admin/login.htm");
		this.exclude.add("/admin/login.do");
		this.exclude.add("/admin/getidentCode.jpg");
		this.exclude.add("/admin/permission_error.htm");
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		String uri = request.getRequestURI();
		if (this.exclude.contains(uri)) {
			return true;
		}

		if (StringUtils.startsWith(uri, "/admin/")) {
			Object status = request.getSession().getAttribute("status");
			if ("login".equals(status)) {
				return true;
			}
			response.sendRedirect("/admin/login.htm");
			return false;
		}
		return true;
	}
}
