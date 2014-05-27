package com.ramsgaard.mud;

import com.ramsgaard.mud.world.Level;
import com.ramsgaard.mud.world.Tile;

public class Game {

    public static final Tile NULL_TILE = new Tile("?", "White", true, 0);
    public static final Tile FLOOR_TILE = new Tile(".", "Grey", true, 1);
    public static final Tile WALL_TILE = new Tile("#", "Black", false, 2);

    public static final Tile[] tileIndex = new Tile[]{NULL_TILE, FLOOR_TILE, WALL_TILE};

    public static void main(String[] args) {
        int[][] testindexmap = {
                {1,1,1,2,1},
                {1,1,1,2,1},
                {1,1,3,2,1},
                {1,1,1,2,1},
                {1,1,1,2,1}
        };
        Level myLevel = new Level("My Level", 1, testindexmap);

    }

    public static Tile[][] buildMap(int[][] indexMap) {
        Tile[][] map = new Tile[indexMap.length][indexMap[0].length];
        for (int y = 0; y < indexMap.length; y++) {
            for (int x = 0; x < indexMap[y].length; x++) {
                for(Tile i : tileIndex){
                   if(i.index == indexMap[y][x]) map[y][x] = i;
                    else if(indexMap[y][x] >= tileIndex.length) map[y][x] = NULL_TILE;
                }
            }
        }
        return map;
    }
}
