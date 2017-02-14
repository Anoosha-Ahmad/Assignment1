/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author ahmaa1808
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Creating the city of Kitchener 
        City kitchener = new City();
        //Creating a robot: living where, what place, directiom
        Robot karel = new Robot(kitchener, 3,0, Direction.EAST);
        //Creating an object
        new Thing(kitchener,3,1);
        //Creating the mountain (walls)
        new Wall(kitchener, 3,2, Direction.WEST);
        new Wall(kitchener, 3,2, Direction.NORTH);
        new Wall(kitchener, 2,3, Direction.WEST);
        new Wall(kitchener, 2,3, Direction.WEST);
        new Wall(kitchener, 1,3, Direction.WEST);
        new Wall(kitchener, 1,3, Direction.NORTH);
        new Wall(kitchener, 1,3, Direction.EAST);
        new Wall(kitchener, 2,4, Direction.NORTH);
        new Wall(kitchener, 2,4, Direction.EAST); 
        new Wall(kitchener, 3,4, Direction.EAST);
        //Moving toward the flag
        karel.move();
        //Picking up the flag (object)
        karel.pickThing();
        //Moving towards the top of the mountain
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        //Dropping the flag at the top of the mountain
        karel.putThing();
        //Moving down to the bottom of the mountain
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.turnLeft();
        
        
        
        
        
    }
}
