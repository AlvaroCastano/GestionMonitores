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

        <script src="//code.jquery.com/jquery-1.10.2.min.js"></script>
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/alertas.js"></script>
    </head>
    <body>
        <div class="col-md-6 col-md-offset-3">
            <div class="card hovercard">
                <div class="card-background">
                    <img class="card-bkimg" alt="" src="">

                </div>
                <div class="useravatar">
                    <img alt="" src="${pageContext.request.contextPath}/img/docente.png">
                </div>
                <div class="card-info"> <span class="card-title"><s:property value="docente.nombre" /></span>

                </div>
            </div>

            <div class="btn-pref btn-group btn-group-justified btn-group-lg" role="group" aria-label="...">
                <div class="btn-group" role="group">
                    <button type="button" id="perfil" class="btn btn-default" href="#tab1" data-toggle="tab"><span class="glyphicon glyphicon-user" aria-hidden="true"></span>
                        <div class="hidden-xs">Perfil</div>
                    </button>
                </div>
                <div class="btn-group" role="group">
                    <button type="button" id="materias" class="btn btn-primary" href="#tab2" data-toggle="tab"><span class="glyphicon glyphicon-th-list" aria-hidden="true"></span>
                        <div class="hidden-xs">Materias</div>
                    </button>
                </div>
                <div class="btn-group" role="group">
                    <button type="button" id="reuniones" class="btn btn-default" href="#tab3" data-toggle="tab"><span class="glyphicon glyphicon-edit" aria-hidden="true"></span>
                        <div class="hidden-xs">Reuniones</div>
                    </button>
                </div>
            </div>

            <div class="well">
                <div class="tab-content">
                    <div class="tab-pane fade in" id="tab1">
                        <div class="list-group">
                            <table class="table table-condensed">
                                <thead>
                                    <tr>
                                        <th>Datos Personales</th>
                                        <th></th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td>Cedula</td>
                                        <td><s:property value="docente.cedula" /></td>
                                    </tr>
                                    <tr>
                                        <td>Nombre</td>
                                        <td><s:property value="docente.nombre" /></td>
                                    </tr>
                                    <tr>
                                        <td>Apellidos</td>
                                        <td><s:property value="docente.apellidos" /></td>
                                    </tr>
                                    <tr>
                                        <td>Telefono</td>
                                        <td><s:property value="docente.telefono" /></td>
                                    </tr>
                                    <tr>
                                        <td>Direccion</td>
                                        <td><s:property value="docente.direccion" /></td>
                                    </tr>
                                    <tr>
                                        <td>Fecha de Nacimiento</td>
                                        <td><s:property value="docente.fechaNacimiento" /></td>
                                    </tr>
                                    <tr>
                                        <td>E-mail</td>
                                        <td><s:property value="docente.email" /></td>
                                    </tr>
                                </tbody>
                            </table>
                            <button class="btn btn-primary" type="submit">Editar</button>
                        </div>
                    </div>

                    <div class="tab-pane fade in active" id="tab2" >
                        <s:form class="form-signin" action="ofertar" method="post">
                        <div class="list-group">
                            <a class="list-group-item disabled">Materias</a>
                            <s:iterator value="materias" >
                                <a href="#" class="list-group-item"><s:property value="nombre" />
                                    <input type="checkbox" id="nombre" name="check" value="<s:property value="codigo" />"class="custom-control-input" checked></a>
                                </s:iterator>
                        </div>
                        <button class="btn btn-primary" type="submit">Postular</button>
                        </s:form>
                    </div>

                    <div class="tab-pane fade in" id="tab3">
                        <h3>Reuniones</h3>
                    </div>
                </div>
            </div>
        </div>


    </body>
</html>
