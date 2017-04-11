package SportInventory;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Map extends JFrame {

	private static final long serialVersionUID = 1L;

	public Map(String s_VudSportu) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		JLabel l_Hapka = new JLabel("Оберіть, будь ласка, регіон");
		l_Hapka.setFont(new Font("Monotype Corsiva", Font.BOLD, 50));
		l_Hapka.setForeground(Color.BLUE);
		l_Hapka.setHorizontalAlignment(SwingConstants.CENTER);
		l_Hapka.setBounds(10, 0, 770, 51);
		getContentPane().add(l_Hapka);

		JButton b_Nazad = new JButton("");
		b_Nazad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Oputuvanna();
				setVisible(false);
			}
		});
		b_Nazad.setIcon(new ImageIcon("res/Nazad.png"));
		b_Nazad.setBounds(0, 0, 46, 41);
		getContentPane().add(b_Nazad);
		
		JLabel l_luck = new JLabel("");
		l_luck.setBounds(92, 98, 84, 88);
		getContentPane().add(l_luck);
		
		JLabel l_Rivne = new JLabel("");
		l_Rivne.setBounds(175, 106, 56, 97);
		getContentPane().add(l_Rivne);
		
		JLabel l_Jutomur = new JLabel("");
		l_Jutomur.setBounds(238, 117, 92, 117);
		getContentPane().add(l_Jutomur);
		
		JLabel l_Kiev = new JLabel("");
		l_Kiev.setBounds(328, 128, 56, 149);
		getContentPane().add(l_Kiev);
		
		JLabel l_Kiev1 = new JLabel("");
		l_Kiev1.setBounds(380, 183, 56, 51);
		getContentPane().add(l_Kiev1);
		
		JLabel l_Cernigiv = new JLabel("");
		l_Cernigiv.setBounds(380, 64, 105, 122);
		getContentPane().add(l_Cernigiv);
		
		JLabel l_Summy = new JLabel("");
		l_Summy.setBounds(473, 74, 118, 122);
		getContentPane().add(l_Summy);
		
		JLabel l_Lviv = new JLabel("");
		l_Lviv.setBounds(39, 199, 97, 75);
		getContentPane().add(l_Lviv);
		
		JLabel l_Ternopol = new JLabel("");
		l_Ternopol.setBounds(148, 216, 46, 97);
		getContentPane().add(l_Ternopol);
		
		JLabel l_Hmelnuckuy = new JLabel("");
		l_Hmelnuckuy.setBounds(196, 199, 56, 117);
		getContentPane().add(l_Hmelnuckuy);
		
		JLabel l_Vinnisa = new JLabel("");
		l_Vinnisa.setBounds(248, 235, 92, 112);
		getContentPane().add(l_Vinnisa);
		
		JLabel l_Cerkasu = new JLabel("");
		l_Cerkasu.setBounds(338, 262, 68, 51);
		getContentPane().add(l_Cerkasu);
		
		JLabel l_Cerkasu1 = new JLabel("");
		l_Cerkasu1.setBounds(396, 235, 78, 63);
		getContentPane().add(l_Cerkasu1);
		
		JLabel l_Poltava = new JLabel("");
		l_Poltava.setBounds(458, 199, 105, 88);
		getContentPane().add(l_Poltava);
		
		JLabel l_Harkiv = new JLabel("");
		l_Harkiv.setBounds(566, 187, 118, 111);
		getContentPane().add(l_Harkiv);
		
		JLabel l_Lugansk = new JLabel("");
		l_Lugansk.setBounds(702, 216, 78, 131);
		getContentPane().add(l_Lugansk);
		
		JLabel l_Ujgorod = new JLabel("");
		l_Ujgorod.setBounds(10, 287, 84, 65);
		getContentPane().add(l_Ujgorod);
		
		JLabel l_IF = new JLabel("");
		l_IF.setBounds(90, 280, 61, 88);
		getContentPane().add(l_IF);
		
		JLabel l_Cernivci = new JLabel("");
		l_Cernivci.setBounds(147, 314, 92, 51);
		getContentPane().add(l_Cernivci);
		
		JLabel l_Kirovograd = new JLabel("");
		l_Kirovograd.setBounds(380, 297, 118, 50);
		getContentPane().add(l_Kirovograd);
		
		JLabel l_Dnipro = new JLabel("");
		l_Dnipro.setBounds(497, 300, 146, 47);
		getContentPane().add(l_Dnipro);
		
		JLabel l_Dnipro1 = new JLabel("");
		l_Dnipro1.setBounds(469, 344, 84, 35);
		getContentPane().add(l_Dnipro1);
		
		JLabel l_Doneck = new JLabel("");
		l_Doneck.setBounds(634, 287, 78, 131);
		getContentPane().add(l_Doneck);
		
		JLabel l_Odessa1 = new JLabel("");
		l_Odessa1.setBounds(279, 352, 84, 173);
		getContentPane().add(l_Odessa1);
		
		JLabel l_Odessa = new JLabel("");
		l_Odessa.setBounds(362, 382, 34, 88);
		getContentPane().add(l_Odessa);
		
		JLabel l_Mukolaiv = new JLabel("");
		l_Mukolaiv.setBounds(396, 359, 45, 88);
		getContentPane().add(l_Mukolaiv);
		
		JLabel l_Mukolaiv1 = new JLabel("");
		l_Mukolaiv1.setBounds(429, 360, 56, 58);
		getContentPane().add(l_Mukolaiv1);
		
		JLabel l_Mukolaiv2 = new JLabel("");
		l_Mukolaiv2.setBounds(361, 344, 68, 35);
		getContentPane().add(l_Mukolaiv2);
		
		JLabel l_Herson = new JLabel("");
		l_Herson.setBounds(439, 425, 118, 41);
		getContentPane().add(l_Herson);
		
		JLabel l_Herson1 = new JLabel("");
		l_Herson1.setBounds(473, 382, 68, 36);
		getContentPane().add(l_Herson1);
		
		JLabel l_Zaporija = new JLabel("");
		l_Zaporija.setBounds(545, 352, 98, 95);
		getContentPane().add(l_Zaporija);
		
		JLabel l_Simferopol = new JLabel("");
		l_Simferopol.setBounds(442, 479, 190, 86);
		getContentPane().add(l_Simferopol);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("res/map.jpg"));
		label.setBounds(0, 0, 794, 565);
		getContentPane().add(label);
		
		
		setVisible(true);
	}
}
