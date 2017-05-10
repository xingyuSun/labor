<%@ page language="java" contentType="text/html;charset=utf-8" import="java.util.*,com.sun.pojo.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>诚业建筑 | 劳务结算</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <!-- Bootstrap 3.3.6 -->
    <link rel="stylesheet" href="<%=request.getContextPath()%>/rec/bootstrap/css/bootstrap.min.css">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
    <!-- Ionicons -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
    <!-- daterange picker -->
    <link rel="stylesheet" href="<%=request.getContextPath()%>/rec/plugins/daterangepicker/daterangepicker-bs3.css">
    <!-- bootstrap datepicker -->
    <link rel="stylesheet" href="<%=request.getContextPath()%>/rec/plugins/datepicker/datepicker3.css">
    <!-- Bootstrap Color Picker -->
    <link rel="stylesheet" href="<%=request.getContextPath()%>/rec/plugins/colorpicker/bootstrap-colorpicker.min.css">
    <!-- Bootstrap time Picker -->
    <link rel="stylesheet" href="<%=request.getContextPath()%>/rec/plugins/timepicker/bootstrap-timepicker.min.css">
    <!-- Select2 -->
    <link rel="stylesheet" href="<%=request.getContextPath()%>/rec/plugins/select2/select2.min.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="<%=request.getContextPath()%>/rec/dist/css/AdminLTE.min.css">
    <!-- AdminLTE Skins. Choose a skin from the css/skins
         folder instead of downloading all of them to reduce the load. -->
    <link rel="stylesheet" href="<%=request.getContextPath()%>/rec/dist/css/skins/_all-skins.min.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/rec/plugins/iCheck/flat/blue.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/rec/dist/css/main.css">
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">

    <jsp:include flush="true" page="../head.jsp"></jsp:include>
    <jsp:include flush="true" page="../catalog.jsp"></jsp:include>
    
    <!-- Content Wrapper. Contains page content -->
    <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
            <h1>
                用户管理
            </h1>
            <ol class="breadcrumb">
                <li><a href="#"><i class="fa fa-dashboard"></i>系统管理</a></li>
                <li class="active">用户管理</li>
            </ol>
        </section>

        <!-- Main content -->
        <section class="content">
            <div class="row">
                <div class="col-xs-12">
                    <div class="box">
                        <div class="box-header">
                            <h3 class="box-title">用户基本信息</h3>
                        </div>
                        <div class="row">
                            <div class="margin">
                                <div class="col-md-4">
                                    <!-- Date range -->
                                    <div class="form-group">
                                        <label>Date range:</label>

                                        <div class="input-group">
                                            <div class="input-group-addon">
                                                <i class="fa fa-calendar"></i>
                                            </div>
                                            <input type="text" class="form-control pull-right" id="reservation1">
                                        </div>
                                        <!-- /.input group -->
                                    </div>
                                    <!-- /.form group -->
                                </div>
                            </div>
                        </div>
                        <!-- /.box-header table-responsive mailbox-messages -->
                        <div class="box-body">
                            <table id="example1" class="table table-bordered table-striped">
                                <thead>
                                <tr>
                                    <th>用户编号</th>
                                    <th>用户名</th>
                                    <th>用户登录名</th>
                                    <th>所属角色编号</th>
                                    <th>所属角色名称</th>
                                    <th>    </th>
                                    <th>  操  </th>
                                    <th>  作  </th>
                                    <th>    </th>

                                </tr>
                                </thead>
                                <tbody>
                                <tr>
                                    <td>001</td>
                                    <td>admin</td>
                                    <td>kk</td>
                                    <td>00000001</td>
                                    <td>admin</td>
                                    <td><button type="button" class="btn btn-block btn-info"  style="width: 60px">详细</button></td>
                                    <td><button type="button" class="btn btn-block btn-info"  style="width: 60px">修改</button></td>
                                    <td><button type="button" class="btn btn-block btn-info"  style="width: 60px">注销</button></td>
                                    <td><button type="button" class="btn btn-block btn-info"  style="width: 60px">删除</button></td>
                                </tr>
                                <tr>
                                    <td>001</td>
                                    <td>admin</td>
                                    <td>kk</td>
                                    <td>00000001</td>
                                    <td>admin</td>
                                    <td><button type="button" class="btn btn-block btn-info"  style="width: 60px">详细</button></td>
                                    <td><button type="button" class="btn btn-block btn-info"  style="width: 60px">修改</button></td>
                                    <td><button type="button" class="btn btn-block btn-info"  style="width: 60px">注销</button></td>
                                    <td><button type="button" class="btn btn-block btn-info"  style="width: 60px">删除</button></td>
                                </tr>
                                <tr>
                                    <td>001</td>
                                    <td>admin</td>
                                    <td>kk</td>
                                    <td>00000001</td>
                                    <td>admin</td>
                                    <td><button type="button" class="btn btn-block btn-info"  style="width: 60px">详细</button></td>
                                    <td><button type="button" class="btn btn-block btn-info"  style="width: 60px">修改</button></td>
                                    <td><button type="button" class="btn btn-block btn-info"  style="width: 60px">注销</button></td>
                                    <td><button type="button" class="btn btn-block btn-info"  style="width: 60px">删除</button></td>
                                </tr>
                                <tr>
                                    <td>001</td>
                                    <td>admin</td>
                                    <td>kk</td>
                                    <td>00000001</td>
                                    <td>admin</td>
                                    <td><button type="button" class="btn btn-block btn-info"  style="width: 60px">详细</button></td>
                                    <td><button type="button" class="btn btn-block btn-info"  style="width: 60px">修改</button></td>
                                    <td><button type="button" class="btn btn-block btn-info"  style="width: 60px">注销</button></td>
                                    <td><button type="button" class="btn btn-block btn-info"  style="width: 60px">删除</button></td>
                                </tr>
                                <tr>
                                    <td>001</td>
                                    <td>admin</td>
                                    <td>kk</td>
                                    <td>00000001</td>
                                    <td>admin</td>
                                    <td><button type="button" class="btn btn-block btn-info"  style="width: 60px">详细</button></td>
                                    <td><button type="button" class="btn btn-block btn-info"  style="width: 60px">修改</button></td>
                                    <td><button type="button" class="btn btn-block btn-info"  style="width: 60px">注销</button></td>
                                    <td><button type="button" class="btn btn-block btn-info"  style="width: 60px">删除</button></td>
                                </tr>
                                <tr>
                                    <td>001</td>
                                    <td>admin</td>
                                    <td>kk</td>
                                    <td>00000001</td>
                                    <td>admin</td>
                                    <td><button type="button" class="btn btn-block btn-info"  style="width: 60px">详细</button></td>
                                    <td><button type="button" class="btn btn-block btn-info"  style="width: 60px">修改</button></td>
                                    <td><button type="button" class="btn btn-block btn-info"  style="width: 60px">注销</button></td>
                                    <td><button type="button" class="btn btn-block btn-info"  style="width: 60px">删除</button></td>
                                </tr>




                            </table>
                        </div>
                        <!-- /.box-body -->
                    </div>
                    <!-- /.box -->
                </div>
                <!-- /.col -->
            </div>
            <!-- /.row -->
        </section>
        <!-- /.content -->

    </div>


</div>





<!-- /.content-wrapper -->
<footer class="main-footer">
    <div class="pull-right hidden-xs">
        <b>Version</b> 0.1
    </div>
    <strong> 2017.3.4 <a href="http://almsaeedstudio.com">AAAAAAA</a>.</strong> sunxingyu
</footer>

<!-- Control Sidebar -->
<aside class="control-sidebar control-sidebar-dark">
    <!-- Create the tabs -->
    <ul class="nav nav-tabs nav-justified control-sidebar-tabs">
        <li><a href="#control-sidebar-home-tab" data-toggle="tab"><i class="fa fa-home"></i></a></li>
        <li><a href="#control-sidebar-settings-tab" data-toggle="tab"><i class="fa fa-gears"></i></a></li>
    </ul>
    <!-- Tab panes -->
    <div class="tab-content">
        <!-- Home tab content -->
        <div class="tab-pane" id="control-sidebar-home-tab">
            <h3 class="control-sidebar-heading">Recent Activity</h3>
            <h3 class="control-sidebar-heading">Tasks Progress</h3>
        </div>
    </div>
</aside>
<!-- /.control-sidebar -->
<!-- Add the sidebar's background. This div must be placed
     immediately after the control sidebar -->
<div class="control-sidebar-bg"></div>
</div>
<!-- ./wrapper -->

<!-- jQuery 2.2.0 -->
<script src="<%=request.getContextPath()%>/rec/plugins/jQuery/jQuery-2.2.0.min.js"></script>
<!-- Bootstrap 3.3.6 -->
<script src="<%=request.getContextPath()%>/rec/bootstrap/js/bootstrap.min.js"></script>
<!-- Select2 -->
<script src="<%=request.getContextPath()%>/rec/plugins/select2/select2.full.min.js"></script>
<!-- iCheck -->
<script src="<%=request.getContextPath()%>/rec/plugins/iCheck/icheck.min.js"></script>
<!-- DataTables -->
<script src="<%=request.getContextPath()%>/rec/plugins/datatables/jquery.dataTables.min.js"></script>
<script src="<%=request.getContextPath()%>/rec/plugins/datatables/dataTables.bootstrap.min.js"></script>

<!-- date-range-picker -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.11.2/moment.min.js"></script>
<script src="<%=request.getContextPath()%>/rec/plugins/daterangepicker/daterangepicker.js"></script>

<!-- SlimScroll 1.3.0 -->
<script src="<%=request.getContextPath()%>/rec/plugins/slimScroll/jquery.slimscroll.min.js"></script>
<!-- FastClick -->
<script src="<%=request.getContextPath()%>/rec/plugins/fastclick/fastclick.js"></script>
<!-- AdminLTE App -->
<script src="<%=request.getContextPath()%>/rec/dist/js/app.min.js"></script>
<!-- AdminLTE for demo purposes -->
<script src="<%=request.getContextPath()%>/rec/dist/js/demo.js"></script>

<script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.11.2/moment.min.js"></script>
<script src="<%=request.getContextPath()%>/rec/plugins/daterangepicker/daterangepicker.js"></script>
<!-- page script -->
<script>
    $(function () {
        $("#example1").DataTable();
        $('#reservation1').daterangepicker();
    });

</script>
</body>
</html>
