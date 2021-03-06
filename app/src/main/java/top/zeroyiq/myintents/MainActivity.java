package top.zeroyiq.myintents;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
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

        findViewById(R.id.btn_call1008611).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("tel:1008611"));
                startActivity(i);
            }
        });

        findViewById(R.id.btn_openNavtoBilibili).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.bilibili.com"));
                startActivity(i);
            }
        });
    }
}
