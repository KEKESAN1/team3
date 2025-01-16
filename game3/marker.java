import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class marker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class marker extends Actor
{
    /**
     * Act - do whatever the marker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        GreenfootImage img  = new GreenfootImage( "images/teacher.png" );
        setImage(img);
        getImage().scale(120, 210);
        
        MyWorld world = (MyWorld)getWorld();
        if( isAtEdge() ){
                    getImage().setTransparency(0);
                }  
        if( Greenfoot.isKeyDown( "right" ) )
            {
                move(-3);
                
                if( world.flop == false ){
                    if( world.back_x > -3 ){
                        move(540);
                        getImage().setTransparency(255);
                    }
                }
            } 
    }  
}
