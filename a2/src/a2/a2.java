package a2;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import DrugiTest.MojeOkienko;
import a1.Glowna;

public class a2 extends JFrame implements ActionListener
{
	private JFrame frame1;
	//private JPanel p;
	private JButton btnGraj, btnDodaj, btnEdytuj;
	private JLabel lbninfo1;
	
	public a2 ()
	{
	setSize(800,800);
	setTitle("Okineko moje");
	setLayout(null);
	
	btnGraj = new JButton("Graj");
	btnDodaj = new JButton("Dodaj");
	btnEdytuj = new JButton("Edytuj");
	lbninfo1 = new JLabel ("Gra s³ówka - POL - ANG.");
	btnGraj.setBounds(100, 200, 150, 150);
	btnDodaj.setBounds(100, 350, 150, 150);
	btnEdytuj.setBounds(100, 500, 150, 150);
	lbninfo1.setBounds(150, 50, 200, 100);
	lbninfo1.setFont(font);
	add(btnGraj);
	add(btnDodaj);
	add(btnEdytuj);
	add(lbninfo1);
	btnGraj.addActionListener(this);
	btnDodaj.addActionListener(this);
	btnEdytuj.addActionListener(this);
	
	//lwyswietldate = new JLabel("Data: ");
	//lwyswietldate.setBounds(100, 150, 200, 200);
	//lwyswietldate.setForeground(Color.BLUE);
	//lwyswietldate.setFont(new Font("SanSerif",Font.BOLD,50));
	//add(lwyswietldate);
	
	
	}

	public static void main(String[] args)
	{
		a2 okienko = new a2();
		okienko.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		okienko.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		//long eventMask = 1000;
		//System.out.println(new Date(eventMask));
	
		Object ¿ród³o = e.getSource();
		if (¿ród³o==btnGraj)
		{
		//System.out.println(new Date());
			//lwyswietldate.setText(new Date().toString());
			
		}
		else if (¿ród³o==btnDodaj)
		{
			dispose();
			
		}
	}

		
}
