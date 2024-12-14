// Windows map
import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        // Settings map
        int rowCount = 21;
        int columnCount = 19;
        int tileSize = 32;
        int boardWidth = columnCount * tileSize;
        int boardHeight = rowCount * tileSize;

        // Windows map
        JFrame frame = new JFrame("Pac Man");
        // Making it visible
        // frame.setVisible(true);
        // Set Size
        frame.setSize(boardWidth, boardHeight);
        // Center it in middle
        frame.setLocationRelativeTo(null);
        // User can't resize the screen
        frame.setResizable(false);
        // Know when user clicks on X
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // We create an instance PacMan.java
        PacMan pacmanGame = new PacMan();
        // We add it to the frame
        frame.add(pacmanGame);
        // Make sure that it takes 100% of the frame
        frame.pack();
         // Making it visible
        frame.setVisible(true);
    }
}
