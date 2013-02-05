<!----------- TITLE ---------->
<div id="page-headline">
	<div id="page-headline-inner">  
		<div id="page-title">
			<h2>Groups</h2>
		</div><!-- end page-title -->           
	</div><!-- end page-headline-inner -->
	<div class="separator"></div>   
</div><!-- end page-headline -->

<div id="wrapper">
	<div id="content" class="cont-left">
		<c:forEach items="${groups}" var="group">
			<div class="post-title">
				<h3>${group.id.nome}</h3>
			</div>
			
			<div class="post-content">
				<p>
					${group.descricao}
				</p>
				
				<div class="post-metadata">
					<p>
						group website: 
						<a href="${group.url}" target="_blank">
							${group.url}
						</a>
					</p>
				</div>
				
			</div>
			
			<div class="separator"></div> 
		</c:forEach>
	</div>
</div>  