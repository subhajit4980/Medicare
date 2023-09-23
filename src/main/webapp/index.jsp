<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign Up</title>

    <!-- Include Bootstrap CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS for styling -->
    <style>
              body {
                   background-image: url('https://images.unsplash.com/photo-1628771065518-0d82f1938462?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=2070&q=80');
                   background-size: cover; /* Adjust as needed to fit your design */
                   background-repeat: no-repeat;
                   background-attachment: fixed; /* This keeps the image fixed while scrolling */
               }

        .container {
            margin-top: 50px;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="row justify-content-center">
            <div class="col-md-6">
                <div class="card">
                    <div class="card-header">
                        <h2 class="text-center">Sign Up</h2>
                    </div>
                    <div class="card-body">
                        <form action="/api/auth/signup" method="post">
                            <div class="form-group">
                                <label for="username">Username:</label>
                                <input type="text" class="form-control" id="username" name="username" required th:field="*{username}">
                            </div>

                            <div class="form-group">
                                <label for="email">Email:</label>
                                <input type="email" class="form-control" id="email" name="email" required th:field="*{email}">
                            </div>

                            <div class="form-group">
                                <label for="password">Password:</label>
                                <input type="password" class="form-control" id="password" name="password" required th:field="*{password}">
                            </div>

                            <div class="form-group">
                                       <label>Select Role(s):</label>
                                        <div class="col-sm-9">
                                            <div class="form-check form-check-inline">
                                                <input type="checkbox" class="form-check-input" id="userRole" name="roles" value="ROLE_USER" th:field="*{roles}">
                                                <label class="form-check-label" for="userRole">User</label>
                                            </div>
                                            <div class="form-check form-check-inline">
                                                <input type="checkbox" class="form-check-input" id="moderatorRole" name="roles" value="ROLE_MODERATOR" th:field="*{roles}">
                                                <label class="form-check-label" for="moderatorRole">Moderator</label>
                                            </div>
                                            <div class="form-check form-check-inline">
                                                <input type="checkbox" class="form-check-input" id="adminRole" name="roles" value="ROLE_ADMIN" th:field="*{roles}">
                                                <label class="form-check-label" for="adminRole">Admin</label>
                                            </div>
                                        </div>
                                    </div>
                            <button type="submit" class="btn btn-primary btn-block">Register</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- Include Bootstrap JS and jQuery (optional) -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
