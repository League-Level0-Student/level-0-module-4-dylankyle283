
PImage donkey;
PImage tail;
void setup(){
  size(750,536);
  donkey = loadImage("Donkey.jpg");
  tail = loadImage("Tail.png");
  tail.resize(200, 0);
}

void draw(){
if( dist(0, 0, mouseX, mouseY) < 30){
   

  background (donkey);
}
if(mousePressed){
  image(tail,mouseX, mouseY);
}
  rect(0,0,30,30);
  rect(630,100,30,30);
  if(mousePressed && dist(630, 100, mouseX, mouseY) < 30){
  println ("you are the weiner");
playDoh();
}
  
}
 void playDoh() {
     doh.stop();
     doh.trigger();
 }

import ddf.minim.*;
Minim minim = new Minim(this); 
AudioSample doh;
AudioSample woohoo;