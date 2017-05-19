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
    <link rel="stylesheet" href="<%=request.getContextPath()%>/rec/daterangepicker/daterangepicker-bs3.css">
    <!-- bootstrap datepicker -->
    <link rel="stylesheet" href="<%=request.getContextPath()%>/rec/datepicker/datepicker3.css">
    <!-- Bootstrap Color Picker -->
    <link rel="stylesheet" href="<%=request.getContextPath()%>/rec/colorpicker/bootstrap-colorpicker.min.css">
    <!-- Bootstrap time Picker -->
    <link rel="stylesheet" href="<%=request.getContextPath()%>/rec/timepicker/bootstrap-timepicker.min.css">
    <!-- Select2 -->
    <link rel="stylesheet" href="<%=request.getContextPath()%>/rec/select2/select2.min.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="<%=request.getContextPath()%>/rec/dist/css/AdminLTE.min.css">
    <!-- AdminLTE Skins. Choose a skin from the css/skins
         folder instead of downloading all of them to reduce the load. -->
    <link rel="stylesheet" href="<%=request.getContextPath()%>/rec/dist/css/skins/_all-skins.min.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/rec/iCheck/flat/blue.css">
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
                                    <th>所属角色名称</th>
                                    <th>用户备注</th>
                                    <th><button type="button" id="changemodal" class="btn btn-block btn-info"   style="width: 60px">修改</button></th>
                                    <th><button type="button" id="delete" class="btn btn-block btn-info"  style="width: 60px">删除</button></th>

                                </tr>
                                </thead>
                                <tbody>
                                	 <c:forEach items="${listMap}" var="item">
                                     	<tr>
                                   			<td name="userID">${item.userID}</td>
                                   			<td name="userName">${item.userName}</td>
                                   			<td name="loginName">${item.loginName}</td>
                                   			<td name="roleName">${item.roleName}</td>
                                   			<td name="userRemark">${item.userRemark}</td>
                                   			<td><input type="radio" name="ss"></td>
                                            <td><input type="checkbox"></td>
                                     	</tr>
                                     </c:forEach>
                                </tbody>
                                <tfoot>
                                <tr>
                                    <th>  </th>
                                    <th>  </th>
                                    <th> <button type="button" id="addmodal" class="btn btn-block btn-info"   style="width: 60px">添加</button> </th>
                                </tr>
                                </tfoot>
                            </table>
                        </div>
                        <!-- /.box-body -->
                    </div>
                    <!-- /.box -->
                </div>
                <!-- /.col -->
            </div>
            
            
            
            <div id="add" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header bg-primary">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                            <h4 class="modal-title">
                                <i class="icon-pencil"></i>
                                <span id="lblAddOneTitle" style="font-weight:bold">添加用户</span>
                            </h4>
                        </div>

                        <form class="form-horizontal form-bordered form-row-strippe" id="addfrom" action="" data-toggle="validator" enctype="multipart/form-data">
                            <div class="modal-body">
                                <div class="row">
                                    <div class="col-md-12">
                                        <div class="form-group">
                                            <label class="control-label col-md-2">用户编号</label>
                                            <div class="col-md-10">
                                                <input id="useridadd" type="text" class="form-control" placeholder="用户编号..." />
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-12">
                                        <div class="form-group">
                                            <label class="control-label col-md-2">用户名称</label>
                                            <div class="col-md-10">
                                                <input id="usernameadd"  type="text" class="form-control" placeholder="用户名称..." />
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-12">
                                        <div class="form-group">
                                            <label class="control-label col-md-2">登录名</label>
                                            <div class="col-md-10">
                                                <input id="loginnameadd"  type="text" class="form-control" placeholder="登录名..." />
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-12">
                                        <div class="form-group">
                                            <label class="control-label col-md-2">初始密码</label>
                                            <div class="col-md-10">
                                                <input id="passwordadd"  type="text" class="form-control" placeholder="初始密码..." />
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-12">
                                        <div class="form-group">
                                            <label class="control-label col-md-2">角色</label>
                                            <div class="col-md-10">
                                                <select id="rolenameadd" class="form-control select2" style="width: 100%;">
                                                    <c:forEach items="${listMapr}" var="item">
                                                     
                                                    <option selected="selected">${item.roleName}</option>

                                                  </c:forEach>
                                                </select>
                                            </div>
                                        </div>                                    
                                    </div>
                                    <div class="col-md-12">
                                        <div class="form-group">
                                            <label class="control-label col-md-2">用户备注</label>
                                            <div class="col-md-10">
                                                <textarea id="userremarksadd" name="userremarksadd" class="form-control"  rows="8" placeholder="Enter ..."></textarea>
                                            </div>
                                        </div>     
                                    </div>                                   
                                    
                                </div>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                                <button type="button" id="adduser" class="btn btn-primary" data-dismiss="modal">确认</button>
                            </div>
                        </form>

                    </div>
                </div>
            </div>
            
            
            <div id="change" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header bg-primary">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                            <h4 class="modal-title">
                                <i class="icon-pencil"></i>
                                <span id="lblAddOneTitle" style="font-weight:bold">修改用户基本信息</span>
                            </h4>
                        </div>

                        <form class="form-horizontal form-bordered form-row-strippe" id="changefrom" action="" data-toggle="validator" enctype="multipart/form-data">
                            <div class="modal-body">
                                <div class="row">
                                    <div class="col-md-12">
                                        <div class="form-group">
                                            <label class="control-label col-md-2">用户名称</label>
                                            <div class="col-md-10">
                                                <input id="usernamechange"  type="text" class="form-control" placeholder="用户名称..." />
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-12">
                                        <div class="form-group">
                                            <label class="control-label col-md-2">登录名</label>
                                            <div class="col-md-10">
                                                <input id="loginnamechange"  type="text" class="form-control" placeholder="登录名..." />
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-12">
                                        <div class="form-group">
                                            <label class="control-label col-md-2">初始密码</label>
                                            <div class="col-md-10">
                                                <input id="passwordchange"  type="text" class="form-control" placeholder="初始密码..." />
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-12">
                                        <div class="form-group">
                                            <label class="control-label col-md-2">角色</label>
                                            <div class="col-md-10">
                                                <select id="rolenamechange" class="form-control select2" style="width: 100%;">
                                                    <c:forEach items="${listMapr}" var="item">
                                                     
                                                    <option selected="selected">${item.roleName}</option>

                                                  </c:forEach>
                                                </select>
                                            </div>
                                        </div>                                    
                                    </div>
                                    <div class="col-md-12">
                                        <div class="form-group">
                                            <label class="control-label col-md-2">用户备注</label>
                                            <div class="col-md-10">
                                                <textarea id="userremarkschange" name="userremarkschange" class="form-control"  rows="8" placeholder="Enter ..."></textarea>
                                            </div>
                                        </div>     
                                    </div>                                   
                                    
                                </div>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                                <button type="button" id="changeuser" class="btn btn-primary" data-dismiss="modal">确认</button>
                            </div>
                        </form>


                    </div>
                </div>
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
<script src="<%=request.getContextPath()%>/rec/jQuery/jQuery-2.2.0.min.js"></script>
<!-- Bootstrap 3.3.6 -->
<script src="<%=request.getContextPath()%>/rec/bootstrap/js/bootstrap.min.js"></script>
<!-- Select2 -->
<script src="<%=request.getContextPath()%>/rec/select2/select2.full.min.js"></script>
<!-- iCheck -->
<script src="<%=request.getContextPath()%>/rec/iCheck/icheck.min.js"></script>
<!-- DataTables -->
<script src="<%=request.getContextPath()%>/rec/datatables/jquery.dataTables.min.js"></script>
<script src="<%=request.getContextPath()%>/rec/datatables/dataTables.bootstrap.min.js"></script>

<!-- date-range-picker -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.11.2/moment.min.js"></script>
<script src="<%=request.getContextPath()%>/rec/daterangepicker/daterangepicker.js"></script>

<!-- SlimScroll 1.3.0 -->
<script src="<%=request.getContextPath()%>/rec/slimScroll/jquery.slimscroll.min.js"></script>
<!-- FastClick -->
<script src="<%=request.getContextPath()%>/rec/fastclick/fastclick.js"></script>
<!-- AdminLTE App -->
<script src="<%=request.getContextPath()%>/rec/dist/js/app.min.js"></script>
<!-- AdminLTE for demo purposes -->
<script src="<%=request.getContextPath()%>/rec/dist/js/demo.js"></script>

<script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.11.2/moment.min.js"></script>
<script src="<%=request.getContextPath()%>/rec/daterangepicker/daterangepicker.js"></script>
<!-- page script -->
<script>
    $(function () {
        $("#example1").DataTable();
        $('#reservation1').daterangepicker();   
    });
    
  $(function () {
  
          $("#changemodal").click(function(){

                $("#change").modal();
                //document.getElementById('userbookid').value = h;
                //$("#identifier").modal();  
          });
          
            $("#addmodal").click(function(){
                $("#add").modal();
            });
  
  

          
          
         $("#changeuser").click(function(){
            $("input[type='radio']:checked").each(function() { // 遍历选中的checkbox
                n = $(this).parents("tr").index();  // 获取checkbox所在行的顺序
                //alert(n);
                h = $(this).parents("tr").find("[name='userID']").text();
                s = $(this).parents("tr").find("[name='userName']").text();
                //alert(h);
            });     
            
 	        var jsontest={
     			 userid:h,
     			 username:$("#usernamechange").val(),
     			 loginname:$("#loginnamechange").val(),
     			 password:$("#passwordchange").val(),
     			 rolename:$("#rolenamechange").val(),
     			 userremark:$("#userremarkchange").val()
    	        };
               var $a = $(this);  
               $.ajax({  
                  url:"<%=request.getContextPath()%>/systemmanage/changeUser",  
                  type:'post',  
                  data:jsontest,  
                  dataType: 'json',  
  
        		  success:function(data){
         		  if (data && data.success == "true") 
         		  {
					  alert("修改成功");
					  window.location.reload();    		
            		
         		  }
        		   else
         		  {
         		  	alert("修改失败");   
         		  }  
        		  },        
       			   error:function(data){              
        		  } 
              }); 
            
        });
  
  
          $("#adduser").click(function(){
   
    	    var jsontest={
     			 userid:$("#useridadd").val(),
     			 username:$("#usernameadd").val(),
     			 loginname:$("#loginnameadd").val(),
     			 password:$("#passwordadd").val(),
     			 rolename:$("#rolenameadd").val(),
     			 userremark:$("#userremarkadd").val()
    	        };

               $.ajax({
                  url:"<%=request.getContextPath()%>/systemmanage/addUser",  
                  type:"post",  
                  //data:$.toJSON(userArray),  
                  data:jsontest,
                  dataType: "json",  
  
        		  success:function(data){
         		  if (data && data.success == "true") 
         		  {
					  alert("添加成功");
					  window.location.reload();
					      		
         		  }
        		   else
         		  {
         		  	alert("添加失败");   
         		  }  
        		  },        
       			   error:function(data){              
        		  } 
              }); 
             });

  
            
           

        $("#delete").click(function(){
          var userArray = new Array();
            $("input[type='checkbox']:checked").each(function() { // 遍历选中的checkbox
                n = $(this).parents("tr").index();  // 获取checkbox所在行的顺序
                
                h = $(this).parents("tr").find("[name='userID']").text();
                s = $(this).parents("tr").find("[name='userName']").text();
                
                userArray.push({userid: h, username: s});
    	   });
    	    var jsontest={
     			 userid:h,
     			 username:s
    	        };
    	        var $a = $(this);  
               $.ajax({
                  url:"<%=request.getContextPath()%>/systemmanage/deleteUser",  
                  type:"post",  
                  //data:$.toJSON(userArray),  
                  data:jsontest,
                  dataType: "json",  
  
        		  success:function(data){
         		  if (data && data.success == "true") 
         		  {
					  alert("删除成功");
					  window.location.reload();    		
         		  }
        		   else
         		  {
         		  	alert("删除失败");   
         		  }  
        		  },        
       			   error:function(data){              
        		  } 
              }); 
             });
          });
    

</script>
</body>
</html>
