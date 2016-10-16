package top.zeroyiq.myintents;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_startAty1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /**
                 * 第一种 使用 Component （组件）名称启动Activity（显示 Intent）
                 */
//                Intent i = new Intent();
//                i.setComponent(new ComponentName("top.zeroyiq.myintents","top.zeroyiq.myintents.Aty_1"));
                /**
                 * 第二种 使用 Action 启动 Activity（隐式 Intent）
                 */
                Intent i = new Intent("top.zeroyiq.myintents.intent.action.Aty1");
                startActivity(i);
            }
        });
    }
}
