import java.util.Scanner;
class shapes{
        double area(double r){
                return Math.PI*r*r;
        }
        double area(double l,double b){
                return l*b;
        }
        double area(float b,float h){
                return 0.5*b*h;
        }

        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                shapes obj = new shapes();
                System.out.println("Enter radius of circle:");
                double r=sc.nextDouble();
                System.out.println("Area of a circle=" + obj.area(r));
                System.out.println("Enter length and breadth of rectangle:");
                double l=sc.nextDouble();
                double b=sc.nextDouble();
                System.out.println("Area of Rectangle="+obj.area(l,b));
                System.out.println("Enter base and height of Triangle:");
                float base=sc.nextFloat();
                float height=sc.nextFloat();
                System.out.println("Area of triangle="+obj.area(base,height));
        }
}
