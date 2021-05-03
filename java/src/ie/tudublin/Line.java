package ie.tudublin;


import ryan.*;
import processing.core.*;

public class Line extends Vision {


    public Line(RyansVisual rv){
        super(rv);
    }
      

float angle =0;
float[] lerpedBuffer = new float[512];

@Override
public void render() 
{
  
    rv.noFill();
    rv.strokeWeight(20);

    for (int i = 0; i < rv.getAudioBuffer().size(); i++) {

        float c = PApplet.map(i, 0, rv.getAudioBuffer().size() , 0, 255);
       
            rv.stroke(c,255,255);
      
        lerpedBuffer[i] = PApplet.lerp(lerpedBuffer[i], rv.getAudioBuffer().get(i), 0.1f);        
        rv.line(i * 2.5f + 50, rv.height/2 - lerpedBuffer[i] * rv.height/2 * 4, i * 2.5f - 50, rv.height/2 + lerpedBuffer[i] * rv.height/2 * 4);


}

      
    
   
}}








