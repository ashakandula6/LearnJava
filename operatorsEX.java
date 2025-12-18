/*Imagine you are building a program to count how many people enter and leave a room.
You can use ++ to increase the counter when someone enters, and -- to decrease it when someone leaves: */

public class operatorsEX{
    public static void main(String[] args){
        int peopleInRoom = 10;
        peopleInRoom++; // One person enters
        peopleInRoom++;
        peopleInRoom--; // One person leaves
        peopleInRoom++;
        peopleInRoom--;
        System.out.println("Number of people in the room: " + peopleInRoom);
    }
}