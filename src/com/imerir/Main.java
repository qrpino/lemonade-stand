package com.imerir;

public class Main {

    public static void main(String[] args) {
        MainWindow window = new MainWindow();
        window.setVisible(true);
        Game game = new Game();
        game.loop();
        // write your code here
    }
}
