<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%String path=request.getContextPath()+"/rec";%>
 <header class="main-header">
    <!-- Logo -->
    <a href="#" class="logo">
      <!-- mini logo for sidebar mini 50x50 pixels -->
      <span class="logo-mini"><b>劳务</b></span>
      <!-- logo for regular state and mobile devices -->
      <span class="logo-lg"><b>诚业建筑利</b>装饰劳务结算系统</span>
    </a>
    <!-- Header Navbar: style can be found in header.less -->
    <nav class="navbar navbar-static-top">
      <!-- Sidebar toggle button-->
      <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
        <span class="sr-only">Toggle navigation</span>
      </a>
      
      <div class="navbar-custom-menu">
        <ul class="nav navbar-nav">
          <!-- Tasks: style can be found in dropdown.less -->
          <li class="dropdown tasks-menu">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
              <i class="fa fa-flag-o"></i>
              <span class="label label-danger" id="budgetnumber"></span>
            </a>
            <ul class="dropdown-menu">
              <li class="header">今日预算</li>
              <li>
                <!-- inner menu: contains the actual data -->
                <ul class="menu" id="todaybudget">
                </ul>
              </li>
            </ul>
          </li>
          <!-- User Account: style can be found in dropdown.less -->
          <li class="dropdown user user-menu">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
              <img src="<%=path%>/dist/img/user2-160x160.jpg" class="user-image" alt="User Image">
              <span class="hidden-xs">${nameAndID.userName}</span>
            </a>
            <ul class="dropdown-menu">
              <!-- User image -->
              <li class="user-header">
                <img src="<%=path%>/dist/img/user2-160x160.jpg" class="img-circle" alt="User Image">

                <p>
                  ${map.userName}
                  <small>欢迎您</small>
                </p>
              </li>
              <!-- Menu Footer-->
              <li class="user-footer">
                <div class="pull-left">
                  <a href="user/change.html" class="btn btn-default btn-flat">个人信息</a>
                </div>
                <div class="pull-right">
                  <a href="#" class="btn btn-default btn-flat">退出登录</a>
                </div>
              </li>
            </ul>
          </li>

        </ul>
      </div>
    </nav>
  </header>
