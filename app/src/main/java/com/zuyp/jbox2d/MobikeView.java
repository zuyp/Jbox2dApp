package com.zuyp.jbox2d;


import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/**
 * Created by zuyp on 2017/8/16
 * Thanks for kimi
 */

public class MobikeView extends FrameLayout {

    private Mobike mMobike;

    public MobikeView(Context context) {
        this(context,null);
    }

    public MobikeView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setWillNotDraw(false);
        mMobike = new Mobike(this);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        mMobike.onSizeChanged(w,h);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        mMobike.onLayout(changed);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mMobike.onDraw(canvas);
    }

    public Mobike getmMobike(){
        return this.mMobike;
    }
}
