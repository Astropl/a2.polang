package a2;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
//import java.sql.Date;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class MojeOkienko extends JFrame implements ActionListener
{
	JButton bpodajdate, bwyjscie, bstart;
	JLabel lwyswietldate;
	
	public MojeOkienko ()
	{
	setSize(800,800);
	setTitle("Okineko moje");
	setLayout(null);
	
	bpodajdate = new JButton("Czesc Sylwia");
	bpodajdate.setBounds(350, 100, 100, 100);
	add(bpodajdate);
	bpodajdate.addActionListener(this);
	
	bwyjscie = new JButton("Wyjscie");
	bwyjscie.setBounds(200, 100, 100, 100);
	add(bwyjscie);
	bwyjscie.addActionListener(this);
	
	bstart = new JButton("START");
	bstart.setBounds(500, 100, 100, 100);
	add(bstart);
	bstart.addActionListener(this);
	
	lwyswietldate = new JLabel("Data: ");
	lwyswietldate.setBounds(100, 250, 600, 100);
	lwyswietldate.setForeground(Color.BLUE);
	lwyswietldate.setFont(new Font("SanSerif",Font.BOLD,40));
	add(lwyswietldate);
	
	
	}

	public static void main(String[] args)
	{
		MojeOkienko okienko = new MojeOkienko();
		okienko.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		okienko.setVisible(true);
		System.out.println("Astro");
		//Timer t = new Timer (1000,new ActionListener ()
				//{
			
				//}
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		//long eventMask = 1000;
		//System.out.println(new Date(eventMask));
	
		Object ¿ród³o = e.getSource();
		if (¿ród³o==bpodajdate)
		{
		//System.out.println(new Date());
			lwyswietldate.setText(new Date().toString());
			
		}
		else if (¿ród³o==bwyjscie)
		{
			dispose();
			
		}
		else if (¿ród³o==bstart)
		{System.out.println("cos tam ");
			//bstart.addActionListener(new);
			Timer t = new Timer(1000,new ActionListener()
					{@Override
				public void actionPerformed(ActionEvent e)
				{
					SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
					lwyswietldate.setText(new Date().toString());
					//lwyswietldate.setText(sdf.format(new java.util.Date()));
					}
					});
			t.start();
			
					
		}
	}

}
