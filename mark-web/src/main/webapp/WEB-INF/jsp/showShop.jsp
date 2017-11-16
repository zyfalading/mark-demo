<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>显示商品</title>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		var html="";
		$.ajax({
			
			type:'POST',
			url:'/mark-web/showshop',
			success:function(data){
				alert(data.shopname);
				$("tbody").html(html);
			}
		});
	});
</script>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>编号</th>
				<th>名称</th>
				<th>价格</th>
				<th>创建时间</th>
				<th>更新时间</th>
			</tr>
		</thead>
		<tbody>
		</tbody>	
	</table>
</body>
</html>