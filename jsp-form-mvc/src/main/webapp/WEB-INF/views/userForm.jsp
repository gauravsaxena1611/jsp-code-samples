<!DOCTYPE html>
<html>
<head>
    <title>User Form</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/styles.css">
</head>
<body>
    <h1>Enter Your Information</h1>
    <form action="/submitUser" method="POST">
        <label for="name">Name:</label>
        <input type="text" name="name" required><br><br>

        <label for="email">Email:</label>
        <input type="email" name="email" required><br><br>

        <input type="submit" value="Submit">
    </form>
</body>
</html>
