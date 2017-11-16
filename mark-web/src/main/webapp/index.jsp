<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Dubbo Demo</title>
	<script type="text/javascript" src="/DubboTest-web/js/jquery.min.js"></script>
	<script type="text/javascript">
		$(function(){
			var html ='';
			$.ajax({
				  type:'post',
				  url: '/DubboTest-web/accountInfo',
				  success: function(data) {
				    for (var i = 0; i < data.length; i++) {
						
						html +="<table><tr><td>"+
								data[i].id+"</td><td>"+
								data[i].name+"</td><td>"+
								data[i].age+"</td><td>"+
								data[i].sex+"</td></tr></table>"
					}
				    $("#view").append(html);
				  }
				});
			
			
			
		});
	</script>
</head>
<body>
	<div id="view">
	</div>
</body>
</html>