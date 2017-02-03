package com.example.shridharbadri.aiodelivery;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

/**
 * Created by Shridharbadri on 2/3/2017.
 */

public class BackgroundTask extends AsyncTask<String, Void, String> {
    private Context context;
    private String Username;
    private String Password;
    public BackgroundTask(Context context,String Username,String Password){
        this.context=context;
        this.Username=Username;
        this.Password=Password;
    }

    @Override
    protected String doInBackground(String... params) {
        Object method=params[0];
        if(method.equals("login")){
            try {
                URL url=new URL("http://debuggers.site88.net/MINI_Project/login.php");
                HttpURLConnection httpURLConnection= (HttpURLConnection) url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);

                //Output Stream
                OutputStream os=httpURLConnection.getOutputStream();
                BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(os,"UTF-8"));
                String data= URLEncoder.encode("Username","UTF-8")+"="+URLEncoder.encode(Username,"UTF-8")+"&"+
                        URLEncoder.encode("Password","UTF-8")+"="+
                        URLEncoder.encode(Password,"UTF-8");
                bufferedWriter.write(data);
                bufferedWriter.flush();
                bufferedWriter.close();
                os.close();

                //Input Stream
                InputStream is=httpURLConnection.getInputStream();
                BufferedReader br=new BufferedReader(new InputStreamReader(is,"iso-8859-1"));
                String line="";
                String response="";
                while((line=br.readLine())!=null){
                    response+=line;
                }
                br.close();
                is.close();
                httpURLConnection.disconnect();
                Log.d("key",""+response);
                return response;
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else
        {

        }
        return null;
    }

    @Override
    protected void onPostExecute(String s) {
        Toast.makeText(context,""+s,Toast.LENGTH_SHORT).show();
        super.onPostExecute(s);
    }
}
