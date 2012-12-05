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
		<div id="contents">
			<c:forEach items="${publications}" var="publication">
				<ul>
					<li>
						<a href="<c:url value='/publication/'></c:url>${publication.id}">
							${publication.titulo}
						</a>
					</li>
				</ul>
			</c:forEach>
		</div>
	</div>
</div>
