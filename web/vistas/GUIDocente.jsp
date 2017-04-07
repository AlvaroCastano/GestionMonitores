<%-- 
    Document   : GUIDocente
    Created on : 25-mar-2017, 20:52:44
    Author     : Alvaro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset=UTF-8">
        <title>Docente</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <link href="${pageContext.request.contextPath}/css/cssInicial.css" rel="stylesheet" type="text/css"/>

        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
        <script src="${pageContext.request.contextPath}/js/jquery-3.2.0.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/alertas.js"></script>
    </head>
    <body>
        <div class="col-md-6 col-md-offset-3">

            <div class="card hovercard">
                <div class="card-background">
                    <img class="card-bkimg" alt="" src="http://lorempixel.com/100/100/people/9/">
                    <!-- http://lorempixel.com/850/280/people/9/ -->
                </div>
                <div class="useravatar">
                    <img alt="" src="http://lorempixel.com/100/100/people/9/">
                </div>
                <div class="card-info"> <span class="card-title">Pamela Anderson</span>
                </div>
            </div>

            <div class="btn-pref btn-group btn-group-justified btn-group-lg" role="group" aria-label="...">
                <div class="btn-group" role="group">
                    <button type="button" id="stars" class="btn btn-primary" href="#tab1" data-toggle="tab"><span class="glyphicon glyphicon-star" aria-hidden="true"></span>
                        <div class="hidden-xs">Stars</div>
                    </button>
                </div>
                <div class="btn-group" role="group">
                    <button type="button" id="favorites" class="btn btn-default" href="#tab2" data-toggle="tab"><span class="glyphicon glyphicon-heart" aria-hidden="true"></span>
                        <div class="hidden-xs">Favorites</div>
                    </button>
                </div>
                <div class="btn-group" role="group">
                    <button type="button" id="following" class="btn btn-default" href="#tab3" data-toggle="tab"><span class="glyphicon glyphicon-user" aria-hidden="true"></span>
                        <div class="hidden-xs">Following</div>
                    </button>
                </div>
            </div>

            <div class="well">
                <div class="tab-content">
                    <div class="tab-pane fade in active" id="tab1">
                        <h3>This is tab 1</h3>
                    </div>
                    <div class="tab-pane fade in" id="tab2">
                        <h3>This is tab 2</h3>
                    </div>
                    <div class="tab-pane fade in" id="tab3">
                        <h3>This is tab 3</h3>
                    </div>
                </div>
            </div>
        </div>

    <s:form action="cargarmaterias" method="post">
        <button class="btn btn-lg btn-primary btn-block" type="submit">Listar</button>
    </s:form>
</body>
</html>
