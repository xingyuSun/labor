<%@ page language="java" contentType="text/html;charset=utf-8" import="java.util.*,com.sun.pojo.*" pageEncoding="utf-8" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
  <!--meta charset="utf-8"-->
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>AdminLTE 2 | Registration Page</title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
  <!-- Bootstrap 3.3.6 -->
  <link rel="stylesheet" href="<%=request.getContextPath()%>/rec/bootstrap/css/bootstrap.min.css">
  <!-- Font Awesome -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
  <!-- Ionicons -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
  <!-- Select2 -->
  <link rel="stylesheet" href="<%=request.getContextPath()%>/rec/select2/select2.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="<%=request.getContextPath()%>/rec/dist/css/AdminLTE.min.css">
  <!-- iCheck -->
  <link rel="stylesheet" href="<%=request.getContextPath()%>/rec/iCheck/square/blue.css">
  <link rel="stylesheet" href="<%=request.getContextPath()%>/rec/dist/css/main.css">
  <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
  <!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>

  <![endif]-->

  <!-- jQuery 2.2.0 -->
  <script src="<%=request.getContextPath()%>/rec/jQuery/jQuery-2.2.0.min.js"></script>
  <!-- Bootstrap 3.3.6 -->
  <script src="<%=request.getContextPath()%>/rec/bootstrap/js/bootstrap.min.js"></script>
  <!-- Select2 -->
  <script src="<%=request.getContextPath()%>/rec/select2/select2.full.min.js"></script>
  <!-- iCheck -->
  <script src="<%=request.getContextPath()%>/rec/iCheck/icheck.min.js"></script>
  <script src="<%=request.getContextPath()%>/rec/datepicker/bootstrap-datepicker.js"></script>
  <!-- script type="text/javascript" src="<%=request.getContextPath()%>/rec/dist/js/area.js"></script> 
  <script type="text/javascript" src="<%=request.getContextPath()%>/rec/dist/js/location.js"></script>-->
  <script type="text/javascript" src="<%=request.getContextPath()%>/rec/dist/js/location.js"></script>
  
</head>
<body class="hold-transition register-page">
<div class="register-box">
  <div class="register-logo">
    <a href="../index.html"><b>朝朝利</b>个人理财系统</a>
  </div>

  <div class="register-box-body">
    <h4 class="login-box-msg">注册成为新用户</h4>

    <form id="myform" action="<%=request.getContextPath()%>/user/checkRegister" method="post">

      <div class="form-group has-feedback">
        <input type="text" class="form-control" id="USERID" name="userName" placeholder="用户名">
        <span class="glyphicon glyphicon-user form-control-feedback"></span>
      </div>



      <div class="form-group has-feedback">
        <input type="email" class="form-control" id="userEmail" name="userEmail" placeholder="邮箱">
        <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
      </div>




      <div class="form-group has-feedback">
        <input type="password" class="form-control" id="USERP"  name="userPassword" placeholder="密码">
        <span class="glyphicon glyphicon-lock form-control-feedback"></span>
      </div>



      <div class="form-group has-feedback">
        <input type="password" class="form-control" id="USERRP" name="repassword" placeholder="再次输入密码">
        <span class="glyphicon glyphicon-log-in form-control-feedback"></span>
      </div>

      <!-- radio -->
      <div class="form-group">
        <label>性别：</label>
        <label>
          <input type="radio" name="userSex" class="minimal" value="M" checked>
          男
        </label>
        &nbsp;
        <label>
          <input type="radio" name="userSex" class="minimal" value="W">
          女
        </label>
      </div>
      
      <!--  div class="form-group">
        <label>ttttttt</label>
        <select class="form-control select2" style="width: 100%;" name="tttttt">
          <option selected="selected" value="Alabama">Alabama</option>
          <option value="四川">四川</option>
          <option value="California">California</option>
          <option value="Delaware">Delaware</option>
          <option value="Tennessee">Tennessee</option>
          <option value="Texas">Texas</option>
          <option value="Washington">Washington</option>
        </select>
      </div>-->
      
      
      <div class="form-group">
        <label>职业：</label>
        <select class="form-control select2" style="width: 100%;" name="userWork">
          <option value="计算机/互联网/通信">计算机/互联网/通信</option>
          <option value="生产/工艺/制造">生产/工艺/制造</option>
          <option value="医疗/护理/制药">医疗/护理/制药</option>
          <option value="金融/银行/保险/投资">金融/银行/保险/投资</option>
          <option value="商业/服务业/个体经营">商业/服务业/个体经营</option>
          <option value="文化/广告/传媒">文化/广告/传媒</option>
          <option value="娱乐/艺术/表演">娱乐/艺术/表演</option>
          <option value="律师/法务">律师/法务</option>
          <option value="教育/培训">教育/培训</option>
          <option value="公务员/行政/事业单位">公务员/行政/事业单位</option>
          <option value="Texas">模特</option>
          <option value="Texas">空姐</option>
          <option value="其他">学生</option>
          <option value="Washington">Washington</option>
        </select>
      </div>
      <label>所在地：</label>
      <div class="row">
        <div class="col-md-4">
          <div class="form-group">

            <select class="form-control select2" id="loc_province" style="width: 100%;" name="userProvince">
            </select>
          </div>
        </div>
        <div class="col-md-4">
          <div class="form-group">
            <select class="form-control select2" id="loc_city" style="width: 100%;" name="userCity">
            </select>
          </div>
        </div>
        <div class="col-md-4">
          <div class="form-group">
            <select class="form-control select2" id="loc_town" style="width: 100%;" name="userTown">
            </select>
          </div>
        </div>
      </div>

      <div class="form-group">
        <label>出生日期：</label>

        <div class="input-group date">
          <div class="input-group-addon">
            <i class="fa fa-calendar"></i>
          </div>
          <input type="text" class="form-control pull-right" id="datepicker">
        </div>
        <!-- /.input group -->
      </div>
      <div class="row">
        <div class="col-xs-8">
          <div class="checkbox icheck">
            <label>
              <input type="checkbox">我同意<a href="#">协议</a>
            </label>
          </div>
        </div>
        <!-- /.col -->
        <div class="col-xs-4">
          <button type="submit" id="signupForm" class="btn btn-primary btn-block btn-flat">注册</button>
        </div>
        <!-- /.col -->
      </div>
    </form>
    <a href="login.html" class="text-center">我已经有了一个账户</a>
  </div>
  <!-- /.form-box -->
</div>
<!-- /.register-box -->
<script type="text/javascript" src="<%=request.getContextPath()%>/rec/dist/js/bootstrapValidator.js"></script>
<script type="text/javascript">
  $(document).ready(function() {
    $('#myform')
            .bootstrapValidator({
              message: 'This value is not valid',
              fields: {
                'userName': {
                  message: '用户名无效',
                  validators: {
                    notEmpty: {
                      message: '用户名不能为空'
                    },
                    stringLength: {
                      min: 6,
                      max: 16,
                      message: '用户名长度必须在6-16个字符之间'
                    },
                    regexp: {
                      regexp: /^[a-zA-Z0-9_\.]+$/,
                      message: '用户名只能由英文字母，数字，点和下划线组成'
                    }
                  }
                },
                'userEmail': {
                  validators: {
                    emailAddress: {
                      message: '输入必须为一个邮箱'
                    },
                    notEmpty: {
                      message: '邮箱不能为空'
                    },
                    remote: {
                           type: "post",
                             url: '<%=request.getContextPath()%>/user/checkEmail',
                             data: function (validator) {

                                 return {
                                     userEmail: validator.getFieldElements('userEmail').val()
                                 };
                             },
                             message: '此郵箱已註冊。',
                             delay: 2000
                        }
                  }
                },
                'userPassword': {
                  feedbackIcons: 'false',
                  validators: {
                    notEmpty: {
                      message: '密码不能为空'
                    },
                    stringLength: {
                      min: 6,
                      max: 16,
                      message: '密码长度必须在6-16个字符之间'
                    },
                    different: {
                      field: 'userName',
                      message: '密码不能与用户名相同'
                    }
                  }
                },
                'repassword': {
                  feedbackIcons: 'false',
                  validators: {
                    notEmpty: {
                      message: '密码不能为空'
                    },
                    identical: {
                      field: 'userPassword',
                      message: '必须与上述密码相同'
                    }
                  }
                }

              }
            });
  });
</script>
<script>
function showLocation(province , city , town) {
	
	var loc	= new Location();
	var title	= ['省份' , '地级市' , '市、县、区'];
	$.each(title , function(k , v) {
		title[k]	= '<option value="">'+v+'</option>';
	})
	
	$('#loc_province').append(title[0]);
	$('#loc_city').append(title[1]);
	$('#loc_town').append(title[2]);
	
	$("#loc_province,#loc_city,#loc_town").select2()
	$('#loc_province').change(function() {
		$('#loc_city').empty();
		$('#loc_city').append(title[1]);
		loc.fillOption('loc_city' , '0,'+$("#loc_province").find("option:selected").attr("id"));
		$('#loc_city').change()
	})
	$('#loc_city').change(function() {
		$('#loc_town').empty();
		$('#loc_town').append(title[2]);
		loc.fillOption('loc_town' , '0,' + $(":selected","#loc_province").attr("id") + ',' + $(":selected","#loc_city").attr("id"));
	})
	
	$('#loc_town').change(function() {
	})
	
	if (province) {
		loc.fillOption('loc_province' , '0' , province);
		
		if (city) {
			loc.fillOption('loc_city' , '0,'+province , city);
			
			if (town) {
				loc.fillOption('loc_town' , '0,'+province+','+city , town);
			}
		}
		
	} else {
		loc.fillOption('loc_province' , '0');
	}
		
}


  $(function () {
    $(".select2").select2();
    $('input').iCheck({
      checkboxClass: 'icheckbox_square-blue',
      radioClass: 'iradio_square-blue',
      increaseArea: '20%' // optional
    });
    $('#datepicker').datepicker({
      autoclose: true
    });
    showLocation();
  });

</script>
</body>
</html>
