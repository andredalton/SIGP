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
			
			<h2>Coordinators</h2>
			
			<c:forEach items="${coordinators}" var="person">
				<ul>
					<li>
						<a href="<c:url value='/people/'></c:url>${person.id}">
							${person.nomecompleto}
						</a>
					</li>
				</ul>
			</c:forEach>
		
			<h2>PhD Students</h2>
			
			<c:forEach items="${phds}" var="person">
				<ul>
					<li>
						<a href="<c:url value='/people/'></c:url>${person.id}">
							${person.nomecompleto}
						</a>
					</li>
				</ul>
			</c:forEach>
			
			<h2>Researchers</h2>
			
			<c:forEach items="${researchers}" var="person">
				<ul>
					<li>
						<a href="<c:url value='/people/'></c:url>${person.id}">
							${person.nomecompleto}
						</a>
					</li>
				</ul>
			</c:forEach>
		
		
			<h2>Master Degree Students</h2>
			
			<c:forEach items="${masters}" var="person">
				<ul>
					<li>
						<a href="<c:url value='/people/'></c:url>${person.id}">
							${person.nomecompleto}
						</a>
					</li>
				</ul>
			</c:forEach>
		
			<h2>Undergrad Students</h2>
			
			<c:forEach items="${undergraduates}" var="person">
				<ul>
					<li>
						<a href="<c:url value='/people/'></c:url>${person.id}">
							${person.nomecompleto}
						</a>
					</li>
				</ul>
			</c:forEach>
			
			
			<h2>Collaborators</h2>
			
			<c:forEach items="${collaborators}" var="person">
				<ul>
					<li>
						<a href="<c:url value='/people/'></c:url>${person.id}">
							${person.nomecompleto}
						</a>
					</li>
				</ul>
			</c:forEach>
			
			<h2>Others</h2>
			
			<c:forEach items="${others}" var="person">
				<ul>
					<li>
						<a href="<c:url value='/people/'></c:url>${person.id}">
							${person.nomecompleto}
						</a>
					</li>
				</ul>
			</c:forEach>
			
		</div> <!-- id=contents -->
	</div>
</div>  