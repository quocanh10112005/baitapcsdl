// Lớp Triangle kế thừa từ Shape
class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Triangle");
    }

    @Override
    void erase() {
        System.out.println("Erasing Triangle");
    }

    @Override
    void move(int x, int y) {
        System.out.println("Moving Triangle to position (" + x + ", " + y + ")");
    }
}