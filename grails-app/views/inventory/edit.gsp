<%--
  Created by IntelliJ IDEA.
  User: matia
  Date: 4/5/2023
  Time: 10:13 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Edit Inventory</title>
</head>

<body>
 ${product} ${sku}

<form>
    Product : <input type="text" size=40 name="product" value="${product}"/>
    SKU : <input type="text" size=40 name="sku" value="${sku}"/>
</form>
</body>
</html>