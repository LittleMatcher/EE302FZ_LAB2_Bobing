package com.example.bobing_1;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class gamerule_rule extends AppCompatActivity {

    Button button_back_gamerule;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gamerule_rule);

        button_back_gamerule=findViewById(R.id.button_back_gamerule);//按钮id为btn_1

        button_back_gamerule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(gamerule_rule.this,gamerule.class);//从MainActivity跳转到nextActivity
                startActivity(intent);
            }
        });
    }
}