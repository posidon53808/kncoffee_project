/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.77
 * Generated at: 2022-04-01 06:30:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.porder;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.customer;

public final class addPorder_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("Model.customer");
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    ");
customer c=(customer)session.getAttribute("cu");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\r\n");
      out.write("<style>\r\n");
      out.write("body{\r\n");
      out.write("width:100% ;\r\n");
      out.write("height: 100% ;\r\n");
      out.write("padding:0 ;\r\n");
      out.write("margin: 0;\r\n");
      out.write("background:url(\"page.jpg\") ;\r\n");
      out.write("background-size:cover;\r\n");
      out.write("background-attachment:fixed;\r\n");
      out.write("background-position:center;\r\n");
      out.write("}\r\n");
      out.write("h1{color:red;\r\n");
      out.write("   font-weight: bold;}\r\n");
      out.write("   select{margin-top:10px;}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "title.jsp", out, false);
      out.write("\r\n");
      out.write("<table width=700 align=center border=2>\r\n");
      out.write("<tr> <td height=600>\r\n");
      out.write("<form action=\"confirm.jsp\" method=\"post\">\r\n");
      out.write(" <table width=900 align=center border=3>\r\n");
      out.write("<tr><td colspan=3 align=center><h1>商品項目<h1><hr>\r\n");
      out.write("\r\n");
      out.write("<tr><td align=center>HARIO V60 Drip Scale HARIO電子秤：<br>\r\n");
      out.write("<img src=\"photo/HARIO V60 Drip Scale HARIO電子秤.jpg\"\r\n");
      out.write(" alt=\"HARIO V60 Drip Scale HARIO\"\r\n");
      out.write(" width=\"200\"\r\n");
      out.write(" height=\"200\">\r\n");
      out.write("<select name=\"A\">\r\n");
      out.write("<option value=\"0\">0</option>\r\n");
      out.write("<option value=\"1\">1</option>\r\n");
      out.write("<option value=\"2\">2</option>\r\n");
      out.write("<option value=\"3\">3</option>\r\n");
      out.write("</select>\r\n");
      out.write("<hr>\r\n");
      out.write("<td align=center>KALITA 蝶番付手沖壺 0.7公升 SWAN NECK KETTLE：<br>\r\n");
      out.write("<img src=\"photo/KALITA 蝶番付手沖壺 0.7公升 SWAN NECK KETTLE.jpg\"\r\n");
      out.write(" alt=\"KALITA 蝶番付手沖壺 0.7公升 SWAN NECK KETTLE\"\r\n");
      out.write(" width=\"200\"\r\n");
      out.write(" height=\"200\">\r\n");
      out.write("<select name=\"B\">\r\n");
      out.write("<option value=\"0\">0</option>\r\n");
      out.write("<option value=\"1\">1</option>\r\n");
      out.write("<option value=\"2\">2</option>\r\n");
      out.write("<option value=\"3\">3</option>\r\n");
      out.write("</select><hr>\r\n");
      out.write("<td align=center>泰摩冰瞳濾杯TIMEMORE CRYSTAL EYE DRIPPER：<br>\r\n");
      out.write("<img src=\"photo/泰摩冰瞳濾杯TIMEMORE CRYSTAL EYE DRIPPER.jpg\"\r\n");
      out.write(" alt=\"泰摩冰瞳濾杯TIMEMORE CRYSTAL EYE DRIPPER\"\r\n");
      out.write(" width=\"200\"\r\n");
      out.write(" height=\"200\">\r\n");
      out.write("<select name=\"C\">\r\n");
      out.write("<option value=\"0\">0</option>\r\n");
      out.write("<option value=\"1\">1</option>\r\n");
      out.write("<option value=\"2\">2</option>\r\n");
      out.write("<option value=\"3\">3</option>\r\n");
      out.write("</select>\r\n");
      out.write("<hr>\r\n");
      out.write("<tr><td align=center>天堂鳥-耳掛包：<br>\r\n");
      out.write("<img src=\"photo/天堂鳥.jpg\"\r\n");
      out.write(" alt=\"天堂鳥-耳掛包\"\r\n");
      out.write(" width=\"200\"\r\n");
      out.write(" height=\"200\">\r\n");
      out.write("<select name=\"D\">\r\n");
      out.write("<option value=\"0\">0</option>\r\n");
      out.write("<option value=\"1\">1</option>\r\n");
      out.write("<option value=\"2\">2</option>\r\n");
      out.write("<option value=\"3\">3</option>\r\n");
      out.write("</select><hr>\r\n");
      out.write("<td align=center>巴西 摩吉安娜-耳掛包：<br>\r\n");
      out.write("<img src=\"photo/巴西 摩吉安娜.jpg\"\r\n");
      out.write(" alt=\"巴西 摩吉安娜-耳掛包\"\r\n");
      out.write(" width=\"200\"\r\n");
      out.write(" height=\"200\">\r\n");
      out.write("<select name=\"E\">\r\n");
      out.write("<option value=\"0\">0</option>\r\n");
      out.write("<option value=\"1\">1</option>\r\n");
      out.write("<option value=\"2\">2</option>\r\n");
      out.write("<option value=\"3\">3</option>\r\n");
      out.write("</select><hr>\r\n");
      out.write("<td align=center>耶加雪非日曬-耳掛包：<br>\r\n");
      out.write("<img src=\"photo/耶加雪非日曬.jpg\"\r\n");
      out.write(" alt=\"耶加雪非日曬-耳掛包\"\r\n");
      out.write(" width=\"200\"\r\n");
      out.write(" height=\"200\">\r\n");
      out.write("<select name=\"F\">\r\n");
      out.write("<option value=\"0\">0</option>\r\n");
      out.write("<option value=\"1\">1</option>\r\n");
      out.write("<option value=\"2\">2</option>\r\n");
      out.write("<option value=\"3\">3</option>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</select>\r\n");
      out.write("<hr>\r\n");
      out.write("<tr><td colspan=3 align=center>\r\n");
      out.write("<input style=mb-3 type=\"submit\" value=\"提交\">\r\n");
      out.write("<a href=\"porder.jsp\">回上一頁</a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("</table></form>\r\n");
      out.write("<tr><td height=100 align=center>");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "end.jsp", out, false);
      out.write("\r\n");
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