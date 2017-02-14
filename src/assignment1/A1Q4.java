/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author ahmaa1808
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Creating the city of Kitchener 
        City kitchener = new City();
        //Creating a robot1: living where, what place, direction
        Robot karel = new Robot(kitchener, 0,0, Direction.SOUTH);
        //Creating a robot2: living where, what place, direction
        Robot anoosha = new Robot(kitchener, 0,1, Direction.SOUTH);
        //Creating the walls
        new Wall(kitchener, 0,1, Direction.WEST);
        new Wall(kitchener, 1,1, Direction.WEST);
        new Wall(kitchener, 1,1, Direction.SOUTH);
        //Moving karel and anoosha at the same time towards each other
        karel.move();
        karel.move();
        anoosha.move();
        anoosha.turnLeft();
        anoosha.move();
        anoosha.turnLeft();
        anoosha.turnLeft();
        anoosha.turnLeft();
        anoosha.move();
        karel.turnLeft();
        anoosha.turnLeft();
        anoosha.turnLeft();
        anoosha.turnLeft();
        //Arriving at the final destination around the same time
        karel.move(); 
        anoosha.move();
    }
}
