<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="author" content="Grupo BO">
        <meta name="description" content="">
        <link href="img/favicon.ico" rel="shortcut icon">

        <title>Modulo BO</title>
        <jsp:include page="base/header.jsp"/>
    </head>

    <body>
        <div class="container">
            <form class="form-signin" action="Login" method="post">
                <h2 class="form-signin-heading">Ingreso al sistema</h2>

                <label for="inputEmail" class="sr-only">Email</label>
                <input type="text" id="inputEmail" name="inputEmail" class="form-control" placeholder="Email address" required autofocus>

                <label for="inputPassword" class="sr-only">Password</label>
                <input type="password" id="inputPassword" name="inputPassword" class="form-control" placeholder="Password" required>

                <button class="btn btn-lg btn-primary btn-block" type="submit">Ingresar</button>
            </form>
            <footer class="footer">
                <p>&copy; Modulo BackOffice 2017</p>
            </footer>
        </div>
        <jsp:include page="base/footer.jsp"/>
    </body>
</html>
