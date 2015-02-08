<%@ page language="java" contentType="text/html; charset=UTF-8"
	isELIgnored="false" pageEncoding="UTF-8"%>
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
</body>
</html>