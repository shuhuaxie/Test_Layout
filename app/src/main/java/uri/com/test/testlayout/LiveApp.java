package uri.com.test.testlayout;

import android.app.Application;
import android.util.Log;

import static uri.com.test.testlayout.TestParameter.isNeedSlowAppInit;

public class LiveApp extends Application {
    public static long initTime;

    @Override
    public void onCreate() {
        initTime = System.currentTimeMillis();
        if (isNeedSlowAppInit) {
            try {
                Thread.currentThread().sleep(10 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Log.e("xie", "onCreate end 1:");
        }

        super.onCreate();
        if (isNeedSlowAppInit) {
            try {
                Thread.currentThread().sleep(10 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Log.e("xie", "onCreate end 2:");
        }
    }
}
