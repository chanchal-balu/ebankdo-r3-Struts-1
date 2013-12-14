<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <title>eBankDo Login</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">

 
        <!-- Bootstrap core CSS -->
        <link href="css/bootstrap.css" rel="stylesheet">

        <!-- Add custom CSS here -->
        <link href="css/logo-nav.css" rel="stylesheet">

    </head>

   <body>

    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <!-- You'll want to use a responsive image option so this logo looks good on devices - I recommend using something like retina.js (do a quick Google search for it and you'll find it) -->
          <a class="navbar-brand logo-nav" href="index.php"><img src="images/logo_ebankdo_42x39.png"></a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse navbar-ex1-collapse">
          <ul class="nav navbar-nav navbar-right">
            <li><a href="#about">About Bank</a></li>
            <li><a href="welcomeEbankDO.jsp">Services</a></li>
            <li><a href="#contact">Contact</a></li>
          </ul>
        </div><!-- /.navbar-collapse -->
      </div><!-- /.container -->
    </nav>

    <div class="container">

      <div class="row">
        <div class="col-lg-12">
          <h1>ebankDo</h1>
          <p>
            eBankDO is a Dominican Republic bank founded in 1980 by <code>Mr. Samot Zenemij</code> with a technological vision oriented to a service user. "TODAY IS THE DAY"
          </p>
                             <form method="post" class="form-signin" action="/ebankdo-r3-Struts-1/login.do">
                        <h2 class="form-signin-heading">Please sign in</h2>
                        <input name="id" type="text" class="input-block-level" placeholder="Your Id">
                        <input name="pass" type="password" class="input-block-level" placeholder="Password">
                        <select class="input-block-level">
                            <option>--Level--</option>
                            <option value="Admin">Private Customer</option>
                            <option value="Admin">Public Customer</option>
                            <option value="Admin">Internal Customer</option>
                        </select>
                        <label class="checkbox">
                            <input type="checkbox" value="remember-me"> Remember me
                        </label>
                        <button class="btn btn-large btn-success" type="submit">Sign in</button>
                        <button class="btn btn-large btn-warning" type="reset">Reset</button>
                    </form>
        </div>
      </div>

    </div><!-- /.container -->

    <!-- JavaScript -->
    <script src="js/jquery-1.10.2.js"></script>
    <script src="js/bootstrap.js"></script>
    
    <script src="assets/js/jquery.js"></script>
    <script src="assets/js/bootstrap-transition.js"></script>
    <script src="assets/js/bootstrap-alert.js"></script>
    <script src="assets/js/bootstrap-modal.js"></script>
    <script src="assets/js/bootstrap-dropdown.js"></script>
    <script src="assets/js/bootstrap-scrollspy.js"></script>
    <script src="assets/js/bootstrap-tab.js"></script>
    <script src="assets/js/bootstrap-tooltip.js"></script>
    <script src="assets/js/bootstrap-popover.js"></script>
    <script src="assets/js/bootstrap-button.js"></script>
    <script src="assets/js/bootstrap-collapse.js"></script>
    <script src="assets/js/bootstrap-carousel.js"></script>
    <script src="assets/js/bootstrap-typeahead.js"></script>

  </body>


</html>
