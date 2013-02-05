<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!----------- TITLE ---------->
<div id="page-headline">
	<div id="page-headline-inner">  
		<div id="page-title">
			<h2>New Tag</h2>
		</div><!-- end page-title -->           
	</div><!-- end page-headline-inner -->
	<div class="separator"></div>   
</div><!-- end page-headline -->

<div id="wrapper">
	<div id="content" class="cont-left">
		<div id="contents">
               <form action="<c:url value="/tag/save"/>" method="post">
               		Nome:
               		<br />
               		<input name="marcador.id" type="text" value="${marcador.id}">
               		<br />
                    <input type="submit" value="Salvar">
               </form>
               
               <div style="width: 400; text-align: left;">
                    <a href="<c:url value="/tags/"/>">Back</a>
               </div>
       	</div>
   </div>
</div>