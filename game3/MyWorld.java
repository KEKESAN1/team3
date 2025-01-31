//
import greenfoot.*;

public class MyWorld extends World
{
    GreenfootImage back;
    GreenfootImage back_flop;
    int back_dx = -3; // スクロール速度(マイナスにすると左から右)
    int back_x = 0;
    int back_width;
    int flag = 0;
    boolean flop = true;
    int random; 
    long currentTime = 0;
    long time = 0;
    
    
    public Actor titlelogo = null;

    public MyWorld()
    {
        super(600, 330, 1); // 画像サイズをセットする
        back = new GreenfootImage( "./images/back.png" );
        back_flop = new GreenfootImage( "./images/back2.png" );
        back_width = back.getWidth();
        
        addObject( new marker(), 540, 220 );
        addObject( new Gakusei(), 100, 220 );
        
        titlelogo = new TitleLogo();
        addObject(titlelogo,305,170);
    }
    
    public void act()
    {
        getBackground().drawImage( flop ? back_flop : back, back_x, 0 );
        getBackground().drawImage( flop ? back : back_flop, back_x+back_width, 0 );
        
        if(flag == 0){
            showText( "Press 「→」 key", 400, 115 );
        }
        if( Greenfoot.isKeyDown( "right" ))
        {
            if(flag == 0){
                currentTime = System.currentTimeMillis();
            
                flag = 1;
                showText( "", 400, 115 );
            
                back_x += back_dx;
            }
            if( back_x > 0){
                back_x -= back_width;
                flop = Greenfoot.getRandomNumber(2) == 0;
            }
            if( back_x < -back_width ){
                back_x += back_width;
                flop = Greenfoot.getRandomNumber(2) == 0;
            }
            getBackground().drawImage( flop ? back_flop : back, back_x, 0 );
            getBackground().drawImage( flop ? back : back_flop, back_x+back_width, 0 );
            
            /*if(flop == false){
                showText("wao!", 100, 100);
            }else{
                showText( "", 100, 100 );
            }*/
            
            
            showText(""+ flop, 100, 50);
            showText( "back_x : "+ back_x, 100, 10 );
        }
        if(flag == 1){
            time = (System.currentTimeMillis() - currentTime) / 1000;
            showText(""+ time, 100, 100);
        }
                
        if(titlelogo != null){
            removeObject(titlelogo);
            titlelogo = null;
        }
    }
}