public abstract class Shape
{
    protected String color;
    protected boolean filled;

    protected Shape()
    {
        color = "white";
        filled = false;
    }

    protected Shape(String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }

    protected String getColor() { return color; }
    protected void setColor(String color) { this.color = color; }

    protected boolean isFilled() { return filled; }
    protected void setFilled(boolean filled) { this.filled = filled; }

    abstract double getArea();
    abstract double getPerimeter();

    @Override
    public String toString()
    {
        return "Shape{color='" + color + '\'' +", filled=" + filled + '}';
    }
}