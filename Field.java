package sample;

public class Field {
    private Tile[][] arr;

    public Tile[][] getArr() {
        return arr;
    }

    public Field (){
        initGame();
    }

    private void initGame() {
        arr = new Tile[2][2];
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++) {
                arr[i][j] = new Tile();
            }
    }
    }


}

