<div id="wrapper">
	<div id="content" class="cont-left">
		<c:choose>
			<c:when test="${userIsLogged}">
				<div id="side-contents">
					<fmt:message key="misc.acoes"></fmt:message>
					<hr />
					<a href="novo"><fmt:message key="novo" /></a>
				</div>
			</c:when>
			<c:otherwise>
				<div id="side-contents" class="hidden"></div>
			</c:otherwise>
		</c:choose>
    
    	<div id="page-headline">
			<div id="page-headline-inner">
				<div id="page-title">
					<h2>${person.nomecompleto}</h2>
					<p>${person.tipodecolaborador}</p>
				</div>
			</div>
		</div>
		<div class="fotoCurriculo">
			<img src="<c:url value='/images/colaborator.jpg'/>" class="colaboradorFoto" title="${person.apelido}" alt="${person.apelido}" />
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
	</div>
</div>  


