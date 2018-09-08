package com.example.tarsbir.ecomtutorial;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AskQuestion extends AppCompatActivity {
    EditText name,message,email;
    String subject = "E-com App" ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ask_question);
        name = findViewById(R.id.nameEditText);
        message = findViewById(R.id.messageEditText);
        email = findViewById(R.id.emailEditText);
        String msg=message.toString();
        Button sendMail = findViewById(R.id.send_mailButton);
        sendMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msgFull();
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:suket.arora@yahoo.com")); // only email apps should handle this
                intent.putExtra(Intent.EXTRA_SUBJECT,subject);
                intent.putExtra(Intent.EXTRA_TEXT,msgFull());
                startActivity(Intent.createChooser(intent, "New"));

                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });
    }
public String msgFull(){
    String n= "Name: ";
    String na = name.getText().toString();
    String em="\n Email Address:";
    String ema= email.getText().toString();
    String m = "\n Message: ";
    String msg  = message.getText().toString();
    String ok = n+na+em+ema+m+msg;
    return ok;
       }
}