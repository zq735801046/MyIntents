package top.zeroyiq.myintents;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.ImageView;

/**
 * Created by  on 2016.10.16.
 * 作者：ZeroyiQ
 * 时间：2016.10.16 15:59
 * 邮箱：
 * 说明：
 */

public class ImageViewer extends Activity {
    private ImageView iv;

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

        iv = new ImageView(this);
        setContentView(iv);

        iv.setImageURI(getIntent().getData());
    }


}
