/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import entity.Circle;
import entity.Rectangle;
import entity.Triangle;

/**
 *
 * @author ADMIN
 */
public class Manager {
    private Rectangle rec;
    private Circle circle;
    private Triangle triangle;

    public Manager() {
        this.rec = new Rectangle();
        this.circle = new Circle();
        this.triangle = new Triangle();
    }

    public void setRec(Rectangle rec) {
        this.rec = rec;
    }

    public Circle getCircle() {
        double area = Math.PI * circle.getRadius() * circle.getRadius();
        double perimeter = Math.PI * 2 * circle.getRadius();
        circle.setArea(area);
        circle.setPerimeter(perimeter); 
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public Triangle getTriangle() {
        if (triangle.getSideA()+triangle.getSideB() > triangle.getSideC()
                || triangle.getSideB()+triangle.getSideC() > triangle.getSideA()
                || triangle.getSideA()+triangle.getSideC() > triangle.getSideB()) {
            
        }
        double perimeter = triangle.getSideA() + triangle.getSideB() + triangle.getSideC();
        triangle.setPerimeter(perimeter);
        double area = Math.sqrt(perimeter*(perimeter - triangle.getSideA())*(perimeter - triangle.getSideB())*(perimeter - triangle.getSideC()));
        triangle.setArea(area); 
        return triangle;
    }

    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }
    
    public Rectangle getRectangle() {
        double area = rec.getWidth() * rec.getLength();
        double perimeter = 2 * (rec.getWidth() + rec.getLength());
        rec.setArea(area);
        rec.setPerimeter(perimeter); 
        return rec;
    }
}
