package com.ramsgaard.mud;

public class Game {

    static final GameClasses.Tile nullTile = new GameClasses.Tile("?", "White", true, 0);
    static final GameClasses.Tile floorTile = new GameClasses.Tile(".", "Grey", true, 1);
    static final GameClasses.Tile wallTile = new GameClasses.Tile("#", "Black", false, 2);

    GameClasses.Tile[] tileIndex = new GameClasses.Tile[]{nullTile, floorTile, wallTile};

    public static void main(String[] args) {
    }

    public static GameClasses.Tile[][] makeLayer(int[][] indexMap) {
        GameClasses.Tile[][] map = new GameClasses.Tile[indexMap.length][indexMap[0].length];
        for (int y = 0; y < indexMap.length; y++) {
            for (int x = 0; x < indexMap[y].length; x++) {
                if (indexMap[y][x] == 0) map[y][x] = nullTile;
            }
        }
        return map;
    }
}
