<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE>
<html>
<head>
<meta charset="UTF-8">
<title>RESPUESTA</title>
</head>
<body>
<h2>Hola ALUMNO</h2>${param.nombreAlumno}. Bienvenido al Curso de Spring
<br>
<!--  rutas relativas de dos formas -->
<img alt="foto" src="${pageContext.request.contextPath}/recursos/imgs/foto.jpg" hight="140" width="140">
<br>
<img alt="foto" src="/ProyectoSpringDos/recursos/imgs/foto.jpg" hight="140" width="140">

<!--  ruta absoluta -->
<img alt="foto" src="C:\WEB\ProyectoSpringDos\WebContent\recursos\imgs\foto.jpg" hight="140" width="140">


<p><br>
<h2>Atención a todos</h2>
${mensajeClaro}
</p>
 
</body>
</html>