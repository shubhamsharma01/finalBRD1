/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2018-08-11 07:49:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addcustomer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/view/index1.jsp", Long.valueOf(1533904432675L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsecurity_005fauthentication_0026_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fform_0026_005fmodelAttribute_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005finput_0026_005fpath_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ferrors_0026_005fpath_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fsecurity_005fauthentication_0026_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fform_0026_005fmodelAttribute_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005finput_0026_005fpath_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ferrors_0026_005fpath_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fsecurity_005fauthentication_0026_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fform_0026_005fmodelAttribute_005faction.release();
    _005fjspx_005ftagPool_005fs_005finput_0026_005fpath_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005ferrors_0026_005fpath_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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
      out.write("     \r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Add</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("  <title>Bootstrap Example</title>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-inverse\">\r\n");
      out.write("  <div class=\"container-fluid\" >\r\n");
      out.write("    <div class=\"navbar-header\">\r\n");
      out.write("    <a class=\"navbar-brand\" href=\"#\">");
      if (_jspx_meth_security_005fauthentication_005f0(_jspx_page_context))
        return;
      out.write("</a>\r\n");
      out.write("    \r\n");
      out.write("    </div>\r\n");
      out.write(" \r\n");
      out.write("    <ul class=\"nav navbar-header\" >\r\n");
      out.write("      <li><a href=\"insert\">Add</a></li>\r\n");
      out.write("      <li><a href=\"singleview\">View</a></li>\r\n");
      out.write("      <li><a href=\"update\">Update</a></li>\r\n");
      out.write("      <li><a href=\"delete\">Delete</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write(" </div>\r\n");
      out.write(" </nav>\r\n");
      out.write(" <h1><center>Welcome ,");
      if (_jspx_meth_security_005fauthentication_005f1(_jspx_page_context))
        return;
      out.write(" </center></h1>\r\n");
      out.write(" \r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<h1><center>Insert New Record</center></h1>\r\n");
      //  s:form
      org.springframework.web.servlet.tags.form.FormTag _jspx_th_s_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fs_005fform_0026_005fmodelAttribute_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
      _jspx_th_s_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_s_005fform_005f0.setParent(null);
      // /WEB-INF/view/addcustomer.jsp(22,0) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fform_005f0.setAction("add1");
      // /WEB-INF/view/addcustomer.jsp(22,0) name = modelAttribute type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fform_005f0.setModelAttribute("customer");
      int[] _jspx_push_body_count_s_005fform_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_s_005fform_005f0 = _jspx_th_s_005fform_005f0.doStartTag();
        if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("<table border=\"5\" align=\"center\" >\r\n");
            out.write("<tr><td>Customer Code:</td><td>");
            if (_jspx_meth_s_005finput_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context, _jspx_push_body_count_s_005fform_005f0))
              return;
            //  s:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_s_005ferrors_005f0 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fs_005ferrors_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_s_005ferrors_005f0.setPageContext(_jspx_page_context);
            _jspx_th_s_005ferrors_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
            // /WEB-INF/view/addcustomer.jsp(24,64) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_s_005ferrors_005f0.setPath("customer_code");
            int[] _jspx_push_body_count_s_005ferrors_005f0 = new int[] { 0 };
            try {
              int _jspx_eval_s_005ferrors_005f0 = _jspx_th_s_005ferrors_005f0.doStartTag();
              if (_jspx_th_s_005ferrors_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (java.lang.Throwable _jspx_exception) {
              while (_jspx_push_body_count_s_005ferrors_005f0[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_s_005ferrors_005f0.doCatch(_jspx_exception);
            } finally {
              _jspx_th_s_005ferrors_005f0.doFinally();
              _005fjspx_005ftagPool_005fs_005ferrors_0026_005fpath_005fnobody.reuse(_jspx_th_s_005ferrors_005f0);
            }
            out.write("</td></tr>\r\n");
            out.write("<tr><td>Customer Name:</td><td>");
            if (_jspx_meth_s_005finput_005f1(_jspx_th_s_005fform_005f0, _jspx_page_context, _jspx_push_body_count_s_005fform_005f0))
              return;
            //  s:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_s_005ferrors_005f1 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fs_005ferrors_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_s_005ferrors_005f1.setPageContext(_jspx_page_context);
            _jspx_th_s_005ferrors_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
            // /WEB-INF/view/addcustomer.jsp(25,63) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_s_005ferrors_005f1.setPath("customer_name");
            int[] _jspx_push_body_count_s_005ferrors_005f1 = new int[] { 0 };
            try {
              int _jspx_eval_s_005ferrors_005f1 = _jspx_th_s_005ferrors_005f1.doStartTag();
              if (_jspx_th_s_005ferrors_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (java.lang.Throwable _jspx_exception) {
              while (_jspx_push_body_count_s_005ferrors_005f1[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_s_005ferrors_005f1.doCatch(_jspx_exception);
            } finally {
              _jspx_th_s_005ferrors_005f1.doFinally();
              _005fjspx_005ftagPool_005fs_005ferrors_0026_005fpath_005fnobody.reuse(_jspx_th_s_005ferrors_005f1);
            }
            out.write("</td></tr>\r\n");
            out.write("<tr><td>Customer Address :</td><td>");
            if (_jspx_meth_s_005finput_005f2(_jspx_th_s_005fform_005f0, _jspx_page_context, _jspx_push_body_count_s_005fform_005f0))
              return;
            //  s:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_s_005ferrors_005f2 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fs_005ferrors_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_s_005ferrors_005f2.setPageContext(_jspx_page_context);
            _jspx_th_s_005ferrors_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
            // /WEB-INF/view/addcustomer.jsp(26,71) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_s_005ferrors_005f2.setPath("customer_address1");
            int[] _jspx_push_body_count_s_005ferrors_005f2 = new int[] { 0 };
            try {
              int _jspx_eval_s_005ferrors_005f2 = _jspx_th_s_005ferrors_005f2.doStartTag();
              if (_jspx_th_s_005ferrors_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (java.lang.Throwable _jspx_exception) {
              while (_jspx_push_body_count_s_005ferrors_005f2[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_s_005ferrors_005f2.doCatch(_jspx_exception);
            } finally {
              _jspx_th_s_005ferrors_005f2.doFinally();
              _005fjspx_005ftagPool_005fs_005ferrors_0026_005fpath_005fnobody.reuse(_jspx_th_s_005ferrors_005f2);
            }
            out.write("</td></tr>\r\n");
            out.write("<tr><td>Customer Pin Code:</td><td>");
            if (_jspx_meth_s_005finput_005f3(_jspx_th_s_005fform_005f0, _jspx_page_context, _jspx_push_body_count_s_005fform_005f0))
              return;
            //  s:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_s_005ferrors_005f3 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fs_005ferrors_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_s_005ferrors_005f3.setPageContext(_jspx_page_context);
            _jspx_th_s_005ferrors_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
            // /WEB-INF/view/addcustomer.jsp(27,70) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_s_005ferrors_005f3.setPath("customer_pinCode");
            int[] _jspx_push_body_count_s_005ferrors_005f3 = new int[] { 0 };
            try {
              int _jspx_eval_s_005ferrors_005f3 = _jspx_th_s_005ferrors_005f3.doStartTag();
              if (_jspx_th_s_005ferrors_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (java.lang.Throwable _jspx_exception) {
              while (_jspx_push_body_count_s_005ferrors_005f3[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_s_005ferrors_005f3.doCatch(_jspx_exception);
            } finally {
              _jspx_th_s_005ferrors_005f3.doFinally();
              _005fjspx_005ftagPool_005fs_005ferrors_0026_005fpath_005fnobody.reuse(_jspx_th_s_005ferrors_005f3);
            }
            out.write("</td></tr>\r\n");
            out.write("<tr><td>E-mail address:</td><td>");
            if (_jspx_meth_s_005finput_005f4(_jspx_th_s_005fform_005f0, _jspx_page_context, _jspx_push_body_count_s_005fform_005f0))
              return;
            //  s:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_s_005ferrors_005f4 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fs_005ferrors_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_s_005ferrors_005f4.setPageContext(_jspx_page_context);
            _jspx_th_s_005ferrors_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
            // /WEB-INF/view/addcustomer.jsp(28,64) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_s_005ferrors_005f4.setPath("email_address");
            int[] _jspx_push_body_count_s_005ferrors_005f4 = new int[] { 0 };
            try {
              int _jspx_eval_s_005ferrors_005f4 = _jspx_th_s_005ferrors_005f4.doStartTag();
              if (_jspx_th_s_005ferrors_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (java.lang.Throwable _jspx_exception) {
              while (_jspx_push_body_count_s_005ferrors_005f4[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_s_005ferrors_005f4.doCatch(_jspx_exception);
            } finally {
              _jspx_th_s_005ferrors_005f4.doFinally();
              _005fjspx_005ftagPool_005fs_005ferrors_0026_005fpath_005fnobody.reuse(_jspx_th_s_005ferrors_005f4);
            }
            out.write("</td></tr>\r\n");
            out.write("<tr><td>Contact number:</td><td>");
            if (_jspx_meth_s_005finput_005f5(_jspx_th_s_005fform_005f0, _jspx_page_context, _jspx_push_body_count_s_005fform_005f0))
              return;
            //  s:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_s_005ferrors_005f5 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fs_005ferrors_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_s_005ferrors_005f5.setPageContext(_jspx_page_context);
            _jspx_th_s_005ferrors_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
            // /WEB-INF/view/addcustomer.jsp(29,65) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_s_005ferrors_005f5.setPath("contact_number");
            int[] _jspx_push_body_count_s_005ferrors_005f5 = new int[] { 0 };
            try {
              int _jspx_eval_s_005ferrors_005f5 = _jspx_th_s_005ferrors_005f5.doStartTag();
              if (_jspx_th_s_005ferrors_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (java.lang.Throwable _jspx_exception) {
              while (_jspx_push_body_count_s_005ferrors_005f5[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_s_005ferrors_005f5.doCatch(_jspx_exception);
            } finally {
              _jspx_th_s_005ferrors_005f5.doFinally();
              _005fjspx_005ftagPool_005fs_005ferrors_0026_005fpath_005fnobody.reuse(_jspx_th_s_005ferrors_005f5);
            }
            out.write("</td></tr>\r\n");
            out.write("<tr><td></td><td><input type=\"submit\" value=\"submit details\" /></td></tr>\r\n");
            out.write("\r\n");
            out.write("</table>\r\n");
            int evalDoAfterBody = _jspx_th_s_005fform_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_s_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_s_005fform_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_s_005fform_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_s_005fform_005f0.doFinally();
        _005fjspx_005ftagPool_005fs_005fform_0026_005fmodelAttribute_005faction.reuse(_jspx_th_s_005fform_005f0);
      }
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html> \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_security_005fauthentication_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  security:authentication
    org.springframework.security.taglibs.authz.AuthenticationTag _jspx_th_security_005fauthentication_005f0 = (org.springframework.security.taglibs.authz.AuthenticationTag) _005fjspx_005ftagPool_005fsecurity_005fauthentication_0026_005fproperty_005fnobody.get(org.springframework.security.taglibs.authz.AuthenticationTag.class);
    _jspx_th_security_005fauthentication_005f0.setPageContext(_jspx_page_context);
    _jspx_th_security_005fauthentication_005f0.setParent(null);
    // /WEB-INF/view/index1.jsp(17,37) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_security_005fauthentication_005f0.setProperty("name");
    int _jspx_eval_security_005fauthentication_005f0 = _jspx_th_security_005fauthentication_005f0.doStartTag();
    if (_jspx_th_security_005fauthentication_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsecurity_005fauthentication_0026_005fproperty_005fnobody.reuse(_jspx_th_security_005fauthentication_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fsecurity_005fauthentication_0026_005fproperty_005fnobody.reuse(_jspx_th_security_005fauthentication_005f0);
    return false;
  }

  private boolean _jspx_meth_security_005fauthentication_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  security:authentication
    org.springframework.security.taglibs.authz.AuthenticationTag _jspx_th_security_005fauthentication_005f1 = (org.springframework.security.taglibs.authz.AuthenticationTag) _005fjspx_005ftagPool_005fsecurity_005fauthentication_0026_005fproperty_005fnobody.get(org.springframework.security.taglibs.authz.AuthenticationTag.class);
    _jspx_th_security_005fauthentication_005f1.setPageContext(_jspx_page_context);
    _jspx_th_security_005fauthentication_005f1.setParent(null);
    // /WEB-INF/view/index1.jsp(29,22) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_security_005fauthentication_005f1.setProperty("name");
    int _jspx_eval_security_005fauthentication_005f1 = _jspx_th_security_005fauthentication_005f1.doStartTag();
    if (_jspx_th_security_005fauthentication_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsecurity_005fauthentication_0026_005fproperty_005fnobody.reuse(_jspx_th_security_005fauthentication_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fsecurity_005fauthentication_0026_005fproperty_005fnobody.reuse(_jspx_th_security_005fauthentication_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005finput_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_s_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_s_005finput_005f0 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fs_005finput_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_s_005finput_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005finput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/view/addcustomer.jsp(24,31) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005finput_005f0.setPath("customer_code");
    int[] _jspx_push_body_count_s_005finput_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_s_005finput_005f0 = _jspx_th_s_005finput_005f0.doStartTag();
      if (_jspx_th_s_005finput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_s_005finput_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_s_005finput_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_s_005finput_005f0.doFinally();
      _005fjspx_005ftagPool_005fs_005finput_0026_005fpath_005fnobody.reuse(_jspx_th_s_005finput_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_s_005finput_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_s_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_s_005finput_005f1 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fs_005finput_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_s_005finput_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005finput_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/view/addcustomer.jsp(25,31) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005finput_005f1.setPath("customer_name");
    int[] _jspx_push_body_count_s_005finput_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_s_005finput_005f1 = _jspx_th_s_005finput_005f1.doStartTag();
      if (_jspx_th_s_005finput_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_s_005finput_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_s_005finput_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_s_005finput_005f1.doFinally();
      _005fjspx_005ftagPool_005fs_005finput_0026_005fpath_005fnobody.reuse(_jspx_th_s_005finput_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_s_005finput_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_s_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_s_005finput_005f2 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fs_005finput_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_s_005finput_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005finput_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/view/addcustomer.jsp(26,35) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005finput_005f2.setPath("customer_address1");
    int[] _jspx_push_body_count_s_005finput_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_s_005finput_005f2 = _jspx_th_s_005finput_005f2.doStartTag();
      if (_jspx_th_s_005finput_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_s_005finput_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_s_005finput_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_s_005finput_005f2.doFinally();
      _005fjspx_005ftagPool_005fs_005finput_0026_005fpath_005fnobody.reuse(_jspx_th_s_005finput_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_s_005finput_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_s_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_s_005finput_005f3 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fs_005finput_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_s_005finput_005f3.setPageContext(_jspx_page_context);
    _jspx_th_s_005finput_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/view/addcustomer.jsp(27,35) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005finput_005f3.setPath("customer_pinCode");
    int[] _jspx_push_body_count_s_005finput_005f3 = new int[] { 0 };
    try {
      int _jspx_eval_s_005finput_005f3 = _jspx_th_s_005finput_005f3.doStartTag();
      if (_jspx_th_s_005finput_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_s_005finput_005f3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_s_005finput_005f3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_s_005finput_005f3.doFinally();
      _005fjspx_005ftagPool_005fs_005finput_0026_005fpath_005fnobody.reuse(_jspx_th_s_005finput_005f3);
    }
    return false;
  }

  private boolean _jspx_meth_s_005finput_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_s_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_s_005finput_005f4 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fs_005finput_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_s_005finput_005f4.setPageContext(_jspx_page_context);
    _jspx_th_s_005finput_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/view/addcustomer.jsp(28,32) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005finput_005f4.setPath("email_address");
    int[] _jspx_push_body_count_s_005finput_005f4 = new int[] { 0 };
    try {
      int _jspx_eval_s_005finput_005f4 = _jspx_th_s_005finput_005f4.doStartTag();
      if (_jspx_th_s_005finput_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_s_005finput_005f4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_s_005finput_005f4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_s_005finput_005f4.doFinally();
      _005fjspx_005ftagPool_005fs_005finput_0026_005fpath_005fnobody.reuse(_jspx_th_s_005finput_005f4);
    }
    return false;
  }

  private boolean _jspx_meth_s_005finput_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_s_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_s_005finput_005f5 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fs_005finput_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_s_005finput_005f5.setPageContext(_jspx_page_context);
    _jspx_th_s_005finput_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/view/addcustomer.jsp(29,32) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005finput_005f5.setPath("contact_number");
    int[] _jspx_push_body_count_s_005finput_005f5 = new int[] { 0 };
    try {
      int _jspx_eval_s_005finput_005f5 = _jspx_th_s_005finput_005f5.doStartTag();
      if (_jspx_th_s_005finput_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_s_005finput_005f5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_s_005finput_005f5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_s_005finput_005f5.doFinally();
      _005fjspx_005ftagPool_005fs_005finput_0026_005fpath_005fnobody.reuse(_jspx_th_s_005finput_005f5);
    }
    return false;
  }
}
