package com.upworkproject.test;

import junit.framework.TestCase;

import org.springframework.web.servlet.ModelAndView;

import com.upworkproject.controller.MainController;

public class MainControllerTests extends TestCase
{

	public void testHandleRequestView() throws Exception
	{
		MainController controller = new MainController();
		ModelAndView modelAndView = controller.handleRequest(null, null);
		assertEquals("jsp/index.jsp", modelAndView.getViewName());
	}
}
