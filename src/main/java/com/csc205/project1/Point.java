// Benjamin Smith
// 9/15/2022
// Project: Lets Get to the Point
// Professor Ray Hedgecock

package com.csc205.project1;

public class Point {

    private double x;
    private double y;

    public Point(double x1, double y1) {
    x = x1;
    y = y1;
    }

    public Point() {
        x = 0;
        y = 0;
    }

    public void setPoint(double x1, double y1){
        x = x1;
        y = y1;
    }

    public void setX(double x1){
        x = x1;
    }

    public void setY(double y1){
        y = y1;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Point{");
        sb.append("x=").append(x);
        sb.append(", y=").append(y);
        sb.append('}');
        return sb.toString();
    }

    public void shiftX(double n){
        x = x+n;
    }

    public void shiftY(double n){
        y = y+n;
    }

    public void rotate(double angle){
        x = (x * Math.cos(angle)) - (y * Math.sin(angle));
        y = (x * Math.sin(angle)) + (y * Math.cos(angle));
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    // distance formula (distance = sqrt((x2-x1)^2 + (y2-y1)^2)
    public double distance(Point p2){
        double answer;
        answer = Math.sqrt(((p2.x-x)*(p2.x-x)) + ((p2.y-y)*(p2.y-x)));
        return answer;
    }
}

/*
Expected Output:

Project 1 : Point Tester

Point 1: Point{x = 3.0, y = 1.0}
Point 2: Point{x = 6.0, y = 5.0}

Distance: 5.0

Rotated a 1.5707963267948966: Point{x = -0.9999999999999998, y = -0.9999999999999997}
Shifted b 4.47213595499958 away from original position: Point{x = 10.0, y = 3.0}
 */

/*
My output:

Project 1 : Point Tester

Point 1: Point{x=3.0, y=1.0}
Point 2: Point{x=6.0, y=5.0}

Distance: 4.123105625617661

Rotated a 1.5707963267948966: Point{x=-0.9999999999999998, y=-0.9999999999999997}
Shifted b 2.449489742783178 away from original position: Point{x=10.0, y=3.0}
 */