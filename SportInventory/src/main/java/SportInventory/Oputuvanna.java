package SportInventory;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Window;
import java.awt.Choice;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Oputuvanna extends JFrame {

	private static final long serialVersionUID = 1L;

	private JLabel l_Vik;
	private JLabel l_Hapka;
	private Choice choice_Vik;
	private JLabel l_Stat;
	private Choice choice_Stat;
	private JLabel l_Vaga;
	private Choice choice_Vaga;
	private JLabel l_Zrist;
	private Choice choice_Zrist;
	private JLabel l_Zdorovj;
	private Choice choice_Zdorovj;
	private JLabel l_finansu;
	private Choice choice_Finansu;
	private Choice choice_VudSportu;
	private JLabel l_Uminna;
	private Choice choice_Uminna;
	private JLabel l_kartunka;
	private JLabel l_fon;
	private JLabel l_Komanda;
	private JLabel l_Komanda1;
	private Choice choice_Komanda;

	private boolean boolean_Komanda = false;

	public Oputuvanna() {
		getContentPane().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				String s_choice_VudSportu = choice_VudSportu.getSelectedItem();
				if (s_choice_VudSportu.equals("Футбол") && boolean_Komanda == false
						|| s_choice_VudSportu.equals("Баскетбол") && boolean_Komanda == false
						|| s_choice_VudSportu.equals("Волейбол") && boolean_Komanda == false
						|| s_choice_VudSportu.equals("Ганбол") && boolean_Komanda == false) {

					l_kartunka.setBounds(0, 0, 0, 0);

					choice_Komanda.setBounds(544, 218, 184, 22);
					l_Komanda.setBounds(544, 132, 184, 28);
					l_Komanda1.setBounds(544, 172, 184, 28);
					boolean_Komanda = true;

				}
			}
		});

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		l_Vik = new JLabel("Вік:");
		l_Vik.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		l_Vik.setBounds(23, 73, 184, 28);
		getContentPane().add(l_Vik);

		l_Hapka = new JLabel("Вкажіть, будь ласка, персональні дані:");
		l_Hapka.setFont(new Font("Monotype Corsiva", Font.BOLD, 36));
		l_Hapka.setHorizontalAlignment(SwingConstants.CENTER);
		l_Hapka.setBounds(12, 13, 770, 47);
		getContentPane().add(l_Hapka);

		choice_Vik = new Choice();
		choice_Vik.setBounds(226, 73, 249, 22);
		getContentPane().add(choice_Vik);
		choice_Vik.add("до 18");
		choice_Vik.add("від 19 до 25");
		choice_Vik.add("від 26 до 35");
		choice_Vik.add("від 36 до 50");
		choice_Vik.add("понад 51");

		l_Stat = new JLabel("Стать:");
		l_Stat.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		l_Stat.setBounds(23, 132, 184, 28);
		getContentPane().add(l_Stat);

		choice_Stat = new Choice();
		choice_Stat.setBounds(226, 138, 249, 22);
		getContentPane().add(choice_Stat);
		choice_Stat.add("чоловіча");
		choice_Stat.add("жіноча");

		l_Vaga = new JLabel("Вага:");
		l_Vaga.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		l_Vaga.setBounds(23, 188, 184, 28);
		getContentPane().add(l_Vaga);

		choice_Vaga = new Choice();
		choice_Vaga.setBounds(226, 194, 249, 22);
		getContentPane().add(choice_Vaga);
		choice_Vaga.add("до 50");
		choice_Vaga.add("від 51 до 55");
		choice_Vaga.add("від 56 до 60");
		choice_Vaga.add("від 61 до 65");
		choice_Vaga.add("від 66 до 70");
		choice_Vaga.add("від 71 до 75");
		choice_Vaga.add("від 76 до 80");
		choice_Vaga.add("від 81 до 85");
		choice_Vaga.add("від 86 до 90");
		choice_Vaga.add("від 91 до 95");
		choice_Vaga.add("від 96 до 100");
		choice_Vaga.add("від 101 до 105");
		choice_Vaga.add("від 106 до 110");
		choice_Vaga.add("від 111 до 115");
		choice_Vaga.add("від 116 до 120");
		choice_Vaga.add("від 121 до 125");
		choice_Vaga.add("від 126 до 130");
		choice_Vaga.add("від 131 до 135");
		choice_Vaga.add("від 136 до 140");
		choice_Vaga.add("від 141 до 145");
		choice_Vaga.add("від 146 до 150");
		choice_Vaga.add("понад 151");

		l_Zrist = new JLabel("Зріст:");
		l_Zrist.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		l_Zrist.setBounds(23, 250, 184, 28);
		getContentPane().add(l_Zrist);

		choice_Zrist = new Choice();
		choice_Zrist.setBounds(226, 256, 249, 22);
		getContentPane().add(choice_Zrist);
		choice_Zrist.add("до 120 см.");
		choice_Zrist.add("від 121 до 130 см.");
		choice_Zrist.add("від 131 до 140 см.");
		choice_Zrist.add("від 141 до 150 см.");
		choice_Zrist.add("від 151 до 160 см.");
		choice_Zrist.add("від 161 до 170 см.");
		choice_Zrist.add("від 171 до 180 см.");
		choice_Zrist.add("від 181 до 190 см.");
		choice_Zrist.add("від 191 до 200 см.");
		choice_Zrist.add("від 201 до 210 см.");
		choice_Zrist.add("понад 211 см.");

		l_Zdorovj = new JLabel("Стан здоров'я:");
		l_Zdorovj.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		l_Zdorovj.setBounds(23, 310, 184, 28);
		getContentPane().add(l_Zdorovj);

		choice_Zdorovj = new Choice();
		choice_Zdorovj.setBounds(226, 316, 249, 22);
		getContentPane().add(choice_Zdorovj);
		choice_Zdorovj.add("Впевнений у своєму здоров'ї");
		choice_Zdorovj.add("Здоровий, але недавно втратив форму");
		choice_Zdorovj.add("Маю сумніви");
		choice_Zdorovj.add("Мені варто більше звертати увагу на це");
		choice_Zdorovj.add("Жахливий стан");

		l_finansu = new JLabel("Фінансовий стан:");
		l_finansu.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		l_finansu.setBounds(23, 375, 184, 28);
		getContentPane().add(l_finansu);

		choice_Finansu = new Choice();
		choice_Finansu.setBounds(226, 381, 249, 22);
		getContentPane().add(choice_Finansu);
		choice_Finansu.add("Для мене гроші - не проблема");
		choice_Finansu.add("Дуже рідко відмовляю собі в чомусь");
		choice_Finansu.add("Важко відповісти");
		choice_Finansu.add("Часто задумуюсь про свій бюджет");
		choice_Finansu.add("Ледве зводжу кінці з кінцями");

		Container l_VudSportu = new JLabel("Вид спорту:");
		l_VudSportu.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		l_VudSportu.setBounds(23, 440, 184, 28);
		getContentPane().add(l_VudSportu);

		choice_VudSportu = new Choice();
		choice_VudSportu.setBounds(226, 446, 249, 22);
		getContentPane().add(choice_VudSportu);
		choice_VudSportu.add("Теніс");
		choice_VudSportu.add("Легка атлетика");

		choice_VudSportu.add("Волейбол");
		choice_VudSportu.add("Футбол");
		choice_VudSportu.add("Баскетбол");
		choice_VudSportu.add("Ганбол");
		choice_VudSportu.add("Хокей");

		l_Uminna = new JLabel("Рівень умінь:");
		l_Uminna.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		l_Uminna.setBounds(23, 507, 184, 28);
		getContentPane().add(l_Uminna);

		choice_Uminna = new Choice();
		choice_Uminna.setBounds(226, 513, 249, 22);
		getContentPane().add(choice_Uminna);
		choice_Uminna.add("Профі");
		choice_Uminna.add("Любитель");
		choice_Uminna.add("Нище середнього");
		choice_Uminna.add("Я навчаюсь");

		JButton b_Dali = new JButton("Далі");
		b_Dali.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String s_choice_Vik = choice_Vik.getSelectedItem();
				String s_choice_Stat = choice_Stat.getSelectedItem();
				String s_choice_Vaga = choice_Vaga.getSelectedItem();
				String s_choice_Zrist = choice_Zrist.getSelectedItem();
				String s_choice_Zdorovj = choice_Zdorovj.getSelectedItem();
				String s_choice_Finansu = choice_Finansu.getSelectedItem();
				String s_choice_VudSportu = choice_VudSportu.getSelectedItem();
				String s_choice_Uminna = choice_Uminna.getSelectedItem();
				String s_choice_Komanda = choice_Komanda.getSelectedItem();

				if (s_choice_VudSportu.equals("Волейбол") || s_choice_VudSportu.equals("Футбол")
						|| s_choice_VudSportu.equals("Баскетбол") || s_choice_VudSportu.equals("Ганбол")
						||  s_choice_VudSportu.equals("Хокей")) {
					new Oputuvanna1(s_choice_Vik, s_choice_Stat, s_choice_Vaga, s_choice_Zrist, s_choice_Zdorovj,
							s_choice_Finansu, s_choice_VudSportu, s_choice_Uminna, s_choice_Komanda);
				} else {
					new Oputuvanna1(s_choice_Vik, s_choice_Stat, s_choice_Vaga, s_choice_Zrist, s_choice_Zdorovj,
							s_choice_Finansu, s_choice_VudSportu, s_choice_Uminna);
				}

				setVisible(false);
			}
		});
		b_Dali.setBounds(530, 507, 226, 30);
		getContentPane().add(b_Dali);

		l_Komanda = new JLabel("Кількість членів");
		l_Komanda.setHorizontalAlignment(SwingConstants.CENTER);
		l_Komanda.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		l_Komanda.setBounds(0, 0, 0, 0);
		getContentPane().add(l_Komanda);

		l_Komanda1 = new JLabel(" команди:");
		l_Komanda1.setHorizontalAlignment(SwingConstants.CENTER);
		l_Komanda1.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		l_Komanda1.setBounds(0, 0, 0, 0);
		getContentPane().add(l_Komanda1);

		choice_Komanda = new Choice();
		choice_Komanda.setBounds(0, -50, 0, 0);
		getContentPane().add(choice_Komanda);
		choice_Komanda.add("1");
		choice_Komanda.add("2");
		choice_Komanda.add("3");
		choice_Komanda.add("4");
		choice_Komanda.add("5");
		choice_Komanda.add("6");
		choice_Komanda.add("7");
		choice_Komanda.add("8");
		choice_Komanda.add("9");
		choice_Komanda.add("10");
		choice_Komanda.add("11");
		choice_Komanda.add("12");
		choice_Komanda.add("13");
		choice_Komanda.add("14");
		choice_Komanda.add("15 і більше");

		l_kartunka = new JLabel("");
		l_kartunka.setHorizontalAlignment(SwingConstants.CENTER);
		l_kartunka.setIcon(new ImageIcon("res/kartunka_Zaput1.png"));
		l_kartunka.setBounds(510, 66, 260, 428);
		getContentPane().add(l_kartunka);

		l_fon = new JLabel("");
		l_fon.setIcon(new ImageIcon("res/fon_Zaput1.png"));
		l_fon.setBounds(0, 0, 800, 600);
		getContentPane().add(l_fon);

		setVisible(true);
	}
}
