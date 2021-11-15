public class MovablePoint implements Movable {
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    public MovablePoint(){

    }
    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public String toString(){
        return "MovablePoint, x: "+this.x+", y: "+this.y+", xSpeed: "+this.xSpeed+", ySpeed: "+this.ySpeed+"";
    }
    public void moveUp(){
        x += xSpeed;
    }
    public void moveDown(){
        x -= xSpeed;
    }
    public void moveLeft(){
        x -= ySpeed;
    }
    public void moveRight(){
        x += ySpeed;
    }

}
