<%@page contentType="text/html"%>
<%@page pageEncoding="iso-8859-1"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta http-equiv="Content-type" content="text/html; charset=iso-8859-1" />
<title>VRaptor - T�picos : Lista</title>
</head>
<body>
	<center>
		<div style="width: 400; text-align: left;">
			<a href="<c:url value="/topico/lista"/>">Voltar</a>
		</div>
		<form action="<c:url value="/topico/salvar"/>" method="post">
			<table width="400">
				<tr>
					<td width="100" align="right">Nome do Marcador</td>
					<td width="300"><input name="topico.id.marcadorpai" type="text"
						value="${topico.id.marcadorpai}"></td>
				</tr>
				<tr>
					<td width="100" align="right">Nome do T�pico</td>
					<td width="300"><input name="topico.id.nome" type="text"
						value="${topico.id.nome}"></td>
				</tr>
				<tr>
					<td colspan="2" align="right"><input type="submit"
						value="Salvar"></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>