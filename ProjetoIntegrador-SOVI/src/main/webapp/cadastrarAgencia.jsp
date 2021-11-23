<%-- 
    Document   : cadastrarAgencia
    Created on : 09/06/2017, 08:44:00
    Author     : a1603019
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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
            <h2 class="box-text page-title-text">Cadastro de Agência</h2>
        </header>
        
        <div class="content-text">
            <form method="post" action="AgenciaServlet" autocomplete="off">

                <label>Id da Agência</label>
                <input type="text" name="idAgencia" required data-msg-required="Obrigatório.">
                <label>Senha</label>
                <input type="password" name="senha" required data-msg-required="Obrigatório.">
                <button class="button" type="submit" style="vertical-align:middle"><span>Cadastrar</span></button>

            </form>
        </div>
        
    </body>
</html>
