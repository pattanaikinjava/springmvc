<!DOCType html>

<html>
	<head>
	<style>
	body{ 
		background-color: yellow;
	}
		h1{ 
			color:red;
			text-align:center
                }
		h2{ 
			color:blue;
			text-align:center
                }
		img {
    			width: 57%;
    			height: 50%;
    			margin-left: 20%;
    			margin-right: 30%;
		}
        </style>
		<title>WELCOME TO APP</title>
	</head>
	<body>
		<h1> Welcome to Spring Boot Web Application </h1>
		<h2>WELCOME TO FIRST APPLICATION! </h2>
		<table>
			<tr>
				<th> SNo </th>
				<th> First Name </th>
				<th> Middle Name </th>
				<th> Last Name </th>
				<th> Desgination </th>
			</tr>
			<tr>
				<th> 1</th>
				<th> ${FName} </th>
				<th> ${MName} </th>
				<th> ${LName} </th>
				<th> ${Desgination} </th>
			</tr>
		</table>
		<img src="\images\spring_boot.jfif" />
	</body>
</html>