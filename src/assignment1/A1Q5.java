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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Creating the city of Kitchener 
        City kitchener = new City();
        //Creating a robot1: living where, what place, direction
        Robot karel = new Robot(kitchener, 3,3, Direction.EAST);
        //Labelling robot1
        karel.setLabel ("K");
        //Creating robot2: living where, what place, direction
        Robot maria = new Robot(kitchener, 0,1, Direction.WEST);
        //Labelling robot2
        maria.setLabel("M");
        //Creating karel's house (with walls)
        new Wall(kitchener, 3,3, Direction.SOUTH);
        new Wall(kitchener, 3,3, Direction.EAST);
        new Wall(kitchener, 2,3, Direction.EAST);
        new Wall(kitchener, 2,3, Direction.NORTH);
        new Wall(kitchener, 2,3, Direction.WEST);
        //Creating the items (objects)that fell from karel's bag
        new Thing(kitchener,0,0);
        new Thing(kitchener,1,0);
        new Thing(kitchener,1,1);
        new Thing(kitchener,1,2);
        new Thing(kitchener,2,2);
        //Movement of maria and karel towards the items fallen on the ground
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        maria.move();
        karel.move();
        //Karel and maria picking up the items on the ground 
        karel.pickThing();
        maria.pickThing();
        //Karel and maria moving toward the next item
        karel.move();
        maria.turnLeft();
        maria.move();
        //Karel and maria picking up the next item on the ground
        karel.pickThing();
        maria.pickThing();
        //Karel and maria moving toward the next item
        karel.turnLeft();
        maria.turnLeft(); 
        maria.move();
        //Maria picks up the last item and meets up with karel in front of her
        maria.pickThing();
        
                
                }
}
