public class Room {

    float height;
    float width;
    float length;

    public final float areaPerLtr = 6.5f; //assuming 1 litre of paint covers 6.5 square metres

    public Room(float height, float width, float lenth)
    {
        this.height = height;
        this.width = width;
        this.length = lenth;
    }

    public float getHeight()
    {
        return this.height;
    }

    public float getWidth()
    {
        return this.width;
    }

    public float getLength()
    {
        return this.length;
    }
    
    public float areaFloor()
    {
        return length * width;
    }

    public float volumeRoom()
    {
        return length * width * height;
    }

    public float paintRequired()
    {
        return ((2 * length * height) + (2 * width * height)) / areaPerLtr; //first calculates the total surface area of the walls, then divides to find paint required
    }
}
