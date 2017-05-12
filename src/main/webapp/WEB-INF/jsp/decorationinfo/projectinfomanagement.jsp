<%@ page language="java" contentType="text/html;charset=utf-8" import="java.util.*,com.sun.pojo.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>诚业建筑 | 劳务结算</title>
    <%String path=request.getContextPath()+"/rec";%>
    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <!-- Bootstrap 3.3.6 -->
    <link rel="stylesheet" href="<%=path%>/bootstrap/css/bootstrap.min.css">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
    <!-- Ionicons -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
    <!-- daterange picker -->
    <link rel="stylesheet" href="<%=path%>/daterangepicker/daterangepicker-bs3.css">
    <!-- bootstrap datepicker -->
    <link rel="stylesheet" href="<%=path%>/datepicker/datepicker3.css">
    <!-- Bootstrap Color Picker -->
    <link rel="stylesheet" href="<%=path%>/colorpicker/bootstrap-colorpicker.min.css">
    <!-- Bootstrap time Picker -->
    <link rel="stylesheet" href="<%=path%>/timepicker/bootstrap-timepicker.min.css">
    <!-- Select2 -->
    <link rel="stylesheet" href="<%=path%>/select2/select2.min.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="<%=path%>/dist/css/AdminLTE.min.css">
    <!-- AdminLTE Skins. Choose a skin from the css/skins
         folder instead of downloading all of them to reduce the load. -->
    <link rel="stylesheet" href="<%=path%>/dist/css/skins/_all-skins.min.css">
    <link rel="stylesheet" href="<%=path%>/iCheck/flat/blue.css">
    <link rel="stylesheet" href="<%=path%>/dist/css/main.css">
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
                装饰工程对应信息管理
            </h1>
            <ol class="breadcrumb">
                <li><a href="#"><i class="fa fa-dashboard"></i>装饰基础信息管理</a></li>
                <li class="active">装饰工程对应信息管理</li>
            </ol>
        </section>

        <!-- Main content -->
        <section class="content">
            <div class="row">
                <div class="col-xs-12">
                    <div class="box">
                        <div class="box-header">
                            <h3 class="box-title">工程基本信息列表</h3>
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
                                    <th>工程编号</th>
                                    <th>工程名称</th>
                                    <th>项目经理</th>
                                    <th>审计人员</th>
                                    <th>成控部经理</th>
                                    <th>开始时间</th>
                                    <th><button type="button" id="changemodal" class="btn btn-block btn-info"   style="width: 60px">修改</button></th>
                                    <th><button type="button" id="delete" class="btn btn-block btn-info"  style="width: 60px">删除</button></th>
                                </tr>
                                </thead>
                                <tbody>
                                	 <c:forEach items="${listMap}" var="item">
                                     	<tr>
                                   			<td name="projectID">${item.projectID}</td>
                                   			<td name="projectName">${item.projectName}</td>
                                   			<td name="projectManager">${item.projectManager}</td>          
                                   			<td name="auditor">${item.auditor}</td>
                                   			<td name="controlManager">${item.controlManager}</td>  
                                   			<td name="beginTime">${item.beginTime}</td>                                      			                                        			                                          			                         			
                                   			<td><input type="radio" name="ss"></td>
                                            <td><input type="checkbox"></td>
                                     	</tr>
                                     </c:forEach>
                                </tbody>
                                <tfoot>
                                <tr>
                                    <th>  </th>
                                    <th>  </th>
                                    <th> <button type="button" class="btn btn-block btn-info" data-toggle="modal" data-target="#add"  style="width: 60px">添加</button> </th>
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
                                <span id="lblAddOneTitle" style="font-weight:bold">添加任装饰人员对应工程信息</span>
                            </h4>
                        </div>

                        <form class="form-horizontal form-bordered form-row-strippe" id="addfrom" action="" data-toggle="validator" enctype="multipart/form-data">
                            <div class="modal-body">
                                <div class="row">
                                    <div class="col-md-12">
                                        <div class="form-group">
                                            <label class="control-label col-md-2">工程编号</label>
                                            <div class="col-md-10">
                                                <input id="projectidadd" name="projectidadd" type="text" class="form-control" placeholder="工程编号..." />
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label col-md-2">工程名称</label>
                                            <div class="col-md-10">
                                                <input id="projectnameadd" name="projectnameadd" type="text" class="form-control" placeholder="工程书名称..." />
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label col-md-2">项目经理</label>
                                            <div class="col-md-10">
                                                <select id="projectmanageradd" class="form-control select2" style="width: 100%;">
                                                  <c:forEach items="${listMapu}" var="item">
                                                     
                                                    <option selected="selected">${item.userName}</option>

                                                  </c:forEach>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label col-md-2">审计人员</label>
                                            <div class="col-md-10">
                                                <select id="auditoradd" class="form-control select2" style="width: 100%;">
                                                    <c:forEach items="${listMapu}" var="item">
                                                     
                                                    <option selected="selected">${item.userName}</option>

                                                  </c:forEach>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label col-md-2">成控部经理</label>
                                            <div class="col-md-10">
                                                <select id="controlmanageradd" class="form-control select2" style="width: 100%;">
                                                 <c:forEach items="${listMapu}" var="item">
                                                     
                                                    <option selected="selected">${item.userName}</option>

                                                  </c:forEach>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label col-md-2">开始时间</label>
                                            <div class="col-md-10">
                                                <div class="input-group date">
                                                    <div class="input-group-addon">
                                                        <i class="fa fa-calendar"></i>
                                                    </div>
                                                    <input type="text" id="begintimeadd"   class="form-control pull-right">
                                                </div>
                                            </div>
                                        </div>

                                    </div>
                                </div>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                                <button type="button" id="addproject" class="btn btn-primary">确认</button>
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
                                <span id="lblAddOneTitle" style="font-weight:bold">修改对应工程信息</span>
                            </h4>
                        </div>

                        <form class="form-horizontal form-bordered form-row-strippe" id="changefrom" action="" data-toggle="validator" enctype="multipart/form-data">
                            <div class="modal-body">
                                <div class="row">
                                    <div class="col-md-12">
                                        <div class="form-group">
                                            <label class="control-label col-md-2">工程编号</label>
                                            <div class="col-md-10">
                                                <input id="projectidchange" name="projectidchange" type="text" class="form-control" placeholder="工程编号..." />
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label col-md-2">工程名称</label>
                                            <div class="col-md-10">
                                                <input id="projectnamechange" name="projectnamechange" type="text" class="form-control" placeholder="工程书名称..." />
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label col-md-2">项目经理</label>
                                            <div class="col-md-10">
                                                <select id="projectmanagerchange" class="form-control select2" style="width: 100%;">
                                                    <c:forEach items="${listMapu}" var="item">
                                                     
                                                    <option selected="selected">${item.userName}</option>

                                                  </c:forEach>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label col-md-2">审计人员</label>
                                            <div class="col-md-10">
                                                <select id="auditorchange" class="form-control select2" style="width: 100%;">
                                                     <c:forEach items="${listMapu}" var="item">
                                                     
                                                     <option selected="selected">${item.userName}</option>

                                                     </c:forEach>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label col-md-2">成控部经理</label>
                                            <div class="col-md-10">
                                                <select id="controlmanagerchange" class="form-control select2" style="width: 100%;">
                                                   <c:forEach items="${listMapu}" var="item">
                                                     
                                                    <option selected="selected">${item.userName}</option>

                                                  </c:forEach>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label col-md-2">开始时间</label>
                                            <div class="col-md-10">
                                                <div class="input-group date">
                                                    <div class="input-group-addon">
                                                        <i class="fa fa-calendar"></i>
                                                    </div>
                                                    <input type="text" data-format="yyyy-MM-dd" class="form-control pull-right" id="begintimechange">
                                                </div>
                                            </div>
                                        </div>

                                    </div>
                                </div>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                                <button type="button" id="changeproject" class="btn btn-primary">确认</button>
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
<script src="<%=path%>/jQuery/jQuery-2.2.0.min.js"></script>
<!-- Bootstrap 3.3.6 -->
<script src="<%=path%>/bootstrap/js/bootstrap.min.js"></script>
<!-- Select2 -->
<script src="<%=path%>/select2/select2.full.min.js"></script>
<!-- iCheck -->
<script src="<%=path%>/iCheck/icheck.min.js"></script>
<!-- DataTables -->
<script src="<%=path%>/datatables/jquery.dataTables.min.js"></script>
<script src="<%=path%>/datatables/dataTables.bootstrap.min.js"></script>

<!-- date-range-picker -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.11.2/moment.min.js"></script>
<script src="<%=path%>/daterangepicker/daterangepicker.js"></script>

<!-- bootstrap datepicker -->
<script src="<%=path%>/datepicker/bootstrap-datepicker.js"></script>
<!-- SlimScroll 1.3.0 -->
<script src="<%=path%>/slimScroll/jquery.slimscroll.min.js"></script>
<!-- FastClick -->
<script src="<%=path%>/fastclick/fastclick.js"></script>
<!-- AdminLTE App -->
<script src="<%=path%>/dist/js/app.min.js"></script>
<!-- AdminLTE for demo purposes -->
<script src="<%=path%>/dist/js/demo.js"></script>


<script type="text/javascript" src="<%=path%>/dist/js/bootstrapValidator.js"></script>
<script type="text/javascript" src="<%=path%>/dist/js/jquery-confirm.min.js"></script>
<!-- page script -->
<script>
    $(function () {
        $("#example1").DataTable();
        $('#reservation1').daterangepicker();

    });
        $('#begintimechange').datepicker({
            format: 'yyyy-mm-dd',
            autoclose: true
        });
        
        
        $('#begintimeadd').datepicker({
            format: 'yyyy-mm-dd',
            autoclose: true
        });
         
         
          $("#changemodal").click(function(){
           $("#change").modal();
                //document.getElementById('projectbookid').value = h;
                //$("#identifier").modal();  
          });
          
          $("#addmodal").click(function(){
             $("#add").modal();
          });

         $("#changeproject").click(function(){
            $("input[type='radio']:checked").each(function() { // 遍历选中的checkbox
                n = $(this).parents("tr").index();  // 获取checkbox所在行的顺序
                //alert(n);
                h = $(this).parents("tr").find("[name='projectID']").text();
                s = $(this).parents("tr").find("[name='projectName']").text();
                m = $(this).parents("tr").find("[name='projectManager']").text();
                a = $(this).parents("tr").find("[name='auditor']").text();
                c = $(this).parents("tr").find("[name='controlManager']").text();
                b = $(this).parents("tr").find("[name='beginTime']").text();                                                                
                //alert(h);
            });     
            
 	        var jsontest={
     			 projectid:h,
     			 projectname:$("#projectnamechange").val(),
     			 projectmanager:$("#projectmanagerchange").val(),
      			 auditor:$("#auditorchange").val(),  			 
     			 controlmanager:$("#controlmanagerchange").val(),
     			 begintime:$("#begintimechange").val()
    	        };
               var $a = $(this);  
               $.ajax({  
                  url:"<%=request.getContextPath()%>/decorationinfo/changeProject",  
                  type:'post',  
                  data:jsontest,  
                  dataType: 'json',  
  
        		  success:function(data){
         		  if (data && data.success == "true") 
         		  {
					  alert("修改成功");    		
            		
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
  
  
          $("#addproject").click(function(){
   
    	    var jsontest={
     			 projectid:$("#projectidadd").val(),
     			 projectname:$("#projectnameadd").val(),
     			 projectmanager:$("#projectmanageradd").val(),
      			 auditor:$("#auditoradd").val(),  			 
     			 controlmanager:$("#controlmanageradd").val(),
     			 begintime:$("#begintimeadd").val()
    	        };

               $.ajax({
                  url:"<%=request.getContextPath()%>/decorationinfo/addProject",  
                  type:"post",  
                  //data:$.toJSON(projectArray),  
                  data:jsontest,
                  dataType: "json",  
  
        		  success:function(data){
         		  if (data && data.success == "true") 
         		  {
					  alert("添加成功");    		
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
          var projectArray = new Array();
            $("input[type='checkbox']:checked").each(function() { // 遍历选中的checkbox
                n = $(this).parents("tr").index();  // 获取checkbox所在行的顺序
                
                h = $(this).parents("tr").find("[name='projectID']").text();
                s = $(this).parents("tr").find("[name='projectName']").text();
                
                projectArray.push({projectid: h, projectname: s});
    	   });
    	    var jsontest={
     			 projectid:h,
     			 projectname:s
    	        };
    	        var $a = $(this);  
               $.ajax({
                  url:"<%=request.getContextPath()%>/decorationinfo/deleteProject",  
                  type:"post",  
                  //data:$.toJSON(projectArray),  
                  data:jsontest,
                  dataType: "json",  
  
        		  success:function(data){
         		  if (data && data.success == "true") 
         		  {
					  alert("删除成功");    		
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















    $(document).ready(function() {
        $('#addfrom')
            .bootstrapValidator({
                message: 'This value is not valid',
                feedbackIcons: {
                    valid: 'glyphicon glyphicon-ok',
                    invalid: 'glyphicon glyphicon-remove',
                    validating: 'glyphicon glyphicon-refresh'
                },
                fields: {
                    'projectname': {
                        validators: {
                            notEmpty: {
                                message: '不能为空'
                            },
                            stringLength: {
                                min: 1,
                                max: 10,
                                message: '不超过十个字符'
                            }
                        }
                    }
                }
            });
    });
</script>
</body>
</html>
    
