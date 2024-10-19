
// Lớp Circle kế thừa từ Shape
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    void erase() {
        System.out.println("Erasing Circle");
    }

    @Override
    void move(int x, int y) {
        System.out.println("Moving Circle to position (" + x + ", " + y + ")");
    }
}