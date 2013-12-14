<%-- 
    Created on : Dec 14, 2013, 6:24:03 AM
    Author     : Tomas Jimenez
--%>

<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html lang="true">
    <head>
        <meta charset="utf-8">
        <title>eBankDO Transfers</title>
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
 <div class="row-fluid">
                    <html:form method="post" action="customer">
                        <div class="span5">

                            <h4 class="form-signin-heading">Form Customer</h4>
                            <input name="name" type="text" class="input-block-level" placeholder="NAME">
                            <input name="credit_card_number" type="text" class="input-block-level" placeholder="CREDIT CARD NO.#">
                            <select name="status" class="input-block-level">
                                <option class="input-block-level">--Status--</option>
                                <option class="input-block-level" value="Active">Active</option>
                                <option class="input-block-level" value="Inactive">Inactive</option>
                            </select>
                            <button class="btn btn-success" type="submit" name="action" value="submit">Submit</button>
                            <button class="btn warning" type="reset">Reset</button>

                        </div>
                        <div class="span7">
                            <br />
                            <table class="table table-hover table-bordered">
                                <tr>
                                    <td> <b>ID</b> </td>
                                    <td> <b>Name</b> </td>
                                    <td> <b>Credit_Card_Number</b> </td>
                                    <td> <b>Status</b> </td>
                                </tr>
                                <logic:notEmpty name="list1">
                                    <logic:iterate id="element" name="list1">
                                        <tr>
                                            <td><bean:write name="element" property="codcustomer"/></td>
                                        
                                        <td> <bean:write name="element" property="name"/> </td>
                                        <td> <bean:write name="element" property="credit_card_number"/> </td>
                                        <td> <bean:write name="element" property="status"/> </td>
                                     
<!--                                      <button type="submit" class="btn btn-warning" name="action" value="update">Update</button>
                                            |
                                            <button type="submit" class="btn btn-danger" name="action" value="delete">Delete</button>-->
                                      
                                        </tr>
                                    </logic:iterate>
                                </logic:notEmpty>
                            </table>

                        </div>
                    </html:form>
                </div>
        </div>
      </div>

    </div><!-- /.container -->

    <!-- JavaScript -->
    <script src="js/jquery-1.10.2.js"></script>
    <script src="js/bootstrap.js"></script>

  </body>
               



</html:html>
