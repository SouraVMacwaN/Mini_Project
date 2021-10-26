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
	
  		Frame f = new Frame();
		f.setVisible(true);
		f.setSize(400,400);
		f.setLayout(null);
		Label user_name=new Label("Username : ");
		Label password=new Label("Password : ");
		user_Text=new TextField(20);
		pass_Text=new TextField(20);
		pass_Text.setEchoChar('*');
		b1=new Button("Sign Up");
		b2=new Button("Login");
		f.add(user_name);
		f.add(user_Text);
		f.add(password);
		f.add(pass_Text);
		f.add(b1);
		f.add(b2);

		user_name.setBounds(68,100,90,20);
		password.setBounds(70,140,90,20);
		user_Text.setBounds(180,100,150,20);
		pass_Text.setBounds(180,140,150,20);
		b1.setBounds(100,220,70,30);
		b2.setBounds(220,220,70,30);

		Color c = new Color(0, 83, 98);
		Color c1 = new Color(0,54,65);
		Color c2 = new Color(38,38,38);

		f.setBackground(c);

		user_name.setForeground(Color.white);
		password.setForeground(Color.white);
		user_name.setBackground(c);
		password.setBackground(c);
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

		 b1.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
		f.dispose();
		sign_up ob = new sign_up();
		ob.setVisible(true);
	
    }  
    });  
		
				
	}

	
	
	public static void main(String args[])
	{
		sign_in ob=new sign_in();
				
	} 

}
