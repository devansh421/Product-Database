<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
 <form action='save' method='post'>
  <table style='border-collapse:collapse;font-size:20px;width:45%' border='1'>
    <tr>
     <th>Product Id</th><th>Product name</th><th>Product brand</th><th>Product price</th>
    </tr>
    <c:forEach var="p" items="${plist}">
     <tr>
      <td>${p.pid}</td>
      <td>${p.name}</td>
      <td>${p.brand}</td>
      <td>${p.price}</td>
     </tr>
    </c:forEach>
  </table>
 </form> 
</body>
</html>
