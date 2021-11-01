public class Main {
    public static void main(String[] args){
        Shape s1 = new Circle(5.5, "RED", false);

        System.out.println(s1); // получим результат переопределенного метода toString().
        System.out.println(s1.getArea());  // получим результат переопределенного метода класса Circle, так как мы апкстаимся к родительскому классу Circle(Полиморфизм).
        System.out.println(s1.getPerimeter()); // так же как и с getArea().
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        System.out.println(s1.getRadius()); // Получаем ошибку, так как в родительском классе Shape нету такого абстрактного или обычного метода.

        Circle c1 = (Circle)s1;
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius()); // тут мы уже не получаем ошибку, так как мы сделали DownCast к Circle.

        Shape s2 = new Shape(); // Получаем ошибку, потому что нельзя создавать экземпляры абстрактного класса.

        Shape s3 = new Rectangle(1.0, 2.0, "RED", false);

        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        System.out.println(s3.getLength()); // получаем ошибку, потому мы апкастимся к родительскому классу Shape ...
                                            // в котором нету такого метода.

        Rectangle r1 = (Rectangle)s3;

        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength()); // тут мы уже не получаем ошибку, потому что даункастимся к Rectangle

        Shape s4 = new Square(6.6);

        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        System.out.println(s4.getSide()); // получаем ошибку, потому мы апкастимся к родительскому классу Shape ...
        // в котором нету такого метода.
    }
}
