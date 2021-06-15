package com.imerir;

public class Main {

    public static void main(String[] args) {
        // Commit test
        MainWindow window = new MainWindow();
        window.setVisible(true);
        Game game = new Game();
        game.loop();
        // write your code here
    }
}
