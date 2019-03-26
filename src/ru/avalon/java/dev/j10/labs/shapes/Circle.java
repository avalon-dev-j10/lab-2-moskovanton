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
    private float radius;       //Радиус
    private float x;            //Абцисса
    private float y;            //Ордината
    /*
     * TODO: Реализовать класс 'Circle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
    //Метод, возвращающий площадь фигуры
    public float getArea(){
        float area = (float)Math.PI * (float)Math.pow(radius, 2);
        return area;
    }
    //Метод, возвращающий абциссу
    public float getX(){
        return x;
    }
    //Метод, возвращающий ординату
    public float getY(){
        return y;
    }
    //Метод, возвращающий длину элипса
    public float getLength(){
        float length = radius * 2 * (float)Math.PI;
        return length;
    }
    //Метод, возвращающий радиус
    public float getRadius() {
        return radius;
    }

    // Метод, возвращающий тип фигуры
    public String getType(){
        return "Circle";
    }
    // Метод, устанавливающий абциссу
    public void setX(float x) {
        this.x = x;
    }
    // Метод, устанавливающий ординату
    public void setY(float y) {
        this.y = y;
    }
    //Полный конструктор
    public Circle(float radius, float x, float y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }
    //Конструктор без абциссы и ординаты
    public Circle(float radius) {
        this(radius, 0, 0);
    }
    
    /*  TODO (Проверка №1)
        Создай еще конструктор с полным набором параметров (хоть он и не пригодиться)
        а конструктор без координат объяви через конструктор с полными параметрами,
        применяя значения по умолчанию!
    
        Добавить коментарии к полям и методам класса
    */
}
