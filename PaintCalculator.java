import java.util.Scanner;

public class PaintCalculator {
    
    public final float paintPerSqMtr = 6.5f;

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        float roomLength = 0f;
        float roomWidth = 0f;
        float roomHeight = 0f;

        System.out.print("Enter room length");
        roomLength = sc.nextFloat();
        System.out.println("");

        System.out.print("Enter room width");
        roomWidth = sc.nextFloat();
        System.out.println("");

        System.out.print("Enter room height");
        roomHeight = sc.nextFloat();
        System.out.println("");

    }


    float areaFloor(float length, float width)
    {
        return length * width;
    }

    float volumeRoom(float length, float width, float height)
    {
        return lenth * width * height;
    }

    String paintRequired(float length, float width, float height)
    {
        return ((2 * length * height) + (2 * width * height)) / paintPerSqMtr + "litres.";
    }
}
