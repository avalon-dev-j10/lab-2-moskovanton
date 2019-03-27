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
    private float sideA;        //Основание А
    private float sideB;        //Сторона В
    private float sideC;        //Сторона С
    private float x;            //Абцисса
    private float y;            //Ордината
    private int rotation;       //Угол поворота
    
    /*  TODO (Проверка №2)
        - поле heightH - зависит от 3 сторон треугольника, его всегда можно
        вычислить, зная только 3 стороны треугольника. Если ты его задаешь наугад,
        то оно может не соответствовать действительности на плоскости.
        - Убрать лишнее поле heightH, его методы, площадь треугольника выполнить
        по формуле Герона!
    
    */
    
    /*
     * TODO: Реализовать класс 'Triangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
    //Метод, возвращающий площадь фигуры
    public float getArea(){
        return (float)Math.sqrt((getPerimeter()/2) * ((getPerimeter()/2) - sideA) * ((getPerimeter()/2) - sideB) * ((getPerimeter()/2) - sideC));
    }
    //Метод, возвращающий угол поворота фигуры
    public int getRotation(){
        return rotation;
    }
    //Метод, возвращающий абциссу
    public float getX(){
        return x;
    }
    //Метод, возвращающий ординату
    public float getY(){
        return y;
    }
    //Метод, возвращающий периметр фигуры
    public float getPerimeter(){
        return sideA + sideB + sideC;
    }
    //Метод, возвращающий основание А фигуры
    public float getBaseA() {
        return sideA;
    }
    //Метод, возвращающий сторону В фигуры
    public float getSideB() {
        return sideB;
    }
    //Метод, возвращающий сторону С фигуры
    public float getSideC() {
        return sideC;
    }
    //Метод, возвращающий тип фигуры
    public String getType(){
        return "Triangle";
    }
    // Метод, устанавливающий абциссу
    public void setX(float x) {
        this.x = x;
    }
    // Метод, устанавливающий ординату
    public void setY(float y) {
        this.y = y;
    }
    // Метод, устанавливающий угол поворота
    public void setRotation(int rotation) {
        this.rotation = rotation;
    }
    //Полный конструктор
    public Triangle(float sideA, float sideB, float sideC, float x, float y, int rotation) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.x = x;
        this.y = y;
        this.rotation = rotation;
    }
    //Конструктор без координат и угла поворота
    public Triangle(float sideA, float sideB, float sideC) {
        this(sideA, sideB, sideC, 0, 0, 0);
    }
    
    /*  TODO (Проверка №1)
        Создай еще конструктор с полным набором параметров (хоть он и не пригодиться)
        а конструктор без координат объяви через конструктор с полными параметрами,
        применяя значения по умолчанию!
    
        Добавить коментарии к полям и методам класса
    */
}
