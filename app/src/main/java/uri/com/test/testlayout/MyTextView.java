package uri.com.test.testlayout;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MyTextView extends TextView {
    String TAG = "MyTextView:" + getTag();

    public MyTextView(Context context) {
        super(context);
        Log.e("xie", TAG + "Construct 1");
    }

    public MyTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Log.e("xie", TAG + "Construct 2");
    }

    public MyTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        Log.e("xie", TAG + "Construct 3");
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        Log.e("xie", TAG + "onLayout start:" + (System.currentTimeMillis() - LiveApp.initTime));
        super.onLayout(changed, left, top, right, bottom);
        if(TestParameter.isNeedSlowAppInit) {
            try {
                Thread.currentThread().sleep(10 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Log.e("xie", TAG + "onLayout end:" + (System.currentTimeMillis() - LiveApp.initTime));
    }

    @Override
    protected void onMeasure(int widthSpec, int heightSpec) {
        Log.e("xie", TAG + "onMeasure start:" + (System.currentTimeMillis() - LiveApp.initTime));
        super.onMeasure(widthSpec, heightSpec);
        Log.e("xie", TAG + "onMeasure end:" + (System.currentTimeMillis() - LiveApp.initTime));
    }

    @Override
    public void onDraw(Canvas c) {
        super.onDraw(c);
        Log.e("xie", TAG + "onDraw1");
        if(TestParameter.isNeedSlowAppInit) {
            try {
                Thread.currentThread().sleep(20 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Log.e("xie", TAG + "onDraw2");
    }

}
