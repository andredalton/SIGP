<div id="wrapper">
	<div id="content" class="cont-left">
    	<div id="page-headline">
			<div id="page-headline-inner">
				<div id="page-title">
					<h2>${person.nomecompleto}</h2>
					<p>${person.tipodecolaborador}</p>
				</div>
			</div>
		</div>
		<div class="fotoCurriculo">
			<img src="<c:url value='/img/avatar.jpg'/>" class="colaboradorFoto" title="${person.apelido}" alt="${person.apelido}" />
		</div>
		<div id="curriculo">
			<p>
				<span id="_t15">${person.shortbioportugues}</span>
			</p>
			<p>
				<strong>e-mail</strong>
				: ${person.email}
			</p>
			<p>
				<strong>CV</strong>
				: <a class="colaborador" href="${person.cvurl}">${person.cvurl}</a>
			</p>
			
			<div style="display: inline-block;">
				<h2>Publications</h2>
				
				${person}
				
			</div>
		</div>
		
		<%
			if (isUser) {
		%>
			<div class="separator"></div>
			<a href="<c:url value='/people/delete/'></c:url>${person.id}">Delete this Collaborator</a>
		<%
			}
		%>
	</div>
</div>  


