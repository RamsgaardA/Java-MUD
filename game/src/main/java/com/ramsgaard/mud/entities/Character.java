package com.ramsgaard.mud.entities;


public class Character extends Entity {
    public Character(String color, int x, int y, String level){
        this.color = color;
        this.symbol = '@';
        this.isWalkable = false;
        this.x = x;
        this.y = y;
        this.level = level;
    }
    public String getID(){
        return this.id;
    }
}
