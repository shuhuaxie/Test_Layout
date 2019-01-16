package uri.com.test.testlayout;

import android.os.Bundle;
import android.app.Activity;

public class SlowActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slow);

    }

}
