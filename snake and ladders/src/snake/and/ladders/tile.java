
package snake.and.ladders;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class tile extends Rectangle {
    
    Rectangle rectangle;
     public tile (int x, int y){
         
         setWidth(x);
         setHeight(y);
         
         
         setFill(Color.	HONEYDEW);
         setStroke(Color.BLACK);
       
     }
}