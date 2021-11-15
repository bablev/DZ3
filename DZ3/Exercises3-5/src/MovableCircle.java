public class MovableCircle extends MovablePoint {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.radius = radius;
    }
    public String toString(){
        return "MovableCircle, x: "+this.x+", y: "+this.y+", xSpeed: "+this.xSpeed+", ySpeed: "+this.ySpeed+"";
    }
    public void moveUp(){
        x += xSpeed;
    }
    public void moveRight(){
        x += ySpeed;
    }   public void moveDown(){
        x -= xSpeed;
    }
    public void moveLeft(){
        x -= ySpeed;
    }


}
