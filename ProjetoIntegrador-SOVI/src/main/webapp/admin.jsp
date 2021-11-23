<%-- 
    Document   : admin
    Created on : 02/06/2017, 09:01:07
    Author     : a1603019
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="imports.jsp" %>

    <c:set var="idAgencia" scope="sessao" value="${sessao}"></c:set>
    <c:if test="${sessionScope.idAgencia == null}">
        <c:redirect url="index.jsp"></c:redirect>
    </c:if>

    <body class="page">

        <div class="header">
            <header class="box box-black">
                <a href="index.jsp">
                    <img src="img/sovi.png" alt="S.O.V.I." height="100" width="400">
                    <p class="content-text">Sistema Online de Venda de Itinerários</p>
                </a>            
            </header>
        </div>
        <header class="header box-black margin-b-20">
            <h2 class="box-text page-title-text"> 
                <c:if test="${sessionScope.idAgencia != null}">
                    <c:out value="Página de ${sessionScope.idAgencia}!" />
                </c:if>
            </h2>
        </header>
        <div class="content-text">
            <label>Linha:</label>
            <input type="text" name="linha" required data-msg-required="Obrigatório.">
            <form method="get"  autocomplete="off">
                <button class="button" type="submit" style="vertical-align:middle"><span>Criar</span></button>
            </form>
            <form method="get"  autocomplete="off">
                <button class="button" type="submit" style="vertical-align:middle"><span>Ver</span></button>
            </form>
            <form method="get"  autocomplete="off">
                <button class="button" type="submit" style="vertical-align:middle"><span>Atualizar</span></button>
            </form>
            <form method="get"  autocomplete="off">
                <button class="button" type="submit" style="vertical-align:middle"><span>Deletar</span></button>
            </form>

            <form method="get" action="cadastrarAgencia.jsp" autocomplete="off">
                <button class="button" type="submit" style="vertical-align:middle"><span>Cadastrar agencia</span></button>
            </form>

        </div>
    </body>
</html>
