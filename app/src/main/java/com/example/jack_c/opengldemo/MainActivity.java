package com.example.jack_c.opengldemo;

import android.opengl.GLSurfaceView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.example.jack_c.opengldemo.widget.opengl.render.OpenGLRender;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.supportRequestWindowFeature(Window.FEATURE_NO_TITLE);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        GLSurfaceView surfaceView=new GLSurfaceView(this);

        surfaceView.setRenderer(new OpenGLRender());

        setContentView(surfaceView);


//        setContentView(R.layout.activity_main);
    }
}
