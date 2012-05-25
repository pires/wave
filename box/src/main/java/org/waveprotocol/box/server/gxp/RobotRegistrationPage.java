// ===================================================================
//
//   WARNING: GENERATED CODE! DO NOT EDIT!
//
// ===================================================================
/*
 This file generated from:

 /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/RobotRegistrationPage.gxp
*/

package org.waveprotocol.box.server.gxp;

import com.google.gxp.base.*;
import com.google.gxp.css.*;                                                    // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/RobotRegistrationPage.gxp: L12, C44
import com.google.gxp.html.*;                                                   // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/RobotRegistrationPage.gxp: L12, C44
import com.google.gxp.js.*;                                                     // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/RobotRegistrationPage.gxp: L12, C44
import com.google.gxp.text.*;                                                   // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/RobotRegistrationPage.gxp: L12, C44

public class RobotRegistrationPage extends com.google.gxp.base.GxpTemplate {    // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/RobotRegistrationPage.gxp: L12, C44

  private static final String GXP$MESSAGE_SOURCE = "org.waveprotocol.box.server.gxp";

  public static void write(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context, final String domain, final String message, final String analyticsAccount)
      throws java.io.IOException {
    final java.util.Locale gxp_locale = gxp_context.getLocale();
    gxp$out.append("<html><head><meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\"");   // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/RobotRegistrationPage.gxp: L18, C3
    if (gxp_context.isUsingXmlSyntax()) {                                       // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/RobotRegistrationPage.gxp: L20, C7
      gxp$out.append(" /");                                                     // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/RobotRegistrationPage.gxp: L20, C7
    }
    gxp$out.append(">\n<title>Robot Registration</title>\n<link rel=\"shortcut icon\" href=\"/static/favicon.ico\"");   // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/RobotRegistrationPage.gxp: L20, C7
    if (gxp_context.isUsingXmlSyntax()) {                                       // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/RobotRegistrationPage.gxp: L22, C7
      gxp$out.append(" /");                                                     // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/RobotRegistrationPage.gxp: L22, C7
    }
    gxp$out.append(">\n");                                                      // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/RobotRegistrationPage.gxp: L22, C7
    org.waveprotocol.box.server.gxp.AnalyticsFragment.write(gxp$out, gxp_context, analyticsAccount, org.waveprotocol.box.server.gxp.AnalyticsFragment.getDefaultError());   // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/RobotRegistrationPage.gxp: L23, C7
    gxp$out.append("</head>\n<body>");                                          // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/RobotRegistrationPage.gxp: L19, C5
    if (!message.isEmpty()) {                                                   // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/RobotRegistrationPage.gxp: L28, C7
      gxp$out.append("<b>");                                                    // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/RobotRegistrationPage.gxp: L29, C9
      com.google.gxp.html.HtmlAppender.INSTANCE.append(gxp$out, gxp_context, (message));   // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/RobotRegistrationPage.gxp: L29, C12
      gxp$out.append("</b>");                                                   // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/RobotRegistrationPage.gxp: L29, C9
    }
    gxp$out.append("\n<form method=\"post\" action=\"\">Robot Username: <input name=\"username\" type=\"text\"");   // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/RobotRegistrationPage.gxp: L30, C16
    if (gxp_context.isUsingXmlSyntax()) {                                       // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/RobotRegistrationPage.gxp: L33, C25
      gxp$out.append(" /");                                                     // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/RobotRegistrationPage.gxp: L33, C25
    }
    gxp$out.append(">@");                                                       // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/RobotRegistrationPage.gxp: L33, C25
    com.google.gxp.html.HtmlAppender.INSTANCE.append(gxp$out, gxp_context, (domain));   // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/RobotRegistrationPage.gxp: L33, C62
    gxp$out.append("<br");                                                      // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/RobotRegistrationPage.gxp: L33, C87
    if (gxp_context.isUsingXmlSyntax()) {                                       // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/RobotRegistrationPage.gxp: L33, C87
      gxp$out.append(" /");                                                     // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/RobotRegistrationPage.gxp: L33, C87
    }
    gxp$out.append(">\nRobot URL: <input name=\"location\" type=\"text\"");     // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/RobotRegistrationPage.gxp: L33, C87
    if (gxp_context.isUsingXmlSyntax()) {                                       // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/RobotRegistrationPage.gxp: L34, C20
      gxp$out.append(" /");                                                     // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/RobotRegistrationPage.gxp: L34, C20
    }
    gxp$out.append("><br");                                                     // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/RobotRegistrationPage.gxp: L34, C20
    if (gxp_context.isUsingXmlSyntax()) {                                       // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/RobotRegistrationPage.gxp: L34, C56
      gxp$out.append(" /");                                                     // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/RobotRegistrationPage.gxp: L34, C56
    }
    gxp$out.append(">\n<input type=\"submit\"");                                // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/RobotRegistrationPage.gxp: L34, C56
    if (gxp_context.isUsingXmlSyntax()) {                                       // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/RobotRegistrationPage.gxp: L35, C9
      gxp$out.append(" /");                                                     // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/RobotRegistrationPage.gxp: L35, C9
    }
    gxp$out.append("></form></body></html>");                                   // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/RobotRegistrationPage.gxp: L35, C9
  }

  private static final java.util.List<String> GXP$ARGLIST = java.util.Collections.unmodifiableList(java.util.Arrays.asList("domain", "message", "analyticsAccount"));

  /**
   * @return the names of the user defined arguments to this template.
   * This is sort of like a mapping between the positional and named
   * parameters. The first two parameters (common to all templates) are
   * not included in this list. (BTW: No, Java reflection does not
   * provide this information)
   */
  public static java.util.List<String> getArgList() {
    return GXP$ARGLIST;
  }

  private abstract static class TunnelingHtmlClosure
      extends GxpTemplate.TunnelingGxpClosure
      implements com.google.gxp.html.HtmlClosure {
  }

  public static com.google.gxp.html.HtmlClosure getGxpClosure(final String domain, final String message, final String analyticsAccount) {
    return new TunnelingHtmlClosure() {
      public void writeImpl(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context)
          throws java.io.IOException {
        org.waveprotocol.box.server.gxp.RobotRegistrationPage.write(gxp$out, gxp_context, domain, message, analyticsAccount);
      }
    };
  }

  /**
   * Interface that defines a strategy for writing this GXP
   */
  public interface Interface {
    public void write(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context, final String domain, final String message, final String analyticsAccount)
        throws java.io.IOException;

    public com.google.gxp.html.HtmlClosure getGxpClosure(final String domain, final String message, final String analyticsAccount);
  }

  /**
   * Instantiable instance of this GXP
   */
  public static class Instance implements Interface {

    public Instance() {
    }

    public void write(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context, final String domain, final String message, final String analyticsAccount)
        throws java.io.IOException {
      org.waveprotocol.box.server.gxp.RobotRegistrationPage.write(gxp$out, gxp_context, domain, message, analyticsAccount);
    }

    public com.google.gxp.html.HtmlClosure getGxpClosure(final String domain, final String message, final String analyticsAccount) {
      return new TunnelingHtmlClosure() {
        public void writeImpl(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context)
            throws java.io.IOException {
          Instance.this.write(gxp$out, gxp_context, domain, message, analyticsAccount);
        }
      };
    }
  }
}

// ===================================================================
//
//   WARNING: GENERATED CODE! DO NOT EDIT!
//
// ===================================================================
