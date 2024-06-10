package com.example.obstacleracegame;

public class GameManager {
    private int life;
    private int playerLocation;
    private int rows;
    private int columns;

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getPlayerLocation() {
        return playerLocation;
    }

    public void setPlayerLocation(int playerLocation) {
        this.playerLocation = playerLocation;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public void reduceLife(int life){
        if(life>0) {
            setLife(life - 1);
        }
    }

}
