<!----------- TITLE ---------->
<div id="page-headline">
	<div id="page-headline-inner">  
		<div id="page-title">
			<h2>People</h2>
		</div><!-- end page-title -->           
	</div><!-- end page-headline-inner -->
	<div class="separator"></div>   
</div><!-- end page-headline -->

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
    
		<div id="contents">
		
		
				ijashdibeebfwa
				
				
				
				${peoples}
				
				<c:forEach items="${peoples}" var="person">
					<tr>
						<td>${person.id}</td>
						<td>${person.nomecompleto}</td>
					</tr>
				</c:forEach>
		
		
		
		
			<h2 class="top"><fmt:message key="header.contribuintes" /></h2>

			<ul class="membro">
				<c:forEach items="${contribuintes}" var="contrib">
					<li>
						<div class="left">
							<a href="/SIGP/contribuinte/ver/${contrib.idContribuinte}">
								<img class="membro" src="<c:url value="/contribuinte/foto/${contrib.idContribuinte}"></c:url>" />
							</a>
						</div>
						<div>
							<a href="/SIGP/contribuinte/ver/${contrib.idContribuinte}">${contrib.nome}</a>
							<br />
							(${contrib.nomeCitacao})
						</div>
						<span class="clear"></span>
					</li>
				</c:forEach>
			</ul>
		</div> <!-- id=contents -->
	</div>
</div>  