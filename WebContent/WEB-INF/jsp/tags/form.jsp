<%@page contentType="text/html"%>
<%@page pageEncoding="iso-8859-1"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<html>
     <head>
          <meta http-equiv="Content-type" content="text/html; charset=iso-8859-1" />
          <title>VRaptor - Marcador : Lista</title>
     </head>
     <body>
          <center>
               <div style="width: 400; text-align: left;">
                    <a href="<c:url value="/marcador/lista"/>">Voltar</a>
               </div>
               <form action="<c:url value="/marcador/salvar"/>" method="post">
                    <table width="400">
                         <tr>
                              <td width="100" align="right">Nome</td>
                              <td width="300"><input name="marcador.id" type="text" value="${marcador.id}"> </td>
                         </tr>
                         <tr>
                              <td colspan="2" align="right">
                                   <input type="submit" value="Salvar">
                              </td>
                         </tr>
                    </table>
               </form>
          </center>
     </body>
</html>