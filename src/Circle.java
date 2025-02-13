import static java.lang.Math.pow;

public class Circle {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public static void main(String[] args){

        Circle circle = new Circle(3);

        circle.getArea();
        circle.getCircumference();
        circle.print();

        circle.resize(2);

        circle.getArea();
        circle.getCircumference();
        circle.print();


    }

    public double getCircumference(){
        return 2*Math.PI*radius;
    }

    public double getArea(){
        return Math.PI*pow(radius,2.0);
    }

    public void resize(double factor){
        radius*=factor;
    }

    public void print(){
        System.out.println("radius=" + radius + " Circumference=" + getCircumference() + " Area=" + getArea());
    }


}
