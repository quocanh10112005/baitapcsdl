// Lớp Rectangle kế thừa từ Quad
class Rectangle extends Quad {
    @Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }

    @Override
    void erase() {
        System.out.println("Erasing Rectangle");
    }

    @Override
    void move(int x, int y) {
        System.out.println("Moving Rectangle to position (" + x + ", " + y + ")");
    }
}
