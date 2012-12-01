<table>
	<thead>
		<tr>
			<th>Nome</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${topicos}" var="topico">
			<tr>
				<td>${topico.id.nome}</td>
				<form action="<c:url value="/topico/editar/${topico.id.nome}/${topico.id.marcadorpai}"/>">
					<td><input type="submit" value="Editar" /></td>
				</form>
				<form action="<c:url value="/topico/${topico.id.nome}/${topico.id.marcadorpai}"/>" method="POST">
					<input type="hidden" name="_method" value="DELETE" />
					<td><input type="submit" value="Remover" /></td>
				</form>
			</tr>
		</c:forEach>
	</tbody>
</table>

<%@ include file="/footer.jspf"%>