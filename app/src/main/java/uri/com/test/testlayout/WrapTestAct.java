package uri.com.test.testlayout;

import android.os.Bundle;
import android.app.Activity;
import android.os.Handler;
import android.util.Log;
import android.widget.FrameLayout;

import java.lang.reflect.Field;

public class WrapTestAct extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO 减少Layout次数
        new Handler().postDelayed(new Runnable() {
            @Override public void run() {
                setContentView(R.layout.activity_wrap_text);
            }
        }, 1000);
        // 1256->1304 如果不等1s // 48
        // 1304->1304
        FrameLayout dv = (FrameLayout) getWindow().getDecorView();
//        dv.
        try {
            Field field = getWindow().getDecorView().getClass().getDeclaredField("DEBUG_MEASURE");
            field.setAccessible(true);
            field.setBoolean(getWindow().getDecorView(), true);
        } catch (Exception e) {
            Log.e("xie", "e:" + e.getMessage());
        }
        Log.e("xie", "window:" + getWindow().getClass().getSimpleName());
        Log.e("xie", "decorView:" + getWindow().getDecorView().getClass().getSimpleName());
        // 1. 从 DoctorView 开始都是2次?
        //PhoneWindow
        //DecorView

    }

}
