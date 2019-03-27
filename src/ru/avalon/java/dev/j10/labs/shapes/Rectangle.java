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
    private float sideA;        //Сторона А
    private float sideB;        //Сторона В
    private float x;            //Абцисса
    private float y;            //Ордината
    private int rotation;       //Угол поворота
    /*
     * TODO: Реализовать класс 'Rectangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
    //Метод, возвращающий площадь фигуры
    public float getArea(){
        return sideA * sideB;
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
        return 2 * (sideA + sideB);
    }
    //Метод, возвращающий сторону А фигуры
    public float getSideA() {
        return sideA;
    }
    //Метод, возвращающий сторону В фигуры
    public float getSideB() {
        return sideB;
    }
    //Метод, возвращающий тип фигуры
    public String getType(){
        return "Rectangle";
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
    public Rectangle(float sideA, float sideB, float x, float y, int rotation) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.x = x;
        this.y = y;
        this.rotation = rotation;
    }
    //Конструктор без координат и угла поворота
    public Rectangle(float sideA, float sideB) {
        this(sideA, sideB, 0, 0, 0);
    }
    
    /*  TODO (Проверка №1)
        Создай еще конструктор с полным набором параметров (хоть он и не пригодиться)
        а конструктор без координат объяви через конструктор с полными параметрами,
        применяя значения по умолчанию!
    
        Добавить коментарии к полям и методам класса
    */
}
