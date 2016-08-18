package org.fib.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller 
public class WebHookController {

	private Log logger = LogFactory.getLog(this.getClass());
	
	@RequestMapping(value={"/","/callback"},method=RequestMethod.GET)
	public @ResponseBody  String validFb(@RequestParam("hub.challenge") String h,HttpServletRequest r,HttpServletResponse re){
		System.out.println("ok");
		System.out.println("hub challenge : "+h);
		return h;
		
	}
	
	
}
