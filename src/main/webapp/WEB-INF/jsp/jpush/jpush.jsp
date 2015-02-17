<%@ page language="java" contentType="text/html; charset=UTF-8"
	isELIgnored="false" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="/dinner/static/js/jquery-1.11.2.min.js"></script>
<script type="text/javascript">

function goSubmit()
{
	var appkey = $("#appkey").val();
	var tag = $("#tag").val();
	var msg = $("#msg").val();
	
	var path="http://localhost/dinner/jpush/go/"+appkey+"/"+tag+"/"+msg;
	
	console.log(path);
	$.ajax({
	 type: "get",
        url: path,
        contentType: "application/json; charset=utf-8",
        //data: "{'dateTime':'" + $("#reservation").val() + "','pg':" + page + "}",
        success: function(datas){
        	//var result = eval('(' + datas + ')');
        	//alert(result.status+":"+result.infomation);
        	alert("123");
        },
        error: function (jqXHR, textStatus, errorThrown){
        	var err;
	    	if (textStatus !== "abort" && errorThrown !== "abort") 
	    	{
		        try 
		        {
		            err = $.parseJSON(jqXHR.responseText);
		            alert(err.Message);
		        } catch(e) {
		            alert("ERROR:\n" + jqXHR.responseText);
		        }
    		}
        }
	});
    
}

  	
</script>
</head>
<body>
1.jsp ${username}<br/>

<form action="">
appkey:<input id="appkey" type="text" value="f4a5faf32e341076eab417dc" /><br/>
tag:<input id="tag" type="text" value="amar" /><br/>
msg:<input id="msg" type="text" value="ssssssss" /><br/>
<button onclick="goSubmit()">发送</button>
</form>

</body>
</html>