package com.example.shell_android;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.example.shell_android.shellexecuter.ShellExecuter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.click_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShellExecuter exe = new ShellExecuter();
                String command = "am start -n com.tencent.mm/com.tencent.mm.ui.LauncherUI";
                String outp = exe.Executer(command);
                Log.d("Output", outp);
            }
        });
    }
}
