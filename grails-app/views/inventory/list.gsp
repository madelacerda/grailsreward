<%--
  Created by IntelliJ IDEA.
  User: matia
  Date: 4/4/2023
  Time: 11:28 AM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>List Products</title>
</head>

<body>
${allProducts.name} ${allProducts.sku} ${allProducts.price}
<table border="1">
    <g:each in="${allProducts}" var="thisProduct">
        <tr>
            <td>${thisProduct.name}</td>
            <td>${thisProduct.sku}</td>
            <td>${thisProduct.price}</td>

        </tr>
    </g:each>
</table>
</body>
</html>