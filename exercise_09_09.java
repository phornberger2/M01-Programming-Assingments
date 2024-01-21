// UML diagram
/**************************************************************
 *                     RegularPolygon                          *
 ***************************************************************
 * -n: int                                                     *
 * -side: double                                               *
 * -x: double                                                  *
 * -y: double                                                  *
 * +RegularPolygon()                                           *
 * +RegularPolygon(n: int, side: double)                       *
 * +RegularPolygon(n: int, side: double, x: double, y: double) *
 * +setN(newN: int)                                            *
 * +setSide(newSide: double)                                   *
 * +setX(newX: double)                                         *
 * +setY(newY: double)                                         *
 * +getN(): int                                                *
 * +getSide(): double                                          *
 * +getX(): double                                             *
 * +getY(): double                                             *
 * +getPerimeter(): double                                     *
 * +getArea(): doulbe                                          *
 **************************************************************/

public class exercise_09_09 {
    // Main method
    public static void main(String[] args) {
        // Create three RegularPolygon objects
        RegularPolygon regularPolygon1 = new RegularPolygon();
        RegularPolygon regularPolygon2 = new RegularPolygon(6, 4);
        RegularPolygon regularPolygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        // Display perimeter and area of each object
        System.out.println("\n--------------------------------------------------");
        System.out.println("| Regular Polygon Objects |  Perimeter  |  Area  |");
        System.out.println("--------------------------------------------------");
        System.out.printf( "|       Object# 1         |%8.2f     |%6.2f  |\n",
                regularPolygon1.getPerimeter(), regularPolygon1.getArea());
        System.out.printf( "|       Object# 2         |%8.2f     |%6.2f  |\n",
                regularPolygon2.getPerimeter(), regularPolygon2.getArea());
        System.out.printf( "|       Object# 3         |%8.2f     |%6.2f  |\n",
                regularPolygon3.getPerimeter(), regularPolygon3.getArea());
        System.out.println("--------------------------------------------------");
    }
}

// Implement RegularPolygon class
class RegularPolygon {
    //Data fields
    private int n;
    private double side;
    private double x;
    private double y;

    // Constructors
    //Creates a regular polygon with default values
    RegularPolygon() {
        n = 3;
        side = 1;
        x = y = 0;
    }

    //Creates a regular polygon with the specified number of sides and length of side, centered at (0, 0)
    RegularPolygon(int newN, double newSide) {
        n = newN;
        side = newSide;
        x = y = 0;
    }

    // creates a regular polygon with the specified number of sides, length of side, and x- and y-coordinates
    RegularPolygon(int newN, double newSide, double newX, double newY) {
        n = newN;
        side = newSide;
        x = newX;
        y = newY;
    }

    // Methods
    // Sets new n
    public void setN(int newN) {
        n = newN;
    }

    // Sets new length of the side
    public void setSide(double newSide) {
        side = newSide;
    }

    // Sets new x-coordinate
    public void setX(double newX) {
        x = newX;
    }

    // Sets new y-coordinate
    public void setY(double newY) {
        y = newY;
    }

    // Returns n
    public int getN() {
        return n;
    }

    // Returns the length of the side
    public double getSide() {
        return side;
    }

    // Returns x-coordinate
    public double getX() {
        return x;
    }

    // Returns y-coordinate
    public double getY() {
        return y;
    }

    // Returns the perimeter of the polygon
    public double getPerimeter() {
        return side * n;
    }

    // Returns the area of the polygon
    public double getArea() {
        return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
    }
}
