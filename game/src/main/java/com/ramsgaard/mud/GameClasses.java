package com.ramsgaard.mud;

public class GameClasses {

    public static class Tile {
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

    public static class Level {
        String name;
        int difficulty;
        Tile[][] groundLayer;

        public Level(String name, int difficulty, int[][] indexMap) {
            this.name = name;
            this.difficulty = difficulty;
            this.groundLayer = Game.makeLayer(indexMap);

        }

    }
}