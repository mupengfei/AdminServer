package com.jesse.admin.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.support.RequestContextUtils;

import com.jesse.admin.model.dao.AUserDao;
import com.jesse.admin.model.entity.AUser;
 


@Controller
public class TestController {
	@RequestMapping("/test.do")
	public String test(HttpServletRequest request, HttpServletResponse response){
		try {
			AUserDao userDao = (AUserDao)RequestContextUtils.getWebApplicationContext(request).getBean("aUserDao");
			AUser user = userDao.getAUser();
			response.getOutputStream().print(user.getaUsername());
			response.getOutputStream().flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
