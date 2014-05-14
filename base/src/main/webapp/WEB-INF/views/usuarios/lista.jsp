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
		<div class="ui menu">
		  <a class="active item">
		    <i class="home icon"></i> Início
		  </a>
		  <a class="item" href="usuario/lista">
		    <i class="users icon"></i> Usuários
		  </a>
		  <div class="right menu">
		    <div class="item">
		      <div class="ui icon input">
		        <input type="text" placeholder="Search...">
		        <i class="search link icon"></i>
		      </div>
		    </div>
		  </div>
		</div>
		<table class="ui table segment">
			<thead>
				<tr>
					<th></th>
					<th>Nome</th>
					<th>Login</th>
					<th></th>
			</thead>
			<tbody>
				<c:forEach items="${usuarios}" var="usuarios">
				<tr>
					<td><a href="edita?id=${usuarios.id}"><i class="blue pencil icon"></i></a></td>
					<td>${usuarios.nome}</td>
					<td>${usuarios.login}</td>
					<td><a href="remove?id=${usuarios.id}"><i class="remove circle red icon"></i></a></td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		<script src="../resources/javascript/semantic.min.js"></script>
	</body>
</html>