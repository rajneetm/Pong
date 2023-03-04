import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

// window for game to be displayed in (like a canvas)

public class GameFrame extends JFrame {

	GamePanel panel; // create instance of GamePanel
	
	GameFrame(){
		panel = new GamePanel();
		this.add(panel);
		this.setTitle("Ping Pong");
		this.setResizable(false); // size cannot be changed
		this.setBackground(Color.black); // sets background color
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exits panel when closed
		this.pack();
		this.setVisible(true); // allows us to see
		this.setLocationRelativeTo(null); // opens window in the middle of screen
	}
	
}
