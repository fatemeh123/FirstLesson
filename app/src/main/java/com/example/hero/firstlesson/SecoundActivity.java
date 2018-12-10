package com.example.hero.firstlesson;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecoundActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secound);

        TextView name=findViewById(R.id.txtName);
        TextView lastName=findViewById(R.id.txtLastName);
        TextView age=findViewById(R.id.txtAge);
        TextView number=findViewById(R.id.txtNumber);




        Intent intent=getIntent();
        String firstName=intent.getStringExtra("name");
        name.setText(firstName);

        String secoundName=intent.getStringExtra("lastName");
        lastName.setText(secoundName);

        String agee=intent.getStringExtra("age");
        age.setText(agee);

        String phoneNumber=intent.getStringExtra("number");
        number.setText(phoneNumber);

    }
}
