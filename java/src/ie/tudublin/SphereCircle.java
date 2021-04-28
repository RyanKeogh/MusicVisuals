package ie.tudublin;


import processing.core.*;
import ryan.RyansVisual;



public class SphereCircle extends Visual {

    
RyansVisual ryansVisual;

public SphereCircle(RyansVisual ryansVisual)
{
    this.ryansVisual= ryansVisual;
}








public void render()
{

    


    for(int i=0;i< ryansVisual.getAudioBuffer().size(); i++)
    {
        //float c = map(i,0,ryansVisual.getAudioBuffer(),0,255);
        //stroke(c,255,255);
      

                 ryansVisual.noFill();
         

         float wave = PApplet.sin(radians(frameCount/2));

         ryansVisual.ellipse(ryansVisual.width/2 + wave * 200 + getSmoothedAmplitude() * 200 , ryansVisual.height/2 + wave * 200,100,100);
         ryansVisual.ellipse(ryansVisual.width/2 - wave * 200 + getSmoothedAmplitude() * 200,ryansVisual. height/2 - wave * 200,100,100);
        
         ryansVisual. ellipse(ryansVisual.width/2 + wave * 200 + getSmoothedAmplitude() * 200, ryansVisual.height/2 - wave * 200,100,100);
         ryansVisual.ellipse(ryansVisual.width/2 - wave * 200 + getSmoothedAmplitude() * 200, ryansVisual.height/2 + wave * 200,100,100);

    }
    ryansVisual.pushMatrix();
    ryansVisual.translate(width/2,height/2);
    ryansVisual.rotate(radians(100));
    ryansVisual.sphere(40);
    ryansVisual.popMatrix();
}
}




