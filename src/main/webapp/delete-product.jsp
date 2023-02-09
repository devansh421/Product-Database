<html>
<body>
 <form action='delete-record' method='post'>
  <table style='border:2px solid blue;font-size:20px' cellpadding='10px'>
   <tr>
    <td>Enter product id</td>
    <td><input type='text' name='pid' required></td>
    <td><button>Delete Record</button>
    </td>
   </tr>
  </table>
  <h3 style='color:red'>${msg}</h3>
 </form> 
</body>
</html>
