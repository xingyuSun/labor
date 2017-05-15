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
                装饰计件任务书
            </h1>
            <ol class="breadcrumb">
                <li><a href="#"><i class="fa fa-dashboard"></i>新建装饰任务书</a></li>
                <li class="active">装饰计件任务书</li>
            </ol>
        </section>

        <!-- Main content -->
        <section class="content">
            <div class="row">
                <div class="col-xs-12">
                    <div class="box">
                        <div class="box-header">
                            <h3 class="box-title">新建装饰计件任务书</h3>
                        </div>


                        <!-- /.box-header table-responsive mailbox-messages -->
                        <div class="box-body">
                            <table id="example1" class="table table-bordered table-striped">
                                <thead>
                                <tr>
                                    <th>序号</th>
                                    <th>工程名称</th>
                                    <th>所属部门</th>
                                    <th>栋号</th>
                                    <th>结算单位</th>
                                    <th>时间范围</th>
                                    <th>新/旧合同</th>
                                    <th>分部</th>
                                    <th>工程部位</th>
                                    <th>工作项目</th>
                                    <th>具体部位</th>
                                    <th>单位</th>
                                    <th>单价</th>
                                    <th>本月实际完成工作量</th>
                                    <th>工资金额</th>
                                    <th>已累计工程量</th>
                                    <th>备注</th>
                                    

                                </tr>
                                </thead>
                                <tbody>
                                	 <c:forEach items="${listMap}" var="item">
                                     	<tr>
                                   			<td name="taskBookID">${item.taskBookID}</td>
                                   			<td name="projectName">${item.projectName}</td>
                                   			<td name="departmentName">${item.departmentName}</td>
                                   			<td name="buildingsNum">${item.buildingsNum}</td>
                                   			<td name="settlementUnitName">${item.settlementUnitName}</td>
                                   			<td name="workTime">${item.workTime}</td>
                                   			<td name="contractType">${item.contractType}</td>
                                   			<td name="divisionName">${item.divisionName}</td>
                                   			<td name="workProjectName">${item.workProjectName}</td>
                                   			<td name="workProjectParts">${item.workProjectParts}</td>
                                   			<td name="specificParts">${item.specificParts}</td>
                                   			<td name="unitName">${item.unitName}</td>
                                   			<td name="unitPrice">${item.unitPrice}</td>
                                   			<td name="monthWorkload">${item.monthWorkload}</td>
                                   			<td name="wage">${item.wage}</td>
                                   			<td name="accumulatedWorkload">${item.accumulatedWorkload}</td>
                                   			<td name="taskBookRemarks">${item.taskBookRemarks}</td>
                                   			
                                     	</tr>
                                     </c:forEach>
                                </tbody>

                                <tfoot>
                                <tr>
                                    <th>  </th>
                                    <th>  </th>
                                    <th> <button type="button" class="btn btn-block btn-info" id="addmodal"  style="width: 60px">添加</button> </th>
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
                                <span id="AddTitle" style="font-weight:bold">新建装饰计件任务书</span>
                            </h4>
                        </div>

                        <form class="form-horizontal form-bordered form-row-strippe" id="addfrom" action=""  data-toggle="validator" enctype="multipart/form-data">
                            <div class="modal-body">
                                <div class="row">
                                    <div class="col-md-12">
                                    
                                        <div class="form-group">
                                            <label class="control-label col-md-2">任务书编号</label>
                                            <div class="col-md-10">
                                                <input id="taskbookidadd" name="taskbookidadd" type="text" class="form-control" placeholder="任务书编号..." />
                                            </div>
                                        </div>
                                    
                                        <div class="form-group">
                                            <label class="control-label col-md-2">工程名称</label>
                                            <div class="col-md-10">
                                                <select id="projectnameadd" class="form-control select2" style="width: 100%;">
                                                    <c:forEach items="${listMapp}" var="item">
                                                     
                                                    <option selected="selected">${item.projectName}</option>

                                                  </c:forEach>
                                                </select>
                                            </div>
                                        </div>
                                        
                                        <div class="form-group">
                                            <label class="control-label col-md-2">工程所属部门</label>
                                            <div class="col-md-10">
                                                <select id="departmentnameadd" class="form-control select2" style="width: 100%;">
                                                    <c:forEach items="${listMapt}" var="item">
                                                     
                                                    <option selected="selected">${item.departmentName}</option>

                                                  </c:forEach>
                                                </select>
                                            </div>
                                        </div>
                                        
                                        <div class="form-group">
                                            <label class="control-label col-md-2">栋号</label>
                                            <div class="col-md-10">
                                                <select id="buildingsnumadd" class="form-control select2" style="width: 100%;">
                                                    <c:forEach items="${listMapb}" var="item">
                                                     
                                                    <option selected="selected">${item.buildingsNum}</option>

                                                  </c:forEach>
                                                </select>
                                            </div>
                                        </div>
                                        
                                        <div class="form-group">
                                            <label class="control-label col-md-2">结算单位</label>
                                            <div class="col-md-10">
                                                <select id="settlementunitnameadd" class="form-control select2" style="width: 100%;">
                                                     <c:forEach items="${listMaps}" var="item">
                                                     
                                                    <option selected="selected">${item.settlementUnitName}</option>

                                                  </c:forEach>
                                                </select>
                                            </div>
                                        </div>
                                        
                                        <div class="form-group">
                                          <div class="control-label col-md-2">
                                              <h5 class="text-center">工作时间范围</h5>
                                          </div>
                                          <div class="col-md-10">
                                            <div class="input-group">
                                                <div class="input-group-addon">
                                                    <i class="fa fa-calendar"></i>
                                                </div>
                                                <input type="text" class="form-control pull-right" id="worktimeadd">
                                            </div>
                                            <!-- /.input group -->
                                           </div>
                                         </div>
                                        
                                        <div class="form-group">
                                            <label class="control-label col-md-2">新/旧合同</label>
                                            <div class="col-md-10">
                                                <select id="contracttypeadd" class="form-control select2" style="width: 100%;">
                                                    <option selected="selected">新合同</option>
                                                    <option>旧合同</option>
                                                 </select>
                                            </div>
                                        </div>
                                       
                                        <div class="form-group">
                                            <label class="control-label col-md-2">分部</label>
                                            <div class="col-md-10">
                                                <select id="divisionnameadd" class="form-control select2" style="width: 100%;">
                                                    <c:forEach items="${listMapd}" var="item">
                                                     
                                                    <option selected="selected">${item.divisionName}</option>

                                                  </c:forEach>
                                                </select>
                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <label class="control-label col-md-2">工程部位</label>
                                            <div class="col-md-10">
                                                <select id="workprojectpartsadd" class="form-control select2" style="width: 100%;">
                                                    <c:forEach items="${listMapw}" var="item">
                                                     
                                                    <option selected="selected">${item.workProjectParts}</option>

                                                  </c:forEach>
                                                </select>
                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <label class="control-label col-md-2">工作项目</label>
                                            <div class="col-md-10">
                                                <select id="workprojectnameadd" class="form-control select2" style="width: 100%;">
                                                    <c:forEach items="${listMapw}" var="item">
                                                     
                                                    <option selected="selected">${item.workProjectName}</option>

                                                  </c:forEach>
                                                </select>
                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <label class="control-label col-md-2">单位</label>
                                            <div class="col-md-10">
                                                <select id="unitnameadd" class="form-control select2" style="width: 100%;">
                                                    <c:forEach items="${listMapu}" var="item">
                                                     
                                                    <option selected="selected">${item.unitName}</option>

                                                  </c:forEach>
                                                </select>
                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <label class="control-label col-md-2">单价</label>
                                            <div class="col-md-10">
                                                <input id="unitpriceadd" name="unitpriceadd" type="text" class="form-control" placeholder="单价..." />
                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <label class="control-label col-md-2">本月实际完成工作量</label>
                                            <div class="col-md-10">
                                                <input id="monthworkloadadd" name="monthworkloadadd" type="text" class="form-control" placeholder="工作项目名称..." />
                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <label class="control-label col-md-2">已累计工程量</label>
                                            <div class="col-md-10">
                                                <input id="accumulatedworkloadadd" name="accumulatedworkloadadd" type="text" class="form-control" placeholder="工作项目名称..." />
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label col-md-2">具体部位</label>
                                            <div class="col-md-10">
                                                <textarea id="specificpartsadd" name="specificpartsadd" class="form-control"  rows="8" placeholder="Enter ..."></textarea>
                                            </div>
                                        </div>


                                        <div class="form-group">
                                            <label class="control-label col-md-2">备注</label>
                                            <div class="col-md-10">
                                                <textarea id="taskbookremarksadd" name="taskbookremarksadd" class="form-control"  rows="8" placeholder="Enter ..."></textarea>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                                <button type="button" id="addtaskbook" class="btn btn-primary">确认</button>
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
<!-- ./wrapper -->

<!-- jQuery 2.2.0 -->
<script src="<%=path%>/jQuery/jQuery-2.2.0.min.js"></script>
<!-- Bootstrap 3.3.6 -->
<script src="<%=path%>/bootstrap/js/bootstrap.min.js"></script>
<!-- Select2 -->
<script src="<%=path%>/select2/select2.full.min.js"></script>
<!-- iCheck -->
<script src="<%=path%>/iCheck/icheck.min.js"></script>
<!-- InputMask -->
<script src="<%=path%>/input-mask/jquery.inputmask.js"></script>
<script src="<%=path%>/input-mask/jquery.inputmask.date.extensions.js"></script>
<script src="<%=path%>/input-mask/jquery.inputmask.extensions.js"></script>
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


          $("#addmodal").click(function(){
             $("#add").modal();
          });
        function p(s) {
             return s < 10 ? '0' + s: s;
          }

          var myDate = new Date();
          var now=myDate.getFullYear()+'-'+p(myDate.getMonth()+1)+"-"+p(myDate.getDate())+" "+p(myDate.getHours())+':'+p(myDate.getMinutes())+":"+p(myDate.getSeconds());
               


          $("#addtaskbook").click(function(){
    	    var jsontest={
     			 taskbookid:$("#taskbookidadd").val(),
     			 taskbooktype:"计件任务书",
     			 projectname:$("#projectnameadd").val(),
     			 departmentname:$("#departmentnameadd").val(),
      			 buildingsnum:$("#buildingsnumadd").val(),
     			 settlementunitname:$("#settlementunitnameadd").val(),
     			 worktime:$("#worktimeadd").val(),
     			 contracttype:$("#contracttypeadd").val(),
     			 divisionname:$("#divisionnameadd").val(),
     			 workprojectparts:$("#workprojectpartsadd").val(),
      			 workprojectname:$("#workprojectnameadd").val(),
     			 unitname:$("#unitnameadd").val(),
     			 unitprice:$("#unitpriceadd").val(),
     			 monthworkload:$("#monthworkloadadd").val(),
     			 accumulatedworkload:$("#accumulatedworkloadadd").val(),
     			 specificparts:$("#specificpartsadd").val(),
     			 submittime:now,
     			 reviewstatus:"待审核",
      			 taskbookremarks:$("#taskbookremarksadd").val()
    	        };

               $.ajax({
                  url:"<%=request.getContextPath()%>/newtaskbook/addTaskBook",  
                  type:"post",  
                  //data:$.toJSON(taskbookArray),  
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

  
            
           

 

    //Date range picker
    $('#reservation').daterangepicker();
    $('#worktimeadd').daterangepicker();
    $('#worktimechange').daterangepicker();
    //Date range picker with time picker
    $('#reservationtime').daterangepicker({timePicker: true, timePickerIncrement: 30, format: 'MM/DD/YYYY h:mm A'});
    //Date range as a button
    $('#daterange-btn').daterangepicker(
        {
            ranges: {
                'Today': [moment(), moment()],
                'Yesterday': [moment().subtract(1, 'days'), moment().subtract(1, 'days')],
                'Last 7 Days': [moment().subtract(6, 'days'), moment()],
                'Last 30 Days': [moment().subtract(29, 'days'), moment()],
                'This Month': [moment().startOf('month'), moment().endOf('month')],
                'Last Month': [moment().subtract(1, 'month').startOf('month'), moment().subtract(1, 'month').endOf('month')]
            },
            startDate: moment().subtract(29, 'days'),
            endDate: moment()
        },
        function (start, end) {
            $('#daterange-btn span').html(start.format('MMMM D, YYYY') + ' - ' + end.format('MMMM D, YYYY'));
        }
    );

    //Date picker
    $('#datepicker').datepicker({
        autoclose: true
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
                                max: 50,
                                message: '不超过50个字符'
                            }
                        }
                    },
                    'remarks': {
                        validators: {
                            stringLength: {
                                min: 0,
                                max: 250,
                                message: '不能超过250字符'
                            }
                        }
                    }
                }
            });
    });



</script>
</body>
</html>
