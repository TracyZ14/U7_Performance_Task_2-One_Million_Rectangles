import java.util.ArrayList;
public class Main
{
    public static void main(String[] args)
    {
        Rectangle rect = new Rectangle(20, 10, 10, 15);

        ArrayList<Rectangle> oneMillionRectangles = new ArrayList<Rectangle>();
        for(int i = 0; i < 1000000; i++)
        {
            Rectangle rectangle = new Rectangle();
            oneMillionRectangles.add(rectangle);
        }

        int numberOfCollisions = 0;
        for(Rectangle rectangle : oneMillionRectangles)
        {
            if(rectangle.isCollidingWith(rect))
            {
                numberOfCollisions++;
            }
        }

        double percentageCollided = ((double) numberOfCollisions / oneMillionRectangles.size()) * 100;

        System.out.println("The percentage of one million random rectangles that collide with the original rectangle is " + percentageCollided + "%.");
    }
}