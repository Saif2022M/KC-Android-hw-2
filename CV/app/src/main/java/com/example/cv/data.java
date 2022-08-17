package com.example.cv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class data extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        TextView Name = findViewById(R.id.textView1);
        TextView Age = findViewById(R.id.textView2);
        TextView job = findViewById(R.id.textView3);
        TextView Phone = findViewById(R.id.textView4);
        TextView Email = findViewById(R.id.textView5);


Bundle bundle = getIntent().getExtras();

        String S1 = bundle.getString("Name");
        Name.setText(S1);
        System.out.println(S1);

    String S2 = bundle.getString("Age");
    Age.setText(S2);
System.out.println(S2);

       String S3 = bundle.getString("job");
       job.setText(S3);
       System.out.println(S3);

        String S4 = bundle.getString("Phone");
        Phone.setText(S4);
        System.out.println(S4);

        String S5 = bundle.getString("Email");
        Email.setText(S5);
        System.out.println(S5);


        Phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String S = (String.valueOf(Phone));
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_DIAL);
                Uri uri = Uri.parse("tel:"+ Phone);
                startActivity(intent);
            }
        });






    }
}