package com.amar.web.dinner.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping( "/home" )
public class HomeController
{
	public final Logger log = Logger.getLogger( this.getClass() );

	@RequestMapping( value = "/login/{userid}" , method = RequestMethod.GET )
	public ModelAndView login( @PathVariable( "userid" ) Long userid )
	{
		log.info( "login:" + userid );
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.setViewName( "home/1" );
		modelAndView.getModelMap().put( "username" , "" + userid );
		return modelAndView;
	}

	@RequestMapping( value = "/chat" , method = RequestMethod.GET )
	public String gotoChat()
	{
		return "home/chat";
	}
	@RequestMapping( value = "/logout/{userid}" , method = RequestMethod.GET )
	public ModelAndView logout( @PathVariable( "userid" ) Long userid )
	{
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.setViewName( "home/2" );
		modelAndView.getModelMap().put( "username" , "" + userid );
		return modelAndView;
	}

	@RequestMapping( value = "/blog/{blogId}/message/{msgId}" , method = RequestMethod.DELETE )
	public ModelAndView delete( @PathVariable( "blogId" ) Long blogId , @PathVariable( "msgId" ) Long msgId , HttpServletRequest request , HttpServletResponse response )
	{

		return null;
	}

}
