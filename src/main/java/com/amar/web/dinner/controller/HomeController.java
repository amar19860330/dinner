package com.amar.web.dinner.controller;

import java.io.File;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.amar.web.dinner.db.dao.Menu_typeDAO;
import com.amar.web.dinner.db.model.Menu_type;
import com.amar.web.dinner.util.ProjectConfig;

;

@Controller
@RequestMapping( "/home" )
public class HomeController
{
	public final Logger log = Logger.getLogger( this.getClass() );

	@Resource( name = "menu_typeDAO" )
	Menu_typeDAO menu_typeDAO;

	@Resource( name = "projectConfig" )
	ProjectConfig projectConfig;

	@RequestMapping( value = "/login/{userid}" , method = RequestMethod.GET )
	public ModelAndView login( @PathVariable( "userid" ) Long userid )
	{
		log.info( "login:" + userid );
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.setViewName( "home/1" );
		modelAndView.getModelMap().put( "username" , "" + userid );

		List<Menu_type> list = menu_typeDAO.findMenu_type( new Menu_type() );

		log.info( "login:" + list.size() );

		return modelAndView;
	}

	@RequestMapping( value = "/chat" , method = RequestMethod.GET )
	public String gotoChat()
	{
		return "home/chat";
	}

	@RequestMapping( value = "/video" , method = RequestMethod.GET )
	public String gotoVideo()
	{
		return "home/video";
	}

	@RequestMapping( value = "/videos" , method = RequestMethod.GET )
	public ModelAndView gotoVideos(HttpServletRequest request , HttpServletResponse response)
	{

		log.info( "" + projectConfig.getVideopath() );

		File videoRootFile = new File( projectConfig.getVideopath() );
		
		String[] fileList = videoRootFile.list();
		
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.setViewName( "home/video" );
		
		modelAndView.getModel().put( "filelist" , fileList );
		
		return modelAndView;
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
