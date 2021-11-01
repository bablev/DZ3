public class Square extends Rectangle {
    protected double side;
    public Square(){
        side = 1;
    }
    public Square(double side){
        this.side = side;
    }
    public Square(double side, String color, boolean filled){
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public void setWidth(double side){
        this.width = side;
    }
    public void setLength(double side){
        this.length = side;
    }
    @Override
    public String toString(){
        return "Shape: Square, width: "+this.width+", length: "+this.length+", side: "+this.side+", color: "+this.color+"";
    }
}
