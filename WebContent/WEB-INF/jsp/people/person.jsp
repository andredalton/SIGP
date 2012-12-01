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
		
			${person}
		</div> <!-- id=contents -->
	</div>
</div>  