package sample.models.Game;
import sample.models.Game.Spot.Spot;
import

import java.util.ArrayList;

public class Game {

    private ArrayList Tile[][];

    public Game() {

    }

    private createTiles() {
        for (int x = 0; x != this.Tile; x++) {
            for(int y = 0; y != this.Tile[x].length; y++) {
                this.Tile[x][y] = new Spot();
            }
        }
    }

    private setupTiles() {
        for ()
    }

    private setupTilesColor(x, y) {

        if(y % 2 != 0 && x % 2 != 0) {
            .setColor(Color.GRAY);
        } else if(y % 2 == 0 && x % 2 == 0) {
            .setColor(Color.BLACK);
        } else {
            .setColor(Color.DARK_GRAY);
        }
    }


}
