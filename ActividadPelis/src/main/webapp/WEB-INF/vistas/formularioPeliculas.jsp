<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<script type="application/javascript">

//Dry stick Javascript

function volver(){
	let href = window.location.href
	if(href.includes("/seleccionarPelicula")) {
		window.location.href = '../listadoPeliculas'
	} else {
		window.location.href = 'listadoPeliculas'
	}
}

function vaciar(){
	document.getElementById("formulario").reset()

	//HACER ESTO DE MANERA CORRECTA PARA VACIAR EL FORMULARIO

}

function enviarFormulario(path){
	formulario.action = path
	formulario.submit()
}

//Hacer que puedas modificar pel�cula y borrarla









window.onload = function(){
	document.getElementById("btnVolver").onclick = volver
	document.getElementById("btnVaciar").onclick = vaciar
	document.getElementById("btnInsertar").onclick = function() { enviarFormulario("insertarPelicula") }
	document.getElementById("btnModificar").onclick = function() { enviarFormulario("modificarPelicula/${pelicula.id}") }
	document.getElementById("btnBorrar").onclick = function() { enviarFormulario("borrarPelicula/${pelicula.id}") }
}

</script>

<body>

	<h1 align="center">
		<font color="lightGreen">
			Formulario de pel�culas
		</font>
	</h1>
	
	<div align="center">
		<h2>${mensaje}</h2>
	</div>
	
	<!-- 
	<form method="POST" id="formulario">
		<div align="center">
			<input type="button" id="btnInsertar"  value="Insertar"  />
			<input type="button" id="btnModificar" value="Modificar" />
			<input type="button" id="btnBorrar"    value="Borrar"    />
			<input type="button" id="btnVaciar"    value="Vaciar"/>
			<input type="button" id="btnVolver"    value="Volver"/>
		</div>
		
		<p/>
		
		<table align="center">
			<tr>
				<td>T�tulo</td>
				<td>
					<input type="text" name="pelicula.titulo" value=""/>
				</td>
			</tr>	
			<tr>
				<td>Director</td>
				<td>
					<input type="text" name="pelicula.director" value=""/>
				</td>
			</tr>	
			<tr>
				<td>G�nero</td>
				<td>
					<input type="text" name="pelicula.genero" value=""/>
				</td>
			</tr>	
			<tr>
				<td>Fecha</td>
				<td>
					<input type="text" name="pelicula.fechaEstreno" value=""/>
				</td>
			</tr>	
		</table>
	
	</form>
	-->


	<form:form id="formulario" method="POST" modelAttribute="pelicula">

	
		<div align="center">
			<input type="button" id="btnInsertar"  value="Insertar"  />
			<input type="button" id="btnModificar" value="Modificar" />
			<input type="button" id="btnBorrar"    value="Borrar"    />
			<input type="button" id="btnVaciar"    value="Vaciar"/>
			<input type="button" id="btnVolver"    value="Volver"/>
		</div>
		
		<p/>
		
		<table align="center">
			<tr>
				<td>ID</td>
				<td>
					<form:input path="id" id="id"/>
				</td>
			</tr>
			<tr>
				<td>T�tulo</td>
				<td>
					<form:input path="titulo" id="titulo"/>
				</td>
			</tr>	
			<tr>
				<td>Director</td>
				<td>
					<form:input path="director" id="director"/>
				</td>
			</tr>

			<tr>
				<td>G�nero</td>
				<td>
					<form:select path="genero">
						<form:option value="" label="-- Selecciona g�nero --" />
						<c:forEach items="${generos}" var="g">
							<form:option value="${g}">${g}</form:option>
						</c:forEach>
					</form:select>
				</td>
			</tr>
			<tr>
				<td>Fecha</td>
				<td>
					<form:input path="year" id="year"/>
				</td>
			</tr>	
		</table>
	
	</form:form>

</body>
</html>
