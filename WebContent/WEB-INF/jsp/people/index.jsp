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
		<!--<c:choose>
			<c:when test="${isUser}">
				<div id="side-contents">
					<fmt:message key="misc.acoes"></fmt:message>
					<hr />
					<a href="novo"><fmt:message key="novo" /></a>
				</div>
			</c:when>
			<c:otherwise>
				<div id="side-contents" class="hidden"></div>
			</c:otherwise>
		</c:choose>-->
    
		<div id="contents">
			<%
				if (isUser) {
			%>
				<a href="<c:url value='/people/new'></c:url>">Add Collaborator</a>
				<div class="separator"></div>
			<%
				}
			%>
			
			
			<h3>Coordinators</h3>
			
			<c:forEach items="${coordinators}" var="person">
				<ul>
					<li>
						<a href="<c:url value='/people/'></c:url>${person.id}">
							${person.nomecompleto}
						</a>
					</li>
				</ul>
			</c:forEach>
		
			<div class="separator"></div>
		
			<h3>PhD Students</h3>
			
			<c:forEach items="${phds}" var="person">
				<ul>
					<li>
						<a href="<c:url value='/people/'></c:url>${person.id}">
							${person.nomecompleto}
						</a>
					</li>
				</ul>
			</c:forEach>
			
			<div class="separator"></div>
			
			<h3>Researchers</h3>
			
			<c:forEach items="${researchers}" var="person">
				<ul>
					<li>
						<a href="<c:url value='/people/'></c:url>${person.id}">
							${person.nomecompleto}
						</a>
					</li>
				</ul>
			</c:forEach>
		
			<div class="separator"></div>
		
			<h3>Master Degree Students</h3>
			
			<c:forEach items="${masters}" var="person">
				<ul>
					<li>
						<a href="<c:url value='/people/'></c:url>${person.id}">
							${person.nomecompleto}
						</a>
					</li>
				</ul>
			</c:forEach>
		
			<div class="separator"></div>
			
			<h3>Undergrad Students</h3>
			
			<c:forEach items="${undergraduates}" var="person">
				<ul>
					<li>
						<a href="<c:url value='/people/'></c:url>${person.id}">
							${person.nomecompleto}
						</a>
					</li>
				</ul>
			</c:forEach>
			
			<div class="separator"></div>
			
			<h3>Collaborators</h3>
			
			<c:forEach items="${collaborators}" var="person">
				<ul>
					<li>
						<a href="<c:url value='/people/'></c:url>${person.id}">
							${person.nomecompleto}
						</a>
					</li>
				</ul>
			</c:forEach>
			
			<div class="separator"></div>
			
			<h3>Others</h2>
			
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