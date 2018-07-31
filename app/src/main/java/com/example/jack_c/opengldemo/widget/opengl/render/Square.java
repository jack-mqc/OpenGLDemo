package com.example.jack_c.opengldemo.widget.opengl.render;

import java.nio.ByteBuffer;
import java.nio.ShortBuffer;

public class Square {

    //顶点
    private float vertices[]={
            -1.0f,1.0f,0.0f,//top left
            -1.0f,-1.0f,0.0f,//bottom left
            1.0f,-1.0f,0.0f,//bottom right
            1.0f,1.0f,0.0f//top right
    };

    //链接方式
    private short[] indices={0,1,2,0,2,3};

    //顶点buffer
    private ShortBuffer vertexBuffer;

    //索引buffer
    private ShortBuffer indexBuffer;

    public Square()
    {
        //因为float类型是4个字节，所以需要vertices的长度*4
        ByteBuffer vbb=ByteBuffer.allocateDirect(vertices.length*4);



    }



}
