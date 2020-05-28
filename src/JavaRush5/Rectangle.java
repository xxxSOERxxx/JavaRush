package JavaRush5;

public class Rectangle {
    protected int top, left, width = 0, height = 0;


    public Rectangle(int top, int left, int width, int height)
    {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }public Rectangle(int top, int left)
    {
        this.top = top;
        this.left = left;

    }public Rectangle(int top, int left, int width)
    {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = width;
    }public void initialize(Rectangle rectangle)
    {
        this.top = rectangle.top;
        this.left = rectangle.left;
        this.width = rectangle.height;

    }



    public static void main(String[] args) {

    }
}
