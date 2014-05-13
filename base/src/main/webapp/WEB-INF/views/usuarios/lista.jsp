<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt"  uri="http://java.sun.com/jsp/jstl/fmt"%>
 <!DOCTYPE HTML>
<html lang="pt-br">
	<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" type="text/css" href="../resources/css/semantic.min.css">
		<link href='http://fonts.googleapis.com/css?family=Abel' rel='stylesheet' type='text/css'>
		<style type="text/css">
		    * {
		        font-family: 'Open Sans', sans-serif;
		        font-size: 14px;
		    }
		    a{
		    	text-decoration: none;
		    }
		</style>
		<title>Listagem de usuários</title>
	</head>
	<body>
		<table class="ui table segment">
			<thead>
				<tr>
					<th>Nome</th>
					<th>Login</th>
			</thead>
			<tbody>
				<c:forEach items="${usuarios}" var="usuarios">
				<tr>
					<td>${usuarios.nome}</td>
					<td>${usuarios.login}</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		<script src="../resources/javascript/semantic.min.js"></script>
	</body>
</html>