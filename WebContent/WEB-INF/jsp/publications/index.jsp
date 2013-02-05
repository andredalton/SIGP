<!----------- TITLE ---------->
<div id="page-headline">
	<div id="page-headline-inner">  
		<div id="page-title">
			<h2>Publications</h2>
		</div><!-- end page-title -->           
	</div><!-- end page-headline-inner -->
	<div class="separator"></div>   
</div><!-- end page-headline -->


<div id="wrapper">
	<div id="content" class="cont-left">
		<div id="container">
			<div id="article">
				<div id="aside" class="one-sixth">
					<ul id="yearsList">
						<li class="off">
							<div class="menuTitle">By year</div>
						</li>
						<c:forEach items="${years}" var="y">
						    <li>
						    	<a href="<c:url value='/publicacao/by-year/${y.value}'/>">
						    		${y.key} (${y.value})
						    	</a>
						    </li>
						</c:forEach>
					</ul>
				</div>
				<div style="display: inline-block; width: 450px">
					<h2>Publications</h2>
					<ol class="custom-list">
						<c:forEach items="${publications}" var="publication">
							<li>
								<strong>
									<a href="<c:url value='/publication/'></c:url>${publication.id}">
										${publication.titulo}
									</a>
								</strong>
								<c:if test="${publication.titulodaconferenciajornallivrorevista != NULL}">, ${publication.titulodaconferenciajornallivrorevista}</c:if>
								<c:if test="${publication.ano != NULL}">, ${publication.ano}</c:if>
								<c:if test="${publication.tipo != NULL}"><strong><i>&nbsp;[${publication.tipo}]</i></strong></c:if>
							</li>
						</c:forEach>
					</ol>
				</div>
			</div> <!-- end Article -->
			<div class="breakLine"></div>
			<div class="sectionLine"></div>
		</div> <!-- Container -->
	
	
		<!-- <div id="contents">
			<ol>
				<c:forEach items="${publications}" var="publication">
					<li>
						<a href="<c:url value='/publication/'></c:url>${publication.id}">
							${publication.titulo}
						</a>
					</li>
				</c:forEach>
			</ol>
		</div> -->
	</div>
</div>
