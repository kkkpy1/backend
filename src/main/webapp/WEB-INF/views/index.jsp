<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url="common/header.jsp"></c:import>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>

</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-8">
				<h2 class="page-header">Feed</h2>
				<section class="comment-list">
					<!-- First Comment -->
					<article class="row">
						<div class="col-md-2 col-sm-2 hidden-xs">
							<figure class="thumbnail">
								<img class="img-responsive"
									src="http://www.tangoflooring.ca/wp-content/uploads/2015/07/user-avatar-placeholder.png" />
								<figcaption class="text-center">username</figcaption>
							</figure>
						</div>
						<div class="col-md-10 col-sm-10">
							<div class="panel panel-default arrow left">
								<div class="panel-body">
									<header class="text-left">
										<div class="comment-user">
											<i class="fa fa-user"></i>username
										</div>
										<time class="comment-date" datetime="16-12-2014 01:05">
											<i class="fa fa-clock-o"></i>date
										</time>
									</header>
									<div class="comment-post">
										<p>Lorem ipsum dolor sit amet, consectetur adipisicing
											elit, sed do eiusmod tempor incididunt ut labore et dolore
											magna aliqua. Ut enim ad minim veniam, quis nostrud
											exercitation ullamco laboris nisi ut aliquip ex ea commodo
											consequat.</p>
									</div>
									<p class="text-right">
										<a href="/report" class="btn btn-danger"><i class="fa fa-reply"></i>
											신고하기</a>
									</p>
									<p class="text-right">
										<a href="#" class="btn btn-primary"><i class="fa fa-reply"></i>
											좋아요</a>
									</p>
								</div>
							</div>
						</div>
					</article>
					<!-- Second Comment Reply -->
					<article class="row">
						<div class="col-md-2 col-sm-2 hidden-xs">
							<figure class="thumbnail">
								<img class="img-responsive"
									src="http://www.tangoflooring.ca/wp-content/uploads/2015/07/user-avatar-placeholder.png" />
								<figcaption class="text-center">username</figcaption>
							</figure>
						</div>
						<div class="col-md-10 col-sm-10">
							<div class="panel panel-default arrow left">
								<div class="panel-body">
									<header class="text-left">
										<div class="comment-user">
											<i class="fa fa-user"></i>username
										</div>
										<time class="comment-date" datetime="16-12-2014 01:05">
											<i class="fa fa-clock-o"></i>date
										</time>
									</header>
									<div class="comment-post">
										<p>Lorem ipsum dolor sit amet, consectetur adipisicing
											elit, sed do eiusmod tempor incididunt ut labore et dolore
											magna aliqua. Ut enim ad minim veniam, quis nostrud
											exercitation ullamco laboris nisi ut aliquip ex ea commodo
											consequat.</p>
									</div>
									<p class="text-right">
										<a href="/report" class="btn btn-danger"><i class="fa fa-reply"></i>
											신고하기</a>
									</p>
									<p class="text-right">
										<a href="#" class="btn btn-primary"><i class="fa fa-reply"></i>
											좋아요</a>
									</p>
								</div>
							</div>
						</div>
					</article>
					<!-- Third Comment -->
					<article class="row">
						<div class="col-md-10 col-sm-10">
							<div class="panel panel-default arrow right">
								<div class="panel-body">
									<header class="text-right">
										<div class="comment-user">
											<i class="fa fa-user"></i> That Guy
										</div>
										<time class="comment-date" datetime="16-12-2014 01:05">
											<i class="fa fa-clock-o"></i> Dec 16, 2014
										</time>
									</header>
									<div class="comment-post">
										<p>Lorem ipsum dolor sit amet, consectetur adipisicing
											elit, sed do eiusmod tempor incididunt ut labore et dolore
											magna aliqua. Ut enim ad minim veniam, quis nostrud
											exercitation ullamco laboris nisi ut aliquip ex ea commodo
											consequat.</p>
									</div>
									<p class="text-right">
										<a href="/report" class="btn btn-danger"><i class="fa fa-reply"></i>
											신고하기</a>
									</p>
									<p class="text-right">
										<a href="#" class="btn btn-primary"><i class="fa fa-reply"></i>
											좋아요</a>
									</p>
								</div>
							</div>
						</div>
						<div class="col-md-2 col-sm-2 hidden-xs">
							<figure class="thumbnail">
								<img class="img-responsive"
									src="http://www.tangoflooring.ca/wp-content/uploads/2015/07/user-avatar-placeholder.png" />
								<figcaption class="text-center">username</figcaption>
							</figure>
						</div>
					</article>
					<!-- Fourth Comment -->
					<article class="row">
						<div class="col-md-2 col-sm-2 hidden-xs">
							<figure class="thumbnail">
								<img class="img-responsive"
									src="http://www.tangoflooring.ca/wp-content/uploads/2015/07/user-avatar-placeholder.png" />
								<figcaption class="text-center">username</figcaption>
							</figure>
						</div>
						<div class="col-md-10 col-sm-10">
							<div class="panel panel-default arrow left">
								<div class="panel-body">
									<header class="text-left">
										<div class="comment-user">
											<i class="fa fa-user"></i>username
										</div>
										<time class="comment-date" datetime="16-12-2014 01:05">
											<i class="fa fa-clock-o"></i>date
										</time>
									</header>
									<div class="comment-post">
										<p>Lorem ipsum dolor sit amet, consectetur adipisicing
											elit, sed do eiusmod tempor incididunt ut labore et dolore
											magna aliqua. Ut enim ad minim veniam, quis nostrud
											exercitation ullamco laboris nisi ut aliquip ex ea commodo
											consequat.</p>
									</div>
									<p class="text-right">
										<a href="/report" class="btn btn-danger"><i class="fa fa-reply"></i>
											신고하기</a>
									</p>
									<p class="text-right">
										<a href="#" class="btn btn-primary"><i class="fa fa-reply"></i>
											좋아요</a>
									</p>
								</div>
							</div>
						</div>
					</article>
					<!-- Fifth Comment -->
					<article class="row">
						<div class="col-md-10 col-sm-10">
							<div class="panel panel-default arrow right">
								<div class="panel-body">
									<header class="text-right">
										<div class="comment-user">
											<i class="fa fa-user"></i> That Guy
										</div>
										<time class="comment-date" datetime="16-12-2014 01:05">
											<i class="fa fa-clock-o"></i> Dec 16, 2014
										</time>
									</header>
									<div class="comment-post">
										<p>Lorem ipsum dolor sit amet, consectetur adipisicing
											elit, sed do eiusmod tempor incididunt ut labore et dolore
											magna aliqua. Ut enim ad minim veniam, quis nostrud
											exercitation ullamco laboris nisi ut aliquip ex ea commodo
											consequat.</p>
									</div>
									<p class="text-right">
										<a href="/report" class="btn btn-danger"><i class="fa fa-reply"></i>
											신고하기</a>
									</p>
									<p class="text-right">
										<a href="#" class="btn btn-primary"><i class="fa fa-reply"></i>
											좋아요</a>
									</p>
								</div>
							</div>
						</div>
						<div class="col-md-2 col-sm-2 hidden-xs">
							<figure class="thumbnail">
								<img class="img-responsive"
									src="http://www.tangoflooring.ca/wp-content/uploads/2015/07/user-avatar-placeholder.png" />
								<figcaption class="text-center">username</figcaption>
							</figure>
						</div>
					</article>

				</section>
			</div>
		</div>
	</div>
</body>
</html>

<c:import url="common/footer.jsp"></c:import>
