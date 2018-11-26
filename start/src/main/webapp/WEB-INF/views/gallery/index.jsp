

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<script src="../resources/js/util.js" type="text/javascript"></script>

<jsp:include page="/WEB-INF/views/include/home.jsp" flush="true" />
<jsp:include page="/WEB-INF/views/include/header.jsp" flush="true" />
	
	<!-- Animate.css -->
	<link rel="stylesheet" href="../resources/css/animate.css">
	<!-- Icomoon Icon Fonts-->
	<link rel="stylesheet" href="../resources/css/icomoon.css">
	<!-- Bootstrap  -->

	<!-- Owl Carousel -->
	<link rel="stylesheet" href="../resources/css/owl.carousel.min.css">
	<link rel="stylesheet" href="../resources/css/owl.theme.default.min.css">
	<!-- Theme style  -->
	<link rel="stylesheet" href="../resources/css/style.css">

	<!-- Modernizr JS -->
	<script src="../resources/js/modernizr-2.6.2.min.js"></script>
	<!-- FOR IE9 below -->
	<!--[if lt IE 9]>
	<script src="js/respond.min.js"></script>
	<![endif]-->
<div class="col-xs-9">
	<div id="fh5co-page">
		<a href="#" class="js-fh5co-nav-toggle fh5co-nav-toggle"><i></i></a>
		

		<div id="fh5co-main">

			<div class="fh5co-gallery">

				<a class="gallery-item" href="single.html">
					<img src="../resources/images/work_1.jpg" alt="Free HTML5 Bootstrap Template by FreeHTML5.co">
					<span class="overlay">
						<h2>Nature</h2>
						<span>14 Photos</span>
					</span>
				</a>
				<a class="gallery-item" href="single.html">
					<img src="../resources/images/work_2.jpg" alt="Free HTML5 Bootstrap Template by FreeHTML5.co">
					<span class="overlay">
						<h2>People</h2>
						<span>7 Photos</span>
					</span>
				</a>
				<a class="gallery-item" href="single.html">
					<img src="../resources/images/work_3.jpg" alt="Free HTML5 Bootstrap Template by FreeHTML5.co">
					<span class="overlay">
						<h2>Sky</h2>
						<span>22 Photos</span>
					</span>
				</a>
				<a class="gallery-item" href="single.html">
					<img src="../resources/images/work_4.jpg" alt="Free HTML5 Bootstrap Template by FreeHTML5.co">
					<span class="overlay">
						<h2>Building</h2>
						<span>28 Photos</span>
					</span>
				</a>
				<a class="gallery-item" href="single.html">
					<img src="../resources/images/work_5.jpg" alt="Free HTML5 Bootstrap Template by FreeHTML5.co">
					<span class="overlay">
						<h2>People 2</h2>
						<span>17 Photos</span>
					</span>
				</a>
				<a class="gallery-item" href="single.html">
					<img src="../resources/images/work_6.jpg" alt="Free HTML5 Bootstrap Template by FreeHTML5.co">
					<span class="overlay">
						<h2>Beach</h2>
						<span>34 Photos</span>
					</span>
				</a>
				<a class="gallery-item" href="single.html">
					<img src="../resources/images/work_7.jpg" alt="Free HTML5 Bootstrap Template by FreeHTML5.co">
					<span class="overlay">
						<h2>Vegetarian Food</h2>
						<span>10 Photos</span>
					</span>
				</a>
				<a class="gallery-item" href="single.html">
					<img src="../resources/images/work_8.jpg" alt="Free HTML5 Bootstrap Template by FreeHTML5.co">
					<span class="overlay">
						<h2>Travel</h2>
						<span>19 Photos</span>
					</span>
				</a>

				<a class="gallery-item" href="single.html">
					<img src="../resources/images/work_9.jpg" alt="Free HTML5 Bootstrap Template by FreeHTML5.co">
					<span class="overlay">
						<h2>Family</h2>
						<span>42 Photos</span>
					</span>
				</a>
				<a class="gallery-item" href="single.html">
					<img src="../resources/images/work_10.jpg" alt="Free HTML5 Bootstrap Template by FreeHTML5.co">
					<span class="overlay">
						<h2>Food</h2>
						<span>10 Photos</span>
					</span>
				</a>
				<a class="gallery-item" href="single.html">
					<img src="../resources/images/work_11.jpg" alt="Free HTML5 Bootstrap Template by FreeHTML5.co">
					<span class="overlay">
						<h2>Gadgets</h2>
						<span>76 Photos</span>
					</span>
				</a>
				<a class="gallery-item" href="single.html">
					<img src="../resources/images/work_12.jpg" alt="Free HTML5 Bootstrap Template by FreeHTML5.co">
					<span class="overlay">
						<h2>Cars</h2>
						<span>55 Photos</span>
					</span>
				</a>

				<a class="gallery-item" href="single.html">
					<img src="../resources/images/work_13.jpg" alt="Free HTML5 Bootstrap Template by FreeHTML5.co">
					<span class="overlay">
						<h2>Animals</h2>
						<span>47 Photos</span>
					</span>
				</a>
				<a class="gallery-item" href="single.html">
					<img src="../resources/images/work_14.jpg" alt="Free HTML5 Bootstrap Template by FreeHTML5.co">
					<span class="overlay">
						<h2>Building 2</h2>
						<span>10 Photos</span>
					</span>
				</a>
				<a class="gallery-item" href="single.html">
					<img src="../resources/images/work_15.jpg" alt="Free HTML5 Bootstrap Template by FreeHTML5.co">
					<span class="overlay">
						<h2>Baloon</h2>
						<span>17 Photos</span>
					</span>
				</a>
				<a class="gallery-item" href="single.html">
					<img src="../resources/images/work_16.jpg" alt="Free HTML5 Bootstrap Template by FreeHTML5.co">
					<span class="overlay">
						<h2>Animals 2</h2>
						<span>22 Photos</span>
					</span>
				</a>
			</div>
		</div>
	</div>
			<a class="button" onclick="fncWrite()">
							<strong>등록</strong>
			</a>
</div>



	<!-- jQuery -->
	<script src="js/jquery.min.js"></script>
	<!-- jQuery Easing -->
	<script src="js/jquery.easing.1.3.js"></script>
	<!-- Bootstrap -->
	<script src="js/bootstrap.min.js"></script>
	<!-- Carousel -->
	<script src="js/owl.carousel.min.js"></script>
	<!-- Stellar -->
	<script src="js/jquery.stellar.min.js"></script>
	<!-- Waypoints -->
	<script src="js/jquery.waypoints.min.js"></script>
	<!-- Counters -->
	<script src="js/jquery.countTo.js"></script>
	
	
	
	<!-- MAIN JS -->
	<script src="js/main.js"></script>

	
