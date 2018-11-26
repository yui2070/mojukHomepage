<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<script type="text/javascript">

</script>

		
<!--Start Header-->
<div id="screensaver">
	<canvas id="canvas"></canvas>
	<i class="fa fa-lock" id="screen_unlock"></i>
</div>
<div id="modalbox">
	<div class="devoops-modal">
		<div class="devoops-modal-header">
			<div class="modal-header-name">
				<span>Basic table</span>
			</div>
			<div class="box-icons">
				<a class="close-link"> <i class="fa fa-times"></i>
				</a>
			</div>
		</div>
		<div class="devoops-modal-inner"></div>
		<div class="devoops-modal-bottom"></div>
	</div>
</div>
<header class="navbar">
	<div class="container-fluid expanded-panel">
		<div class="row">
			<div id="logo" class="col-xs-12 col-sm-2">
				<a href="http://localhost:8081/mainpage.do">MOJUK</a>
			</div>
			<div id="top-panel" class="col-xs-12 col-sm-10">
				<div class="row">
					<div class="col-xs-8 col-sm-9">
						<a href="#" class="dropdown-toggle">
							<i class="fa fa-pencil-square-o"></i> <span class="hidden-xs">프로필  </span>
						</a>
						<i >&nbsp; | &nbsp;</i>
						<a href="/no_list.do" class="dropdown-toggle">
							<i class="fa fa-list"></i> <span class="hidden-xs">  공지사항  </span>
						</a> 
						<i >&nbsp; | &nbsp;</i>
						<a href="/pro_list.do" class="dropdown-toggle">
							<i class="fa fa-desktop"></i> <span class="hidden-xs">  프로젝트  </span>
						</a>
						<i >&nbsp; | &nbsp;</i>
						<a href="/toc_board.do" class="dropdown-toggle">
							<i class="fa fa-table"></i> <span class="hidden-xs">  TOC튀는멘토링  </span>
						</a>
						<i >&nbsp;| &nbsp;</i>
						<a href="#" class="dropdown-toggle">
							<i class="fa fa-table"></i> <span class="hidden-xs">  Fly튜터링</span>
						</a>
						<i >&nbsp; | &nbsp;</i>
						 <a href="#" class="dropdown-toggle">
							<i class="fa fa-map-marker"></i> <span class="hidden-xs">  대외활동  </span>
						</a> 
						<i >&nbsp; | &nbsp;</i>
						<a href="/gallery.do" class="dropdown-toggle">
							<i class="fa fa-picture-o"></i> <span class="hidden-xs">  갤러리</span>
						</a>
					</div>


						<div class="col-xs-4 col-sm-3 top-panel-right">
							<ul class="nav navbar-nav pull-right panel-menu">

								<li class="dropdown"><a href="#"
									class="dropdown-toggle account" data-toggle="dropdown">
										<div class="avatar">
											<img src="../resources/images/mojuk_logo.png" class="img-rounded"
												alt="avatar" />
										</div> <i class="fa fa-angle-down pull-right"></i>
										<div class="user-mini pull-right">

											
											
						</div>
						</a>
						<ul class="dropdown-menu">
							
							
							
							
								<li><a href="/login.do"> <i class="fa fa-power-off"></i> <span
										class="hidden-sm text">Login</span></a></li>
							

						</ul>
						</li>

						</ul>
					</div>

				</div>
			</div>
</header>





