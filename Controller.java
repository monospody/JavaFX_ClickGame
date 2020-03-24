package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class Controller {
    public Button btn1;
    public Button btn2;
    public Button btn3;
    public Button btn4;
    public Game game;

    public Controller() {
        game=new Game();
        game.startGame();
    }
    public void clickBtn(ActionEvent actionEvent) {
        Tile[][] arr=game.getField().getArr();
        System.out.println(((Button)actionEvent.getSource()).getId());
        switch (((Button)actionEvent.getSource()).getId()){
            case "btn1" :
                if (arr[0][0].getId()!=0) {
                    arr[0][0].setId(arr[0][0].getId() - 1);
                    arr[0][1].setId(arr[0][1].getId() + 1);
                    arr[1][0].setId(arr[1][0].getId() + 1);
                }
                break;
            case "btn2" :
                if (arr[1][0].getId()!=0) {
                arr[0][0].setId(arr[0][0].getId()+1);
                arr[1][1].setId(arr[1][1].getId()+1);
                arr[1][0].setId(arr[1][0].getId()-1);
                }
                break;
            case "btn3" :
                if (arr[0][1].getId()!=0) {
                arr[0][0].setId(arr[0][0].getId()+1);
                arr[0][1].setId(arr[0][1].getId()-1);
                arr[1][1].setId(arr[1][1].getId()+1);
                }
                break;
            case "btn4" :
                if (arr[1][1].getId()!=0) {
                arr[1][0].setId(arr[1][0].getId()+1);
                arr[0][1].setId(arr[0][1].getId()+1);
                arr[1][1].setId(arr[1][1].getId()-1);
                }
                break;
        }
        rePaint();
    }

    public void rePaint() {
        Tile[][] arr=game.getField().getArr();
        btn1.setText(String.valueOf(arr[0][0].getId()));
        btn2.setText(String.valueOf(arr[1][0].getId()));
        btn3.setText(String.valueOf(arr[0][1].getId()));
        btn4.setText(String.valueOf(arr[1][1].getId()));
    }

}
