package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_form_action;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_form_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_form_action.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <title>Education</title>\n");
      out.write("        \n");
      out.write("        <link href=\"templatemo_style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function ctck()\n");
      out.write("            {\n");
      out.write("                var sds = document.getElementById(\"dum\");\n");
      out.write("                if (sds == null) {\n");
      out.write("                    alert(\"You are using a free package.\\n You are not allowed to remove the tag.\\n\");\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <SCRIPT LANGUAGE=\"JavaScript\">\n");
      out.write("            function dil(form)\n");
      out.write("            {\n");
      out.write("                for (var i = 0; i < form.elements.length; i++)\n");
      out.write("                {\n");
      out.write("                    if (form.elements[i].value == \"\")\n");
      out.write("                    {\n");
      out.write("                        alert(\"Fill out all Fields\")\n");
      out.write("                        document.F1.username.focus()\n");
      out.write("                        return false\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("\n");
      out.write("\n");
      out.write("                if (!isNaN(document.F1.username.value))\n");
      out.write("                {\n");
      out.write("                    alert(\"User Name  must  be  char's & can't be null\")\n");
      out.write("                    document.F1.username.value = \"\"\n");
      out.write("                    document.F1.username.focus()\n");
      out.write("                    return false\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                if (!isNaN(document.F1.password.value))\n");
      out.write("                {\n");
      out.write("                    alert(\"Password  must  be  char's & can't be null\")\n");
      out.write("                    document.F1.password.value = \"\"\n");
      out.write("                    document.F1.password.focus()\n");
      out.write("                    return false\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                return true\n");
      out.write("            }\n");
      out.write("        </SCRIPT>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"templatemo_header_wrapper\">\n");
      out.write("            <div id=\"templatemo_header\">\n");
      out.write("                <div id=\"site_title\">\n");
      out.write("                    <h1>\n");
      out.write("                            <img src=\"images/templatemo_logo.png\" alt=\"Site Title\" />\n");
      out.write("                           \n");
      out.write("                        </h1>\n");
      out.write("                </div>\n");
      out.write("                 <p>Online Library Controlling system is made by me. This is my first project in Java EE(Servlet,JSP).</p>\n");
      out.write("\n");
      out.write("            </div> <!-- end of templatemo_header -->\n");
      out.write("\n");
      out.write("        </div> <!-- end of templatemo_menu_wrapper -->\n");
      out.write("\n");
      out.write("        <div id=\"templatemo_menu_wrapper\">\n");
      out.write("            <div id=\"templatemo_menu\">\n");
      out.write("\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                    <li><a href=\"admin.jsp\">Adminstrator</a></li>\n");
      out.write("                    <li><a href=\"member.jsp\">Library Member</a></li>\n");
      out.write("                    <li><a href=\"bookdetailsforbookdetails.jsp\">Book Details</a></li>\n");
      out.write("                    <li><a href=\"aboutus.jsp\">About Us</a></li>\n");
      out.write("                    <li><a href=\"contactus.jsp\">Contact Us</a></li>\n");
      out.write("                </ul>    \t\n");
      out.write("\n");
      out.write("            </div> <!-- end of templatemo_menu -->\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"templatemo_content_wrapper\">\n");
      out.write("\n");
      out.write("            <div id=\"templatemo_sidebar\">\n");
      out.write("\n");
      out.write("                <div class=\"sidebar_box\">\n");
      out.write("\n");
      out.write("                    <h2>Announcements</h2>\n");
      out.write("\n");
      out.write("                     <a href=\"#\">By using this project an educational institution or department can control library easily.</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div><div class=\"sidebar_box_bottom\"></div>\n");
      out.write("\n");
      out.write("                <div class=\"sidebar_box\">\n");
      out.write("\n");
      out.write("                    <h2>JAVA</h2>\n");
      out.write("\n");
      out.write("                    <div class=\"section_w250 float_l\">\n");
      out.write("                        <h3>Core Java</h3>            \n");
      out.write("                        <p>oops is a concept of core java so.if you want to learn java ee at first you must know Core java.</p>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"cleaner\"></div>\n");
      out.write("\n");
      out.write("                </div><div class=\"sidebar_box_bottom\"></div>\n");
      out.write("\n");
      out.write("            </div> <!-- end of sidebar -->\n");
      out.write("\n");
      out.write("            <div id=\"templatemo_content\">\n");
      out.write("\n");
      out.write("                <div class=\"content_box\">\n");
      out.write("\n");
      out.write("                    <td valign=\"top\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        ");
  out.print("<font color=blue>WELCOME TO ADMINISTRATION LOGIN");
                        
      out.write("\n");
      out.write("                         \n");
      out.write("                        ");
      //  s:form
      org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_form_0 = (org.apache.struts2.views.jsp.ui.FormTag) _jspx_tagPool_s_form_action.get(org.apache.struts2.views.jsp.ui.FormTag.class);
      _jspx_th_s_form_0.setPageContext(_jspx_page_context);
      _jspx_th_s_form_0.setParent(null);
      _jspx_th_s_form_0.setAction("login");
      int _jspx_eval_s_form_0 = _jspx_th_s_form_0.doStartTag();
      if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_s_form_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_s_form_0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("                             <table height=\"230\" cellspacing=\"10\" cellpadding=\"8\">\t\n");
          out.write("                                ");
if (request.getAttribute("aa") != null) {
                                        out.print("<div>");
                                        out.print("<font color='blue'><font size='3'>" + request.getAttribute("aa") + "");

                                        out.print("</div>");
                                    }

                                
          out.write("\n");
          out.write("\n");
          out.write("                                <tr><td>LOGIN NAME:</td><td> <input type=\"text\" name=\"username\"/></td></tr>\n");
          out.write("\n");
          out.write("                                <tr><td>PASSWORD:</td><td> <input type=\"password\" name=\"password\"/></td></tr>\n");
          out.write("\n");
          out.write("                                <tr><td></td><td><input type=\"submit\" value=\"Submit\"/>\n");
          out.write("\n");
          out.write("\n");
          out.write("                                        <INPUT TYPE=RESET VALUE=\"CLEAR\"></td></tr>\n");
          out.write("\n");
          out.write("                            </table>\n");
          out.write("                            \n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_s_form_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_s_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_s_form_action.reuse(_jspx_th_s_form_0);
        return;
      }
      _jspx_tagPool_s_form_action.reuse(_jspx_th_s_form_0);
      out.write("\n");
      out.write("\n");
      out.write("                       \n");
      out.write("\n");
      out.write("                    </td>\n");
      out.write("\n");
      out.write("                    ");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"cleaner\"></div>\n");
      out.write("                </div><div class=\"content_box_bottom\"></div>\n");
      out.write("\n");
      out.write("                <div class=\"content_box_bottom\"></div>\n");
      out.write("\n");
      out.write("            </div> <!-- end of content -->\n");
      out.write("\n");
      out.write("            <div class=\"cleaner\"></div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"templatemo_footer_wrapper\">\n");
      out.write("\n");
      out.write("            <div id=\"templatemo_footer\">\n");
      out.write("\n");
      out.write("                <ul class=\"footer_menu\">\n");
      out.write("                    <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                    <li><a href=\"admin.jsp\">Adminstrator</a></li>\n");
      out.write("                    <li><a href=\"member.jsp\">Library Member</a></li>\n");
      out.write("                    <li><a href=\"bookdetailsforbookdetails.jsp\">Book Details</a></li>\n");
      out.write("                    <li><a href=\"aboutus.jsp\">About Us</a></li>\n");
      out.write("                    <li><a href=\"contactus.jsp\">Contact Us</a></li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("               Copyright © 2048 <a href=\"#\" align=\"center\">Limon Kanti Dey.</a> \n");
      out.write("               \n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
