package com.example.filters;

import static com.netflix.zuul.context.RequestContext.getCurrentContext;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;


// URL to be called : http://localhost:8086/api/tollproxy/tollrate/3?source=mobile
public class ProxyFilter extends ZuulFilter {

	@Override
	public Object run() {
		System.out.println("calling a filter!");
		return null;
	}

	@Override
	public boolean shouldFilter() {
		boolean isMobile = false;
		RequestContext ctx = getCurrentContext();
		String param = ctx.getRequest().getParameter("source");
		
		if(param !=null && param.equals("mobile")) {
			isMobile = true;
		}
		return isMobile;
	}

	@Override
	public int filterOrder() {
		return 1;
	}

	@Override
	public String filterType() {
		return "pre";
	}
}
