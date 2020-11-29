package com.dhaaaga.musetoday;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText ed1;
    Button b1;
    Button b2;

    public static final String MyPREFERENCES = "mypref" ;
    public static final String usernamekey = "username" ;
    SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




            ed1=(EditText)findViewById(R.id.etext1);


        b1 = (Button) findViewById(R.id.nxtbtn);
        b2 = (Button) findViewById(R.id.nxtbtn2);
        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);

            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String n = ed1.getText().toString();


                    SharedPreferences.Editor editor = sharedpreferences.edit();

                    editor.putString(usernamekey, n);
                    editor.apply();
                    Toast.makeText(MainActivity.this, "Welcome!", Toast.LENGTH_LONG).show();


                    Intent i = new Intent(MainActivity.this, Home.class);
                    startActivity(i);


                }
            });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Home.class));
            }
        });

    }


}
