import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Graphics;
import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class sign_in extends Frame
{
	TextField user_Text,pass_Text;
	Button b1,b2;
	sign_in()
	{

		this.setLayout(null);
		Label user_name=new Label("Username : ");
		Label password=new Label("Password : ");
		user_Text=new TextField(20);
		pass_Text=new TextField(20);
		pass_Text.setEchoChar('*');
		b1=new Button("Sign Up");
		b2=new Button("Login");
		this.add(user_name);
		this.add(user_Text);
		this.add(password);
		this.add(pass_Text);
		this.add(b1);
		this.add(b2);

		user_name.setBounds(68,100,90,20);
		password.setBounds(70,140,90,20);
		user_Text.setBounds(180,100,150,20);
		pass_Text.setBounds(180,140,150,20);
		b1.setBounds(100,220,70,30);
		b2.setBounds(220,220,70,30);

		Color c = new Color(0, 83, 98);
		Color c1 = new Color(0,54,65);
		Color c2 = new Color(38,38,38);
		this.setBackground(c);
		user_name.setForeground(Color.white);
		password.setForeground(Color.white);
		b1.setBackground(c1);
		b2.setBackground(c1);
		b1.setForeground(Color.white);
		b2.setForeground(Color.white);
		user_Text.setForeground(Color.white);
		pass_Text.setForeground(Color.white);
		user_Text.setBackground(c2);
		pass_Text.setBackground(c2);

		user_name.setFont(new Font("SansSerif", Font.BOLD, 14));
		password.setFont(new Font("SansSerif", Font.BOLD, 14));
		b1.setFont(new Font("SansSerif", Font.BOLD, 10));
		b2.setFont(new Font("SansSerif", Font.BOLD, 10));
		
				
	}
	
	public static void main(String args[])
	{
		sign_in ob=new sign_in();
		ob.setVisible(true);
		ob.setSize(400,400);		
	} 

}