// ===================================================================
//
//   WARNING: GENERATED CODE! DO NOT EDIT!
//
// ===================================================================
/*
 This file generated from:

 /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/AnalyticsFragment.gxp
*/

package org.waveprotocol.box.server.gxp;

import com.google.gxp.base.*;
import com.google.gxp.css.*;                                                    // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/AnalyticsFragment.gxp: L27, C42
import com.google.gxp.html.*;                                                   // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/AnalyticsFragment.gxp: L27, C42
import com.google.gxp.js.*;                                                     // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/AnalyticsFragment.gxp: L27, C42
import com.google.gxp.text.*;                                                   // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/AnalyticsFragment.gxp: L27, C42

public class AnalyticsFragment extends com.google.gxp.base.GxpTemplate {        // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/AnalyticsFragment.gxp: L27, C42

  private static final String GXP$MESSAGE_SOURCE = "org.waveprotocol.box.server.gxp";

  public static void write(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context, final String account, final String error)
      throws java.io.IOException {
    final java.util.Locale gxp_locale = gxp_context.getLocale();
    if (account != null && !account.isEmpty()) {                                // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/AnalyticsFragment.gxp: L32, C3
      gxp$out.append("<script type=\"text/javascript\">\n      var _gaq = _gaq || [];\n      _gaq.push(['_setAccount', ");   // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/AnalyticsFragment.gxp: L33, C5
      com.google.gxp.js.JavascriptAppender.INSTANCE.append(gxp$out, gxp_context, (account));   // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/AnalyticsFragment.gxp: L35, C33
      gxp$out.append("]);\n      ");                                            // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/AnalyticsFragment.gxp: L35, C59
      if (error != null && !error.isEmpty()) {                                  // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/AnalyticsFragment.gxp: L36, C7
        gxp$out.append("\n        _gaq.push(['_setCustomVar', 1, 'error', ");   // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/AnalyticsFragment.gxp: L36, C64
        com.google.gxp.js.JavascriptAppender.INSTANCE.append(gxp$out, gxp_context, (error));   // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/AnalyticsFragment.gxp: L37, C49
        gxp$out.append(", 3]);\n      ");                                       // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/AnalyticsFragment.gxp: L37, C73
      }
      gxp$out.append("\n      _gaq.push(['_trackPageview']);\n\n      (function() {\n        var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;\n        ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';\n        var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);\n      })();\n    </script>");   // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/AnalyticsFragment.gxp: L38, C16
    }
  }

  private static final String GXP_DEFAULT$error = null;                         // /Volumes/data/Work/Ubiwhere/Coollab/wave-maven/box/src/main/java/org/waveprotocol/box/server/gxp/AnalyticsFragment.gxp: L30, C3

  public static String getDefaultError() {
    return GXP_DEFAULT$error;
  }

  private static final java.util.List<String> GXP$ARGLIST = java.util.Collections.unmodifiableList(java.util.Arrays.asList("account", "error"));

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

  public static com.google.gxp.html.HtmlClosure getGxpClosure(final String account, final String error) {
    return new TunnelingHtmlClosure() {
      public void writeImpl(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context)
          throws java.io.IOException {
        org.waveprotocol.box.server.gxp.AnalyticsFragment.write(gxp$out, gxp_context, account, error);
      }
    };
  }

  /**
   * Interface that defines a strategy for writing this GXP
   */
  public interface Interface {
    public void write(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context, final String account, final String error)
        throws java.io.IOException;

    public com.google.gxp.html.HtmlClosure getGxpClosure(final String account, final String error);

    String getDefaultError();
  }

  /**
   * Instantiable instance of this GXP
   */
  public static class Instance implements Interface {

    public Instance() {
    }

    public void write(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context, final String account, final String error)
        throws java.io.IOException {
      org.waveprotocol.box.server.gxp.AnalyticsFragment.write(gxp$out, gxp_context, account, error);
    }

    public com.google.gxp.html.HtmlClosure getGxpClosure(final String account, final String error) {
      return new TunnelingHtmlClosure() {
        public void writeImpl(final java.lang.Appendable gxp$out, final com.google.gxp.base.GxpContext gxp_context)
            throws java.io.IOException {
          Instance.this.write(gxp$out, gxp_context, account, error);
        }
      };
    }

    public String getDefaultError() {
      return org.waveprotocol.box.server.gxp.AnalyticsFragment.getDefaultError();
    }
  }
}

// ===================================================================
//
//   WARNING: GENERATED CODE! DO NOT EDIT!
//
// ===================================================================
