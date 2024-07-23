package snake.and.ladders;

import static java.lang.Math.random;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import static javafx.scene.shape.StrokeLineCap.SQUARE;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import static sun.dc.pr.PathStroker.SQUARE;

public class DiceRollSnake extends Application {

    public int rand;
    public Label randResult;
    //this code is calculating the dice from 1 to 6//
    private void diceroll(){
    int max = 6;
    int min = 1;
    int Range = max - min + 1;
        int Random = (int)(Math.random()* Range)+ min;
    Random = (int)(math.random() * 5+1);
    
    }
//width * height = 5*5=25 ,this is the numbers of the squares //
    public static final int Tile_size = 90;
    public static final int width = 5;
    public static final int height = 5;

    public boolean gameStart = true;
    public Button gameButton;
    
//the bull and the cow defines player 1 and player 2//
    public Image bull;
    public Image cow;

    public int bullPosition = 1;
    public int cowPosition = 1;
//player's turn
    public boolean bullTurn = true;
    public boolean cowTurn = true;
    public boolean roleTheDiceNow = true;
//player's position
    public static int bullXpos = 5;
    public static int bullYpos = 330;

    public static int cowXpos = 2;
    public static int cowYpos = 360;

    private final Group tileGroup = new Group();

    private Parent createConetent() {
        Pane root = new Pane();
        root.setPrefSize(width * Tile_size, (height * Tile_size) + 180);
        root.getChildren().addAll(tileGroup);

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                tile tile = new tile(Tile_size, Tile_size) {
                };
                tile.setTranslateX(j * Tile_size);
                tile.setTranslateY(i * Tile_size);
                tileGroup.getChildren().add(tile);

            }
        }
//this codes declare the three ladders//
        Image lad = new Image("ladder.gif");
        ImageView ladder1 = new ImageView();
        ladder1.setImage(lad);
        ladder1.setTranslateX(375);
        ladder1.setTranslateY(235);
        ladder1.setFitHeight(200);
        ladder1.setFitWidth(50);

        Image lad2 = new Image("ladder2.gif");
        ImageView ladder2 = new ImageView();
        ladder2.setImage(lad2);
        ladder2.setTranslateX(110);
        ladder2.setTranslateY(200);
        ladder2.setFitHeight(150);
        ladder2.setFitWidth(50);

        Image lad3 = new Image("ladder3.gif");
        ImageView ladder3 = new ImageView();
        ladder3.setImage(lad3);
        ladder3.setTranslateX(200);
        ladder3.setTranslateY(25);
        ladder3.setFitHeight(150);
        ladder3.setFitWidth(50);
// this codes declare the three snakes//
        Image snk = new Image("snake.gif");
        ImageView snake = new ImageView();
        snake.setImage(snk);
        snake.setTranslateX(300);
        snake.setTranslateY(48);
        snake.setFitHeight(160);
        snake.setFitWidth(50);

        Image snk2 = new Image("snake2.gif");
        ImageView snake2 = new ImageView();
        snake2.setImage(snk2);
        snake2.setTranslateX(200);
        snake2.setTranslateY(300);
        snake2.setFitHeight(120);
        snake2.setFitWidth(50);

        Image snk3 = new Image("snake3.gif");
        ImageView snake3 = new ImageView();
        snake3.setImage(snk3);
        snake3.setTranslateX(30);
        snake3.setTranslateY(110);
        snake3.setFitHeight(300);
        snake3.setFitWidth(50);
        
//thsi code declare player 1 //
        Image bulll = new Image("bull.gif");
        ImageView bull = new ImageView();
        bull.setImage(bulll);
        bull.setTranslateX(25);
        bull.setTranslateY(415);
        bull.setFitHeight(30);
        bull.setFitWidth(30);
        
//this code declare player 2//
        Image coww = new Image("cow.gif");
        ImageView cow = new ImageView();
        cow.setImage(coww);
        cow.setTranslateX(25);
        cow.setTranslateY(390);
        cow.setFitHeight(30);
        cow.setFitWidth(30);
        
//this code for played bull(player 1)//
        Button button1 = new Button("bull");
        button1.setTranslateX(5);
        button1.setTranslateY(490);
        button1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                if (gameStart) {
                    if (bullTurn) {

                    }
                }

            }

        });

        //this code for played cow (player 2)//
        Button button2 = new Button("cow");
        button2.setTranslateX(5);
        button2.setTranslateY(550);
        button2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                if (gameStart) {
                    if (cowTurn) {

                    }

                }

            }

        });
//this code is for the button that make us start the game//
        gameButton = new Button("Start Game");
        gameButton.setTranslateX(5);
        gameButton.setTranslateY(450);
        gameButton.setOnAction(new EventHandler<ActionEvent>() {

            //then getting an output thet the game has started//
            @Override
            public void handle(ActionEvent event) {
                gameButton.setText("Game Started");
                bullXpos = 25;
                bullYpos = 415;

                cowXpos = 25;
                cowYpos = 390;

                bull.setTranslateX(bullXpos);
                bull.setTranslateY(bullYpos);
                cow.setTranslateX(cowXpos);
                cow.setTranslateY(cowYpos);

            }
        });

        //this codes is used to but numbers inside the squares and there is 25 square//
        Text Square1 = new Text("1");
        Square1.setTranslateX(5);
        Square1.setTranslateY(383);
        Square1.setFont(Font.font(20));
        Square1.setFill(Color.BLACK);

        Text Square2 = new Text("2");
        Square2.setTranslateX(100);
        Square2.setTranslateY(383);
        Square2.setFont(Font.font(20));
        Square2.setFill(Color.BLACK);

        Text Square3 = new Text("3");
        Square3.setTranslateX(185);
        Square3.setTranslateY(383);
        Square3.setFont(Font.font(20));
        Square3.setFill(Color.BLACK);

        Text Square4 = new Text("4");
        Square4.setTranslateX(280);
        Square4.setTranslateY(383);
        Square4.setFont(Font.font(20));
        Square4.setFill(Color.BLACK);

        Text Square5 = new Text("5");
        Square5.setTranslateX(365);
        Square5.setTranslateY(383);
        Square5.setFont(Font.font(20));
        Square5.setFill(Color.BLACK);

        Text Square6 = new Text("6");
        Square6.setTranslateX(365);
        Square6.setTranslateY(290);
        Square6.setFont(Font.font(20));
        Square6.setFill(Color.BLACK);

        Text Square7 = new Text("7");
        Square7.setTranslateX(280);
        Square7.setTranslateY(290);
        Square7.setFont(Font.font(20));
        Square7.setFill(Color.BLACK);

        Text Square8 = new Text("8");
        Square8.setTranslateX(185);
        Square8.setTranslateY(290);
        Square8.setFont(Font.font(20));
        Square8.setFill(Color.BLACK);

        Text Square9 = new Text("9");
        Square9.setTranslateX(100);
        Square9.setTranslateY(290);
        Square9.setFont(Font.font(20));
        Square9.setFill(Color.BLACK);

        Text Square10 = new Text("10");
        Square10.setTranslateX(5);
        Square10.setTranslateY(290);
        Square10.setFont(Font.font(20));
        Square10.setFill(Color.BLACK);

        Text Square11 = new Text("11");
        Square11.setTranslateX(5);
        Square11.setTranslateY(200);
        Square11.setFont(Font.font(20));
        Square11.setFill(Color.BLACK);

        Text Square12 = new Text("12");
        Square12.setTranslateX(100);
        Square12.setTranslateY(200);
        Square12.setFont(Font.font(20));
        Square12.setFill(Color.BLACK);

        Text square13 = new Text("13");
        square13.setTranslateX(185);
        square13.setTranslateY(200);
        square13.setFont(Font.font(20));
        square13.setFill(Color.BLACK);

        Text square14 = new Text("14");
        square14.setTranslateX(270);
        square14.setTranslateY(200);
        square14.setFont(Font.font(20));
        square14.setFill(Color.BLACK);

        Text square15 = new Text("15");
        square15.setTranslateX(365);
        square15.setTranslateY(200);
        square15.setFont(Font.font(20));
        square15.setFill(Color.BLACK);

        Text square16 = new Text("16");
        square16.setTranslateX(360);
        square16.setTranslateY(110);
        square16.setFont(Font.font(20));
        square16.setFill(Color.BLACK);

        Text square17 = new Text("17");
        square17.setTranslateX(280);
        square17.setTranslateY(110);
        square17.setFont(Font.font(20));
        square17.setFill(Color.BLACK);

        Text square18 = new Text("18");
        square18.setTranslateX(185);
        square18.setTranslateY(110);
        square18.setFont(Font.font(20));
        square18.setFill(Color.BLACK);

        Text square19 = new Text("19");
        square19.setTranslateX(90);
        square19.setTranslateY(110);
        square19.setFont(Font.font(20));
        square19.setFill(Color.BLACK);

        Text square20 = new Text("20");
        square20.setTranslateX(5);
        square20.setTranslateY(110);
        square20.setFont(Font.font(20));
        square20.setFill(Color.BLACK);

        Text square21 = new Text("21");
        square21.setTranslateX(5);
        square21.setTranslateY(25);
        square21.setFont(Font.font(20));
        square21.setFill(Color.BLACK);

        Text square22 = new Text("22");
        square22.setTranslateX(100);
        square22.setTranslateY(25);
        square22.setFont(Font.font(20));
        square22.setFill(Color.BLACK);

        Text square23 = new Text("23");
        square23.setTranslateX(185);
        square23.setTranslateY(25);
        square23.setFont(Font.font(20));
        square23.setFill(Color.BLACK);

        Text square24 = new Text("24");
        square24.setTranslateX(280);
        square24.setTranslateY(25);
        square24.setFont(Font.font(20));
        square24.setFill(Color.BLACK);

        Text square25 = new Text("25");
        square25.setTranslateX(362);
        square25.setTranslateY(25);
        square25.setFont(Font.font(20));
        square25.setFill(Color.BLACK);

        //to let the images apper in the output//
        tileGroup.getChildren().addAll(ladder1, ladder2, ladder3, snake, snake2, snake3, cow, bull, button1, button2, Square1, Square2, Square3, Square4, Square5, Square6, Square7, Square8, Square9, Square10, Square11, Square12, square13, square14, square15, square16 , square17, square18, square19, square20, square21, square22, square23, square24, square25, gameButton);

        return root;

    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Scene Scene = new Scene(createConetent());
        primaryStage.setTitle("snake and ladder");
        primaryStage.setScene(Scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private static class math {

        private static int random() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public math() {
        }
    }

}

