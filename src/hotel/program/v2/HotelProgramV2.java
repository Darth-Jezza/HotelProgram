package hotel.program.v2;

import java.util.*;

public class HotelProgramV2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Room[] myHotel = new Room[10];
        for (int x = 0; x < 10; x++ ) {
            myHotel[x] = new Room();
        }
 
        String roomName;
        int roomNum = 0;
        initialise(myHotel);
        while (roomNum < 10) {
            
            //if ()
            
            
            for (int x = 0; x < 10; x++ ){
                if (myHotel[x].mainName.equals("e")){
                    System.out.println("room " + x + " is empty");
                }
                System.out.println("Enter room number (0-9) or 10 to stop:");
                roomNum = input.nextInt();
                System.out.println("Enter name for room " + roomNum + " :");
                roomName = input.next();
                myHotel[roomNum].mainName = roomName ;
                for (int i = 0; i < 10; i++) {
                    System.out.println("room " + i + " occupied by " + myHotel[i].mainName);
                }
            }
        }
    }
    private static void initialise( Room hotelRef[] ) {
        for (int x = 0; x < 10; x++ ) hotelRef[x].mainName = "e";
            System.out.println( "initilise ");
    }
}
    
