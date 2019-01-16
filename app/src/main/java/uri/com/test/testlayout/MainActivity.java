package uri.com.test.testlayout;

import android.app.Activity;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.my_tv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TestParameter.isNeedSlowAppInit = true;
                startActivity(new Intent(MainActivity.this, SlowActivity.class));
            }
        });

    }
}
