PImage minecraft;     //at the top of your program
PImage groan;
void setup(){
  size(243,137);
  groan = loadImage("groan.jpeg");
  minecraft=loadImage("minecraft.png");     //in setup method
  
  
}
void draw(){
  background (groan);
  image(minecraft, mouseX, mouseY);     //in draw method
  
}