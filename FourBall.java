package com.example.ball;

import processing.core.PApplet;


public class FourBall extends PApplet{

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 100;
    int x=0;
    public static void main(String[] args) {
        PApplet.main("FourBall", args);
    }


    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw(){

        for(int speed=1;speed<=4;speed++){
            Ball b=new Ball(x*speed,(HEIGHT*speed)/5,DIAMETER);
            b.display();
        }
        x++;
    }
}


