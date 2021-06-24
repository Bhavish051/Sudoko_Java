import java.awt.Dimension;
import java.time.Duration;
import java.time.Instant;

import javax.swing.JFrame;
import javax.swing.JPanel;


//The main class for the game

public class Sudoku extends JFrame{
    
    private int height = 1000;
    private int width = 1000;

    class App extends JPanel{

        public App(){
            setPreferredSize(new Dimension(width,height));
        }
    }
    
    private Sudoku(){
        super("Sudoku");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        App canvas = new App();
        this.setContentPane(canvas);
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args){
        Sudoku window = new Sudoku();
        window.run();
    }

    private void run() {
        while(true){
            Instant startTime = Instant.now();
            Instant endTime = Instant.now();
            long howLong = Duration.between(startTime, endTime).toMillis();
            try {
                Thread.sleep(20l - howLong);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
