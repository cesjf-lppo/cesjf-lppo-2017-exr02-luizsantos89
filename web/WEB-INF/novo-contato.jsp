<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Novo contato:</h1>
        <table>
            <form action="NovoContato" method="post">
                <tr>
                    <th>Nome:</th>
                    <td>
                        <input type="text" size="25" name="nome" />
                    </td>
                </tr>
                <tr>
                    <th>Sobrenome: </th>
                    <td>
                        <input type="text" size="25" name="sobrenome" />
                    </td>
                </tr>
                <tr>
                    <th>Telefone: </th>
                    <td>
                        <input type="text" size="25" name="telefone" />
                    </td>
                </tr>
                <tr>
                    <td><button type="submit">Enviar</button></td>
                    <td><button type="reset">Limpar campos</button></td>
                </tr>
            </form>
        </table>
    </body>
</html>
