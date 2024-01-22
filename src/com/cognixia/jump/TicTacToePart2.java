package com.cognixia.jump;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;


public class TicTacToePart2 implements ActionListener {
	
	// GUI Objects
	JFrame frame = new JFrame();
	JPanel titlePanel = new JPanel();
	JPanel buttonPanel = new JPanel();
	JLabel textField = new JLabel();
	JButton[] buttons = new JButton[9];
	
	// Used to randomly select the first player
	Random random = new Random();
	
	// don't need more than one boolean, this is enough to determine player 2's turn
	boolean player1turn;
	
	TicTacToePart2(){
		
		// Setting values for GUI display
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,800);
		frame.getContentPane().setBackground(new Color(50, 50, 50));
		//frame.getContentPane().setBackground(Color.black);
		frame.setLayout(new BorderLayout());
		frame.setVisible(true);
		
		// textField will be contained within titlePanel
		textField.setBackground(new Color(25, 25, 25));
		textField.setForeground(new Color(25,255,0));
		textField.setFont(new Font("Tahoma", Font.BOLD, 80));
		textField.setHorizontalAlignment(JLabel.CENTER);
		textField.setText("Tic-Tac-Toe");
		textField.setOpaque(true);
		
		// titlePanel will be contained within frame
		titlePanel.setLayout(new BorderLayout());
		//            		 x value, y value, width, height
		//					 -> this will begin in the top left and fill the panel width (800)
		titlePanel.setBounds(0,0,800,100);
		
		
		titlePanel.add(textField);
		//frame.add(titlePanel); // title fills available area
		frame.add(titlePanel, BorderLayout.NORTH); // title sticks to the top
		
		
		// buttonPanel will be contained within frame
		buttonPanel.setLayout(new GridLayout(3,3));
		buttonPanel.setBackground(new Color(150,150,150));
		
		for(int i=0; i<9; i++) {
			buttons[i] = new JButton();
			buttonPanel.add(buttons[i]);
			buttons[i].setFont(new Font("Tahoma",Font.BOLD,120));
			buttons[i].setFocusable(false); // can't select it by pressing tab to move the focus
			buttons[i].addActionListener(this); // comment this out to fix a bug at the end
		}
		
		frame.add(buttonPanel);
		
		firstTurn();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
	}
	
	public void firstTurn() {
		
		
		// add this after testing firstTurn
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		if(random.nextInt(2)==0) { 			// The nextInt method of the random class accepts an integer value,
			player1turn=true;				// which is the exclusive upper bound, in this case meaning our range is 0 to 2 not including 2.
			textField.setText("X turn");	// In other words, it will return 1 or 0.
		} else {
			player1turn=false;
			textField.setText("O turn");
		}
		
		
	}
	
	public void check() {
		
		
		
	}
	
	public void xWins(int a, int b, int c) {
		
		
		
	}
	
	public void oWins(int a, int b, int c) {
		
		
		
	}
}