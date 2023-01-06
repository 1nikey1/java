public class LineTest {
    public static void main(String[] args) {
        Point p1, p2;
        p1 = new Point(2, 3);
        p2 = new Point(7, 9);
        Line l1, l2;
        Line.width = 3;
        l1 = new Line(p1, p2, 1);
        l1.show();
        l2 = new Line(1, 2, 3, 4, 5);
        l2.show();
    }
}

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Line {
    Point p1, p2;
    int color;
    static int width;

    Line(Point p1, Point p2, int color) {
        this.p1 = p1;
        this.p2 = p2;
        this.color = color;
    }

    Line(int x1, int y1, int x2, int y2, int color) {
        p1 = new Point(x1, y1);
        p2 = new Point(x2, y2);
        this.color = color;
    }

    void show() {
        System.out.println("?????????" + p1.x + "??" + p1.y +
                "?????" + p2.x + "??" + p2.y + "????????" + color + "??????" + Line.width);
    }
}
