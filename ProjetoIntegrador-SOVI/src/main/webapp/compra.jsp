<%-- 
    Document   : index
    Created on : 31/03/2017, 08:42:37
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
            <form method="get" action="DestinosServlet" autocomplete="off">
                <h3>COMPRAR PASSAGENS</h3>
                <label>Origem</label>
                <c:forEach items="${cidades}" var="cidade">
                    <input list="origens" name="origem" required data-msg-required="Obrigatório.">
                    <datalist id="origens">



                        <option value="${cidade.id}"/> ${cidade.nome}</option>


                    </datalist>
                </c:forEach>
                <label>Destino</label>
                <c:forEach items="${cidades}" var="cidade">
                    <input list="destinos" name="destino" required data-msg-required="Obrigatório.">
                    <datalist id="destinos">



                        <option value="${cidade.id}"/> ${cidade.nome}</option>


                    </datalist>
                </c:forEach>
                <label>Data da viagem</label>
                <input type="date" name="data" required data-placeholder-disabled data-msg-required="Obrigatório.">
                <button class="button" type="submit" style="vertical-align:middle"><span>Consultar</span></button>
            </form>
        </div>

        <footer class="footer">
            <div>
                <p class="copyright-text"><a href="login.jsp">Área Admnistrativa</a></p>
                <p class="copyright-text">Copyright © 2017 Guilherme Vasco - Contato (44) 99850-3758</p>


            </div>                
        </footer>

        <img class="bus" src="img/bus-left.png" height="40" width="120" id="bus">

        <script>
            bus.onclick = function () {

                this.onclick = null;

                let times = 1;

                function go() {
                    if (times % 2) {
                        bus.classList.remove('back');
                        bus.style.marginLeft = 100 * times + 200 + 'px';
                    } else {
                        bus.classList.add('back');
                        bus.style.marginLeft = 100 * times - 200 + 'px';
                    }

                }

                go();

                bus.addEventListener('transitionend', function () {
                    times++;
                    go();
                });
            }
        </script>

    </body>
</html>
