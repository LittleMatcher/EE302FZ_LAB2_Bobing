package com.example.bobing_1;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class gamerule extends AppCompatActivity {

    Button Btn1,gamerule_rule,gamerule_history;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gamerule);

        Btn1=findViewById(R.id.button_back);//按钮id为btn_1
        gamerule_history=findViewById(R.id.button_gamerule_history);
        gamerule_rule=findViewById(R.id.button_gamerule_rule);
        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(gamerule.this,MainActivity.class);//从MainActivity跳转到nextActivity
                startActivity(intent);
            }
        });
        gamerule_history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(gamerule.this,gamerule_history.class);//从MainActivity跳转到nextActivity
                startActivity(intent);
            }
        });
        gamerule_rule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(gamerule.this,gamerule_rule.class);//从MainActivity跳转到nextActivity
                startActivity(intent);
            }
        });
    }
}