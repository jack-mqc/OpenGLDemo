package com.example.jack_c.opengldemo.widget.opengl.render;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.view.View;

public abstract class Shape implements GLSurfaceView.Renderer {

    protected View mView;

    public int loadShader(int type,String shaderCode)
    {
        int shader= GLES20.glCreateShader(type);

        GLES20.glShaderSource(shader,shaderCode);
        GLES20.glCompileShader(shader);

        return shader;

    }


}
