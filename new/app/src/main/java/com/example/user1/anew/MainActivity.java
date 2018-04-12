package com.example.user1.anew;


import android.app.Notification;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
     //intialize buttons used for displaying
    Button openActivityBtn , openBigContent ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        openActivityBtn =(Button) findViewById(R.id.buttonnotificationactifity);
        openBigContent =(Button)   findViewById(R.id.bigcontent);
        openActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              NotificationGenerator.openActivityNotifications(getApplicationContext());
                //Log.d("LOO", "onClick: ");
            }
        });
    }
}
