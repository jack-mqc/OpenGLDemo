package com.example.jack_c.opengldemo.widget.opengl.render;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class MyGLRender extends Shape
{
    Shape shape;

    private Class<? extends Shape> clazz=Cube.class;

    @Override
    public void onSurfaceCreated(GL10 gl10, EGLConfig eglConfig) {

    }

    @Override
    public void onSurfaceChanged(GL10 gl10, int i, int i1) {

    }


    @Override
    public void onDrawFrame(GL10 gl10) {

    }


}
