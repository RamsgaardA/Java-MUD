package com.ramsgaard.mud.world;

import com.ramsgaard.mud.Game;

/**
* Created by martin on 27/05/14.
*/
public class Level {
    String name;
    int difficulty;
    Tile[][] groundLayer;

    public Level(String name, int difficulty, int[][] indexMap) {
        this.name = name;
        this.difficulty = difficulty;
        this.groundLayer = Game.buildMap(indexMap);

    }

}
