package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о треугольнике.
 * <p>
 * Треуго́льник (в евклидовом пространстве) — геометрическая
 * фигура, образованная тремя отрезками, которые соединяют
 * три точки, не лежащие на одной прямой. Указанные три
 * точки называются вершинами треугольника, а отрезки —
 * сторонами треугольника. Часть плоскости, ограниченная
 * сторонами, называется внутренностью треугольника: нередко
 * треугольник рассматривается вместе со своей внутренностью
 * (например, для определения понятия площади).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A2%D1%80%D0%B5%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Треугольник</a>
 */
public class Triangle implements Shape, Point, Polygon {
    private float baseA;
    private float sideB;
    private float sideC;
    private float heightH;
    private float x;
    private float y;
    private int rotation;
    /*
     * TODO: Реализовать класс 'Triangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
    
    public float getArea(){
        return baseA / 2 * heightH;
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
        return baseA + sideB + sideC;
    }

    public float getBaseA() {
        return baseA;
    }

    public float getSideB() {
        return sideB;
    }

    public float getSideC() {
        return sideC;
    }

    public float getHeightH() {
        return heightH;
    }
    
    public String getType(){
        return "Triangle";
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
    
    public Triangle(float baseA, float sideB, float sideC, float heightH) {
        this.baseA = baseA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.heightH = heightH;
    }
    
}
