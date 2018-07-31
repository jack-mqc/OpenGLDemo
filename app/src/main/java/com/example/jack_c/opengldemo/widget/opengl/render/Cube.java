package com.example.jack_c.opengldemo.widget.opengl.render;

import android.opengl.GLES20;
import android.opengl.Matrix;

import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/**
 *立方体
 * */
public class Cube extends Shape {

    private FloatBuffer vertexButter,colorBuffer;

    private ShortBuffer indexBuffer;

    private final String vertexShaderCode=
            "attribute vec4 vPosition;" +
                    "uniform mat4 vMatrix";


    private float[] mViewMatrix=new float[16];
    private float[] mProjectMatrix=new float[16];
    private float[] mMVPMatrix=new float[16];



    @Override
    public void onSurfaceCreated(GL10 gl10, EGLConfig eglConfig) {

        //开启深度测试
        GLES20.glEnable(GLES20.GL_DEPTH_TEST);

    }

    @Override
    public void onSurfaceChanged(GL10 gl10, int width, int height) {

        //计算宽高比
        float ratio=(float) width/height;

        //设置透视投影
        Matrix.frustumM(mProjectMatrix,0,-ratio,ratio,-1,1,3,20);


        //设置相机位置
       // Matrix.setLookAtM(mViewMatrix,0,5.0,);

    }

    @Override
    public void onDrawFrame(GL10 gl10) {

    }



















}
