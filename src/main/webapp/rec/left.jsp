<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!-- Left side column. contains the logo and sidebar -->
  <aside class="main-sidebar">
    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">
      <!-- Sidebar user panel -->

      <!-- /.search form -->
      <!-- sidebar menu: : style can be found in sidebar.less -->
      <ul class="sidebar-menu">
        <li class="header">MAIN NAVIGATION</li>
        <li class="active treeview">
          <a href="#">
            <i class="fa  fa-paypal"></i> <span>我的账户</span> <i class="fa fa-angle-left pull-right"></i>
          </a>
          <ul class="treeview-menu">
            <li class="active"><a href="<%=request.getContextPath()%>/account/index"><i class="fa fa-circle-o"></i>账户概览</a></li>
            <li><a href="<%=request.getContextPath()%>/account/add"><i class="fa fa-circle-o"></i>添加账户</a></li>
            <li><a href="<%=request.getContextPath()%>/account/manage"><i class="fa fa-circle-o"></i>管理账户</a></li>
          </ul>
        </li>
        <li class="treeview">
          <a href="#">
            <i class="fa  fa-edit"></i>
            <span>收支记录</span>
            <i class="fa fa-angle-left pull-right"></i>
          </a>
          <ul class="treeview-menu">
            <li><a href="<%=request.getContextPath()%>/record/income"><i class="fa fa-circle-o"></i>添加收入</a></li>
            <li><a href="<%=request.getContextPath()%>/record/expenditure"><i class="fa fa-circle-o"></i>添加支出</a></li>
            <li><a href="<%=request.getContextPath()%>/record/repayment"><i class="fa fa-circle-o"></i>信用卡还款</a></li>
            <li><a href="<%=request.getContextPath()%>/record/transfer"><i class="fa fa-circle-o"></i>转账/存取</a></li>
          </ul>
        </li>
        <li class="treeview">
          <a href="<%=request.getContextPath()%>/type/manage">
            <i class="fa fa-star-o"></i> <span>收支类别</span>
          </a>
        </li>

        <li class="treeview">
          <a href="#">
            <i class="fa fa-pie-chart"></i>
            <span>统计分析</span>
            <i class="fa fa-angle-left pull-right"></i>
          </a>
          <ul class="treeview-menu">
            <li><a href="statistics/IncomeAndExpenditure.html"><i class="fa fa-circle-o"></i>收支统计</a></li>
            <li><a href="statistics/monthAnalysis.html"><i class="fa fa-circle-o"></i>每月汇总</a></li>
            <li><a href="statistics/asset.html"><i class="fa fa-circle-o"></i>资产概况</a></li>
            <li><a href="statistics/year.html"><i class="fa fa-circle-o"></i>年度报表</a></li>
            <li><a href="statistics/proportion.html"><i class="fa fa-circle-o"></i>财务金字塔</a></li>
          </ul>
        </li>

        <li>
          <a href="#">
            <i class="fa fa-calendar"></i> <span>提醒预算</span>
            <i class="fa fa-angle-left pull-right"></i>
          </a>
          <ul class="treeview-menu">
            <li><a href="budget/setbudget.html"><i class="fa fa-circle-o"></i>新建预算</a></li>
            <li><a href="budget/querybudget.html"><i class="fa fa-circle-o"></i>查看预算 <small class="label pull-right bg-green">new</small></a></li>
          </ul>
        </li>
      </ul>
    </section>
    <!-- /.sidebar -->
  </aside>