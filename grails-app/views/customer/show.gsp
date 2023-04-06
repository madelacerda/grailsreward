<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>List of customer</title>
</head>

<body>
<h1>List of customer</h1>
<table>
    <thead>
    <tr>
        <g:sortableColumn property="id" title="Id"/>
        <g:sortableColumn property="firstName" title="firstName"/>
        <g:sortableColumn property="lastName" title="lastName"/>
        <g:sortableColumn property="totalPoints" title="totalPoints"/>
        <g:sortableColumn property="phone" title="phone"/>
        <g:sortableColumn property="email" title="email"/>
        <th></th>
        <th></th>
    </tr>
    </thead>
    <tbody>
    <g:each in="${customerInstance}">
        <tr>
            <td>${it.id}</td>
            <td>${it.firstName}</td>
            <td>${it.lastName}</td>
            <td>${it.totalPoints}</td>
            <td>${it.phone}</td>
            <td>${it.email}</td>
            <td><g:link action="delete" id="${it.id}">delete</g:link></td>
            <td><g:link action="edit" id="${it.id}">edit</g:link></td>
        </tr>
    </g:each>
    </tbody>
</table>

</body>
</html>
