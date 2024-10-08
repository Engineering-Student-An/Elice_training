package week13.ch13_3.training5;

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>로그인 페이지</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            padding-top: 40px;
            padding-bottom: 40px;
            background-color: #f5f5f5;
        }

        .form-signin {
            max-width: 330px;
            padding: 15px;
            margin: auto;
        }

        .form-signin .form-control {
            position: relative;
            box-sizing: border-box;
            height: auto;
            padding: 10px;
            font-size: 16px;
        }

        .form-signin .form-control:focus {
            z-index: 2;
        }

        .form-signin input[type="text"],
        .form-signin input[type="password"] {
            margin-bottom: 10px;
        }

        .form-signin button {
            margin-top: 10px;
        }

        .field-error {
            border-color: #dc3545;
            color: #dc3545;
        }
    </style>
</head>
<body>

<div class="container">
    <form class="form-signin" action="/login" method="post">
        <h1 class="h3 mb-3 font-weight-normal text-center">로그인 페이지</h1>
        <hr/>
        <div class="row alert alert-danger center" role="alert" th:if="${param.error != null}">
            <div>로그인 인증에 실패했습니다.</div>
        </div>
        <input type="text" name="name" class="form-control" placeholder="Username" required>
        <input type="password" name="password" class="form-control" placeholder="Password" required>
                
        <!-- 지시사항을 참고하여 코드를 작성해 보세요. -->
        <!-- 로그인 기억하기 추가  -->        
        <div class="checkbox mb-3"> 
	<label> 
		<input type="checkbox" name="remember-me"> 로그인 기억하기 
	</label> 
</div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">로그인</button>
    </form>
</div>

</body>
</html>
