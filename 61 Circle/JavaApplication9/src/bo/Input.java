/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import entity.Circle;
import entity.Rectangle;
import entity.Triangle;
import utils.Validation;

/**
 *
 * @author ADMIN
 */
public class Input {

    private final Rectangle rec;
    private final Circle circle;
    private final Triangle triangle;

    public Input() {
        this.rec = new Rectangle();
        this.circle = new Circle();
        this.triangle = new Triangle();
    }

    public void addInformation() throws Exception {
        rec.setWidth(Validation.getDouble("Please input side width of Rectangle", "Only a real number!", 0, Double.MAX_VALUE));
        rec.setLength(Validation.getDouble("Please input length of Rectangle", "Only a real number!", 0, Double.MAX_VALUE));

        circle.setRadius(Validation.getDouble("Please input radius of Circle", "Only a real number!", 0, Double.MAX_VALUE));

        triangle.setSideA(Validation.getDouble("Please input side A of Triangle", "Only a real number!", 0, Double.MAX_VALUE));
        triangle.setSideB(Validation.getDouble("Please input side B of Triangle", "Only a real number!", 0, Double.MAX_VALUE));
        triangle.setSideC(Validation.getDouble("Please input side C of Triangle", "Only a real number!", 0, Double.MAX_VALUE));
        if (triangle.getSideA() + triangle.getSideB() > triangle.getSideC()
                && triangle.getSideB() + triangle.getSideC() > triangle.getSideA()
                && triangle.getSideA() + triangle.getSideC() > triangle.getSideB()) {
            return;
        }
        throw new Exception("3 sides of a triangle are invalid");
    }

    public Rectangle getRectangleWithSize() {
        return rec;
    }

    public Circle getCircleWithRadius() {
        return circle;
    }

    public Triangle getTriangleWithSides() {
        return triangle;
    }

}
