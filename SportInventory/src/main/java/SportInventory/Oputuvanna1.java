package SportInventory;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import java.awt.Desktop;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URI;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Oputuvanna1 extends JFrame {

	private static final long serialVersionUID = 1L;

	int i_Vik;
	int i_Vaga;
	double d_Zrist;

	int i_Komanda;

	private JLabel l_min_finansu;
	private JLabel l_komands_zagalno;
	private JLabel l_rokomand_zagalno;

	private String s_rekomendacia = "";

	private static BufferedImage image_vuvestuProfil;

	boolean boo_Ekipirivka;
	String s_Hkola_Klub;

	int i_Navantagenna = 0;

	private JLabel l_komentar;

	Desktop desktop = Desktop.getDesktop();

	public Oputuvanna1(String Finansu, String s_choice_Stat, String s_choice_Vaga, String s_choice_Zrist,
			String s_choice_Zdorovj, String s_choice_Finansu, String s_choice_VudSportu, String s_choice_Uminna) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		JLabel l_Hapka = new JLabel("Вам рекомендується придбати:");
		l_Hapka.setFont(new Font("Monotype Corsiva", Font.BOLD, 50));
		l_Hapka.setHorizontalAlignment(SwingConstants.CENTER);
		l_Hapka.setBounds(12, 13, 770, 54);
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

		setVisible(true);
	}

	public Oputuvanna1(String s_choice_Vik, String s_choice_Vaga, String s_choice_Zrist, String s_choice_Zdorovj,
			String s_choice_Finansu, String s_choice_VudSportu, String s_choice_Komanda) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		JLabel l_Hapka = new JLabel("Вам рекомендується придбати:");
		l_Hapka.setFont(new Font("Monotype Corsiva", Font.BOLD, 50));
		l_Hapka.setHorizontalAlignment(SwingConstants.CENTER);
		l_Hapka.setBounds(12, 13, 770, 54);
		getContentPane().add(l_Hapka);

		if (s_choice_Komanda.equals("15 і більше")) {
			s_choice_Komanda = "16";
		}

		i_Komanda = Integer.parseInt(s_choice_Komanda);

		l_komands_zagalno = new JLabel("а команда має " + i_Komanda + " гравців,");
		l_komands_zagalno.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_komands_zagalno.setHorizontalAlignment(SwingConstants.CENTER);
		l_komands_zagalno.setBounds(12, 127, 770, 34);
		getContentPane().add(l_komands_zagalno);

		Zdorovia(s_choice_Zdorovj, s_choice_Vik, s_choice_Vaga, s_choice_Zrist, s_choice_VudSportu);

		// Finansu

		if (s_choice_Finansu.equals("Для мене гроші - не проблема")
				|| s_choice_Finansu.equals("Дуже рідко відмовляю собі в чомусь")) {
			l_min_finansu = new JLabel("Ваш б'юджет це повна свобота,");
			if (s_choice_Vik.equals("до 18")) {
				s_Hkola_Klub = "cпорт школи";
			} else {
				s_Hkola_Klub = "Ігрового клубу";
			}
			l_rokomand_zagalno = new JLabel("рекомендується вступити до " + s_Hkola_Klub);

			if (s_choice_VudSportu.equals("Волейбол")) {
				s_rekomendacia = "res" + "/" + "Volleyball" + "/" + "MaxFinansu.png";

				if (i_Komanda >= 4) {
					l_rokomand_zagalno = new JLabel("необхідно знайти майданчик для гри та зберігання обладняння");
				} else {
					l_rokomand_zagalno = new JLabel("рекомендується індивідуальні вправи (чи/або прийоми в парі)");
				}
			}
			if (s_choice_VudSportu.equals("Футбол")) {
				s_rekomendacia = "res" + "/" + "Footboll" + "/" + "MaxFinansu.png";
				if (i_Komanda >= 6) {
					l_rokomand_zagalno = new JLabel(
							"необхідно знайти стадіон для гри та місце для зберігання обладнання");
				} else {
					l_rokomand_zagalno = new JLabel("рекомендується індивідуальні вправи (чи/або прийоми в парі)");
				}
			}
			if (s_choice_VudSportu.equals("Баскетбол")) {
				s_rekomendacia = "res" + "/" + "Basketball" + "/" + "MaxFinansu.png";
				if (i_Komanda >= 4) {
					l_rokomand_zagalno = new JLabel("необхідно знайти майданчик для гри та зберігання обладнання");
				} else {
					l_rokomand_zagalno = new JLabel("рекомендується індивідуальні вправи (чи/або прийоми в парі)");
				}
			}
			if (s_choice_VudSportu.equals("Ганбол")) {
				s_rekomendacia = "res" + "/" + "Handball" + "/" + "MaxFinansu.png";
				if (i_Komanda >= 4) {
					l_rokomand_zagalno = new JLabel(
							"необхідно знайти майданчик для гри та місце для зберігання обладнання");
				} else {
					l_rokomand_zagalno = new JLabel("рекомендується індивідуальні вправи (чи/або прийоми в парі)");
				}
			}
			if (s_choice_VudSportu.equals("Хокей")) {
				s_rekomendacia = "res" + "/" + "Хокей" + "/" + "MaxFinansu.png";
				if (i_Komanda >= 4) {
					l_rokomand_zagalno = new JLabel(
							"необхідно знайти майданчик для гри та місце для зберігання обладнання");
				} else {
					l_rokomand_zagalno = new JLabel("рекомендується індивідуальні вправи (чи/або прийоми в парі)");
				}
			}

			boo_Ekipirivka = true;
		}
		if (s_choice_Finansu.equals("Важко відповісти")) {
			l_min_finansu = new JLabel("Ваш б'юджет досить вільний,");
			if (s_choice_Vik.equals("до 18")) {
				s_Hkola_Klub = "cпорт школи";
			} else {
				s_Hkola_Klub = "Ігрового клубу";
			}
			l_rokomand_zagalno = new JLabel("рекомендується вступити до " + s_Hkola_Klub);

			if (s_choice_VudSportu.equals("Волейбол")) {
				s_rekomendacia = "res" + "/" + "Volleyball" + "/" + "NormFinansu.png";

				if (i_Komanda >= 4) {
					l_rokomand_zagalno = new JLabel("необхідно знайти майданчик для гри та зберігання обладняння");
				} else {
					l_rokomand_zagalno = new JLabel("рекомендується індивідуальні вправи (чи/або прийоми в парі)");
				}
			}
			if (s_choice_VudSportu.equals("Футбол")) {
				s_rekomendacia = "res" + "/" + "Footboll" + "/" + "NormFinansu.png";
				if (i_Komanda >= 6) {
					l_rokomand_zagalno = new JLabel(
							"необхідно знайти стадіон для гри та місце для зберігання обладнання");
				} else {
					l_rokomand_zagalno = new JLabel("рекомендується індивідуальні вправи (чи/або прийоми в парі)");
				}
			}
			if (s_choice_VudSportu.equals("Баскетбол")) {
				s_rekomendacia = "res" + "/" + "Basketball" + "/" + "NormFinansu.png";
				if (i_Komanda >= 4) {
					l_rokomand_zagalno = new JLabel("необхідно знайти майданчик для гри та зберігання обладнання");
				} else {
					l_rokomand_zagalno = new JLabel("рекомендується індивідуальні вправи (чи/або прийоми в парі)");
				}
			}
			if (s_choice_VudSportu.equals("Ганбол")) {
				s_rekomendacia = "res" + "/" + "Handball" + "/" + "NormFinansu.png";
				if (i_Komanda >= 4) {
					l_rokomand_zagalno = new JLabel(
							"необхідно знайти майданчик для гри та місце для зберігання обладнання");
				} else {
					l_rokomand_zagalno = new JLabel("рекомендується індивідуальні вправи (чи/або прийоми в парі)");
				}
			}
			if (s_choice_VudSportu.equals("Хокей")) {
				s_rekomendacia = "res" + "/" + "Хокей" + "/" + "NormFinansu.png";
				if (i_Komanda >= 4) {
					l_rokomand_zagalno = new JLabel(
							"необхідно знайти майданчик для гри та місце для зберігання обладнання");
				} else {
					l_rokomand_zagalno = new JLabel("рекомендується індивідуальні вправи (чи/або прийоми в парі)");
				}
			}

			boo_Ekipirivka = true;
		}
		if (s_choice_Finansu.equals("Часто задумуюсь про свій бюджет")
				|| s_choice_Finansu.equals("Ледве зводжу кінці з кінцями")) {

			l_min_finansu = new JLabel("На жаль, Ваш б'юджет обмежений,");

			if (s_choice_VudSportu.equals("Волейбол")) {
				s_rekomendacia = "res" + "/" + "Volleyball" + "/" + "MinFinansu.png";
				if (i_Komanda >= 4) {
					l_rokomand_zagalno = new JLabel("рекомендується власноруч зробити сітку (із мотузки та 2 паль)");
				} else {
					l_rokomand_zagalno = new JLabel("рекомендується індивідуальні вправи (чи/або прийоми в парі)");
				}
			}
			if (s_choice_VudSportu.equals("Футбол")) {
				s_rekomendacia = "res" + "/" + "Footboll" + "/" + "MinFinansu.png";
				if (i_Komanda >= 6) {
					l_rokomand_zagalno = new JLabel("рекомендується власноруч зробити ворота (із 3 паль)");
				} else {
					l_rokomand_zagalno = new JLabel("рекомендується індивідуальні вправи (чи/або прийоми в парі)");
				}
			}
			if (s_choice_VudSportu.equals("Баскетбол")) {
				s_rekomendacia = "res" + "/" + "Basketball" + "/" + "MinFinansu.png";
				if (i_Komanda >= 4) {
					l_rokomand_zagalno = new JLabel("рекомендується власноруч зробити кільце із щитом (із дроту)");
				} else {
					l_rokomand_zagalno = new JLabel("рекомендується індивідуальні вправи (чи/або прийоми в парі)");
				}
			}
			if (s_choice_VudSportu.equals("Ганбол")) {
				s_rekomendacia = "res" + "/" + "Handball" + "/" + "MinFinansu.png";
				if (i_Komanda >= 4) {
					l_rokomand_zagalno = new JLabel("рекомендується власноруч зробити ворота (із 3 паль)");
				} else {
					l_rokomand_zagalno = new JLabel("рекомендується індивідуальні вправи (чи/або прийоми в парі)");
				}
			}
			if (s_choice_VudSportu.equals("Хокей")) {
				s_rekomendacia = "res" + "/" + "Хокей" + "/" + "MinFinansu.png";
				if (i_Komanda >= 4) {
					l_rokomand_zagalno = new JLabel(
							"рекомендується власноруч зробити майданчик на річці чи ставку (будьте обережні)");
				} else {
					l_rokomand_zagalno = new JLabel("рекомендується індивідуальні вправи (чи/або прийоми в парі)");
				}
			}

			boo_Ekipirivka = false;

		}

		l_rokomand_zagalno.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_rokomand_zagalno.setHorizontalAlignment(SwingConstants.CENTER);
		l_rokomand_zagalno.setBounds(12, 174, 770, 34);
		getContentPane().add(l_rokomand_zagalno);

		l_min_finansu.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_min_finansu.setHorizontalAlignment(SwingConstants.CENTER);
		l_min_finansu.setBounds(12, 80, 770, 34);
		getContentPane().add(l_min_finansu);

		JButton b_kuputu = new JButton("Перейти до купівлі");
		b_kuputu.setBounds(0, 524, 200, 41);
		getContentPane().add(b_kuputu);

		JButton b_misce = new JButton("Місця для занять");
		b_misce.setBounds(397, 524, 200, 41);
		getContentPane().add(b_misce);

		JButton b_ekipirivka = new JButton("Екіпіровка");
		b_ekipirivka.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (boo_Ekipirivka == false) {
					JOptionPane.showMessageDialog(null, "На жаль, Ваш б'юджет не дозволяє Вам купувати екіпіровку.",
							"Увага", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		b_ekipirivka.setBounds(199, 524, 200, 41);
		getContentPane().add(b_ekipirivka);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 213, 794, 312);
		getContentPane().add(scrollPane);

		JLabel l_rekomandacia = new JLabel();
		scrollPane.setViewportView(l_rekomandacia);

		File file_vuvestuProfil = new File(s_rekomendacia);

		try {
			image_vuvestuProfil = ImageIO.read(file_vuvestuProfil);
		} catch (Exception e1) {
		}

		l_rekomandacia.setIcon(new ImageIcon(image_vuvestuProfil));

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

		if (s_choice_Vik.equals("до 18")) {
			JButton b_Hkola = new JButton("Спортивні школи");
			b_Hkola.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

				}
			});
			b_Hkola.setBounds(594, 524, 200, 41);
			getContentPane().add(b_Hkola);
		} else {
			JButton b_Klub = new JButton("Ігрові клуби");
			b_Klub.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

				}
			});
			b_Klub.setBounds(594, 524, 200, 41);
			getContentPane().add(b_Klub);
		}

		setVisible(true);
	}

	void Zdorovia(String s_choice_Zdorovj, String s_choice_Vik, String s_choice_Vaga, String s_choice_Zrist,
			String s_choice_VudSportu) {

		// Zdorovj

		if (s_choice_Zdorovj.equals("Впевнений у своєму здоров'ї")
				|| s_choice_Zdorovj.equals("Здоровий, але недавно втратив форму")) {
			i_Navantagenna = 10;
		}
		if (s_choice_Zdorovj.equals("Маю сумніви")
				|| s_choice_Zdorovj.equals("Мені варто більше звертати увагу на це")) {
			i_Navantagenna = 5;
		}
		if (s_choice_Zdorovj.equals("Жахливий стан")) {
			i_Navantagenna = 0;
		}

		// Vik

		if (s_choice_Vik.equals("понад 51")) {
			i_Navantagenna = i_Navantagenna - 5;
		}

		// Vaga

		if (s_choice_Vaga.equals("до 50")) {
			i_Vaga = 50;
		}
		if (s_choice_Vaga.equals("від 51 до 55")) {
			i_Vaga = 53;
		}
		if (s_choice_Vaga.equals("від 56 до 60")) {
			i_Vaga = 58;
		}
		if (s_choice_Vaga.equals("від 61 до 65")) {
			i_Vaga = 63;
		}
		if (s_choice_Vaga.equals("від 66 до 70")) {
			i_Vaga = 68;
		}
		if (s_choice_Vaga.equals("від 71 до 75")) {
			i_Vaga = 73;
		}
		if (s_choice_Vaga.equals("від 76 до 80")) {
			i_Vaga = 78;
		}
		if (s_choice_Vaga.equals("від 81 до 85")) {
			i_Vaga = 83;
		}
		if (s_choice_Vaga.equals("від 86 до 90")) {
			i_Vaga = 88;
		}
		if (s_choice_Vaga.equals("від 91 до 95")) {
			i_Vaga = 93;
		}
		if (s_choice_Vaga.equals("від 96 до 100")) {
			i_Vaga = 98;
		}
		if (s_choice_Vaga.equals("від 101 до 105")) {
			i_Vaga = 103;
		}
		if (s_choice_Vaga.equals("від 106 до 110")) {
			i_Vaga = 108;
		}
		if (s_choice_Vaga.equals("від 111 до 115")) {
			i_Vaga = 113;
		}
		if (s_choice_Vaga.equals("від 116 до 120")) {
			i_Vaga = 118;
		}
		if (s_choice_Vaga.equals("від 121 до 125")) {
			i_Vaga = 123;
		}
		if (s_choice_Vaga.equals("від 126 до 130")) {
			i_Vaga = 128;
		}
		if (s_choice_Vaga.equals("від 131 до 135")) {
			i_Vaga = 133;
		}
		if (s_choice_Vaga.equals("від 136 до 140")) {
			i_Vaga = 138;
		}
		if (s_choice_Vaga.equals("від 141 до 145")) {
			i_Vaga = 143;
		}
		if (s_choice_Vaga.equals("від 146 до 150")) {
			i_Vaga = 148;
		}
		if (s_choice_Vaga.equals("понад 151")) {
			i_Vaga = 155;
		}

		// Zrist

		if (s_choice_Zrist.equals("до 120 см.")) {
			d_Zrist = 1.20;
		}
		if (s_choice_Zrist.equals("від 121 до 130 см.")) {
			d_Zrist = 1.25;
		}
		if (s_choice_Zrist.equals("від 131 до 140 см.")) {
			d_Zrist = 1.35;
		}
		if (s_choice_Zrist.equals("від 141 до 150 см.")) {
			d_Zrist = 1.45;
		}
		if (s_choice_Zrist.equals("від 151 до 160 см.")) {
			d_Zrist = 1.55;
		}
		if (s_choice_Zrist.equals("від 161 до 170 см.")) {
			d_Zrist = 1.65;
		}
		if (s_choice_Zrist.equals("від 171 до 180 см.")) {
			d_Zrist = 1.75;
		}
		if (s_choice_Zrist.equals("від 181 до 190 см.")) {
			d_Zrist = 1.85;
		}
		if (s_choice_Zrist.equals("від 191 до 200 см.")) {
			d_Zrist = 1.95;
		}
		if (s_choice_Zrist.equals("від 201 до 210 см.")) {
			d_Zrist = 2.05;
		}
		if (s_choice_Zrist.equals("понад 211 см.")) {
			d_Zrist = 2.15;
		}

		// IMT

		if (i_Vaga / (d_Zrist * d_Zrist) >= 29) {
			i_Navantagenna = i_Navantagenna - 5;
		}
		if (i_Vaga / (d_Zrist * d_Zrist) <= 17) {
			i_Navantagenna = i_Navantagenna - 5;
		}

		System.out.println(i_Vaga / (d_Zrist * d_Zrist));
		System.out.println(i_Navantagenna);

		if (s_choice_VudSportu.equals("Хокей")) {
			if (i_Navantagenna != 10) {
				JOptionPane.showMessageDialog(null,
						"Вам НЕ рекомендовано займатись видом спорту: " + s_choice_VudSportu
								+ ".\nЗверніть увагу на своє здоров'я.\n" + "Бережіть себе !",
						"Увага", JOptionPane.ERROR_MESSAGE);
			}
		} else {

			if (i_Navantagenna == 5) {
				JOptionPane.showMessageDialog(null,
						"Вам необхідно обережно ставитись до навандажень та не перенапружуватись.\nБережіть себе !",
						"Увага", JOptionPane.WARNING_MESSAGE);
			}
			if (i_Navantagenna < 5) {
				JOptionPane.showMessageDialog(null,
						"Вам необхідно надзвичайно обережно ставитись до навандажень,"
								+ "\nні в якому разі не перенапружуватись.\nЯкщо Ви не консультувались"
								+ " з лікарем, то незволікайте. Бережіть себе !",
						"Увага", JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	/**
	 * @wbp.parser.constructor
	 */
	public Oputuvanna1(String s_choice_Finansu, String s_choice_VudSportu, String s_choice_Uminna,
			String s_choice_VudStrilbu, String s_choice_VudZbroi) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		JLabel l_Hapka = new JLabel("Вам рекомендується придбати:");
		l_Hapka.setFont(new Font("Monotype Corsiva", Font.BOLD, 50));
		l_Hapka.setHorizontalAlignment(SwingConstants.CENTER);
		l_Hapka.setBounds(12, 13, 770, 54);
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

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 116, 794, 449);
		getContentPane().add(scrollPane);

		JLabel l_recomendacia = new JLabel("");
		scrollPane.setViewportView(l_recomendacia);

		if (s_choice_VudSportu.equals("Шахи")) {

			l_komentar = new JLabel("Даний вид спорту досить невибагливий відносто інвентаря");

			if (s_choice_Finansu.equals("Часто задумуюсь про свій бюджет")
					|| s_choice_Finansu.equals("Ледве зводжу кінці з кінцями")) {
				s_rekomendacia = "res" + "/" + "Шахи" + "/" + "MinFinansu.png";
			} else {
				s_rekomendacia = "res" + "/" + "Шахи" + "/" + "MaxFinansu.png";
			}
		} else {

			l_komentar = new JLabel("Даний вид спорту досить вибагливий та коштовний");

			if (s_choice_Uminna.equals("Профі")) {
				if (s_choice_VudZbroi.equals("Гвинтівка")) {

				}
				if (s_choice_VudZbroi.equals("Пістолет")) {

				}
				if (s_choice_VudZbroi.equals("Лук")) {
					s_rekomendacia = "res" + "/" + "Стрільба" + "/" + "Лук" + "/" + "MaxUminna.png";
				}
			}
			if (s_choice_Uminna.equals("Любитель")) {
				if (s_choice_VudZbroi.equals("Гвинтівка")) {

				}
				if (s_choice_VudZbroi.equals("Пістолет")) {

				}
				if (s_choice_VudZbroi.equals("Лук")) {
					s_rekomendacia = "res" + "/" + "Стрільба" + "/" + "Лук" + "/" + "NormUminna.png";
				}
			}
			if (s_choice_Uminna.equals("Нище середнього") || s_choice_Uminna.equals("Я навчаюсь")) {
				if (s_choice_VudZbroi.equals("Гвинтівка")) {

				}
				if (s_choice_VudZbroi.equals("Пістолет")) {

				}
				if (s_choice_VudZbroi.equals("Лук")) {
					s_rekomendacia = "res" + "/" + "Стрільба" + "/" + "Лук" + "/" + "MinUminna.png";
				}
			}

			if (s_choice_VudStrilbu.equals("Стендова")) {

				int reply = JOptionPane.showConfirmDialog(null,
						"Ви обрали стендову стрільбу.\n"
								+ "Бажаєте переглянути де можна\nзнайти машину для запуску мішеней\n",
						"Упс...", JOptionPane.YES_NO_OPTION);
				if (reply == JOptionPane.YES_OPTION) {
					try {
						desktop.browse(new URI("https://ibis.net.ua/products/ustrojstva-dlja-metanija-tarelok/"));
					} catch (Exception e1) {
					}
				}
			}
		}

		File file_vuvestuProfil = new File(s_rekomendacia);
		try {
			image_vuvestuProfil = ImageIO.read(file_vuvestuProfil);
			l_recomendacia.setIcon(new ImageIcon(image_vuvestuProfil));
		} catch (Exception e1) {
		}

		l_komentar.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_komentar.setHorizontalAlignment(SwingConstants.CENTER);
		l_komentar.setBounds(22, 79, 760, 25);
		getContentPane().add(l_komentar);

		setVisible(true);
	}
}
