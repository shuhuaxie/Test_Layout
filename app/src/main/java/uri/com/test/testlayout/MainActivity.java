package uri.com.test.testlayout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        findViewById(R.id.slow_tv).setOnClickListener(this);
        findViewById(R.id.wrap_test_tv).setOnClickListener(this);

        startActivity(new Intent(MainActivity.this, WrapTestAct.class));
    }

    @Override
    public void onClick(View v) {
        TestParameter.isNeedSlowAppInit = false;
        switch (v.getId()){
            case R.id.slow_tv:
                TestParameter.isNeedSlowAppInit = true;
                startActivity(new Intent(MainActivity.this, SlowActivity.class));
                break;
            case R.id.wrap_test_tv:
                startActivity(new Intent(MainActivity.this, WrapTestAct.class));
                break;
        }
    }
}
