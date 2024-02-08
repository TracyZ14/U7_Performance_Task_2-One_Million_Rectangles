public class Rectangle
{
    private int length;
    private int width;
    private int topLeftXCoordinate;
    private int topLeftYCoordinate;

    public Rectangle(int length, int width, int topLeftXCoordinate, int topLeftYCoordinate)
    {
        this.length = length;
        this.width = width;
        this.topLeftXCoordinate = topLeftXCoordinate;
        this.topLeftYCoordinate = topLeftYCoordinate;
    }

    public Rectangle()
    {
        this.length = (int) (10 + Math.random() * (50 - 10 + 1));
        this.width = (int) (5 + Math.random() * (10 - 5 + 1));
        this.topLeftXCoordinate = (int) (Math.random() * (50 + 1));
        this.topLeftYCoordinate = (int) (Math.random() * (50 + 1));
    }

    public int getLength()
    {
        return length;
    }

    public int getWidth()
    {
        return width;
    }

    public int getTopLeftXCoordinate()
    {
        return topLeftXCoordinate;
    }

    public int getTopLeftYCoordinate()
    {
        return topLeftYCoordinate;
    }

    public boolean isCollidingWith(Rectangle rectangle)
    {
        int rectXMax = this.getTopLeftXCoordinate();
        int rectXMin = this.getTopLeftXCoordinate() - this.getWidth();
        int rectYMax = this.getTopLeftYCoordinate() + this.getLength();
        int rectYMin = this.getTopLeftYCoordinate();
        int rectangleXMax = rectangle.getTopLeftXCoordinate();
        int rectangleXMin = rectangle.getTopLeftXCoordinate() - rectangle.getWidth();
        int rectangleYMax = rectangle.getTopLeftYCoordinate() + rectangle.getLength();
        int rectangleYMin = rectangle.getTopLeftYCoordinate();
        if((rectXMax <= rectangleXMax) && (rectXMax >= rectangleXMin))
        {
            if((rectYMax <= rectangleYMax) && (rectYMax >= rectangleYMin))
            {
                return true;
            }
            if((rectYMin <= rectangleYMax) && (rectYMin >= rectangleYMin))
            {
                return true;
            }
        }
        if((rectXMin <= rectangleXMax) && (rectXMin >= rectangleXMin))
        {
            if((rectYMax <= rectangleYMax) && (rectYMax >= rectangleYMin))
            {
                return true;
            }
            if((rectYMin <= rectangleYMax) && (rectYMin >= rectangleYMin))
            {
                return true;
            }
        }
        return false;
    }
}