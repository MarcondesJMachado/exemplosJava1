<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import = "br.edu.usj.lp2.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pessoa</title>
</head>
<body>
<% 
 Pessoa p = new Pessoa();

 p.setNome ("Marcondes");
 
 p.setEmail("marcondesjorgemachado@gmail.com");
 
 out.print (p.getNome()  + " - " + p.getEmail());
 
 
 
 
 
 %>
 
</body>
</html>