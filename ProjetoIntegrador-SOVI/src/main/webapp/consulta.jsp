<%-- 
    Document   : consulta
    Created on : 31/03/2017, 08:54:14
    Author     : a1603019
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
    <%@include file="imports.jsp" %>                                

    <body class="page">

        <div class="header box-black">

            <header>
                <a href="index.jsp">
                    <img src="img/sovi.png" alt="S.O.V.I." height="100" width="400">
                    <p class="header-text box-black">Sistema Online de Venda de Itinerários</p>
                </a>            
            </header>

        </div>


        <header class="header box-black margin-b-20">
            <h2 class="box-text page-title-text">Comprar</h2>
        </header>

        <div class="content-text">
            <h3>Horários</h3>
            <form action="carrinho.jsp">
                <table style="width:100%">
                    <tr>
                        <th>Origem</th>
                        <th>Destino</th>
                        <th>Data</th>
                        <th>Horário</th>
                        <th>Valor</th>
                        <th></th>
                    </tr>
                    <tr>
                        <td>${param.origem}</td>
                        <td>${param.destino}</td>
                        <td>${param.data}</td>
                        <td>20:00</td>
                        <td>150,00</td>
                        <td><button class="button" type="submit" style="vertical-align:middle"><span>Comprar</span></button></td>
                    </tr>
                    <tr>
                        <td>${param.origem}</td>
                        <td>${param.destino}</td>
                        <td>${param.data}</td>
                        <td>20:15</td>
                        <td>150,00</td>
                        <td><button class="button" type="submit" style="vertical-align:middle"><span>Comprar</span></button></td>
                    </tr>
                </table>
            </form>
        </div>          

    </body>
</html>
