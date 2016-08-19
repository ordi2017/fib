package org.fib.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fib.entity.Messenger.Payload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller 
@PropertySource("classpath:Config.properties")
@RequestMapping(value="/callback")
public class WebHookController {
	@Autowired
	private Environment env;
	
	@RequestMapping(method=RequestMethod.GET)
	public @ResponseBody  String validFb(@RequestParam("hub.challenge") String h,HttpServletRequest r,HttpServletResponse re){
		
		if(!h.equals(env.getProperty("FB.Verify_Token"))){
			return "Error Verify_Token";
		}
		return h;
		
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> receive(@RequestBody Payload o){
		
		System.out.println(o.getEntry().get(0).getId());
		System.out.println(o.toString());
		
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
}
