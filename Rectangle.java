/*
Deepit Raj Sapru 1001522895
INSY 4305/5309 - HW #4
Write a class called Rectangle that maintains two attributes to represent the length and width of a rectangle.
Provide suitable get, set, and toString methods plus two methods that return the perimeter and area of the rectangle.
Include two constructors for this class. One a parameterless constructor that initializes both the length and width to 0,
and the second one that takes two parameters to initialize the length and width.
*/
public class Rectangle {
    private int length, width;

    public Rectangle() {
        length = 0;
        width = 0;
    }

    public Rectangle(int l, int w) {
        setLength(l);
        setWidth(w);
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int l) {
        length = l;
    }

    public void setWidth(int w) {
        width = w;
    }

    public String toString() {
        return "Rectangle Length: " + length + "\n Rectangle Width: " + width;
    }

    public int area(int l, int w) {
        return l * w;
    }

    public int perimeter(int l, int w) {
        return 2 * (l + w);
    }

}