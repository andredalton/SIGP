
<center>
	<div style="width: 400; text-align: left;">
		<a href="<c:url value="/tags"/>">Voltar</a>
	</div>
	<form action="<c:url value="/topic/save"/>" method="post">
		<table width="400">
			<tr>
				<td width="100" align="right">Nome do Marcador</td>
				<td width="300"><input name="topico.id.marcadorpai" type="text"
					value="${topico.id.marcadorpai}"></td>
			</tr>
			<tr>
				<td width="100" align="right">Nome do Tópico</td>
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