<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/css.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
<script type="text/javascript">
$(function(){
	$.post("query",function(back){
		var b =back.brand
		var k =back.kind
		
		var bb ="";
		for(var b in arr){
			bb="<option value='"+arr[b].bid+"'>"+arr[b].bname+"</option>"
		}
		var kk ="";
		for(var k in arr){
			kk="<option value='"+arr[k].kid+"'>"+arr[k].kname+"</option>"
		}
		$("#bid").append(bb);
	
		$("#kid").append(kk);
	
	},"json")
})
</script>
</head>
<body>
	<form action="add" method="post" enctype="multipart/form-data">
	商品名称<input name="gname"> <br>
	英文名称<input name="ename"> <br>
	品牌<select name="bid" id="bid">
		
	</select><br>
	种类<select name="kid" id="kid">
	
	</select><br>
	尺寸<input name="size"><br>
	单元（价）<input name="price"><br>
	数量<input name="gnum"><br>
	标签<input name="label"><br>
	图片上传<input name="file" type="file"><br>
	<input value="添加" type="submit">
	</form>
</body>
</html>