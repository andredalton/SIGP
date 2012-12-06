<%
   String userIDKey = new String("userID");
   session.setAttribute(userIDKey,  null);
%>
<c:redirect url="/" />