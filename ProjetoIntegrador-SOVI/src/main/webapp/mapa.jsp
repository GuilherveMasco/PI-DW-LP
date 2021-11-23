<%-- 
    Document   : Mapa
    Created on : 21/05/2017, 13:11:57
    Author     : Guilherme
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <%@include file="imports.jsp" %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mapa de viagem</title>
    </head>
    <body class="page">
        <div class="content-text">
            <h1>Lista de Passageiros</h1>

            <table>
                <th>|    Poltrona|     </th>
                <th>|    Nome|</th>
                <th>|    Documento|   </th>
                    <c:forEach items="${Poltrona}" var="poltrona">
                    <tr>
                        <td>| <${poltrona.nPoltrona} /> |<td>
                        <td>| <${poltrona.nome} /> |<td>
                        <td>| <${poltrona.documento} /> |<td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </body>
</html>
