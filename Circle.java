package testingisdone;



class Circle {
    
    double radius;
    String color;
    double circumference;
    
    
     public Circle() { 
    }
    
    
    public Circle(double r) {  
       radius = r;
       color = "red";
    }
    
   
    public double getRadius() {
      return radius; 
    }
    
    public double getArea() {
       return (radius*radius)*Math.PI;
    }
    public double getCircumference() {
        return 2*Math.PI*radius;
    }

   
}
 