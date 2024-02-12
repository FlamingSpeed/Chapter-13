package org.hillcrest.chapter13.a;

public class Triangle {
    private int width;

    public Triangle(int width){
        this.width = width;
    }

    public int getArea(){
        //Terminating condition: Is when we are finished with recursion
        if(width <= 0){
            return 0;
        }
        if(width == 1){
            return 1;
        }
        var smallerTriangle = new Triangle(width - 1);
        //recursive call
        int smallerArea = smallerTriangle.getArea();
        return smallerArea + width;
    }
}