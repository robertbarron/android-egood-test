/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * aapt tool from the resource data it found.  It
 * should not be modified by hand.
 */

package com.egood.platform;

public final class R {
    public static final class anim {
        public static final int fadein=0x7f040000;
        public static final int fadeout=0x7f040001;
        public static final int push_left_in=0x7f040002;
        public static final int push_left_out=0x7f040003;
        public static final int push_right_in=0x7f040004;
        public static final int push_right_out=0x7f040005;
        public static final int rotation=0x7f040006;
        public static final int scale=0x7f040007;
    }
    public static final class attr {
        /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static final int buttonBarButtonStyle=0x7f010001;
        /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static final int buttonBarStyle=0x7f010000;
    }
    public static final class color {
        public static final int black_overlay=0x7f050000;
        public static final int green=0x7f050001;
    }
    public static final class drawable {
        public static final int edit_text=0x7f020000;
        public static final int egood_image=0x7f020001;
        public static final int egood_logo=0x7f020002;
        public static final int gradient=0x7f020003;
        public static final int ic_launcher=0x7f020004;
    }
    public static final class id {
        public static final int button1=0x7f080007;
        public static final int imageView1=0x7f080001;
        public static final int passwd=0x7f080005;
        public static final int phone_or_email=0x7f080003;
        public static final int tableRow1=0x7f080000;
        public static final int tableRow2=0x7f080002;
        public static final int tableRow3=0x7f080004;
        public static final int tableRow4=0x7f080006;
    }
    public static final class layout {
        public static final int main=0x7f030000;
    }
    public static final class string {
        public static final int app_name=0x7f060000;
        public static final int dummy_button=0x7f060001;
        public static final int dummy_content=0x7f060002;
    }
    public static final class style {
        /** 
        Base application theme for API 11+. This theme completely replaces
        AppBaseTheme from res/values/styles.xml on API 11+ devices.

    
 API 11 theme customizations can go here. 

        Base application theme for API 14+. This theme completely replaces
        AppBaseTheme from BOTH res/values/styles.xml and
        res/values-v11/styles.xml on API 14+ devices.
    
 API 14 theme customizations can go here. 
         */
        public static final int AppBaseTheme=0x7f070000;
        /**  All customizations that are NOT specific to a particular API-level can go here. 
         */
        public static final int AppTheme=0x7f070001;
        public static final int ButtonBar=0x7f070003;
        public static final int ButtonBarButton=0x7f070007;
        public static final int ButtonText=0x7f070006;
        public static final int FullscreenActionBarStyle=0x7f070008;
        public static final int FullscreenTheme=0x7f070002;
        public static final int corners=0x7f070004;
        public static final int edit_text_login=0x7f070005;
    }
    public static final class styleable {
        /** 
         Declare custom theme attributes that allow changing which styles are
         used for button bars depending on the API level.
         ?android:attr/buttonBarStyle is new as of API 11 so this is
         necessary to support previous API levels.
    
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #ButtonBarContainerTheme_buttonBarButtonStyle com.egood.platform:buttonBarButtonStyle}</code></td><td></td></tr>
           <tr><td><code>{@link #ButtonBarContainerTheme_buttonBarStyle com.egood.platform:buttonBarStyle}</code></td><td></td></tr>
           </table>
           @see #ButtonBarContainerTheme_buttonBarButtonStyle
           @see #ButtonBarContainerTheme_buttonBarStyle
         */
        public static final int[] ButtonBarContainerTheme = {
            0x7f010000, 0x7f010001
        };
        /**
          <p>This symbol is the offset where the {@link com.egood.platform.R.attr#buttonBarButtonStyle}
          attribute's value can be found in the {@link #ButtonBarContainerTheme} array.


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          @attr name android:buttonBarButtonStyle
        */
        public static final int ButtonBarContainerTheme_buttonBarButtonStyle = 1;
        /**
          <p>This symbol is the offset where the {@link com.egood.platform.R.attr#buttonBarStyle}
          attribute's value can be found in the {@link #ButtonBarContainerTheme} array.


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          @attr name android:buttonBarStyle
        */
        public static final int ButtonBarContainerTheme_buttonBarStyle = 0;
    };
}
