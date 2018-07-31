package com.example.jack_c.opengldemo.widget.opengl.render;

import android.opengl.GLSurfaceView;
import android.opengl.GLU;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class OpenGLRender implements GLSurfaceView.Renderer {

    @Override
    public void onSurfaceCreated(GL10 gl, EGLConfig eglConfig) {

        //设置背景颜色（rgba）
        gl.glClearColor(1.0f,0.0f,0.0f,0.5f);

        //设置一个平滑的阴影，默认是不需要的
        gl.glShadeModel(GL10.GL_SMOOTH);

        //深度的buffer设置
        gl.glClearDepthf(1.0f);

        //允许深度探测
        gl.glEnable(GL10.GL_DEPTH_TEST);

        //如何进行深度探测的类型
        gl.glDepthFunc(GL10.GL_LEQUAL);

        //很好的角度计算
        gl.glHint(GL10.GL_PERSPECTIVE_CORRECTION_HINT,GL10.GL_NICEST);




    }

    @Override
    public void onSurfaceChanged(GL10 gl, int width, int height) {

        //为当前view的端口设置一个新的尺寸
        gl.glViewport(0,0,width,height);

        //选择投影矩阵
        gl.glMatrixMode(GL10.GL_PROJECTION);

        //重置投影矩阵
        gl.glLoadIdentity();

        //计算窗口的宽高比
        GLU.gluPerspective(gl,45.0f,(float)width/height,0.1f,100.0f);

        //选择模型view矩阵
        gl.glMatrixMode(GL10.GL_MODELVIEW);

        // 重置模型view矩阵
        gl.glLoadIdentity();




    }

    @Override
    public void onDrawFrame(GL10 gl) {

        //清楚屏幕和深度buffer
        gl.glClear(GL10.GL_COLOR_BUFFER_BIT|GL10.GL_DEPTH_BUFFER_BIT);

    }



}
