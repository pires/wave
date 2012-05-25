// ===================================================================
//
//   WARNING: GENERATED CODE! DO NOT EDIT!
//
// ===================================================================
/*
 This file generated from:

 /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/WaveClientPage.gxp
*/

package org.waveprotocol.box.server.gxp;

import com.google.gxp.base.*;
import com.google.gxp.css.*;                                                    // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/WaveClientPage.gxp: L28, C44
import com.google.gxp.html.*;                                                   // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/WaveClientPage.gxp: L28, C44
import com.google.gxp.js.*;                                                     // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/WaveClientPage.gxp: L28, C44
import com.google.gxp.text.*;                                                   // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/WaveClientPage.gxp: L28, C44
import org.json.JSONObject;                                                     // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/WaveClientPage.gxp: L30, C3
import org.waveprotocol.box.server.gxp.TopBar;                                  // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/WaveClientPage.gxp: L31, C3

public class WaveClientPage extends com.google.gxp.base.GxpTemplate {           // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/WaveClientPage.gxp: L28, C44

  private static final String GXP$MESSAGE_SOURCE = "org.waveprotocol.box.server.gxp";

  public static void write(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context, final JSONObject sessionJson, final JSONObject clientFlags, final HtmlClosure topBar, final boolean useSocketIO, final String analyticsAccount)
      throws java.io.IOException {
    final java.util.Locale gxp_locale = gxp_context.getLocale();
    if (gxp_context.isUsingXmlSyntax()) {                                       // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/WaveClientPage.gxp: L39, C3
      gxp$out.append("<?xml version=\"1.0\" ?>\n<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");   // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/WaveClientPage.gxp: L39, C3
    } else {
      gxp$out.append("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">");   // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/WaveClientPage.gxp: L39, C3
    }
    gxp$out.append("<html");                                                    // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/WaveClientPage.gxp: L39, C3
    if (gxp_context.isUsingXmlSyntax()) {                                       // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/WaveClientPage.gxp: L39, C3
      gxp$out.append(" xmlns=\"http://www.w3.org/1999/xhtml\"");                // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/WaveClientPage.gxp: L39, C3
    }
    gxp$out.append("><head><meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\"");   // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/WaveClientPage.gxp: L39, C3
    if (gxp_context.isUsingXmlSyntax()) {                                       // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/WaveClientPage.gxp: L41, C7
      gxp$out.append(" /");                                                     // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/WaveClientPage.gxp: L41, C7
    }
    gxp$out.append(">\n<title>Wave in a Box</title>\n<link rel=\"shortcut icon\" href=\"/static/favicon.ico\"");   // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/WaveClientPage.gxp: L41, C7
    if (gxp_context.isUsingXmlSyntax()) {                                       // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/WaveClientPage.gxp: L43, C7
      gxp$out.append(" /");                                                     // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/WaveClientPage.gxp: L43, C7
    }
    gxp$out.append(">\n<script type=\"text/javascript\" language=\"javascript\">\n        var __session = ");   // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/WaveClientPage.gxp: L43, C7
    com.google.gxp.js.JavascriptAppender.INSTANCE.append(gxp$out, gxp_context, (sessionJson));   // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/WaveClientPage.gxp: L47, C25
    gxp$out.append(";\n        var __client_flags = ");                         // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/WaveClientPage.gxp: L47, C56
    com.google.gxp.js.JavascriptAppender.INSTANCE.append(gxp$out, gxp_context, (clientFlags));   // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/WaveClientPage.gxp: L48, C30
    gxp$out.append(";\n        var __useSocketIO = ");                          // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/WaveClientPage.gxp: L48, C61
    com.google.gxp.js.JavascriptAppender.INSTANCE.append(gxp$out, gxp_context, (useSocketIO));   // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/WaveClientPage.gxp: L49, C29
    gxp$out.append(";\n      </script>\n<style type=\"text/css\">\n        /* TODO: Minimize this. */\n        body {\n          /* Override UA defaults. */\n          margin: 0;\n        }\n\n        .topbar {\n          height: 32px;\n          /* Line-height set to full height, in order to get vertical text alignment. */\n          line-height: 32px;\n          border-bottom: solid 1px black;\n          overflow: visible;  /* Let banner detail flow over. */\n          font-family: \"Gill Sans\", \"Lucida Grande\", Verdana, Arial, sans-serif;\n          font-size: 16px;\n\n          /* Left/right padding to keep content off the screen edges. */\n          padding: 0 0.5em;\n\n          /* Z-index to ensure topbar sits on top of the app body. */\n          position: relative;\n          z-index: 1;\n        }\n\n        .logo {\n          /* Logo image is 30px high.  1px padding brings it to 32px, which is the topbar height. */\n          padding: 1px;\n          float: left;\n        }\n\n        .title {\n          float: left;\n          margin-left: 0.5em;\n        }\n\n        .banner {\n          float: left;\n          margin-left: 0.5em;\n        }\n\n        .domain {\n          color: #606060;\n        }\n\n        .info {\n          float: right;\n        }\n\n        .online {\n          color: green;\n        }\n\n        .connecting {\n          color: #ff7f00;\n          font-weight: bold;\n        }\n\n        .offline {\n          color: red;\n          font-weight: bold;\n        }\n\n      </style>\n<script type=\"text/javascript\" language=\"javascript\" src=\"webclient/webclient.nocache.js\"></script>\n");   // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/WaveClientPage.gxp: L49, C60
    org.waveprotocol.box.server.gxp.AnalyticsFragment.write(gxp$out, gxp_context, analyticsAccount, org.waveprotocol.box.server.gxp.AnalyticsFragment.getDefaultError());   // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/WaveClientPage.gxp: L116, C7
    gxp$out.append("</head>\n<body><iframe src=\"javascript:&#39;&#39;\" id=\"__gwt_historyFrame\" style=\"position:absolute;width:0;height:0;border:0\"></iframe>\n");   // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/WaveClientPage.gxp: L40, C5
    com.google.gxp.html.HtmlAppender.INSTANCE.append(gxp$out, gxp_context, (topBar));   // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/WaveClientPage.gxp: L122, C7
    gxp$out.append("\n<div id=\"app\" style=\"position:absolute; top:33px; right:0px; bottom:0px; left:0px;\"></div>\n<noscript><div style=\"width: 22em; position: absolute; left: 50%; margin-left: -11em; color: red; background-color: white; border: 1px solid red; padding: 4px; font-family: sans-serif\">Your web browser must have JavaScript enabled\nin order for this application to display correctly.</div></noscript></body></html>");   // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/WaveClientPage.gxp: L122, C32
  }

  private static final java.util.List<String> GXP$ARGLIST = java.util.Collections.unmodifiableList(java.util.Arrays.asList("sessionJson", "clientFlags", "topBar", "useSocketIO", "analyticsAccount"));

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

  public static com.google.gxp.html.HtmlClosure getGxpClosure(final JSONObject sessionJson, final JSONObject clientFlags, final HtmlClosure topBar, final boolean useSocketIO, final String analyticsAccount) {
    return new TunnelingHtmlClosure() {
      public void writeImpl(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context)
          throws java.io.IOException {
        org.waveprotocol.box.server.gxp.WaveClientPage.write(gxp$out, gxp_context, sessionJson, clientFlags, topBar, useSocketIO, analyticsAccount);
      }
    };
  }

  /**
   * Interface that defines a strategy for writing this GXP
   */
  public interface Interface {
    public void write(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context, final JSONObject sessionJson, final JSONObject clientFlags, final HtmlClosure topBar, final boolean useSocketIO, final String analyticsAccount)
        throws java.io.IOException;

    public com.google.gxp.html.HtmlClosure getGxpClosure(final JSONObject sessionJson, final JSONObject clientFlags, final HtmlClosure topBar, final boolean useSocketIO, final String analyticsAccount);
  }

  /**
   * Instantiable instance of this GXP
   */
  public static class Instance implements Interface {

    public Instance() {
    }

    public void write(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context, final JSONObject sessionJson, final JSONObject clientFlags, final HtmlClosure topBar, final boolean useSocketIO, final String analyticsAccount)
        throws java.io.IOException {
      org.waveprotocol.box.server.gxp.WaveClientPage.write(gxp$out, gxp_context, sessionJson, clientFlags, topBar, useSocketIO, analyticsAccount);
    }

    public com.google.gxp.html.HtmlClosure getGxpClosure(final JSONObject sessionJson, final JSONObject clientFlags, final HtmlClosure topBar, final boolean useSocketIO, final String analyticsAccount) {
      return new TunnelingHtmlClosure() {
        public void writeImpl(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context)
            throws java.io.IOException {
          Instance.this.write(gxp$out, gxp_context, sessionJson, clientFlags, topBar, useSocketIO, analyticsAccount);
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
