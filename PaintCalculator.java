import java.util.Scanner;

public class PaintCalculator {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        float roomLength = 0f;
        float roomWidth = 0f;
        float roomHeight = 0f;

        System.out.print("Enter room length: ");
        roomLength = sc.nextFloat();
        System.out.println("");

        System.out.print("Enter room width: ");
        roomWidth = sc.nextFloat();
        System.out.println("");

        System.out.print("Enter room height: ");
        roomHeight = sc.nextFloat();
        System.out.println("");

        sc.close();
        
        Room room = new Room(roomHeight, roomWidth, roomLength);

        System.out.println("Floor area: " + room.areaFloor() + " metres squared");
        System.out.printf("Paint required: %.2f litres\n", room.paintRequired());
        System.out.println("Room volume: " + room.volumeRoom() + " metres cubed");
        
    }
}
