<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<form action="findList" method="post">
	品牌<select name="bid" id="bid">
	<option value=""></option>
	</select>
	<select name="kid" id="kid">
	种类	<option value=""></option>
	</select>
	<br>
	单价范围<input name="sp"> 到 <input name="ep">
	<br>
	商品名称<input name="gname">
	
	<input value="搜索" type="submit">
	<a href="add.jsp">添加</a>
</form>
	<table>
  <tr>
    <th>商品编号</th>
    <th>商品名称</th>
    <th>英文名称</th>
    <th>商品品牌</th>
    <th>商品种类</th>
    <th>尺寸</th>
    <th>单元（价）</th>  
    <th>数量</th>
    <th>标签</th>
    <th>商品图片</th>
  </tr>
  <c:forEach var="l" items="${page.list }">
  <tr>
    <td>${l.gid  }</td>
    <td>${l.gname}</td>
    <td>${l.ename }</td>
    <td>${l.bname  }</td>
    <td>${l.kname  }</td>
    <td>${l.size }</td>
    <td>${l.price }</td>
    <td>${l.gnum }</td>
    <td>${l.label }</td>
    <td>${l.picurl }</td>
  </tr>
  </c:forEach>
  <tr>
  	<td colspan="10"> 
  	
  	<a href="findList?pageNum=1">首页</a>
  	<a href="findList?pageNum=${page.isFirstPage ? 1 : page.prePage }">上一页</a>
  	<a href="findList?pageNum=${page.isLastPage ? page.lastPage : page.nextPage }">下一页</a>
  	<a href="findList?pageNum=${page.lastPage  }">尾页</a>
  	共	${page.pages }页
  	<br>
  	<form action="findList" method="post">
  	到第<input name="pageNum"> 页
	<input value="跳转" type="submit">
  	</form>
  	</td>
  </tr>
</table>

</body>
</html>