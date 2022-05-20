package com.example.smsreadsend;

import android.content.Intent;
import android.net.Uri;
import android.os.Vibrator;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SuppActivity extends AppCompatActivity {

    private Button btnCall,btnEmail;
    Vibrator vibrator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_supp);
        btnCall= (Button) findViewById(R.id.btnCall);
        btnEmail= (Button) findViewById(R.id.btnEmail);
        vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);


        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibr(v);
                Intent call = new Intent(Intent.ACTION_DIAL);
                call.setData(Uri.parse("tel:"+"+919492138572"));
                startActivity(call);
            }
        });

        btnEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibr(v);
                Intent email = new Intent(Intent.ACTION_SENDTO);
                email.setData(Uri.parse("mailto:mobileassistant2022@gmail.com"));
                startActivity(email);
            }
        });

    }

    public void vibr(View view) {
        vibrator.vibrate(50);
    }
}
