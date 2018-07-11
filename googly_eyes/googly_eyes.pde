void setup(){
size(600,500);



}

void draw(){
if(mouseX <= 100){
  mouseX = 101;
  
}
if (mouseX >= 200){
  mouseX = 199;
}
  if(mouseY <=215){
    mouseY = 216;
  }
  if(mouseY >= 300){
    mouseY = 299;
  }
  fill(#FFFFFF);
  ellipse(150,250,200,150);
  ellipse(450,250,200,150);

fill(0);
  ellipse(mouseX ,mouseY,75,75);
  ellipse(mouseX + 300 ,mouseY ,75,75);

  
}