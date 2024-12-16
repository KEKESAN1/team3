import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gakusei here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gakusei extends Actor
{
    /**
     * Act - do whatever the Gakusei wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    // img  = new GreenfootImage( "images/Gakusei_Default.png" );
    
    public void Gakusei() 
    { 
        //img = new GreenfootImage( "images/Gakusei_Move.png" ); 
    }
    
    public void act() 
    {
        GreenfootImage img  = new GreenfootImage( "images/Gakusei_Default.png" );
        setImage(img); 
        
        getImage().scale(120, 210);
        
        if( Greenfoot.isKeyDown( "right" ) )
            {
                img = new GreenfootImage( "images/Gakusei_Move.png" ); 
                setImage(img); 
                
                getImage().scale(130, 210);
            } 
    }    
}
