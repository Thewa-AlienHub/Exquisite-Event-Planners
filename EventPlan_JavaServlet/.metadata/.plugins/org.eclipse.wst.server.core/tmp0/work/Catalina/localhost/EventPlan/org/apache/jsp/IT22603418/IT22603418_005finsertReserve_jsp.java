/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.80
 * Generated at: 2023-10-28 06:33:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.IT22603418;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class IT22603418_005finsertReserve_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1696690298000L));
    _jspx_dependants.put("jar:file:/E:/SLIIT/thirdsem/OOP/EventPlan_JavaServlet/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/EventPlan/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert Form</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"CSS/IT22603418_PStyles.css\">\r\n");
      out.write("<script>\r\n");
      out.write("// Function to disable previous dates\r\n");
      out.write("function validateCalendar() {\r\n");
      out.write("    var today = new Date().toISOString().slice(0, 10);\r\n");
      out.write("    document.getElementsByName(\"edate\")[0].min = today;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("window.onload = function() {\r\n");
      out.write("    validateCalendar();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function validateForm() {\r\n");
      out.write("    var Name = document.forms[\"myForm\"][\"fname\"].value;\r\n");
      out.write("    var Pnumber = document.forms[\"myForm\"][\"phone\"].value;\r\n");
      out.write("    var Email = document.forms[\"myForm\"][\"email\"].value;\r\n");
      out.write("\r\n");
      out.write("    // Check if Full Name is not empty\r\n");
      out.write("    if (Name == \"\") {\r\n");
      out.write("        alert(\"Full Name must be filled out\");\r\n");
      out.write("        return false;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    // Check if Phone Number is valid\r\n");
      out.write("    var phonePattern = /^[0-9]{10}$/;\r\n");
      out.write("    if (!phonePattern.test(Pnumber)) {\r\n");
      out.write("        alert(\"Phone Number must be 10 digits\");\r\n");
      out.write("        return false;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    // Check if Email is valid\r\n");
      out.write("    var emailPattern = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}$/;\r\n");
      out.write("    if (!emailPattern.test(Email)) {\r\n");
      out.write("        alert(\"Invalid Email Address\");\r\n");
      out.write("        return false;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    return true; // Form is valid and can be submitted\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"background\">\r\n");
      out.write("    	<div class=\"transbox\">\r\n");
      out.write("            <!--reservation form-->\r\n");
      out.write("            <div class=\"form\">\r\n");
      out.write("				<form action=\"/EventPlan/viewReserveServlet\" method=\"post\" id=\"myForm\" onsubmit = \"return validateForm()\">\r\n");
      out.write("					<fieldset>\r\n");
      out.write("                        <legend><span class=\"number\">1</span> Personal Information</legend>\r\n");
      out.write("                        <input type=\"text\" name=\"fname\" placeholder=\"Full Name\" required autocomplete=\"off\">\r\n");
      out.write("                        <input type=\"tel\" name=\"phone\" placeholder=\"Phone Number\" required autocomplete=\"off\">\r\n");
      out.write("                        <input type=\"email\" name=\"email\" placeholder=\"Email Address\" required autocomplete=\"off\">\r\n");
      out.write("                        \r\n");
      out.write("                        <label for=\"CheckInDate\">Event Date</label>\r\n");
      out.write("                            <input type=\"date\" name=\"edate\" required>\r\n");
      out.write("                            \r\n");
      out.write("                        <label for=\"CheckInDate\">Event Time</label>\r\n");
      out.write("                            <input type=\"time\" name=\"etime\" required>\r\n");
      out.write("                      	\r\n");
      out.write("                      	<input type=\"text\" name=\"location\" placeholder=\"Location\" required autocomplete=\"off\">\r\n");
      out.write("                        \r\n");
      out.write("                        <legend>Package</legend>\r\n");
      out.write("	                        <select name=\"Package\">\r\n");
      out.write("								<option value=\"pkg1\">Package1</option>\r\n");
      out.write("								<option value=\"pkg2\">Package2</option>\r\n");
      out.write("								<option value=\"pkg3\">Package3</option>\r\n");
      out.write("								<option value=\"pkg4\">Package4</option>\r\n");
      out.write("								<option value=\"pkg5\">Package5</option>\r\n");
      out.write("	                        </select>\r\n");
      out.write("                        \r\n");
      out.write("                        <label for=\"count\">Number of Guests</label>\r\n");
      out.write("                            <input type=\"number\" name=\"count\" min=\"1\" placeholder=\"Guest Count\" required>\r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("                        <label for=\"guest\">Event Type</label>\r\n");
      out.write("                        	<select name=\"type\">\r\n");
      out.write("						    	<option value=\"Wedding\">Wedding</option>\r\n");
      out.write("						        <option value=\"Engagement\">Engagement</option>\r\n");
      out.write("						        <option value=\"Anniversary\">Anniversary</option>\r\n");
      out.write("						        <option value=\"Birthday\">Birthday</option>\r\n");
      out.write("					        </select>\r\n");
      out.write("					</fieldset>\r\n");
      out.write("					<legend><span class=\"number\">2</span> Additional Services</legend>\r\n");
      out.write("					<fieldset>\r\n");
      out.write("						<legend>Decorations</legend>\r\n");
      out.write("								<h4 class=\"tab\">Floral Arrangement</h4>\r\n");
      out.write("			                	<input type=\"radio\" name=\"decoration1\" value=\"Yes\">Yes\r\n");
      out.write("			                    <input type=\"radio\" name=\"decoration1\" value=\"No\">No\r\n");
      out.write("			                    \r\n");
      out.write("			                    <h4 class=\"tab\">Table Centerpieces</h4>\r\n");
      out.write("			                	<input type=\"radio\" name=\"decoration2\" value=\"Yes\">Yes\r\n");
      out.write("			                    <input type=\"radio\" name=\"decoration2\" value=\"No\">No\r\n");
      out.write("			                    \r\n");
      out.write("			                    <h4 class=\"tab\">Balloon Decorations</h4>\r\n");
      out.write("			                	<input type=\"radio\" name=\"decoration3\" value=\"Yes\">Yes\r\n");
      out.write("			                    <input type=\"radio\" name=\"decoration3\" value=\"No\">No\r\n");
      out.write("                        <legend>Photographers</legend>\r\n");
      out.write("	                        <select name=\"Photographers\">\r\n");
      out.write("								<option value=\"pg1\">P1</option>\r\n");
      out.write("								<option value=\"pg2\">P2</option>\r\n");
      out.write("								<option value=\"pg3\">P3</option>\r\n");
      out.write("								<option value=\"pg4\">P4</option>\r\n");
      out.write("								<option value=\"pg5\">P5</option>\r\n");
      out.write("	                        </select>\r\n");
      out.write("	                    <legend>Entertainments</legend>   \r\n");
      out.write("		                    <input type=\"checkbox\" name=\"Entertainments1\" value=\"want\"> DJ Music\r\n");
      out.write("						    <input type=\"checkbox\" name=\"Entertainments2\" value=\"want\"> Games & Activities\r\n");
      out.write("						    <input type=\"checkbox\" name=\"Entertainments3\" value=\"want\"> Photo Booth\r\n");
      out.write("                    </fieldset>  \r\n");
      out.write("					<br>\r\n");
      out.write("                    <legend><span class=\"number\">3</span> Special Request</legend>\r\n");
      out.write("                    <fieldset>\r\n");
      out.write("                        <textarea name=\"Splrequest\" placeholder = \"You can type here...\" autocomplete=\"off\"></textarea>\r\n");
      out.write("                    </fieldset>\r\n");
      out.write("                    <a href=\"#\">\r\n");
      out.write("				      <input type=\"submit\" name = \"submit\" value=\"Reserve\">\r\n");
      out.write("				    </a>\r\n");
      out.write("			    </form>\r\n");
      out.write("    		</div>\r\n");
      out.write("    	</div>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}