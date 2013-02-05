<table>
	<thead>
		<tr>
			<th>Nome</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${lines}" var="line">
			<tr>
				<td>${line.id.nome}</td>
				<form action="<c:url value="/line/edit/${line.id.nome}"/>">
					<td><input type="submit" value="Editar" /></td>
				</form>
				<form action="<c:url value="/line/delete/${line.id.nome}"/>" method="POST">
					<input type="hidden" name="_method" value="DELETE" />
					<td><input type="submit" value="Remover" /></td>
				</form>
			</tr>
		</c:forEach>
	</tbody>
</table>