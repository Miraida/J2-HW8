package com.geek.j2_hw8;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void enterType(View view){
        Button button = (Button)view;
        String str = button.getText().toString();
        if (str.equals("sign in")){
            setContentView(R.layout.sign_in);
        }
        else setContentView(R.layout.sign_up);
    }
    public void toastMaker(View view){
        Button button = (Button) view;
        String str = button.getText().toString();
        Toast toast ;
        if (str.equals("sign in")){

            toast = Toast.makeText(this,"WELCOME BACK!",Toast.LENGTH_LONG);
            toast.setGravity(Gravity.TOP,0,160);
            toast.show();
        }
        else {
            EditText editText = findViewById(R.id.editTextTextLogin);
           toast = Toast.makeText(this,"WELCOME "+editText.getText().toString()+" !",Toast.LENGTH_LONG);
           toast.setGravity(Gravity.TOP,0,160);
           toast.show();
        }
    }
}