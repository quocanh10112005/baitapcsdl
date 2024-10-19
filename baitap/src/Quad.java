// Lớp Quad kế thừa từ Shape
class Quad extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Quad");
    }

    @Override
    void erase() {
        System.out.println("Erasing Quad");
    }

    @Override
    void move(int x, int y) {
        System.out.println("Moving Quad to position (" + x + ", " + y + ")");
    }
}
