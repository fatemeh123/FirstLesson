package com.example.hero.firstlesson;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText name=findViewById(R.id.editTextName);
        final EditText lastName=findViewById(R.id.editTextLastName);
        final EditText age=findViewById(R.id.editTextAge);
        final EditText number=findViewById(R.id.editTextPhone);
        Button button=findViewById(R.id.btn);


        lastName.getText().toString();
        age.getText().toString();
        number.getText().toString();


        Intent intent=getIntent();


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,SecoundActivity.class);
                intent.putExtra("neme",name.getText().toString());
                intent.putExtra("lastName",lastName.getText().toString());
                intent.putExtra("age",age.getText().toString());
                intent.putExtra("number",number.getText().toString());
                startActivity(intent);
            }
        });
    }
}
