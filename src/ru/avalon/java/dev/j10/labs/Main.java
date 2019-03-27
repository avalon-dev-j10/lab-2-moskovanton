public class Main {
    /**
     * Метод, находящий в массиве 'shapes' фигуру
     * с максимальной площадью.
     */
    static void maxArea(Shape shapes[]) {
        System.out.println("------------------------------------------------");
        int maxIndex = 0;
        for(int i = 0; i < shapes.length - 1; i++){
            if(shapes[maxIndex].getArea() < shapes[i+1].getArea()) maxIndex = i+1;
        }
        System.out.println(maxIndex+1 + ". " + shapes[maxIndex].getType() + ", MAX S = " + shapes[maxIndex].getArea());  
    }

    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];

        /*
         * TODO: Выполнить действия над массивом 'shapes'
         *
         * 1. Проинициализировать переменную 'shapes' массивом
         *    содержащим 10 произвольных фигур. Массив должен
         *    содержать экземпляры классов Circle, Rectangle
         *    и Triangle.
         *
         * 2. Найти в массиве 'shapes' фигуру с максимальной
         *    площадью. Для поиска фигуры необходимо создать
         *    статический метод в текущем классе (Main).
         */
        
        shapes[0] = new Circle(10);
        shapes[1] = new Rectangle(10, 6);
        shapes[2] = new Triangle(3, 4, 5);
        shapes[3] = new Circle(7);
        shapes[4] = new Rectangle(35, 11.4f);
        shapes[5] = new Triangle(4, 5, 2);
        shapes[6] = new Circle(2.3f);
        shapes[7] = new Rectangle(8, 4);
        shapes[8] = new Triangle(5, 6, 4);
        shapes[9] = new Circle(8.1f);
        
        for(int i = 0; i < shapes.length; i++){
            System.out.println(i+1 + ". " + shapes[i].getType() + ", S = " + shapes[i].getArea());
        }
        
        maxArea(shapes);
    }
}
