<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!-- Left side column. contains the logo and sidebar -->
  <aside class="main-sidebar">
    <!-- sidebar: style can be found in sidebar.less -->
        <section class="sidebar">
            <!-- Sidebar user panel -->

            <!-- /.search form -->
            <!-- sidebar menu: : style can be found in sidebar.less -->
            <ul class="sidebar-menu">
                <li class="header">主菜单</li>
                <li class="active treeview">
                    <a href="#">
                        <i class="fa  fa-paypal"></i> <span>系统管理</span> <i class="fa fa-angle-left pull-right"></i>
                    </a>
                    <ul class="treeview-menu">
                        <li class="active"><a href="index"><i class="fa fa-circle-o"></i>权限组管理</a></li>
                        <li><a href="pages/account/add"><i class="fa fa-circle-o"></i>权限管理</a></li>
                        <li><a href="<%=request.getContextPath()%>/systemmanage/rolerightsmanagement"><i class="fa fa-circle-o"></i>角色权限管理</a></li>
                        <li><a href="<%=request.getContextPath()%>/systemmanage/rolemanagement"><i class="fa fa-circle-o"></i>角色管理</a></li>
                        <li><a href="<%=request.getContextPath()%>/systemmanage/usermanagement"><i class="fa fa-circle-o"></i>用户管理</a></li>
                    </ul>
                </li>
                <li class="treeview">
                    <a href="#">
                        <i class="fa  fa-edit"></i>
                        <span>装饰基础信息管理</span>
                        <i class="fa fa-angle-left pull-right"></i>
                    </a>
                    <ul class="treeview-menu">
                        <li><a href="<%=request.getContextPath()%>/decorationinfo/taskbooktype"><i class="fa fa-circle-o"></i>任务书类型</a></li>
                        <li><a href="<%=request.getContextPath()%>/decorationinfo/unit"><i class="fa fa-circle-o"></i>单位</a></li>
                        <li><a href="<%=request.getContextPath()%>/decorationinfo/settlementunit"><i class="fa fa-circle-o"></i>装饰工程结算单位</a></li>
                        <li><a href="<%=request.getContextPath()%>/decorationinfo/projectinfomanagement"><i class="fa fa-circle-o"></i>装饰工程对应信息管理</a></li>
                        <li><a href="<%=request.getContextPath()%>/decorationinfo/reviewprocess"><i class="fa fa-circle-o"></i>审核流程管理</a></li>
                        <li><a href="<%=request.getContextPath()%>/decorationinfo/divisionstandard(d)"><i class="fa fa-circle-o"></i>分部标准（分部）</a></li>
                        <li><a href="<%=request.getContextPath()%>/decorationinfo/divisionstandard(p)"><i class="fa fa-circle-o"></i>分部标准（工程部）</a></li>
                        <li><a href="<%=request.getContextPath()%>/decorationinfo/subcriteria"><i class="fa fa-circle-o"></i>分项标准（工作项目）</a></li>
                        <li><a href="<%=request.getContextPath()%>/decorationinfo/contractpriceimport"><i class="fa fa-circle-o"></i>合同单价导入</a></li>
                        <li><a href="<%=request.getContextPath()%>/decorationinfo/contractpriceview"><i class="fa fa-circle-o"></i>合同单价查看</a></li>
                        <li><a href="<%=request.getContextPath()%>/decorationinfo/contractpricemanage"><i class="fa fa-circle-o"></i>合同单价管理</a></li>
                    </ul>
                </li>

                <li class="treeview">
                    <a href="#">
                        <i class="fa fa-pie-chart"></i>
                        <span>个人信息管理</span>
                        <i class="fa fa-angle-left pull-right"></i>
                    </a>
                    <ul class="treeview-menu">
                        <li><a href="<%=request.getContextPath()%>/infomanagement/infolocking"><i class="fa fa-circle-o"></i>装饰工程信息锁定</a></li>
                        <li><a href="<%=request.getContextPath()%>/infomanagement/changepassword"><i class="fa fa-circle-o"></i>修改密码 <small class="label pull-right bg-green">new</small></a></li>
                    </ul>
                </li>

                <li class="treeview">
                    <a href="#">
                        <i class="fa fa-pie-chart"></i>
                        <span>新建装饰任务书</span>
                        <i class="fa fa-angle-left pull-right"></i>
                    </a>
                    <ul class="treeview-menu">
                        <li><a href="<%=request.getContextPath()%>/newtaskbook/priceworktaskbook"><i class="fa fa-circle-o"></i>装饰计件任务书</a></li>
                        <li><a href="<%=request.getContextPath()%>/newtaskbook/timingtaskbook"><i class="fa fa-circle-o"></i>装饰计时任务书</a></li>
                        <li><a href="<%=request.getContextPath()%>/newtaskbook/changevisataskbook"><i class="fa fa-circle-o"></i>装饰变更签证任务书</a></li>
                        <li><a href="<%=request.getContextPath()%>/newtaskbook/supplypricetaskbook"><i class="fa fa-circle-o"></i>装饰合同外补差价任务书</a></li>
                        <li><a href="<%=request.getContextPath()%>/newtaskbook/othertaskbook"><i class="fa fa-circle-o"></i>装饰合同内其他任务书</a></li>
                        <li><a href="<%=request.getContextPath()%>/newtaskbook/copypricework"><i class="fa fa-circle-o"></i>复制装饰计件任务书</a></li>
                    </ul>
                </li>

                <li class="treeview">
                    <a href="#">
                        <i class="fa fa-pie-chart"></i>
                        <span>装饰任务书查询审核</span>
                        <i class="fa fa-angle-left pull-right"></i>
                    </a>
                    <ul class="treeview-menu">
                        <li><a href="<%=request.getContextPath()%>/taskbookviewreview/taskbookview"><i class="fa fa-circle-o"></i>查看装饰任务书</a></li>
                        <li><a href="<%=request.getContextPath()%>/taskbookviewreview/review"><i class="fa fa-circle-o"></i>审查</a></li>
                        <li><a href="<%=request.getContextPath()%>/taskbookviewreview/pendingreviewtaskbook"><i class="fa fa-circle-o"></i>已提交待审核任务书</a></li>
                        <li><a href="<%=request.getContextPath()%>/taskbookviewreview/retireunreviewtaskbook"><i class="fa fa-circle-o"></i>查看未审/退修任务书</a></li>
                        <li><a href="<%=request.getContextPath()%>/taskbookviewreview/reviewrecord"><i class="fa fa-circle-o"></i>查看审核历史纪录</a></li>
                        <li><a href="<%=request.getContextPath()%>/taskbookviewreview/selfreviewthenno"><i class="fa fa-circle-o"></i>本人已审后续未审查询</a></li>
                        <li><a href="<%=request.getContextPath()%>/taskbookviewreview/downloadtaskbook"><i class="fa fa-circle-o"></i>下载装饰任务书</a></li>
                        <li><a href="<%=request.getContextPath()%>/taskbookviewreview/notreatyetaskbook"><i class="fa fa-circle-o"></i>暂不处理任务书</a></li>
                    </ul>
                </li>

                <li class="treeview">
                    <a href="#">
                        <i class="fa fa-pie-chart"></i>
                        <span>装饰统计报表</span>
                        <i class="fa fa-angle-left pull-right"></i>
                    </a>
                    <ul class="treeview-menu">
                        <li><a href="<%=request.getContextPath()%>/statisticalreport/teammonthlyreport"><i class="fa fa-circle-o"></i>装饰班组月度报表</a></li>
                        <li><a href="<%=request.getContextPath()%>/statisticalreport/laborwages"><i class="fa fa-circle-o"></i>劳务工资支付情况明细</a></li>
                        <li><a href="<%=request.getContextPath()%>/statisticalreport/laborwagessummary"><i class="fa fa-circle-o"></i>劳务工资支付情况汇总</a></li>
                        <li><a href="<%=request.getContextPath()%>/statisticalreport/projectmonthlyreport"><i class="fa fa-circle-o"></i>装饰项目月度报表</a></li>
                    </ul>
                </li>

                <li>
                    <a href="pages/widgets">
                        <i class="fa fa-calendar"></i> <span>超级管理员</span>
                        <i class="fa fa-angle-left pull-right"></i>
                    </a>
                    <ul class="treeview-menu">
                        <li><a href="<%=request.getContextPath()%>/superadministrator/stopreview"><i class="fa fa-circle-o"></i>关停装饰审核</a></li>
                        <li><a href="<%=request.getContextPath()%>/superadministrator/deleteretiretaskbook"><i class="fa fa-circle-o"></i>删除回退装饰任务书</a></li>
                        <li><a href="<%=request.getContextPath()%>/superadministrator/monthtimerange"><i class="fa fa-circle-o"></i>装饰统计月度时间范围</a></li>
                        <li><a href="<%=request.getContextPath()%>/superadministrator/stopnewtaskbook"><i class="fa fa-circle-o"></i>关停新建装饰任务书</a></li>
                        <li><a href="<%=request.getContextPath()%>/superadministrator/completesettlement"><i class="fa fa-circle-o"></i>装饰项目完成结算</a></li>
                        <li><a href="<%=request.getContextPath()%>/superadministrator/settledtaskbook"><i class="fa fa-circle-o"></i>已结算装饰工程任务书</a></li>
                        <li><a href="<%=request.getContextPath()%>/superadministrator/taskbookoperatingrecord"><i class="fa fa-circle-o"></i>装饰任务书操作记录 <small class="label pull-right bg-green">new</small></a></li>
                    </ul>
                </li>
            </ul>
        </section>
    <!-- /.sidebar -->
  </aside>