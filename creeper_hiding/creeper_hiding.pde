int creepX = 980;
int creepY = 0;
PImage creeper;     //at the top of your program
void setup(){
size(1000,667);  
  PImage minecraft = loadImage("green.jpeg");     //in setup method
minecraft.resize(width, height);          //in setup method
background(minecraft);          //in setup method
  creeper=loadImage("creeper.png"); 
creeper.resize(20, 20); 


}




void draw(){
  image(creeper, creepX, creepY);     //in draw method
  if(mousePressed){
  fill(254,0,0);
    ellipse(mouseX,mouseY,20,20);
  }
    if(dist(creepX, creepY, mouseX, mouseY) < 30){
      fill(0,255,0);
      ellipse(mouseX,mouseY,20,20);
    }
    if(dist(creepX, creepY, mouseX, mouseY) < 5){
    println("you win");
    creepX = creepY;
    creepY = creepY + 30;
  }
  
  
}