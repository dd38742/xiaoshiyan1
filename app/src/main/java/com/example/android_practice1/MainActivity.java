package com.example.android_practice1;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.android_practice1.R;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button LogIn = (Button) findViewById(R.id.Log_In);
        LogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder check = new AlertDialog.Builder(MainActivity.this);
                LayoutInflater inflater = getLayoutInflater();

                            Toast.makeText(MainActivity.this, "对不起，输入错误！", Toast.LENGTH_LONG).show();
                        }
                    }
                });
                check.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "取消登录！", Toast.LENGTH_LONG).show();
                    }
                });
                check.show();
            }
        });
        Button Point_Out = (Button) findViewById(R.id.Point_Out);
        Point_Out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder check = new AlertDialog.Builder(MainActivity.this);
                check.setMessage("对话框已弹出");
                check.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "恭喜您，确认成功！", Toast.LENGTH_LONG).show();
                    }
                });
                check.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "恭喜您，退出成功！", Toast.LENGTH_LONG).show();
                    }
                });
                check.show();
            }
        });
    }
}
