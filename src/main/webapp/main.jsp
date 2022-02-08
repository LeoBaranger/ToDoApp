<%@ page import ="java.util.*" %>
<%@ page import ="com.model.SimpleToDo" %>

<!DOCTYPE html>
<html>
	<body>
		<h1>
		    My TODO App
		</h1>
		<%
		ArrayList<SimpleToDo> result= (ArrayList<SimpleToDo>) request.getAttribute("todos");
		
		for(SimpleToDo todo : result){
			out.println("Title : " +todo.getTitle()+ " State : " + (todo.isDone()?"Done":"To do") + "<form method=\"post\" action=\"changetodone\"><input type=\"checkbox\" id=\"changetodone\" name=\"changetodone\" value=\"newsletter\"><button type=\"submit\">Confirm</button></form><br>");
		}
		
		
		%>
	</body>
</html>