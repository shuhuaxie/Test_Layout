package uri.com.test.testlayout;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;


public class MyConstrainLayout extends FrameLayout {
    String TAG = "MyConstrainLayout_" + (getTag() == null ? "" : getTag()) + ":";

    public MyConstrainLayout(Context context) {
        super(context);
        Log.e("xie", TAG + "Construct 1");
    }

    public MyConstrainLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        Log.e("xie", TAG + "Construct 2");
        Log.e("xie", "child:" + getChildCount());
    }

    public MyConstrainLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        Log.e("xie", TAG + "Construct 3");
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        Log.e("xie", TAG + "onLayout start:" + (System.currentTimeMillis() - LiveApp.initTime));
        super.onLayout(changed, left, top, right, bottom);
        Log.e("xie", TAG + "onLayout end:" + (System.currentTimeMillis() - LiveApp.initTime));
        Log.e("xie", "child:" + getChildCount());
    }

    @Override
    protected void onMeasure(int widthSpec, int heightSpec) {
        Log.e("xie", TAG + "onMeasure start:" + (System.currentTimeMillis() - LiveApp.initTime));
        Log.e("xie", TAG + "width size:" + MeasureSpec.getSize(widthSpec));
        Log.e("xie", TAG + "height size:" + MeasureSpec.getSize(heightSpec));
        Log.e("xie", TAG + "width model:" + (MeasureSpec.getMode(widthSpec)>>30));
        Log.e("xie", TAG + "height model:" + (MeasureSpec.getMode(heightSpec)>>30));
        super.onMeasure(widthSpec, heightSpec);
        Log.e("xie", TAG + "onMeasure end:" + (System.currentTimeMillis() - LiveApp.initTime));
    }

    @Override public void onDraw(Canvas c) {
        super.onDraw(c);
        Log.e("xie", TAG + "onDraw");
    }


    @Override
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        super.addView(child, index, params);
        Log.e("xie", TAG + "addView:" + child.getTag() + ":" + child.getClass().getSimpleName());
    }

}
