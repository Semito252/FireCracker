package main;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import main.methods.Methods_Universal;

import javax.swing.JTextArea;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.swing.JScrollPane;
import javax.swing.BoxLayout;
import java.awt.Color;

public class Info extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void newScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Info frame = new Info();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Info() {
		setTitle("Info (resizable)");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane);
		
		JTextArea txtrT = new JTextArea();
		txtrT.setForeground(Color.LIGHT_GRAY);
		txtrT.setBackground(Color.DARK_GRAY);
		txtrT.setWrapStyleWord(true);
		txtrT.setLineWrap(true);
		scrollPane.setViewportView(txtrT);
		txtrT.setFont(new Font("Monospaced", Font.PLAIN, 12));
		txtrT.setText( Methods_Universal.readTextFromFile("info.txt") );
	}

}