<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@page import="model.Usuario" %>
<%@page import="dao.UsuarioDAO" %>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		try{
			Usuario usu = new Usuario();
			UsuarioDAO usudao = new UsuarioDAO();
			if(request.getParameter('nome').equals('') || request.getParameter('senha').equals('')){
				response.sendRedirect('index.jsp')	
			}else{
				
				usu.setNome(request.getParameter('nome'));
				usu.setSenha((request.getParameter('senha'));
				usudao.incuir(usu);				
			}			
		}catch(Exception erro){
			throw new RuntimeException("Erro 7" + erro);
			
		}
		
	%>
</body>
</html>