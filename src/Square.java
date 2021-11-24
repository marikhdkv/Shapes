public class Square extends Rectangle
{
    public Square() {}

    public Square(double side)
    {
        this.width = side;
        this.length = side;
    }

    public Square(double side, String color, boolean filled)
    {
        super(side, side, color, filled);
    }

    public double getSide() { return (width + length) / 2; }
    public void setSide(double side)
    {
        this.width = side;
        this.length = side;
    }

    @Override
    public void setWidth(double width) { setSide(width); }

    @Override
    public void setLength(double length) { setSide(length); }

    @Override
    public String toString()
    {
        return "Rectangle{side= " + (width + length) / 2 + ", width=" + width + ", length=" + length + ", color='" + color + '\'' +", filled=" + filled +'}';
    }
}