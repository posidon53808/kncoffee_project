/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.77
 * Generated at: 2022-04-01 06:30:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.porder;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.customer;

public final class porder_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=BIG5");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
customer cu=(customer)session.getAttribute("cu") ;
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\r\n");
      out.write(" <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css\"> \r\n");
      out.write(" <style>\r\n");
      out.write("  \r\n");
      out.write(" body{\r\n");
      out.write("width:100% ;\r\n");
      out.write("height: 100% ;\r\n");
      out.write("padding:0 ;\r\n");
      out.write("margin: 0;\r\n");
      out.write("background:url(\"page.jpg\") ;\r\n");
      out.write("background-size:cover;\r\n");
      out.write("background-attachment:fixed;\r\n");
      out.write("background-position:center;\r\n");
      out.write("}\r\n");
      out.write("p{\r\n");
      out.write("font-size:20px;\r\n");
      out.write("}\r\n");
      out.write("  </style>\r\n");
      out.write("  \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "title.jsp", out, false);
      out.write("\r\n");
      out.write("<table width=700 align=center border=2>\r\n");
      out.write("\r\n");
      out.write("<tr> <td height=400>\r\n");
      out.write("<form action=\"confirm.jsp\" method=\"post\">\r\n");
      out.write(" <table width=600 align=center>\r\n");
      out.write(" <tr><td align=center>\r\n");
      out.write(" <div class=\"row\">\r\n");
      out.write(" <div class=\"col-12\" align=center >\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("  <h2>");
      out.print(cu.getName() );
      out.write("訂單</h2>\r\n");
      out.write("\r\n");
      out.write("<a  href=\"addPorder.jsp\" class=\"list-group-item\">新增訂單</a>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"activity\" class=\"col-8\" align=center  >\r\n");
      out.write("<hr>\r\n");
      out.write("<h2 class=\"bg-success\">店周年慶活動</h2>\r\n");
      out.write("<p ><strong><mark>消費滿兩千打九五折</mark></strong></p>\r\n");
      out.write("<br>\r\n");
      out.write("<p>鬧鄰居咖啡即將買一周年，為了回饋長期支持我們的顧客\r\n");
      out.write("<p>即日起到3/31起，會員消費滿兩千</p><br>\r\n");
      out.write("<p>享九五折優惠</p>\r\n");
      out.write("<br>\r\n");
      out.write("<p>目前販賣的耳掛包種類會不定期更新，敬請期待</p>\r\n");
      out.write("\r\n");
      out.write("<p>即日起加入會員有機會抽小禮物(耳掛包五入一組或是限量濾杯)</p>\r\n");
      out.write("<p>出示會員到店內消費打九折</p>\r\n");
      out.write("<br>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</table></form>\r\n");
      out.write("<tr><td height=50 align=center>");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "end.jsp", out, false);
      out.write("\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\r\n");
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
