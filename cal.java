import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class Cal extends JFrame  implements ActionListener
{
	GridBagConstraints gbc;
	JTextField tf1;
	Color c1,c2,c3;
	char op;
	JLabel l1;
	String ettext;
	static  boolean format=true;
	double resultdouble;
	MenuBar bar;
	Menu menu;
	MenuItem item;

	double number;
	JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18;
	Cal()
	{
		setLayout(new GridBagLayout());
		bar=new MenuBar();
		setMenuBar(bar);

		menu=new Menu("info");
		item =new MenuItem("about");
		item.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				JOptionPane.showMessageDialog(null, "Welcome to Calculator 1.0", 
                "Calculator 1.0", JOptionPane.INFORMATION_MESSAGE,new ImageIcon("mycalc.png"));
			}
		});
		menu.add(item);
		bar.add(menu);
		setMenuBar(bar);
	

		this.setIconImage(Toolkit.getDefaultToolkit().getImage("mycalc.png"));

		
		
		c1=new Color(244, 125, 66);
		c2=new Color(230, 234, 239);
		c3=new Color(249,249,247);
		Font font2=new Font("SansSerif",Font.BOLD,18);
		b0=new JButton("AC");
		b0.setFont(font2);
		
		b0.setBackground(c1);
		b0.addActionListener(this);	
		b1=new JButton("<-");
		b1.setFont(font2);
		b1.setBackground(Color.WHITE);
		b1.addActionListener(this);
		b2=new JButton("/");
		b2.setFont(font2);
		b2.setBackground(Color.WHITE);
		b2.addActionListener(this);
		b3=new JButton("*");
		b3.setFont(font2);
		b3.setBackground(Color.WHITE);
		b3.addActionListener(this);
		b4=new JButton("7");
		b4.setFont(font2);
		b4.setBackground(Color.WHITE);
		b4.addActionListener(this);
		b5=new JButton("8");
		b5.setFont(font2);
		b5.setBackground(Color.WHITE);
		b5.addActionListener(this);
		b6=new JButton("9");
		b6.setFont(font2);
		b6.setBackground(Color.WHITE);
		b6.addActionListener(this);
		b7=new JButton("-");
		b7.setFont(font2);
		b7.setBackground(Color.WHITE);
		b7.addActionListener(this);
		b8=new JButton("4");
		b8.setFont(font2);
		b8.setBackground(Color.WHITE);
		b8.addActionListener(this);
		b9=new JButton("5");
		b9.setFont(font2);
		b9.setBackground(Color.WHITE);
		b9.addActionListener(this);
		b10=new JButton("6");
		b10.setFont(font2);
		b10.setBackground(Color.WHITE);
		b10.addActionListener(this);
		b11=new JButton("+");
		b11.setFont(font2);
		b11.setBackground(Color.WHITE);
		b11.addActionListener(this);
		b12=new JButton("1");
		b12.setFont(font2);
		b12.setBackground(Color.WHITE);
		b12.addActionListener(this);
		b13=new JButton("2");
		b13.setFont(font2);
		b13.setBackground(Color.WHITE);
		b13.addActionListener(this);
		b14=new JButton("3");
		b14.setFont(font2);
		b14.setBackground(Color.WHITE);
		b14.addActionListener(this);
		b15=new JButton("=");
		b15.setFont(font2);
		b15.setBackground(c1);
		b15.addActionListener(this);
		b16=new JButton("00");
		b16.setFont(font2);
		b16.setBackground(Color.WHITE);
		b16.addActionListener(this);	
		b17=new JButton("0");
		b17.setFont(font2);
		b17.setBackground(Color.WHITE);
		b17.addActionListener(this);
		
		b18=new JButton(".");
		b18.addActionListener(this);
		tf1=new JTextField();
		Font font1 = new Font("SansSerif", Font.BOLD, 40);
		

 
		tf1.setFont(font1);
		tf1.setText("0");
		gbc=new GridBagConstraints();
		
   		gbc.fill=GridBagConstraints.BOTH;
		Insets ins=new Insets(12,12,12,12);
		gbc.insets=ins;
		
		
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.gridheight=10;
		gbc.gridwidth=20;
		gbc.weightx=1.0;
		gbc.weighty=2.0;
		
		tf1.setBackground(c2);
		tf1.setHorizontalAlignment(JTextField.RIGHT);
		tf1.setForeground(Color.BLACK);
		add(tf1,gbc);
		
		gbc.gridx=0;
		gbc.gridy=15;
		gbc.gridheight=4;
		gbc.gridwidth=5;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		
		
		add(b0,gbc);
		
		gbc.gridx=5;
		gbc.gridy=15;
		gbc.gridheight=4;
		gbc.gridwidth=5;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		
		add(b1,gbc);
		
		gbc.gridx=10;
		gbc.gridy=15;
		gbc.gridheight=4;
		gbc.gridwidth=5;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
	
		add(b2,gbc);
		
		gbc.gridx=15;
		gbc.gridy=15;
		gbc.gridheight=4;
		gbc.gridwidth=5;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		
		add(b3,gbc);
		
		gbc.gridx=0;
		gbc.gridy=20;
		gbc.gridheight=4;
		gbc.gridwidth=5;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
			
		add(b4,gbc);
		
		gbc.gridx=5;
		gbc.gridy=20;
		gbc.gridheight=4;
		gbc.gridwidth=5;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		
		add(b5,gbc);
		
		gbc.gridx=10;
		gbc.gridy=20;
		gbc.gridheight=4;
		gbc.gridwidth=5;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		
		add(b6,gbc);
		
		gbc.gridx=15;
		gbc.gridy=20;
		gbc.gridheight=4;
		gbc.gridwidth=5;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		
		add(b7,gbc);
		
		gbc.gridx=0;
		gbc.gridy=25;
		gbc.gridheight=4;
		gbc.gridwidth=5;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
			
		add(b8,gbc);
		
		gbc.gridx=5;
		gbc.gridy=25;
		gbc.gridheight=4;
		gbc.gridwidth=5;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
			
		add(b9,gbc);
		
		gbc.gridx=10;
		gbc.gridy=25;
		gbc.gridheight=4;
		gbc.gridwidth=5;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		
     	add(b10,gbc);
		
		
		gbc.gridx=15;
		gbc.gridy=25;
		gbc.gridheight=4;
		gbc.gridwidth=5;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		
		add(b11,gbc);
		
		gbc.gridx=0;
		gbc.gridy=30;
		gbc.gridheight=4;
		gbc.gridwidth=5;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
			
		add(b12,gbc);
		
		gbc.gridx=5;
		gbc.gridy=30;
		gbc.gridheight=4;
		gbc.gridwidth=5;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
			
		add(b13,gbc);
		
		gbc.gridx=10;
		gbc.gridy=30;
		gbc.gridheight=4;
		gbc.gridwidth=5;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		
		add(b14,gbc);
		
		gbc.gridx=15;
		gbc.gridy=30;
		gbc.gridheight=15;
		gbc.gridwidth=5;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
	
		add(b15,gbc);
		
		gbc.gridx=0;
		gbc.gridy=35;
		gbc.gridheight=15;
		gbc.gridwidth=5;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		
		add(b16,gbc);
		
		gbc.gridx=5;
		gbc.gridy=35;
		gbc.gridheight=4;
		gbc.gridwidth=5;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
			
		add(b17,gbc);
		
		gbc.gridx=10;
		gbc.gridy=35;
		gbc.gridheight=15;
		gbc.gridwidth=5;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		b18.setBackground(Color.WHITE);
		

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
			
		add(b18,gbc);
		setResizable(false);
		setTitle("My Calculator");
	 
		setBackground(c3);
		
	  	setSize(550,650);
		setLocation(600,200);
	  	setVisible(true);
		
		
	}
	public static void main(String arg[])
	{
		new Cal();
	}


	public void actionPerformed(ActionEvent ae)
	{
		JButton btn=(JButton)ae.getSource();
		String label=btn.getLabel();
		
	if (label.equals("7"))
        {
		if(tf1.getText().equals("0"))
		{
			tf1.setText("");
		}
            StringBuilder builder=new StringBuilder(tf1.getText());
		builder.append("7");
		tf1.setText(builder.toString());

        }

        if (label.equals("4"))
        {
		if(tf1.getText().equals("0"))
		{
			tf1.setText("");
		}
            StringBuilder builder=new StringBuilder(tf1.getText());
		builder.append("4");
		tf1.setText(builder.toString());
		

        }
        if (label.equals("1"))
        {
		if(tf1.getText().equals("0"))
		{
			tf1.setText("");
		}
            StringBuilder builder=new StringBuilder(tf1.getText());
		builder.append("1");
		tf1.setText(builder.toString());

        }
        if (label.equals("."))
        {
		if(tf1.getText().equals("0"))
		{
			tf1.setText("");
		}
            StringBuilder builder=new StringBuilder(tf1.getText());
		builder.append(".");
		tf1.setText(builder.toString());

        }
        if (label.equals("8"))
        {
		if(tf1.getText().equals("0"))
		{
			tf1.setText("");
		}
            StringBuilder builder=new StringBuilder(tf1.getText());
		builder.append("8");
		tf1.setText(builder.toString());

        }
        if (label.equals("5"))
        {
		if(tf1.getText().equals("0"))
		{
			tf1.setText("");
		}
            StringBuilder builder=new StringBuilder(tf1.getText());
		builder.append("5");
		tf1.setText(builder.toString());

        }
        if (label.equals("2"))
        {
		if(tf1.getText().equals("0"))
		{
			tf1.setText("");
		}
            StringBuilder builder=new StringBuilder(tf1.getText());
		builder.append("2");
		tf1.setText(builder.toString());


        }
        if (label.equals("0"))
        {
		if(tf1.getText().equals("0"))
		{
			tf1.setText("");
		}
            StringBuilder builder=new StringBuilder(tf1.getText());
		builder.append("0");
		tf1.setText(builder.toString());

        }
        if (label.equals("9"))
        {
		if(tf1.getText().equals("0"))
		{
			tf1.setText("");
		}
            StringBuilder builder=new StringBuilder(tf1.getText());
		builder.append("9");
		tf1.setText(builder.toString());
        }
        if (label.equals("6"))
        {
		if(tf1.getText().equals("0"))
		{
			tf1.setText("");
		}
            StringBuilder builder=new StringBuilder(tf1.getText());
		builder.append("6");
		tf1.setText(builder.toString());
        }
        if (label.equals("3"))
        {
		if(tf1.getText().equals("0"))
		{
			tf1.setText("");
		}
            StringBuilder builder=new StringBuilder(tf1.getText());
		builder.append("3");
		tf1.setText(builder.toString());
        }
	
        if (label.equals("00"))
        {
		if(tf1.getText().equals("0"))
		{
			tf1.setText("0");
		}
            StringBuilder builder=new StringBuilder(tf1.getText());
		builder.append("00");
		tf1.setText(builder.toString());
        }
	
        if (label.equals("="))
        {
		
            ettext=tf1.getText().toString();
             resultdouble= Cal.evaluate(ettext);



                if(format!=false )
                 tf1.setText(String.valueOf(resultdouble));

                else
                {
                    tf1.setText("invalid format");
                    format=true;
                }
        }
        if (label.equals("<-"))
        {
            String Res="";
            for(int i=0; i<tf1.getText().length()-1; i++) Res+=tf1.getText().charAt(i);

            if(Res.equals(""))
                tf1.setText("0");
            else
                tf1.setText(Res);

        }
        if (label.equals("/"))
        {
		if(tf1.getText().equals("0"))
		{
			tf1.setText("");
		}
            StringBuilder builder=new StringBuilder(tf1.getText());
		builder.append("/");
		tf1.setText(builder.toString());


        }
        if (label.equals("*"))
        {
		if(tf1.getText().equals("0"))
		{
			tf1.setText("");
		}
            StringBuilder builder=new StringBuilder(tf1.getText());
		builder.append("*");
		tf1.setText(builder.toString());

        }
        if (label.equals("-"))
        {
		if(tf1.getText().equals("0"))
		{
			tf1.setText("");
		}
            StringBuilder builder=new StringBuilder(tf1.getText());
		builder.append("-");
		tf1.setText(builder.toString());

        }
        if (label.equals("+"))
        {
		if(tf1.getText().equals("0"))
		{
			tf1.setText("");
		}
            StringBuilder builder=new StringBuilder(tf1.getText());
		builder.append("+");
		tf1.setText(builder.toString());

        }
	if(label.equals("AC"))
	{
		tf1.setText("");
	}
	
        	
    }


	public static double evaluate(String expr)
    {
        char tokens[]=expr.toCharArray();

        Stack<Double> values=new Stack<Double>();

        Stack<Character> ops=new Stack<Character>();

        try {
            if (expr.equalsIgnoreCase("")) {
                return 0.0;
            }


            if (tokens[0] == '+' || tokens[0] == '*' || tokens[0] == '/' || tokens[tokens.length - 1] == '+' || tokens[tokens.length - 1] == '-' ||
                    tokens[tokens.length - 1] == '*' || (tokens[tokens.length - 1] == '.') || tokens[tokens.length - 1] == '/' || expr.equalsIgnoreCase(".")) {
                format = false;
                return 0.0;
            }
            for (int i = 0; i < tokens.length; i++) {


                // if current token is a number

                if ((tokens[i] >= '0' && tokens[i] <= '9') || (tokens[i] == '.') || (tokens[i] == '-' && i == 0) || (tokens[i] == '-' && i == 0) || (tokens[i] == '-' && tokens[i - 1] == '+') || (tokens[i] == '-' && tokens[i - 1] == '*') || (tokens[i] == '-' && tokens[i - 1] == '-') || (tokens[i] == '-' && tokens[i - 1] == '/')) {


                    // a number can have more than one digit
                    StringBuffer sbf = new StringBuffer();

                    while ((i < tokens.length) && ((tokens[i] >= '0' && tokens[i] <= '9') || (tokens[i] == '.') || (tokens[i] == '-' && i == 0) ||
                            (tokens[i] == '-' && tokens[i - 1] == '+') || (tokens[i] == '-' && tokens[i - 1] == '*') || (tokens[i] == '-' && tokens[i - 1] == '-') || (tokens[i] == '-' && tokens[i - 1] == '/'))) {
                        sbf.append(tokens[i++]);

                    }
                    i--;
                    values.push(Double.parseDouble(sbf.toString()));


                } else if ((tokens[i] == '+' && tokens[i + 1] == '*') || (tokens[i] == '+' && tokens[i + 1] == '/') || (tokens[i] == '+' && tokens[i + 1] == '+') || (tokens[i] == '*' && tokens[i + 1] == '/') || (tokens[i] == '*' && tokens[i + 1] == '+')
                        || (tokens[i] == '*' && tokens[i + 1] == '*') || (tokens[i] == '/' && tokens[i + 1] == '+') || (tokens[i] == '/' && tokens[i + 1] == '*') || (tokens[i] == '/' && tokens[i + 1] == '/') || (tokens[i] == '-' && tokens[i + 1] == '+')
                        || (tokens[i] == '-' && tokens[i + 1] == '*') || (tokens[i] == '-' && tokens[i + 1] == '/')) {
                    format = false;
                    return 0.0;
                }


                //if current token is a operator

                else if (tokens[i] == '+' || tokens[i] == '-' || tokens[i] == '*' || tokens[i] == '/') {
                    while (!ops.empty() && hasPrecedence(tokens[i], ops.peek())) {

                        values.push(applyOp(ops.pop(), values.pop(), values.pop()));

                    }

                    ops.push(tokens[i]);
                }


            }
            while (!ops.empty()) {

                values.push(applyOp(ops.pop(), values.pop(), values.pop()));


            }
            return values.pop();
        }
        catch (Exception e){
            format=false;return 0.0;}
    }
    public static boolean hasPrecedence(char op1,char op2)
    {
        if((op1=='*' || op1=='/') && (op2=='+' || op2=='-'))
            return false;
        else
            return true;
    }
    public static double applyOp(char op ,double a,double b)
    {
        switch(op)
        {
            case '+':
                return a+b;
            case '-':
                return b-a;
            case '*':
                return a*b;
            case '/':
                return b/a;


        }
        return 0.0;
    }

	
	
	
}



