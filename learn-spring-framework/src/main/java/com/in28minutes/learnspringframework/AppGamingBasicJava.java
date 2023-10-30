package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.PacManGame;
import com.in28minutes.learnspringframework.game.SuperContraGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        var marioGame = new MarioGame();
        var superContraGme = new SuperContraGame();
        var pacManGame = new PacManGame(); // 1: Object Creation
        var gameRunner = new GameRunner(pacManGame);
        // 2: Object Creation + Wiring of dependency
        // Game is a Dependency of GameRunner
        gameRunner.run();
    }
}
