import greenfoot.*;

public class MyWorld extends World
{
    GreenfootImage back;
    GreenfootImage back_flop;
    int back_dx = -3; // スクロール速度(マイナスにすると左から右)
    int back_x = 0;
    int back_width;
    boolean flop = false;

    public MyWorld()
    {
        super(600, 330, 1); // 画像サイズをセットする
        back = new GreenfootImage( "./images/back.png" );
        back_flop = new GreenfootImage( "./images/back2.png" );
        back_width = back.getWidth();
    }

    public void act()
    {
        back_x += back_dx;
        if( back_x > 0){
            back_x -= back_width;
            flop = !flop;
        }
        if( back_x < -back_width ){
            back_x += back_width;
            flop = !flop;
        }
        getBackground().drawImage( flop ? back_flop : back, back_x, 0 );
        getBackground().drawImage( flop ? back : back_flop, back_x+back_width, 0 );
    }
}