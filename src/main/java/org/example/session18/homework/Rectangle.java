package org.example.session18.homework;

public class Rectangle {
    /*Implement the equals() and hashCode() methods for a Rectangle class with width and height fields.
    Test that two instances with the same width and height return true for equals() and have the same hash code.*/
    private double width;
    private double height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Rectangle rectangle = (Rectangle) obj;
        return Double.compare(rectangle.width, width) == 0 &&
                Double.compare(rectangle.height, height) == 0;
    }
    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(width);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';

    }
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(5.0, 10.0);
        Rectangle rect2 = new Rectangle(5.0, 10.0);
        Rectangle rect3 = new Rectangle(3.0, 6.0);

        System.out.println("rect1 equals rect2: " + rect1.equals(rect2)); // true
        System.out.println("rect1 equals rect3: " + rect1.equals(rect3)); // false
        System.out.println("rect1 hashCode: " + rect1.hashCode());
        System.out.println("rect2 hashCode: " + rect2.hashCode());
        System.out.println("rect3 hashCode: " + rect3.hashCode());
    }
}
