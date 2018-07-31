package com.example.jack_c.opengldemo.widget.opengl.view;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;

public class MyGLSurfaceView extends GLSurfaceView {



    public MyGLSurfaceView(Context context, AttributeSet attrs) {
        super(context, attrs);

        init();

    }

    private void init() {

        //设置客户端版本
        setEGLContextClientVersion(2);



        //setRenderer();

    }





























}
