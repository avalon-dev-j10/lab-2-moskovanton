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
    private float baseA;        //Основание А
    private float sideB;        //Сторона В
    private float sideC;        //Сторона С
    private float heightH;      //Высота треугольника
    private float x;            //Абцисса
    private float y;            //Ордината
    private int rotation;       //Угол поворота
    /*
     * TODO: Реализовать класс 'Triangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
    //Метод, возвращающий площадь фигуры
    public float getArea(){
        return baseA / 2 * heightH;
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
        return baseA + sideB + sideC;
    }
    //Метод, возвращающий основание А фигуры
    public float getBaseA() {
        return baseA;
    }
    //Метод, возвращающий сторону В фигуры
    public float getSideB() {
        return sideB;
    }
    //Метод, возвращающий сторону С фигуры
    public float getSideC() {
        return sideC;
    }
    //Метод, возвращающий высоту Н треугольника
    public float getHeightH() {
        return heightH;
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
    public Triangle(float baseA, float sideB, float sideC, float heightH, float x, float y, int rotation) {
        this.baseA = baseA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.heightH = heightH;
        this.x = x;
        this.y = y;
        this.rotation = rotation;
    }
    //Конструктор без координат и угла поворота
    public Triangle(float baseA, float sideB, float sideC, float heightH) {
        this(baseA, sideB, sideC, heightH, 0, 0, 0);
    }
    
    /*  TODO (Проверка №1)
        Создай еще конструктор с полным набором параметров (хоть он и не пригодиться)
        а конструктор без координат объяви через конструктор с полными параметрами,
        применяя значения по умолчанию!
    
        Добавить коментарии к полям и методам класса
    */
}
