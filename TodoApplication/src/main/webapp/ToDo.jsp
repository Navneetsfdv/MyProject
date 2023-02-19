<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import= "com.nav007.demo.list.TodoList"%>
    <%@ page import = "java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>  

  <h1>My ToDo_LIST</h1>
  
      <form action ="add">
    My Priority: <input type="text" name ="id"> <br>
    Description: <input type="text" name ="content">
      <input type="submit" value="Add">
  </form>
   <br>
    <% 
       List<TodoList> todo = (List<TodoList>)request.getAttribute("list");
    %>
   
   <% 
      for(TodoList s: todo){
	%>   
	 <%=s%>
	 <form action ="delete">
	 <input type="hidden" name="id" value="<%=s.getId() %>" >
	 <input type="submit" value="remove">

</form> 
	<br>
	<% 
	   
   }
   %>
</body>
</html>