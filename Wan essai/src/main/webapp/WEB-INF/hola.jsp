<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>Hola vosotros</p>


	<p>

	<c:out value="${variable}" default="wesh tonton"></c:out>
	</p>

	<p>
		<%
		String heure = (String) request.getAttribute("heure");

		int i;
		for (i = 0; i < 11; i++) {
			String ligne = String.valueOf(i);

			out.println("nous sommes à la ligne :" + ligne + " de cette application <br />");

			if (i >= 10) {
				out.println("nous sommes à la fin de cette application  maintenant: " + heure);
			}
		}
		%>
	</p>



	<c:choose>
		<c:when test="${ !empty form.resultat }">
			 ${ form.resultat }
        </c:when>
		<c:otherwise>
			Hola 
        </c:otherwise>
	</c:choose>




	<form method="post" action="bonjour">
		<p>
			 <label for="login">login:</label>
			 <input type="text" name="login" id="login" />
		</p>
			<p>
			 <label for="pass">contraseña :</label>
			 <input type="password" name="pass" id="pass" />
		</p>
		<input type="submit" />

	</form>
</body>
</html>