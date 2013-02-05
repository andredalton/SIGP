<!----------- TITLE ---------->
<div id="page-headline">
	<div id="page-headline-inner">  
		<div id="page-title">
			<h2>Login</h2>
		</div><!-- end page-title -->           
	</div><!-- end page-headline-inner -->
	<div class="separator"></div>   
</div><!-- end page-headline -->

<div id="wrapper">
	<div id="content" class="cont-left">
		<div id="contents">
			<form method="post" action="<c:url value='/login/validate/'></c:url>">
				User:
				<br />
				<input type="text" name="username" />
				<br />
				Password:
				<br />
				<input type="password" name="password" />
				<br />
				<input type="submit" value="Enter" />
			</form>
		</div>
	</div>
</div>


<div id="wrapper">
	<center>
	</center>
</div>
