<%
   String userIDKey = new String("userID");

   // Check if this is new comer on your web page.
   if (session.isNew()){
      session.setAttribute(userIDKey, userID);
   }
   
   userID = (Integer)session.getAttribute(userIDKey);
   if(userID == null){
	   // Buscar a session no banco de dados.
	   userID = 18;
   }
   
   session.setAttribute(userIDKey,  userID);   
%>
<c:redirect url="/" />