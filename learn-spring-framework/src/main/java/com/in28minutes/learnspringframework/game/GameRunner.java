package com.in28minutes.learnspringframework.game;

public class GameRunner {
    private MarioGame game;
    public GameRunner(MarioGame game){
        this.game = game;
    }
    public void run(){
        System.out.println("Running game : "+game.toString());
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
