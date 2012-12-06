<div id="wrapper">
	<div id="content" class="cont-left"> 
		<table>
			<thead>
				<tr>
					<th>Name</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${marcadors}" var="marcador">
					<tr>
						<td>${marcador.id}</td>
						<form action="<c:url value="/tag/edit/${marcador.id}"/>" method="GET">
							<td><input type="submit" value="Edit" /></td>
						</form>
						<form action="<c:url value="/tag/delete/${marcador.id}"/>" method="GET">
							<td><input type="submit" value="Delete" /></td>
						</form>
						<form action="<c:url value="/tag/topic/${marcador.id}"/>" method="GET">
							<td><input type="submit" value="Topic" /></td>
						</form>
					</tr>
				</c:forEach>
					<tr>
						<a href="<c:url value="/tag/new/"/>">New tag</a>
					</tr>
			</tbody>
		</table>
	</div>
</div>