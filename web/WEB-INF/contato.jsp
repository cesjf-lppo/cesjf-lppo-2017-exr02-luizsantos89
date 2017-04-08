<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listagem de Registros</title>
        <style>
            table {
                font-family: "Comic Sans MS";
                border-color: black;
                border-width: 1px;
            }
            
            td {
                text-align: center;
                padding-left: 10px;
                padding-right: 10px;
            }
            
            th {
                font-style: bold;
                text-decoration: underline;
            }
            
            a {
                color: green;
                text-decoration: none;
            }
            
            a:hover {
                text-decoration: underline;
                font-size: 16pt;
            }
        </style>
    </head>
    <body>
        <h1>Contato a ser editado:</h1>
        <table>
            <tr>
                <th>Nome:</th>
                <th>Sobrenome:</th>
                <th>Telefone:</th>
            </tr>
            <tr>
                <td>
                    <input type="text" value="${pessoa.nome}" />
                </td>
                <td>
                    <input type="text" value="${pessoa.sobrenome}" />
                </td>
                <td>
                    <input type="text" value="${pessoa.telefone}" />
                </td>
            </tr>
            <tr>
                <td><button type="submit">Enviar</button></td>
                <td></td>
                <td><button type="reset">Limpar</button></td>
            </tr>
        </table>
    </body>
</html>