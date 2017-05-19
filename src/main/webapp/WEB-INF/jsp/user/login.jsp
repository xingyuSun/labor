<%@ page language="java" import="java.util.*,com.sun.pojo.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>诚业建筑装饰劳务管理系统 | Log in</title>
  <%String path=request.getContextPath();%>
  <!-- Tell the browser to be responsive to screen width -->
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
  <!-- Bootstrap 3.3.6 -->
  <link rel="stylesheet" href="<%=request.getContextPath()%>/rec/bootstrap/css/bootstrap.min.css">
  <!-- Font Awesome -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
  <!-- Ionicons -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">

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
</head>
<body class="hold-transition login-page">
<div class="login-box">
  <div class="login-logo">
      <b>诚业建筑</b>装饰劳务结算系统</a>
  </div>
  <!-- /.login-logo -->
  <div class="login-box-body">
    <h4 class="login-box-msg">登录</h4>

    <form id="loginform" action="<%=request.getContextPath()%>/user/checklogin"  method="post">
      <div class="form-group has-feedback">
        <input type="text" class="form-control" placeholder="LoginName" name="loginname">
        <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
      </div>
      <div class="form-group has-feedback">
        <input type="password" class="form-control" placeholder="Password" name="password">
        <span class="glyphicon glyphicon-lock form-control-feedback"></span>
      </div>
      <div class="row">
        <div class="col-xs-8">
          <div class="checkbox icheck">
            <label>
              <input type="checkbox"> 记住我
            </label>
          </div>
        </div>
        <!-- /.col -->
        <div class="col-xs-4">
          <button type="submit" class="btn btn-primary btn-block btn-flat">登录</button>
        </div>
      </div>
        <!-- /.col -->
    </form>

    </div>
  </div>
  <!-- /.login-box-body -->
<!-- /.login-box -->

<!-- jQuery 2.2.0 -->
<script src="<%=request.getContextPath()%>/rec/jQuery/jQuery-2.2.0.min.js"></script>
<!-- Bootstrap 3.3.6 -->
<script src="<%=request.getContextPath()%>/rec/bootstrap/js/bootstrap.min.js"></script>
<!-- iCheck -->
<script src="<%=request.getContextPath()%>/rec/iCheck/icheck.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/rec/dist/js/bootstrapValidator.js"></script>
<script type="text/javascript">
  $(document).ready(function() {
    $('#loginform')
            .bootstrapValidator({
              message: 'This value is not valid',
              fields: {
                'userEmail': {
                  validators: {
                    notEmpty: {
                      message: '登录名不能为空'
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
                      min: 0,
                      max: 16,
                      message: '密码长度必须在6-16个字符之间'
                    }
                  }
                }
              }
            });
  });
</script>
<script>
  $(function () {
    $('input').iCheck({
      checkboxClass: 'icheckbox_square-blue',
      radioClass: 'iradio_square-blue',
      increaseArea: '10%' // optional
    });
  });
</script>
</body>
</html>
