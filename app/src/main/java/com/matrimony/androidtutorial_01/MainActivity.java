package com.matrimony.androidtutorial_01;

import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import  android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button mRightButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("NEW SESSION","NEW SESSION");

       this.mRightButton = (Button) findViewById(R.id.button_right);
        mRightButton.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Log.v("rightclick","right");

                Toast.makeText(getApplicationContext(),"android is fun",Toast.LENGTH_SHORT).show();

            }
        });
        /**********************************/
       testInterface(new Animal(){
           @Override
           public void makesNoise() {

           }
       });

        Toast.makeText(this,"android is fun",Toast.LENGTH_SHORT).show();

        Log.v("ON CREATE","ON CREATE");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.v("ON START","ON START");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.v("ON RESUME","ON RESUME");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.v("ON PAUSE","ON PAUSE");

    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.v("ON STOP","ON STOP");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.v("ON RESTART","ON RESTART");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.v("ON DESTROY","ON DESTROY");

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void leftClick(View view){

        Log.v("VIEW",view.toString());

    }

    public void testInterface(Animal animal){

        Log.v("MOOOOOO","MOOOOOO");

        Toast.makeText(getApplicationContext(),"sdfdsf", Toast.LENGTH_SHORT).show();
    }



}
