package com.amar.web.dinner.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.jpush.api.JPushClient;
import cn.jpush.api.common.resp.APIConnectionException;
import cn.jpush.api.common.resp.APIRequestException;
import cn.jpush.api.push.PushResult;
import cn.jpush.api.push.model.Options;
import cn.jpush.api.push.model.Platform;
import cn.jpush.api.push.model.PushPayload;
import cn.jpush.api.push.model.audience.Audience;
import cn.jpush.api.push.model.audience.AudienceTarget;
import cn.jpush.api.push.model.notification.AndroidNotification;
import cn.jpush.api.push.model.notification.IosNotification;
import cn.jpush.api.push.model.notification.Notification;
import cn.jpush.api.push.model.Message;

@Controller
@RequestMapping( "/jpush" )
public class JpushController
{
	public final Logger log = Logger.getLogger( this.getClass() );

	@RequestMapping( value = "/" , method = RequestMethod.GET )
	public ModelAndView list()
	{
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.setViewName( "jpush/jpush" );

		return modelAndView;
	}

	@RequestMapping( value = "/go/{appkey}/{tag}/{msg}" , method = RequestMethod.GET )
	public @ResponseBody
	Result goall( @PathVariable( "appkey" ) String appkey , @PathVariable( "tag" ) String tag , @PathVariable( "msg" ) String msg )
	{
		Result result = new Result( 1 , "success" );

		System.out.println( result.toString() );
		return result;
	}

	public class Result
	{
		private int status;

		private String infomation;

		public Result( int status , String infomation )
		{
			super();
			this.status = status;
			this.infomation = infomation;
		}

		public int getStatus()
		{
			return status;
		}

		public void setStatus( int status )
		{
			this.status = status;
		}

		public String getInfomation()
		{
			return infomation;
		}

		public void setInfomation( String infomation )
		{
			this.infomation = infomation;
		}

		@Override
		public String toString()
		{
			return "Result [status=" + status + ", infomation=" + infomation + "]";
		}

	}
//以下是jpush推送的原代码
	private static final String appKey = "dd1066407b044738b6479275";

	private static final String masterSecret = "2b38ce69b1de2a7fa95706ea";

	public static final String TITLE = "Test from API example";

	public static final String ALERT = "Test from API Example - alert";

	public static final String MSG_CONTENT = "Test from API Example - msgContent";

	public static final String REGISTRATION_ID = "0900e8d85ef";

	public static final String TAG = "tag_api";

	//
	public void testSendPush()
	{
		// HttpProxy proxy = new HttpProxy("localhost", 3128);
		// Can use this https proxy: https://github.com/Exa-Networks/exaproxy
		JPushClient jpushClient = new JPushClient( masterSecret , appKey , 3 );

		// For push, all you need do is to build PushPayload object.
		PushPayload payload = buildPushObject_all_all_alert();

		try
		{
			PushResult result = jpushClient.sendPush( payload );
			log.info( "Got result - " + result );

		}
		catch ( APIConnectionException e )
		{
			log.error( "Connection error. Should retry later. " , e );

		}
		catch ( APIRequestException e )
		{
			log.error( "Error response from JPush server. Should review and fix it. " , e );
			log.info( "HTTP Status: " + e.getStatus() );
			log.info( "Error Code: " + e.getErrorCode() );
			log.info( "Error Message: " + e.getErrorMessage() );
			log.info( "Msg ID: " + e.getMsgId() );
		}
	}

	public static PushPayload buildPushObject_all_all_alert()
	{
		return PushPayload.alertAll( ALERT );
	}

	public static PushPayload buildPushObject_all_alias_alert()
	{
		return PushPayload.newBuilder().setPlatform( Platform.all() ).setAudience( Audience.alias( "alias1" ) ).setNotification( Notification.alert( ALERT ) ).build();
	}

	public static PushPayload buildPushObject_android_tag_alertWithTitle()
	{
		return PushPayload.newBuilder().setPlatform( Platform.android() ).setAudience( Audience.tag( "tag1" ) ).setNotification( Notification.android( ALERT , TITLE , null ) ).build();
	}

	public static PushPayload buildPushObject_android_and_ios()
	{
		return PushPayload
				.newBuilder()
				.setPlatform( Platform.android_ios() )
				.setAudience( Audience.tag( "tag1" ) )
				.setNotification(
						Notification.newBuilder().setAlert( "alert content" ).addPlatformNotification( AndroidNotification.newBuilder().setTitle( "Android Title" ).build() )
								.addPlatformNotification( IosNotification.newBuilder().incrBadge( 1 ).addExtra( "extra_key" , "extra_value" ).build() ).build() ).build();
	}

	public static PushPayload buildPushObject_ios_tagAnd_alertWithExtrasAndMessage()
	{
		return PushPayload
				.newBuilder()
				.setPlatform( Platform.ios() )
				.setAudience( Audience.tag_and( "tag1" , "tag_all" ) )
				.setNotification(
						Notification.newBuilder().addPlatformNotification( IosNotification.newBuilder().setAlert( ALERT ).setBadge( 5 ).setSound( "happy" ).addExtra( "from" , "JPush" ).build() )
								.build() ).setMessage( Message.content( MSG_CONTENT ) ).setOptions( Options.newBuilder().setApnsProduction( true ).build() ).build();
	}

	public static PushPayload buildPushObject_ios_audienceMore_messageWithExtras()
	{
		return PushPayload.newBuilder().setPlatform( Platform.android_ios() )
				.setAudience( Audience.newBuilder().addAudienceTarget( AudienceTarget.tag( "tag1" , "tag2" ) ).addAudienceTarget( AudienceTarget.alias( "alias1" , "alias2" ) ).build() )
				.setMessage( Message.newBuilder().setMsgContent( MSG_CONTENT ).addExtra( "from" , "JPush" ).build() ).build();
	}
}
