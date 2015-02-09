<%@ page language="java" contentType="text/html; charset=UTF-8"
	isELIgnored="true" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<%
	String paths = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=paths%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div style="text-align:center">
		<video id="video1" width="420" src="<%=paths%>/static/video/1.mp4" controls> 
		browser does not support HTML5 video. </video>
		<br />
		<button onclick="playPause()">Play/Pause</button>
		<button onclick="makeBig()">Big</button>
		<button onclick="makeSmall()">Small</button>
		<button onclick="makeNormal()">Normal</button>

	</div>
	<br/>
	<img alt="" src="<%=paths%>/static/image/iniesta.png">
<br />
	<script language="javascript">
		var myVideo = document.getElementById("video1");

		function playPause() {
			if (myVideo.paused)
				myVideo.play();
			else
				myVideo.pause();
		}

		function makeBig() {
			myVideo.width = 560;
		}

		function makeSmall() {
			myVideo.width = 320;
		}

		function makeNormal() {
			myVideo.width = 420;
		}
	</script>
	
	<c:forTokens items="Zara,nuha,roshy" delims="," var="name">
   <c:out value="${name}"/><p>
</c:forTokens>

	<c:forEach items="${filelist}" var="item">
	<c:out value="${item}"></c:out>
	</c:forEach>
	<select>
		<c:forEach items="${filelist}" var="file">
		<option value="${file}">${file}</option>
		</c:forEach>
	</select>
</body>
</html>