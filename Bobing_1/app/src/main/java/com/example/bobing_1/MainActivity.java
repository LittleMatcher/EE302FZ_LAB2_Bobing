package com.example.bobing_1;

import androidx.appcompat.app.AppCompatActivity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.media.MediaPlayer;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button_setting,button_gemerule,button_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        findViewById(R.id.gamerule).setOnClickListener(this);

//----------------------------------login/register/forget_password/account------------------------

//---------------------------------------------------------------------------------------------------------

//-----------------------------------back_page/next_page---------------------------------------------------
        button_gemerule=findViewById(R.id.gamerule);
        button_setting=findViewById(R.id.setting);
        button_login=findViewById(R.id.online_game);
        button_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,setting.class);//从MainActivity跳转到nextActivity
                startActivity(intent);
            }
        });
        button_gemerule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,gamerule.class);//从MainActivity跳转到nextActivity
                startActivity(intent);
            }
        });
        button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,LoginActivity.class);//从MainActivity跳转到login
                startActivity(intent);
            }
        });
//---------------------------------------------------------------------------------------------------------
    }


    @Override
    public void onClick(View view) {


    }


//-------------------------quit button function-----------------------------------
    public void showdialog(View view)
    {
        //定义一个新的对话框对象
        AlertDialog.Builder alertdialogbuilder=new AlertDialog.Builder(this);
        //设置对话框提示内容
        alertdialogbuilder.setMessage("确定要退出程序吗？");
        //定义对话框2个按钮标题及接受事件的函数
        alertdialogbuilder.setPositiveButton("确定",click1);
        alertdialogbuilder.setNegativeButton("取消",click2);
        //创建并显示对话框
        AlertDialog alertdialog1=alertdialogbuilder.create();
        alertdialog1.show();

    }
    private DialogInterface.OnClickListener click1=new DialogInterface.OnClickListener()
    {
        //使用该标记是为了增强程序在编译时候的检查，如果该方法并不是一个覆盖父类的方法，在编译时编译器就会报告错误。
        @Override

        public void onClick(DialogInterface arg0,int arg1)
        {
            //当按钮click1被按下时执行结束进程
            android.os.Process.killProcess(android.os.Process.myPid());
        }
    };
    private DialogInterface.OnClickListener click2=new DialogInterface.OnClickListener()
    {
        @Override
        public void onClick(DialogInterface arg0,int arg1)
        {
            //当按钮click2被按下时则取消操作
            arg0.cancel();
        }
    };
//--------------------------------------------------------------------------------

//-------------------------background_music/menu--------------------------------------
@Override
protected void onPause() {
    // TODO Auto-generated method stub
    MusicServer music = null;
    super.onPause();
    music.stop(this);
}
    @Override
    protected void onResume() {
        // TODO Auto-generated method stub
        super.onResume();
        MusicServer music = null;
        music.play(this, R.raw.fight_landown_with_peasant);
    }
//--------------------------------------------------------------------------------

//--------------------------------------------------------------------------------


//--------------------------------------------------------------------------------
}