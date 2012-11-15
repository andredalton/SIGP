<table>
	<thead>
		<tr>
			<th>Nome</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${marcadors}" var="marcador">
			<tr>
				<td>${marcador.id}</td>
				<form action="<c:url value="/marcador/editar/${marcador.id}"/>">
					<td><input type="submit" value="Editar" /></td>
				</form>
				<form action="<c:url value="/marcador/excluir/${marcador.id}"/>" method="POST">
					<input type="hidden" name="_method" value="DELETE" />
					<td><input type="submit" value="Remover" /></td>
				</form>
				<form action="<c:url value="/marcador/editartopico/${marcador.id}"/>">
					<td><input type="submit" value="Tópico" /></td>
				</form>
			</tr>
		</c:forEach>
	</tbody>
</table>

<%@ include file="/footer.jspf"%>