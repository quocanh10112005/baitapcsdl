// Lớp Polygon kế thừa từ Shape
class Polygon extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Polygon");
    }

    @Override
    void erase() {
        System.out.println("Erasing Polygon");
    }

    @Override
    void move(int x, int y) {
        System.out.println("Moving Polygon to position (" + x + ", " + y + ")");
    }
}
