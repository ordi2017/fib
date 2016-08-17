package org.fib.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class WebHookController {

	private Log logger = LogFactory.getLog(this.getClass());
	
	@RequestMapping(value="/callback",method=RequestMethod.GET)
	public void validFb(HttpServletRequest r,HttpServletResponse re){
		String token=(String)r.getAttribute("hub.challenge");
	
		logger.debug("hub challenge : "+token );
	
		
	}
	
	
}
