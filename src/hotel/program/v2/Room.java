/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.program.v2;

/**
 *
 * @author darth
 */
public class Room {
    String mainName;
    int guestsInRoom;
    public Room() {
        mainName = "k";
        System.out.println("made a room ");
    }
    public void setName(String aName) {
        System.out.println("add name class method ");
        mainName = aName;
    }
    public String getName() {
        return mainName;
    }
}