<%@ page language="java" pageEncoding="UTF-8" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
    <base href="<%=basePath%>">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>西宁乐缘综合养老管理平台 - ${title}</title>

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/datepicker3.css" rel="stylesheet">
    <link href="css/bootstrap-table.css" rel="stylesheet">
    <link href="css/styles.css" rel="stylesheet">

    <!--[if lt IE 9]>
    <script src="js/html5shiv.js"></script>
    <script src="js/respond.min.js"></script>
    <![endif]-->

    <script src="js/jquery-1.11.1.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/chart.min.js"></script>
    <script src="js/chart-data.js"></script>
    <script src="js/easypiechart.js"></script>
    <script src="js/easypiechart-data.js"></script>
    <script src="js/bootstrap-datepicker.js"></script>
    <script src="js/bootstrap-table.js"></script>
    <script src="js/xitong/dSRLaoren.js"></script>
    <script type="text/javascript">
        function showModalData(laoren) {
            <c:forEach var="item" items="${formColumns}">
            if (laoren != null) {
                $("#${item.columnname}Input").val(laoren.${item.columnname});
            } else {
                $("#${item.columnname}Input").val("");
            }
            $("#${item.columnname}Input").attr("placeholder", "请输入老人的${item.chinese}");
            </c:forEach>
        }

        function showJiashuModalData(jiashu) {
            <c:forEach var="item" items="${jiashuColumns}">
            if (jiashu != null) {
                $("#JS${item.columnname}Input").val(jiashu.${item.columnname});
            } else {
                $("#JS${item.columnname}Input").val("");
            }
            $("#JS${item.columnname}Input").attr("placeholder", "请输入老人家属的${item.chinese}");
            </c:forEach>
        }

    </script>
</head>

<body style="padding-top:0px">

<div class="row">
    <ol class="breadcrumb">
        <li><a href="user/home.do"><span class="glyphicon glyphicon-home"></span></a></li>
        <li class="active">${title}</li>
    </ol>
</div><!--/.row-->

<div class="row">
    <div class="col-lg-12">
        <div class="panel panel-default">
            <div class="panel-heading">${tableName}</div>
            <div class="panel-body">

                <div class="row" id="alertA" hidden>
                    <div class="col-lg-12">
                        <div class="alert bg-warning" role="alert">
                            <span class="glyphicon glyphicon-warning-sign"></span> <span id="messageA"></span><a
                                id="closeA"
                                class="pull-right"><span
                                class="glyphicon glyphicon-remove"></span></a>
                        </div>
                    </div>
                </div>


                <button type="button" class="btn btn-primary" id="zhuce">注册老人信息</button>
                <button type="button" class="btn btn-primary" id="xiugai">修改老人信息</button>
                <button type="button" class="btn btn-primary" id="shanchu">删除老人信息</button>
                <button type="button" class="btn btn-primary" id="jiashu">添加老人家属</button>
                <button type="button" class="btn btn-primary" id="change">移出低收入老人组</button>


                <table data-toggle="table" data-url="xitong/dSRLaorens.do" data-show-refresh="true"
                       data-show-toggle="true" data-show-columns="true" data-search="true"
                       data-select-item-name="toolbar1" data-pagination="true" data-sort-name="${tableColumns}"
                       data-sort-order="desc" id="userTable">
                    <thead>
                    <tr>
                        <th data-field="state" data-checkbox="true"></th>
                        <c:forEach var="item" items="${tableColumns}">
                            <th data-field="${item.columnname}" data-sortable="true">${item.chinese}</th>
                        </c:forEach>
                    </tr>
                    </thead>
                </table>


                <!-- Modal -->
                <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
                    <div class="modal-dialog" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                                        aria-hidden="true">&times;</span></button>
                                <h4 class="modal-title" id="myModalLabel"></h4>
                            </div>
                            <div class="modal-body">
                                <form id="laorenForm">
                                    <div class="form-group">
                                        <c:forEach var="item" items="${formColumns}">
                                            <label for="${item.columnname}"
                                                   class="control-label"
                                                   id="${item.columnname}Label">${item.chinese}</label>
                                            <c:choose>
                                                <c:when test="${item.type == 'checkbox'}">
                                                    <c:choose>
                                                        <c:when test="${item.columnname == 'bingshi'}">
                                                            <div class="checkbox" id="${item.columnname}Checkbox">
                                                                <c:forEach var="itemb" items="${bingshi}">
                                                                    <label>
                                                                        <input name="${item.columnname}" type="checkbox" value="${itemb.name}">${itemb.name}
                                                                    </label>
                                                                </c:forEach>
                                                            </div>
                                                        </c:when>
                                                    </c:choose>
                                                </c:when>
                                                <c:when test="${item.type == 'select'}">
                                                    <c:choose>
                                                        <c:when test="${item.columnname == 'sex'}">
                                                            <select class="form-control" name="${item.columnname}" id="${item.columnname}Select">
                                                                <c:forEach var="itemb" items="${sex}">
                                                                    <label>
                                                                        <option>${itemb.name}</option>
                                                                    </label>
                                                                </c:forEach>
                                                            </select>
                                                        </c:when>
                                                        <c:when test="${item.columnname == 'nation'}">
                                                            <select class="form-control" name="${item.columnname}" id="${item.columnname}Select">
                                                                <c:forEach var="itemb" items="${nation}">
                                                                    <label>
                                                                        <option>${itemb.name}</option>
                                                                    </label>
                                                                </c:forEach>
                                                            </select>
                                                        </c:when>
                                                    </c:choose>
                                                </c:when>
                                                <c:otherwise>
                                                    <input type="${item.type}" class="form-control" id="${item.columnname}Input" name="${item.columnname}"/>
                                                </c:otherwise>
                                            </c:choose>
                                        </c:forEach>
                                    </div>
                                </form>
                            </div>

                            <div class="row" id="alertB" hidden>
                                <div class="col-lg-12">
                                    <div class="alert bg-warning" role="alert">
                                        <span class="glyphicon glyphicon-warning-sign"></span> <span
                                            id="messageB"></span><a
                                            id="closeB"
                                            class="pull-right"><span
                                            class="glyphicon glyphicon-remove"></span></a>
                                    </div>
                                </div>
                            </div>

                            <div class="modal-footer">
                                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                                <button type="button" class="btn btn-primary" id="saveData">保存</button>
                            </div>
                        </div>
                    </div>
                </div><!-- Modal -->


                <!-- Modal -->
                <div class="modal fade" id="jiashuModal" tabindex="2" role="dialog" aria-labelledby="jiashuModalLabel">
                    <div class="modal-dialog" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                                        aria-hidden="true">&times;</span></button>
                                <h4 class="modal-title" id="jiashuModalLabel"></h4>
                            </div>
                            <div class="modal-body">
                                <form id="jiashuForm">
                                    <div class="form-group">
                                        <c:forEach var="item" items="${jiashuColumns}">
                                            <label for="${item.columnname}"
                                                   class="control-label"
                                                   id="JS${item.columnname}Label">${item.chinese}</label>
                                            <c:choose>
                                                <c:when test="${item.type == 'select'}">
                                                    <c:choose>
                                                        <c:when test="${item.columnname == 'guanxi'}">
                                                            <select class="form-control" name="${item.columnname}" id="JS${item.columnname}Select">
                                                                <c:forEach var="itemb" items="${guanxi}">
                                                                    <label>
                                                                        <option>${itemb.name}</option>
                                                                    </label>
                                                                </c:forEach>
                                                            </select>
                                                        </c:when>
                                                    </c:choose>
                                                </c:when>
                                                <c:otherwise>
                                                    <input type="${item.type}" class="form-control" id="JS${item.columnname}Input" name="${item.columnname}"/>
                                                </c:otherwise>
                                            </c:choose>
                                        </c:forEach>
                                    </div>
                                </form>
                            </div>

                            <div class="row" id="alertC" hidden>
                                <div class="col-lg-12">
                                    <div class="alert bg-warning" role="alert">
                                        <span class="glyphicon glyphicon-warning-sign"></span> <span
                                            id="messageC"></span><a
                                            id="closeC"
                                            class="pull-right"><span
                                            class="glyphicon glyphicon-remove"></span></a>
                                    </div>
                                </div>
                            </div>

                            <div class="modal-footer">
                                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                                <button type="button" class="btn btn-primary" id="saveJiashuData">保存</button>
                            </div>
                        </div>
                    </div>
                </div><!-- Modal -->

            </div>
        </div>
    </div>
</div><!--/.row-->

</body>

</html>
