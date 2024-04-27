import javax.swing.*;

public class SnakeGameExecute {
    public static void main(String[] args) {
        int boardWidth = 500;
        int boardHeight = boardWidth;

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Snake");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            SnakeGame snakeGame = new SnakeGame(boardWidth, boardHeight);
            frame.add(snakeGame);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            snakeGame.requestFocus();
        });
    }
}
