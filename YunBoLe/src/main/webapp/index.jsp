<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>首页</title>
    <%
        String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/";
    %>
    <base href="<%=basePath%>">
    <meta charset="UTF-8">
    <link href="static/bootstrap/css/bootstrap.min.css" rel="stylesheet"/>
    <script src="static/bootstrap/js/jquery.js"></script>
    <script src="static/bootstrap/js/bootstrap.min.js"></script>
</head>
<style>
    /*解决轮播图图片尺寸问题*/
    #carousel-example-generic {
        height: 300px;
    }

    #carousel-example-generic .carousel-inner > .item > img {
        display: block;
        width: 100%;
        height: 300px;
    }
</style>
<body>
<%--******顶部导航条***************--%>
<nav class="navbar navbar-inverse navbar-fixed-top" style="margin-bottom: 0px;">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <a class="navbar-brand" href="#">YUNBOLE <small>互联网人才招聘</small></a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">首页 <span class="sr-only">(current)</span></a></li>
                <li><a href="#">公司</a></li>
                <li><a href="#">职位</a></li>
            </ul>
            <form class="navbar-form navbar-left">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="搜索职位、公司">
                </div>
                <button type="submit" class="btn btn-default"><span class="glyphicon glyphicon-search"
                                                                    aria-hidden="true"/></button>
            </form>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="#">登录/注册</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                       aria-expanded="false">我的 <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="#"><span class="glyphicon glyphicon-user" aria-hidden="true"/>
                            <span>个人主页</span></a></li>
                        <li role="separator" class="divider"></li>
                        <li><a href="#"><span class="glyphicon glyphicon-duplicate" aria-hidden="true"/>
                            <span>我的简历</span></a></li>
                        <li role="separator" class="divider"></li>
                        <li><a href="#"><span class="glyphicon glyphicon-tag" aria-hidden="true"/> <span>我的收藏</span></a>
                        </li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                       aria-expanded="false">我的 <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="#"><span class="glyphicon glyphicon-user" aria-hidden="true"/>
                            <span>个人主页</span></a></li>
                        <li role="separator" class="divider"></li>
                        <li><a href="#"><span class="glyphicon glyphicon-duplicate" aria-hidden="true"/>
                            <span>我的招聘</span></a></li>
                        <li role="separator" class="divider"></li>
                        <li><a href="#"><span class="glyphicon glyphicon-tag" aria-hidden="true"/> <span>简历箱</span></a>
                        </li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</nav>

<%--********轮播图*****--%>
<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
        <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
        <li data-target="#carousel-example-generic" data-slide-to="1"></li>
        <li data-target="#carousel-example-generic" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
        <div class="item active">
            <img src="https://www.lgstatic.com/i/image/M00/41/F6/CgqCHl82er6Ab4R4AAG9GCF3QmU982.PNG" alt="数据分析大课"
                 width="100%" height="100">
        </div>
        <div class="item">
            <img src="https://www.lgstatic.com/i/image/M00/3E/84/Ciqc1F8s0LWAYe-lAAE3p7AtUFo786.JPG" alt="秋招第二期运营专场"
                 width="100%" height="100">
        </div>
        <div class="item">
            <img src="https://www.lgstatic.com/i/image/M00/3E/CB/CgqCHl8tNgyAE1sCAAFcKwDkOL0805.JPG" alt="达达集团"
                 width="100%" height="100">
        </div>
    </div>

    <!-- Controls -->
    <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
        <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
        <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
    </a>
</div>

<%--******导航栏**********--%>
<div class="container" style="margin-top: 15px;">
    <div class="row">
        <nav class="navbar  navbar-default col-md-3">
            <div class="container">
                <div class="navbar-header"><a class="navbar-brand" href="#">技术</a></div>
                <ul class="nav navbar-nav">
                    <li><a href="#">Java</a></li>
                    <li><a href="#">PHP</a></li>
                    <li><a href="#">C++</a></li>
                    <li><a href="#"><span class="glyphicon glyphicon-menu-right" aria-hidden="true"></span></a></li>
                </ul>
            </div>
            <div class="container">
                <div class="navbar-header"><a class="navbar-brand" href="#">技术</a></div>
                <ul class="nav navbar-nav">
                    <li><a href="#">Java</a></li>
                    <li><a href="#">PHP</a></li>
                    <li><a href="#">C++</a></li>
                    <li><a href="#"><span class="glyphicon glyphicon-menu-right" aria-hidden="true"></span></a></li>
                </ul>
            </div>
            <div class="container">
                <div class="navbar-header"><a class="navbar-brand" href="#">技术</a></div>
                <ul class="nav navbar-nav">
                    <li><a href="#">Java</a></li>
                    <li><a href="#">PHP</a></li>
                    <li><a href="#">C++</a></li>
                    <li><a href="#"><span class="glyphicon glyphicon-menu-right" aria-hidden="true"></span></a></li>
                </ul>
            </div>
            <div class="container">
                <div class="navbar-header"><a class="navbar-brand" href="#">技术</a></div>
                <ul class="nav navbar-nav">
                    <li><a href="#">Java</a></li>
                    <li><a href="#">PHP</a></li>
                    <li><a href="#">C++</a></li>
                    <li><a href="#"><span class="glyphicon glyphicon-menu-right" aria-hidden="true"></span></a></li>
                </ul>
            </div>
            <div class="container">
                <div class="navbar-header"><a class="navbar-brand" href="#">技术</a></div>
                <ul class="nav navbar-nav">
                    <li><a href="#">Java</a></li>
                    <li><a href="#">PHP</a></li>
                    <li><a href="#">C++</a></li>
                    <li><a href="#"><span class="glyphicon glyphicon-menu-right" aria-hidden="true"></span></a></li>
                </ul>
            </div>
        </nav>
        <%--招聘岗位信息--%>
        <div class="col-md-9">
            <div class="row">
                <div class="panel panel-default col-md-2" style="margin-left: 25px;">
                    <div class="panel-body">
                        <img src="https://www.lgstatic.com/thumbnail_160x160/image1/M00/00/4B/Cgo8PFTUXPOAb9shAABkUQts0_Y770.jpg"
                             alt="公司logo" width="100" height="100">
                    </div>
                    <div class="panel-heading">
                        <strong>XX公司 </strong>
                    </div>
                </div>
                <div class="panel panel-default col-md-2" style="margin-left: 25px;">
                    <div class="panel-body">
                        <img src="https://www.lgstatic.com/thumbnail_160x160/i/image2/M00/04/D1/CgotOVnE3KOASAFjAABdXRV3eYg217.png"
                             alt="公司logo" width="100" height="100">
                    </div>
                    <div class="panel-heading">
                        <strong>XX公司 </strong>
                    </div>
                </div>
                <div class="panel panel-default col-md-2" style="margin-left: 25px;">
                    <div class="panel-body">
                        <img src="https://www.lgstatic.com/thumbnail_160x160/image1/M00/00/4B/Cgo8PFTUXPOAb9shAABkUQts0_Y770.jpg"
                             alt="公司logo" width="100" height="100">
                    </div>
                    <div class="panel-heading">
                        <strong>XX公司 </strong>
                    </div>
                </div>
                <div class="panel panel-default col-md-2" style="margin-left: 25px;">
                    <div class="panel-body">
                        <img src="https://www.lgstatic.com/thumbnail_160x160/i/image2/M00/04/D1/CgotOVnE3KOASAFjAABdXRV3eYg217.png"
                             alt="公司logo" width="100" height="100">
                    </div>
                    <div class="panel-heading">
                        <strong>XX公司 </strong>
                    </div>
                </div>
                <div class="panel panel-default col-md-2" style="margin-left: 25px;">
                    <div class="panel-body">
                        <img src="https://www.lgstatic.com/thumbnail_160x160/image1/M00/00/4B/Cgo8PFTUXPOAb9shAABkUQts0_Y770.jpg"
                             alt="公司logo" width="100" height="100">
                    </div>
                    <div class="panel-heading">
                        <strong>XX公司 </strong>
                    </div>
                </div>
                <button type="button" class="btn btn-default btn-lg col-md-6 col-md-offset-2">查看更多</button>
            </div>
        </div>
    </div>
</div>

<%--******招聘公司信息******--%>
<div class="container">
    <div class="row">
        <div class="panel panel-success col-md-12">
            <div class="panel-heading">热门职业</div>
            <div class="panel-body">
                <ul>
                    <li>
                        <div class="panel panel-default col-md-3 col-md-offset-1">
                            <div class="panel-heading"><strong>web前端开发 </strong> <span style="color: red">20K-35K</span></div>
                            <div class="panel-body">
                                <p>本科/应届</p>
                                <p>XXXX公司</p>
                            </div>
                        </div>
                    </li>
                    <li>
                        <div class="panel panel-default col-md-3 col-md-offset-1">
                            <div class="panel-heading"><strong>web前端开发 </strong> <span style="color: red">20K-35K</span></div>
                            <div class="panel-body">
                                <p>本科/应届</p>
                                <p>XXXX公司</p>
                            </div>
                        </div>
                    </li>
                    <li>
                        <div class="panel panel-default col-md-3 col-md-offset-1">
                            <div class="panel-heading"><strong>web前端开发 </strong> <span style="color: red">20K-35K</span></div>
                            <div class="panel-body">
                                <p>本科/应届</p>
                                <p>XXXX公司</p>
                            </div>
                        </div>
                    </li>
                    <li>
                        <div class="panel panel-default col-md-3 col-md-offset-1">
                            <div class="panel-heading"><strong>web前端开发 </strong> <span style="color: red">20K-35K</span></div>
                            <div class="panel-body">
                                <p>本科/应届</p>
                                <p>XXXX公司</p>
                            </div>
                        </div>
                    </li>
                </ul>
               <%-- <div class="row">
                    <div class="panel panel-default col-md-3 col-md-offset-1">
                        <div class="panel-heading"><strong>web前端开发 </strong> <span style="color: red">20K-35K</span></div>
                        <div class="panel-body">
                            <p>本科/应届</p>
                            <p>XXXX公司</p>
                        </div>
                    </div>
                </div>--%>
            </div>
        </div>
    </div>
</div>

<%--******底部导航条*********--%>
<div class="container">
    <nav class="navbar navbar-default">
        <div class="container">
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">关于我们 <span class="sr-only">(current)</span></a></li>
                <li><a href="#">关于我们</a></li>
            </ul>
        </div>
    </nav>
</div>
</body>
<script>

</script>
</html>
