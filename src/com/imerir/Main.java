package com.imerir;

public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        MainWindow window = new MainWindow(game);
        window.setVisible(true);
        game.loop();
        // write your code here
    }
}
