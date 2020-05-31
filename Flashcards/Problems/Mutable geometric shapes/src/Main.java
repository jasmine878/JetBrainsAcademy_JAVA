import java.util.Scanner;

interface Movable {

    void move(float dx, float dy);
}

interface Scalable {

    void scale(float factor);
}

interface MutableShape extends Movable, Scalable {

}

final class Circle implements MutableShape {

    /**
     * Defines the horizontal position of the center of the circle
     */
    private float centerX;

    /**
     * Defines the vertical position of the center of the circle
     */
    private float centerY;

    /**
     * Defines the radius of the circle
     */
    private float radius;

    public Circle(float centerX, float centerY, float radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public float getCenterX() {
        return centerX;
    }

    public float getCenterY() {
        return centerY;
    }

    public float getRadius() {
        return radius;
    }

    public void move(float dx, float dy) {
        centerX += dx;
        centerY += dy;
    }

    public void scale(float factor) {
        radius *= factor;
    }
}

final class Rectangle implements MutableShape{

    /**
     * Defines the X coordinate of the upper-left corner of the rectangle.
     */
    private float x;

    /**
     * Defines the Y coordinate of the upper-left corner of the rectangle.
     */
    private float y;

    /**
     * Defines the width of the rectangle.
     */
    private float width;

    /**
     * Defines the height of the rectangle.
     */
    private float height;

    public Rectangle(float x, float y, float w, float h) {
        this.x = x;
        this.y = y;
        this.width = w;
        this.height = h;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

//    public void setX(float dx) {
//        this.x += dx;
//    }
//
//    public void setY(float dy) {
//        this.y += dy;
//    }
//
//    public void setWidth(float factor) {
//        this.width *= factor;
//    }
//
//    public void setHeight(float factor) {
//        this.height *= factor;
//    }

    public void move(float dx, float dy) {
        x += dx;
        y += dy;
    }

    public void scale(float factor) {
        width *= factor;
        height *= factor;
    }
}