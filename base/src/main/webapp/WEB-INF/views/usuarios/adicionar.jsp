<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
		<title>Cadastrar novo usuário</title>
	</head>
	<body>
		<div class="ui form segment">
			<form action="adicionaUsuario" method="post">
				<div class="field">
					<label>Nome: </label>
					<div class="ui left labeled icon input">
						<input type="text" name="nome"  placeholder="Nome" />
						<i class="user icon"></i>
				      	<div class="ui corner label">
				        	<i class="icon asterisk"></i>
				      	</div>
					</div>
				</div>
				<div class="field">
					<label>Login: </label>
					<div class="ui left labeled icon input">
						<input type="text" name="login"  placeholder="Login" />
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
				<div class="ui buttons">
					<input type="submit" class="ui positive button" value="Cadastrar" />
					<div class="or"></div>
					<input type="reset" class="ui negative button" value="Cancelar" />
				</div>
			</form>
		</div>
		
		<div class="ui horizontal divider">
		  Ou
		</div>
		<div class="ui labeled icon button">
  			<i class="left icon"></i>
			<a href="../login">Retornar</a>
		</div>
		<script src="../resources/javascript/semantic.min.js"></script>
	</body>
</html>