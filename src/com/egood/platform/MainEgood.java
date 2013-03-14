package com.egood.platform;

//import android.content.Context;
//import android.telephony.TelephonyManager;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicHeader;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainEgood extends Activity {
	private static String APIKEY = "e807f1fcf82d132f9bb018ca6738a19r";
	private static String APIPUBLIC = "e388c1c5df4933fa01f6da9f92595585";
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        if(!isLogged()) {
	        setContentView(R.layout.main);
	        
	        final ImageView logo = (ImageView) this.findViewById(R.id.imageView1);
	        final EditText phone_or_email = (EditText) this.findViewById(R.id.phone_or_email);
	        final EditText passwd = (EditText) this.findViewById(R.id.passwd);
	        final Button try_login = (Button) this.findViewById(R.id.button1);
	        
	        this.logo_fadein(logo);
	        this.edit_push_in_left(phone_or_email);
	        this.edit_push_in_right(passwd);
	        this.button_fadein(try_login);
	        
	        //phone_or_email.setText(getMyPhoneNumber());
	        
	        try_login.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					String user = phone_or_email.getText().toString();
					String pass = passwd.getText().toString();
					Context context = getApplicationContext();
					int duration = Toast.LENGTH_LONG;
					
					//Get the data (see above)
					JSONObject json = getJSONfromURL("http://www.egood4.me/json/user/login?username=" + user +"&passwd=" + pass);
					try {
						JSONArray  response = json.getJSONArray("0-data");
						Toast.makeText(context, response.toString(), duration).show();
					} catch (JSONException e){
						Toast.makeText(context, "Error parsing data" + e.toString(), duration).show();
				    }

					Toast.makeText(context, "user: "+ user + " pass: " + pass, duration).show();
					//SEND AND GET JSON OBJECT
				}
			});
        }
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        // Trigger the initial hide() shortly after the activity has been
        // created, to briefly hint to the user that UI controls
        // are available.
    }
    
    private boolean isLogged() {
    	/*
    	 * 1.- Check if file is created
    	 * 2.- If it is created, read data access
    	 * 3.- If not created return false;
    	 */
    	return false;
    }
    private void logo_fadein(ImageView object_to_animate) {
    	Animation animation = AnimationUtils.loadAnimation(this, R.anim.fadein);
    	object_to_animate.startAnimation(animation);
    }
    
    private void edit_push_in_left(EditText object_to_animate) {
    	Animation animation = AnimationUtils.loadAnimation(this, R.anim.push_left_in);
    	object_to_animate.startAnimation(animation);
    }
    
    private void edit_push_in_right(EditText object_to_animate) {
    	Animation animation = AnimationUtils.loadAnimation(this, R.anim.push_right_in);
    	object_to_animate.startAnimation(animation);
    }
    
    private void button_scale(Button object_to_animate) {
    	Animation animation = AnimationUtils.loadAnimation(this, R.anim.scale);
    	object_to_animate.startAnimation(animation);
    }
    
    private void button_fadein(Button object_to_animate) {
    	Animation animation = AnimationUtils.loadAnimation(this, R.anim.fadein);
    	object_to_animate.startAnimation(animation);
    }
    
//    private String getMyPhoneNumber() {
//        TelephonyManager mTelephonyMgr;
//        mTelephonyMgr = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE); 
//        return mTelephonyMgr.getLine1Number();
//    }
//
//    private String getMy10DigitPhoneNumber() {
//        String s = getMyPhoneNumber();
//        return s.substring(2);
//    }
    
    public static JSONObject getJSONfromURL(String url) {
	    //initialize
	    InputStream is = null;
	    String result = "";
	    JSONObject jArray = null;
	    //http post
	    try{
	        HttpClient httpclient = new DefaultHttpClient();
	        HttpPost httppost = new HttpPost(url);
	        httppost.addHeader(new BasicHeader("APIKEY", APIKEY));
	        httppost.addHeader(new BasicHeader("APIPUBLIC", APIPUBLIC));
	        
	        HttpResponse response = httpclient.execute(httppost);
	        HttpEntity entity = response.getEntity();
	        is = entity.getContent();
	    }catch(Exception e){
	        Log.e("log_tag", "Error in http connection "+e.toString());
	    }
	    try{
	        BufferedReader reader = new BufferedReader(new InputStreamReader(is,"iso-8859-1"),8);
	        StringBuilder sb = new StringBuilder();
	        String line = null;
	        while ((line = reader.readLine()) != null) {
	            sb.append(line + "\n");
	        }
	        is.close();
	        result=sb.toString();
	    }catch(Exception e){
	        Log.e("log_tag", "Error converting result "+e.toString());
	    }
	    try{
	            jArray = new JSONObject(result);
	    }catch(JSONException e){
	        Log.e("log_tag", "Error parsing data "+e.toString());
	    }
	    return jArray;
	}
}
