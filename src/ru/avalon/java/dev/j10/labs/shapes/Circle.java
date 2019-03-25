package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление об окружности.
 * <p>
 * Окру́жность — замкнутая плоская кривая, которая состоит из
 * всех точек на плоскости, равноудалённых от заданной точки.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9E%D0%BA%D1%80%D1%83%D0%B6%D0%BD%D0%BE%D1%81%D1%82%D1%8C">Окружность</a>
 */
public class Circle implements Shape, Point, Ellipse {
    private float radius;
    private float x;
    private float y;
    /*
     * TODO: Реализовать класс 'Circle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
    public float getArea(){
        float area = (float)Math.PI * (float)Math.pow(radius, 2);
        return area;
    }
    
    public float getX(){
        return x;
    }
    
    public float getY(){
        return y;
    }
    
    public float getLength(){
        float length = radius * 2 * (float)Math.PI;
        return length;
    }

    public float getRadius() {
        return radius;
    }
    
    public String getType(){
        return "Circle";
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
         
    public Circle(float radius) {
        this.radius = radius;
    }
     
}
