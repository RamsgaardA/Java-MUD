package com.ramsgaard.mud.world;

/**
* Created by martin on 27/05/14.
*/
public class Tile {
    int index;
    String symbol;
    String color;
    Boolean isWalkable;

    public Tile(String symbol, String color, Boolean isWalkable, int index) {
        this.index = index;
        this.symbol = symbol;
        this.color = color;
        this.isWalkable = isWalkable;
    }

}
