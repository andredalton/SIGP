<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!----------- TITLE ---------->
<div id="page-headline">
	<div id="page-headline-inner">  
		<div id="page-title">
			<h2>Editing Collaborator</h2>
		</div><!-- end page-title -->           
	</div><!-- end page-headline-inner -->
	<div class="separator"></div>   
</div><!-- end page-headline -->

<div id="wrapper">
	<div id="content" class="cont-left">
		<div id="contents">
			<form method="post" action="<c:url value='/people/save'></c:url>" enctype="multipart/form-data">
				<table>
					<tr>
						<td>Nome completo</td>
						<td><input type="text" name="colaborador.nomecompleto" /></td>
					</tr>
					<tr>
						<td colspan="2"><input type="submit" value="Criar" /></td>
					</tr>
				</table>
			</form>
               
               <div style="width: 400; text-align: left;">
                    <a href="<c:url value="/people/"/>">Back</a>
               </div>
       	</div>
   </div>
</div>