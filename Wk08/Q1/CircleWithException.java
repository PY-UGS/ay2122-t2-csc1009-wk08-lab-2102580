public class CircleWithException{

    private double radius;

    public void setRadius(double r){

        if(r < 0) {
            throw new IllegalArgumentException("Radius entered is not a positive number!");
        }
        else{
            this.radius = r;
        }
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() throws Exception{

        double area;
        area = radius * radius * Math.PI;
        if(area > 1000){
            throw new Exception("Area is bigger than 1000!");
        }
        else{
            return area;
        }
    }

    public double getDiameter(){
        double diameter;
        diameter = radius * 2;
        return diameter;
    }

}