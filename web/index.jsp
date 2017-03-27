<%-- 
    Document   : index
    Created on : 25-mar-2017, 16:40:31
    Author     : Alvaro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset=UTF-8">
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <title>Login</title>
    </head>
    <body>
        <br/><br/><br/><br/>
        <div class="container">
            <div class="row">
                <div class="col-md-4 col-md-offset-4">
                    <s:form class="form-signin" action="login" method="post">
                        <div class="panel panel-primary">
                            <div class="panel-heading text-center form-signin-heading">
                                <h1 class="panel-title">Gestion Monitores</h1>
                            </div>
                            <div class="panel-body">
                                <br/>
                                <label for="inputEmail" class="sr-only" id="email">Email address</label>
                                <input type="email" name="email" id="email" class="form-control" placeholder="Email address" required autofocus>
                                <br/>
                                <label for="inputPassword" class="sr-only" id="pwd">Password</label>
                                <input type="password" name="pwd" id="password" class="form-control" placeholder="Password" required>
                                <br/>
                                <button class="btn btn-lg btn-primary btn-block" type="submit">Ingresar</button>
                            </div>
                        </div>
                    </s:form>
                </div>
            </div>
        </div>
    </body>
</html>
