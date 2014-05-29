package com.ramsgaard.mud.entities;

import java.util.UUID;

public class Entity {
    String id = UUID.randomUUID().toString();
    char symbol;
    String color;
    boolean isWalkable;
    int x;
    int y;
    String level;
    public Entity(int x){
        this.x = x;
    }

}
