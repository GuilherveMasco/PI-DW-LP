<%-- 
    Document   : carrinho
    Created on : 25/04/2017, 23:13:37
    Author     : Guilherme
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
    <%@include file="imports.jsp" %>

    <style>
        table, th, td {
            border: 3px solid white;
            border-collapse: collapse;
        }
        th, td {
            padding: 5px;
            text-align: center;
        }
        table#t01 {
            width: 100%;    
            background-color: #46b223;
        }

        .bt_pol {
            background-color: #196b00;
            border: solid;
            color: white;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            cursor: pointer;
        }
    </style>

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
            <h3>Informações da compra</h3>

            <table id="t01">
                <tr>
                    <td><button class="bt_pol">03</button></td>
                    <td><button class="bt_pol">07</button></td>
                    <td><button class="bt_pol">11</button></td>
                    <td><button class="bt_pol">15</button></td>
                    <td><button class="bt_pol">19</button></td>
                    <td><button class="bt_pol">23</button></td>
                    <td><button class="bt_pol">27</button></td>
                    <td><button class="bt_pol">31</button></td>
                    <td><button class="bt_pol">35</button></td>
                    <td><button class="bt_pol">39</button></td>
                    <td><button class="bt_pol">43</button></td>
                </tr>
                <tr>
                    <td><button class="bt_pol">04</button></td>
                    <td><button class="bt_pol">08</button></td>
                    <td><button class="bt_pol">12</button></td>
                    <td><button class="bt_pol">16</button></td>
                    <td><button class="bt_pol">20</button></td>
                    <td><button class="bt_pol">24</button></td>
                    <td><button class="bt_pol">28</button></td>
                    <td><button class="bt_pol">32</button></td>
                    <td><button class="bt_pol">36</button></td>
                    <td><button class="bt_pol">40</button></td>
                    <td><button class="bt_pol">44</button></td>
                </tr>
                <tr>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>
                <tr>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>
                <tr>
                    <td><button class="bt_pol">02</button></td>
                    <td><button class="bt_pol">06</button></td>
                    <td><button class="bt_pol">10</button></td>
                    <td><button class="bt_pol">14</button></td>
                    <td><button class="bt_pol">18</button></td>
                    <td><button class="bt_pol">22</button></td>
                    <td><button class="bt_pol">26</button></td>
                    <td><button class="bt_pol">30</button></td>
                    <td><button class="bt_pol">34</button></td>
                    <td><button class="bt_pol">38</button></td>
                    <td><button class="bt_pol">42</button></td>
                </tr>
                <tr>
                    <td><button class="bt_pol">01</button></td>
                    <td><button class="bt_pol">05</button></td>
                    <td><button class="bt_pol">09</button></td>
                    <td><button class="bt_pol">13</button></td>
                    <td><button class="bt_pol">17</button></td>
                    <td><button class="bt_pol">21</button></td>
                    <td><button class="bt_pol">25</button></td>
                    <td><button class="bt_pol">29</button></td>
                    <td><button class="bt_pol">33</button></td>
                    <td><button class="bt_pol">37</button></td>
                    <td><button class="bt_pol">41</button></td>
                </tr>
            </table>
            <br>
            <form name="form" action="NewServlet" method="get" autocomplete="off">
                <label>Nome:</label>
                <input type="text" name="nome" required data-msg-required="Obrigatório.">
                <label>Documento (RG):</label>
                <input type="text" name="documento" required data-msg-required="Obrigatório.">
                <label>Poltrona</label>
                <input type="text" name="nPoltrona" required data-msg-required="Obrigatório.">
                <button class="button" type="submit" style="vertical-align:middle"><span>Confirmar</span></button>

            </form>

        </div>           

    </body>
</html>
