<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 <!DOCTYPE HTML>
<html lang="pt-br">
	<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" type="text/css" href="resources/css/semantic.min.css">
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
		<title>Login</title>
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
		<div class="ui form segment">
			<form action="login" method="post">
				<div class="field">
					<label>Login: </label>
					<div class="ui left labeled icon input">
						<input type="text" name="login" placeholder="Login" />
						<i class="user icon"></i>
				      	<div class="ui corner label">
				        	<i class="icon asterisk"></i>
				      	</div>
					</div>
				</div>
				<div class="field">
					<label>Senha: </label>
					<div class="ui left labeled icon input">
						<input type="password" name="senha" placeholder="Senha" /> <br/>
						<i class="lock icon"></i>
			      		<div class="ui corner label">
			        		<i class="icon asterisk"></i>
			     		</div>
			    	</div>
				</div>
				<input type="submit" class="ui blue submit button" value="Acessar" />
			</form>
		</div>
		
		<div class="ui horizontal divider">
		  Ou
		</div>
  		
		<a href="usuario/novo" class="ui labeled icon button">
			Criar novo usuário
			<i class="add sign icon"></i>
		</a>
		
		<script src="resources/javascript/semantic.min.js"></script>
	</body>
</html>
