package calculator.main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator
{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}
	
	JLabel labelNumber = new JLabel("0");
	JLabel labelSecond = new JLabel("0");
	double currentNum = 0;
	double secondNum = 0;
	String operator = "+";

	/**
	 * Create the application.
	 */
	public Calculator()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				currentNum = (currentNum * 10) + 1;
				refreshLabel();
			}
		});
		button1.setBounds(69, 57, 89, 23);
		frame.getContentPane().add(button1);
		
		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				currentNum = (currentNum * 10) + 2;
				refreshLabel();
			}
		});
		button2.setBounds(168, 57, 89, 23);
		frame.getContentPane().add(button2);
		
		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				currentNum = (currentNum * 10) + 3;
				refreshLabel();
			}
		});
		button3.setBounds(267, 57, 89, 23);
		frame.getContentPane().add(button3);
		
		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				currentNum = (currentNum * 10) + 4;
				refreshLabel();
			}
		});
		button4.setBounds(69, 91, 89, 23);
		frame.getContentPane().add(button4);
		
		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				currentNum = (currentNum * 10) + 5;
				refreshLabel();
			}
		});
		button5.setBounds(168, 91, 89, 23);
		frame.getContentPane().add(button5);
		
		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				currentNum = (currentNum * 10) + 6;
				refreshLabel();
			}
		});
		button6.setBounds(267, 91, 89, 23);
		frame.getContentPane().add(button6);
		
		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				currentNum = (currentNum * 10) + 7;
				refreshLabel();
			}
		});
		button7.setBounds(69, 125, 89, 23);
		frame.getContentPane().add(button7);
		
		JButton button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				currentNum = (currentNum * 10) + 8;
				refreshLabel();
			}
		});
		button8.setBounds(168, 125, 89, 23);
		frame.getContentPane().add(button8);
		
		JButton button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				currentNum = (currentNum * 10) + 9;
				refreshLabel();
			}
		});
		button9.setBounds(267, 125, 89, 23);
		frame.getContentPane().add(button9);
		
		JButton buttonPlus = new JButton("+");
		buttonPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if (secondNum != 0)
				{
					if (operator.equals("+"))
					{
						secondNum = secondNum + currentNum;
					}
					else if (operator.equals("-"))
					{
						secondNum = secondNum - currentNum;
					}
					else if (operator.equals("*"))
					{
						secondNum = secondNum * currentNum;
					}
					else if (operator.equals("/"))
					{
						secondNum = secondNum / currentNum;
					}
				}
				else
				{
					secondNum = currentNum;
				}
				currentNum = 0;
				operator = "+";
				labelNumber.setText(operator);
			}
		});
		buttonPlus.setBounds(69, 159, 89, 23);
		frame.getContentPane().add(buttonPlus);
		
		JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				currentNum = (currentNum * 10) + 0;
				refreshLabel();
			}
		});
		button0.setBounds(168, 159, 89, 23);
		frame.getContentPane().add(button0);
		
		JButton buttonMinus = new JButton("-");
		buttonMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if (secondNum != 0)
				{
					if (operator.equals("+"))
					{
						secondNum = secondNum + currentNum;
					}
					else if (operator.equals("-"))
					{
						secondNum = secondNum - currentNum;
					}
					else if (operator.equals("*"))
					{
						secondNum = secondNum * currentNum;
					}
					else if (operator.equals("/"))
					{
						secondNum = secondNum / currentNum;
					}
				}
				else
				{
					secondNum = currentNum;
				}
				currentNum = 0;
				operator = "-";
				labelNumber.setText(operator);
			}
		});
		buttonMinus.setBounds(267, 159, 89, 23);
		frame.getContentPane().add(buttonMinus);
		
		JButton buttonMultiply = new JButton("*");
		buttonMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if (secondNum != 0)
				{
					if (operator.equals("+"))
					{
						secondNum = secondNum + currentNum;
					}
					else if (operator.equals("-"))
					{
						secondNum = secondNum - currentNum;
					}
					else if (operator.equals("*"))
					{
						secondNum = secondNum * currentNum;
					}
					else if (operator.equals("/"))
					{
						secondNum = secondNum / currentNum;
					}
				}
				else
				{
					secondNum = currentNum;
				}
				currentNum = 0;
				operator = "*";
				labelNumber.setText(operator);
			}
		});
		buttonMultiply.setBounds(69, 193, 89, 23);
		frame.getContentPane().add(buttonMultiply);
		
		JButton buttonEquals = new JButton("=");
		buttonEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if (operator.equals("+"))
				{
					currentNum = secondNum + currentNum;
					refreshLabel();
				}
				else if (operator.equals("-"))
				{
					currentNum = secondNum - currentNum;
					refreshLabel();
				}
				else if (operator.equals("*"))
				{
					currentNum = secondNum * currentNum;
					refreshLabel();
				}
				else if (operator.equals("/"))
				{
					currentNum = secondNum / currentNum;
					refreshLabel();
				}
			}
		});
		
		JButton buttondevide = new JButton("/");
		buttondevide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if (secondNum != 0)
				{
					if (operator.equals("+"))
					{
						secondNum = secondNum + currentNum;
					}
					else if (operator.equals("-"))
					{
						secondNum = secondNum - currentNum;
					}
					else if (operator.equals("*"))
					{
						secondNum = secondNum * currentNum;
					}
					else if (operator.equals("/"))
					{
						secondNum = secondNum / currentNum;
					}
				}
				else
				{
					secondNum = currentNum;
				}
				currentNum = 0;
				operator = "/";
				labelNumber.setText(operator);
			}
		});
		buttondevide.setBounds(267, 193, 89, 23);
		frame.getContentPane().add(buttondevide);
		buttonEquals.setBounds(168, 193, 89, 23);
		frame.getContentPane().add(buttonEquals);
		
		JButton buttonClear = new JButton("Clear");
		buttonClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				currentNum = 0;
				secondNum = 0;
				operator = "";
				refreshLabel();
			}
		});
		buttonClear.setBounds(168, 227, 89, 23);
		frame.getContentPane().add(buttonClear);
		
		labelNumber.setBackground(Color.BLACK);
		labelNumber.setForeground(Color.LIGHT_GRAY);
		labelNumber.setBounds(69, 0, 287, 46);
		frame.getContentPane().add(labelNumber);
		labelSecond.setForeground(Color.LIGHT_GRAY);
		
		labelSecond.setBounds(10, 247, 46, 14);
		frame.getContentPane().add(labelSecond);
	}
	public void refreshLabel()
	{
		labelNumber.setText(Double.toString(currentNum));
		labelSecond.setText(Double.toString(secondNum));
	}
}
