package liskovSubstitutionPrincipale;

public class Demo {

    static void useIt(Rectangle r) {
        int width = r.width;
        r.setHeight(10);
        System.out.println("Expected area of " + (width * 10) + ", got " + r.getArea());
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 3);
        useIt(rectangle);

        Rectangle r = new Square();
        r.setWidth(5);
        useIt(r);
    }
}
