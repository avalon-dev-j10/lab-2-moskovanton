package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о прямоугольнике.
 * <p>
 * Прямоугольник — четырехугольник, у которого все углы
 * прямые (равны 90 градусам).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D1%8F%D0%BC%D0%BE%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Прямоугольник</a>
 */
public class Rectangle implements Shape, Point, Polygon {
    private float sideA;
    private float sideB;
    private float x;
    private float y;
    private int rotation;
    /*
     * TODO: Реализовать класс 'Rectangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
    public float getArea(){
        return sideA * sideB;
    }
    
    public int getRotation(){
        return rotation;
    }
    
    public float getX(){
        return x;
    }
    
    public float getY(){
        return y;
    }
    
    public float getPerimeter(){
        return 2 * (sideA + sideB);
    }

    public float getSideA() {
        return sideA;
    }

    public float getSideB() {
        return sideB;
    }
    
    public String getType(){
        return "Rectangle";
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setRotation(int rotation) {
        this.rotation = rotation;
    }     
      
    public Rectangle(float sideA, float sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }
         
}
