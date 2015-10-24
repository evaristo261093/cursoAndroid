package com.example.evaristo.ejemplo002;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private  String status= "";
    private TextView txt_msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button btn_cerrar = (Button)findViewById(R.id.btn_cerrar);
        btn_cerrar.setOnClickListener(new CloseOnClickListener());
        Button btn_abrir = (Button)findViewById(R.id.btn_abrir);
        btn_abrir.setOnClickListener(new OpenOnClickListener());

        txt_msg = (TextView) findViewById(R.id.textView);

        status = "Estado: OnCreate ";
        txt_msg.setText(status);
    }

    @Override
    protected void onStop() {
        super.onStop();
        status = "Estado: OnStop ";
        txt_msg.setText(status);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        status = "Estado: OnDestroy ";
        txt_msg.setText(status);
    }

    @Override
    protected void onPause() {
        super.onPause();
        status = "Estado: OnPause ";
        txt_msg.setText(status);
    }

    @Override
    protected void onResume() {
        super.onResume();
        status = "Estado: OnResume ";
        txt_msg.setText(status);
    }

    @Override
    protected void onStart() {
        super.onStart();
        status = "Estado: OnStart ";
        txt_msg.setText(status);
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
    class CloseOnClickListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            finish();
        }
    }
    class OpenOnClickListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Intent i = new Intent(getApplicationContext(),segunda_actividad.class);
            startActivity(i);
        }
    }
}
