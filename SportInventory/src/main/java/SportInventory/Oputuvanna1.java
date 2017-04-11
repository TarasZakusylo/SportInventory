package SportInventory;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import java.awt.Color;
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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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

	String s_Hkola_Klub;

	int i_Navantagenna = 0;

	private JLabel l_komentar;
	private JLabel l_komentar1;

	Desktop desktop = Desktop.getDesktop();

	private boolean boolean_StendovaStrilba = false;
	private boolean boolean_Akademi4neVesluvanna = false;

	private JScrollPane scrollPane_Recomandacia;

	private JButton b_ekipirivka = new JButton("Екіпіровка");
	private JButton b_Hkola = new JButton("Спортивні школи");
	private JButton b_Klub = new JButton("Ігрові клуби");
 	private JButton b_misce = new JButton("Місця для занять");
	private JButton b_kuputu = new JButton("Перейти до купівлі");
	
	private JLabel l_fon;

	public void OputuvannaKomanda(String s_choice_Vik, String s_choice_Vaga, String s_choice_Zrist,
			String s_choice_Zdorovj, String s_choice_Finansu, String s_choice_VudSportu, String s_choice_Komanda) {

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
			l_min_finansu = new JLabel("Ваш бюджет це повна свобода,");
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
				b_ekipirivka.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						try {
							desktop.browse(new URI("http://www.volleymag.com.ua/catalog/myzhskaja-igrovaja-forma/"));
						} catch (Exception e1) {
						}
					}
				});				
			}
			if (s_choice_VudSportu.equals("Футбол")) {
				s_rekomendacia = "res" + "/" + "Footboll" + "/" + "MaxFinansu.png";
				if (i_Komanda >= 6) {
					l_rokomand_zagalno = new JLabel(
							"необхідно знайти стадіон для гри та місце для зберігання обладнання");
				} else {
					l_rokomand_zagalno = new JLabel("рекомендується індивідуальні вправи (чи/або прийоми в парі)");
				}
				b_ekipirivka.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						try {
							desktop.browse(new URI("http://soccer-shop.com.ua/c1-futbolnaya_forma"));
						} catch (Exception e1) {
						}
					}
				});
			}
			if (s_choice_VudSportu.equals("Баскетбол")) {
				s_rekomendacia = "res" + "/" + "Basketball" + "/" + "MaxFinansu.png";
				if (i_Komanda >= 4) {
					l_rokomand_zagalno = new JLabel("необхідно знайти майданчик для гри та зберігання обладнання");
				} else {
					l_rokomand_zagalno = new JLabel("рекомендується індивідуальні вправи (чи/або прийоми в парі)");
				}
				b_ekipirivka.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						try {
							desktop.browse(new URI(
									"http://og-shop.in.ua/ru/shop/Obyv/?param&select[6][]=48&select[7][]=108&sort=popular"));
						} catch (Exception e1) {
						}
					}
				});
			}
			if (s_choice_VudSportu.equals("Гандбол")) {
				s_rekomendacia = "res" + "/" + "Handball" + "/" + "MaxFinansu.png";
				if (i_Komanda >= 4) {
					l_rokomand_zagalno = new JLabel(
							"необхідно знайти майданчик для гри та місце для зберігання обладнання");
				} else {
					l_rokomand_zagalno = new JLabel("рекомендується індивідуальні вправи (чи/або прийоми в парі)");
				}

				b_ekipirivka.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						try {
							desktop.browse(new URI("http://4sport.com.ua/sports/handball/buy-gandbolnaya-forma/"));
						} catch (Exception e1) {
						}
					}
				});
			}
			if (s_choice_VudSportu.equals("Хокей")) {
				s_rekomendacia = "res" + "/" + "Хокей" + "/" + "MaxFinansu.png";
				if (i_Komanda >= 4) {
					l_rokomand_zagalno = new JLabel(
							"необхідно знайти майданчик для гри та місце для зберігання обладнання");
				} else {
					l_rokomand_zagalno = new JLabel("рекомендується індивідуальні вправи (чи/або прийоми в парі)");
				}

				b_ekipirivka.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						try {
							desktop.browse(new URI("http://iqhockey.com.ua/about-us.html"));
						} catch (Exception e1) {
						}
					}
				});

			}
		}
		if (s_choice_Finansu.equals("Важко відповісти")) {
			l_min_finansu = new JLabel("Ваш бюджет досить вільний,");
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

				b_ekipirivka.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						try {
							desktop.browse(new URI("http://www.volleymag.com.ua/catalog/myzhskaja-igrovaja-forma/"));
						} catch (Exception e1) {
						}
					}
				});
			}
			if (s_choice_VudSportu.equals("Футбол")) {
				s_rekomendacia = "res" + "/" + "Footboll" + "/" + "NormFinansu.png";
				if (i_Komanda >= 6) {
					l_rokomand_zagalno = new JLabel(
							"необхідно знайти стадіон для гри та місце для зберігання обладнання");
				} else {
					l_rokomand_zagalno = new JLabel("рекомендується індивідуальні вправи (чи/або прийоми в парі)");
				}

				b_ekipirivka.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						try {
							desktop.browse(new URI("http://soccer-shop.com.ua/c1-futbolnaya_forma"));
						} catch (Exception e1) {
						}
					}
				});
			}
			if (s_choice_VudSportu.equals("Баскетбол")) {
				s_rekomendacia = "res" + "/" + "Basketball" + "/" + "NormFinansu.png";
				if (i_Komanda >= 4) {
					l_rokomand_zagalno = new JLabel("необхідно знайти майданчик для гри та зберігання обладнання");
				} else {
					l_rokomand_zagalno = new JLabel("рекомендується індивідуальні вправи (чи/або прийоми в парі)");
				}

				b_ekipirivka.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						try {
							desktop.browse(new URI(
									"http://og-shop.in.ua/ru/shop/Obyv/?param&select[6][]=48&select[7][]=108&sort=popular"));
						} catch (Exception e1) {
						}
					}
				});
			}
			if (s_choice_VudSportu.equals("Гандбол")) {
				s_rekomendacia = "res" + "/" + "Handball" + "/" + "NormFinansu.png";
				if (i_Komanda >= 4) {
					l_rokomand_zagalno = new JLabel(
							"необхідно знайти майданчик для гри та місце для зберігання обладнання");
				} else {
					l_rokomand_zagalno = new JLabel("рекомендується індивідуальні вправи (чи/або прийоми в парі)");
				}

				b_ekipirivka.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						try {
							desktop.browse(new URI("http://4sport.com.ua/sports/handball/buy-gandbolnaya-forma/"));
						} catch (Exception e1) {
						}
					}
				});
			}
			if (s_choice_VudSportu.equals("Хокей")) {
				s_rekomendacia = "res" + "/" + "Хокей" + "/" + "NormFinansu.png";
				if (i_Komanda >= 4) {
					l_rokomand_zagalno = new JLabel(
							"необхідно знайти майданчик для гри та місце для зберігання обладнання");
				} else {
					l_rokomand_zagalno = new JLabel("рекомендується індивідуальні вправи (чи/або прийоми в парі)");
				}

				b_ekipirivka.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						try {
							desktop.browse(new URI("http://iqhockey.com.ua/about-us.html"));
						} catch (Exception e1) {
						}
					}
				});
			}
		}
		if (s_choice_Finansu.equals("Часто задумуюсь про свій бюджет")
				|| s_choice_Finansu.equals("Ледве зводжу кінці з кінцями")) {

			l_min_finansu = new JLabel("На жаль, Ваш бюджет обмежений,");

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
			if (s_choice_VudSportu.equals("Гандбол")) {
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
			b_ekipirivka.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					JOptionPane.showMessageDialog(null, "На жаль, Ваш бюджет не дозволяє Вам купувати екіпіровку.",
							"Увага", JOptionPane.WARNING_MESSAGE);
				}
			});
		}

		l_rokomand_zagalno.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_rokomand_zagalno.setHorizontalAlignment(SwingConstants.CENTER);
		l_rokomand_zagalno.setBounds(12, 174, 770, 34);
		getContentPane().add(l_rokomand_zagalno);

		l_min_finansu.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_min_finansu.setHorizontalAlignment(SwingConstants.CENTER);
		l_min_finansu.setBounds(12, 80, 770, 34);
		getContentPane().add(l_min_finansu);

		scrollPane_Recomandacia = new JScrollPane();
		scrollPane_Recomandacia.setBounds(0, 213, 794, 312);
		getContentPane().add(scrollPane_Recomandacia);

		hapka(s_choice_Vik);

		if (s_choice_VudSportu.equals("Волейбол")) {

//			b_kuputu.addActionListener(new ActionListener() {
//				public void actionPerformed(ActionEvent arg0) {
//					try {
//						desktop.browse(new URI("https://footballstyle.com.ua/"));
//					} catch (Exception e1) {
//					}
//				}
//			});
			b_misce.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					Map map = new Map("Волейбол");
				}
			});
//			b_Hkola.addActionListener(new ActionListener() {
//				public void actionPerformed(ActionEvent arg0) {
//					try {
//						desktop.browse(new URI(""));
//					} catch (Exception e1) {
//					}
//				}
//			});
//			b_Klub.addActionListener(new ActionListener() {
//				public void actionPerformed(ActionEvent arg0) {
//					try {
//						desktop.browse(new URI(""));
//					} catch (Exception e1) {
//					}
//				}
//			});
		}
		if (s_choice_VudSportu.equals("Футбол")) {

//			b_kuputu.addActionListener(new ActionListener() {
//				public void actionPerformed(ActionEvent arg0) {
//					try {
//						desktop.browse(new URI(""));
//					} catch (Exception e1) {
//					}
//				}
//			});
//			b_misce.addActionListener(new ActionListener() {
//				public void actionPerformed(ActionEvent arg0) {
//					try {
//						desktop.browse(new URI(""));
//					} catch (Exception e1) {
//					}
//				}
//			});
//			b_Hkola.addActionListener(new ActionListener() {
//				public void actionPerformed(ActionEvent arg0) {
//					try {
//						desktop.browse(new URI(""));
//					} catch (Exception e1) {
//					}
//				}
//			});
//			b_Klub.addActionListener(new ActionListener() {
//				public void actionPerformed(ActionEvent arg0) {
//					try {
//						desktop.browse(new URI(""));
//					} catch (Exception e1) {
//					}
//				}
//			});
		}
		if (s_choice_VudSportu.equals("Баскетбол")) {

//			b_kuputu.addActionListener(new ActionListener() {
//				public void actionPerformed(ActionEvent arg0) {
//					try {
//						desktop.browse(new URI(""));
//					} catch (Exception e1) {
//					}
//				}
//			});
//			b_misce.addActionListener(new ActionListener() {
//				public void actionPerformed(ActionEvent arg0) {
//					try {
//						desktop.browse(new URI(""));
//					} catch (Exception e1) {
//					}
//				}
//			});
//			b_Hkola.addActionListener(new ActionListener() {
//				public void actionPerformed(ActionEvent arg0) {
//					try {
//						desktop.browse(new URI(""));
//					} catch (Exception e1) {
//					}
//				}
//			});
//			b_Klub.addActionListener(new ActionListener() {
//				public void actionPerformed(ActionEvent arg0) {
//					try {
//						desktop.browse(new URI(""));
//					} catch (Exception e1) {
//					}
//				}
//			});
		}
		if (s_choice_VudSportu.equals("Гандбол")) {

//			b_kuputu.addActionListener(new ActionListener() {
//				public void actionPerformed(ActionEvent arg0) {
//					try {
//						desktop.browse(new URI(""));
//					} catch (Exception e1) {
//					}
//				}
//			});
//			b_misce.addActionListener(new ActionListener() {
//				public void actionPerformed(ActionEvent arg0) {
//					try {
//						desktop.browse(new URI(""));
//					} catch (Exception e1) {
//					}
//				}
//			});
//			b_Hkola.addActionListener(new ActionListener() {
//				public void actionPerformed(ActionEvent arg0) {
//					try {
//						desktop.browse(new URI(""));
//					} catch (Exception e1) {
//					}
//				}
//			});
//			b_Klub.addActionListener(new ActionListener() {
//				public void actionPerformed(ActionEvent arg0) {
//					try {
//						desktop.browse(new URI(""));
//					} catch (Exception e1) {
//					}
//				}
//			});
		}
		if (s_choice_VudSportu.equals("Хокей")) {

//			b_kuputu.addActionListener(new ActionListener() {
//				public void actionPerformed(ActionEvent arg0) {
//					try {
//						desktop.browse(new URI(""));
//					} catch (Exception e1) {
//					}
//				}
//			});
//			b_misce.addActionListener(new ActionListener() {
//				public void actionPerformed(ActionEvent arg0) {
//					try {
//						desktop.browse(new URI(""));
//					} catch (Exception e1) {
//					}
//				}
//			});
//			b_Hkola.addActionListener(new ActionListener() {
//				public void actionPerformed(ActionEvent arg0) {
//					try {
//						desktop.browse(new URI(""));
//					} catch (Exception e1) {
//					}
//				}
//			});
//			b_Klub.addActionListener(new ActionListener() {
//				public void actionPerformed(ActionEvent arg0) {
//					try {
//						desktop.browse(new URI(""));
//					} catch (Exception e1) {
//					}
//				}
//			});
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

		if (s_choice_VudSportu.equals("Хокей") || s_choice_VudSportu.equals("Бойові мистецтва")
				|| s_choice_VudSportu.equals("Важка атлетика") || s_choice_VudSportu.equals("Веслування")
				|| s_choice_VudSportu.equals("Альпінізм")) {
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

	public void OputuvannaNoZdorovja(final String s_choice_Finansu, String s_choice_VudSportu, String s_choice_Uminna,
			final String s_choice_VudStrilbu, String s_choice_VudZbroi, String s_choice_Vik) {

		scrollPane_Recomandacia = new JScrollPane();
		scrollPane_Recomandacia.setBounds(0, 116, 794, 409);
		getContentPane().add(scrollPane_Recomandacia);

		JLabel l_recomendacia = new JLabel("");
		scrollPane_Recomandacia.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				stendova(s_choice_VudStrilbu);
			}
		});
		scrollPane_Recomandacia.setViewportView(l_recomendacia);

		if (s_choice_VudSportu.equals("Шахи")) {

			l_komentar = new JLabel("Даний вид спорту досить невибагливий відносто інвентаря");
			l_komentar.setFont(new Font("Times New Roman", Font.BOLD, 20));
			l_komentar.setHorizontalAlignment(SwingConstants.CENTER);
			l_komentar.setBounds(0, 74, 794, 25);
			getContentPane().add(l_komentar);

			if (s_choice_Finansu.equals("Часто задумуюсь про свій бюджет")
					|| s_choice_Finansu.equals("Ледве зводжу кінці з кінцями")) {
				s_rekomendacia = "res" + "/" + "Шахи" + "/" + "MinFinansu.png";
			} else {
				s_rekomendacia = "res" + "/" + "Шахи" + "/" + "MaxFinansu.png";
			}

			b_ekipirivka.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					JOptionPane.showMessageDialog(null, "Даний вид спорту не передбачає екіпіровки");
				}
			});

		} else {
			// стрільба
			l_komentar = new JLabel("Даний вид спорту досить вибагливий та коштовний.");
			l_komentar1 = new JLabel("Також Вам необхідний тир чи полігон.");

			l_komentar.setFont(new Font("Times New Roman", Font.BOLD, 20));
			l_komentar.setHorizontalAlignment(SwingConstants.CENTER);
			l_komentar.setBounds(0, 64, 794, 25);
			getContentPane().add(l_komentar);

			l_komentar1.setFont(new Font("Times New Roman", Font.BOLD, 20));
			l_komentar1.setHorizontalAlignment(SwingConstants.CENTER);
			l_komentar1.setBounds(0, 91, 794, 25);
			getContentPane().add(l_komentar1);

			if (s_choice_Uminna.equals("Профі")) {
				if (s_choice_VudZbroi.equals("Гвинтівка")) {
					s_rekomendacia = "res" + "/" + "Стрільба" + "/" + "Гвинтівка" + "/" + "MaxUminna.png";
				}
				if (s_choice_VudZbroi.equals("Пістолет")) {
					s_rekomendacia = "res" + "/" + "Стрільба" + "/" + "Пістолет" + "/" + "MaxUminna.png";
				}
				if (s_choice_VudZbroi.equals("Лук")) {
					s_rekomendacia = "res" + "/" + "Стрільба" + "/" + "Лук" + "/" + "MaxUminna.png";
				}
			}
			if (s_choice_Uminna.equals("Любитель")) {
				if (s_choice_VudZbroi.equals("Гвинтівка")) {
					s_rekomendacia = "res" + "/" + "Стрільба" + "/" + "Гвинтівка" + "/" + "NormUminna.png";
				}
				if (s_choice_VudZbroi.equals("Пістолет")) {
					s_rekomendacia = "res" + "/" + "Стрільба" + "/" + "Пістолет" + "/" + "NormUminna.png";
				}
				if (s_choice_VudZbroi.equals("Лук")) {
					s_rekomendacia = "res" + "/" + "Стрільба" + "/" + "Лук" + "/" + "NormUminna.png";
				}
			}
			if (s_choice_Uminna.equals("Нище середнього") || s_choice_Uminna.equals("Я навчаюсь")) {
				if (s_choice_VudZbroi.equals("Гвинтівка")) {
					s_rekomendacia = "res" + "/" + "Стрільба" + "/" + "Гвинтівка" + "/" + "MinUminna.png";
				}
				if (s_choice_VudZbroi.equals("Пістолет")) {
					s_rekomendacia = "res" + "/" + "Стрільба" + "/" + "Пістолет" + "/" + "MinUminna.png";
				}
				if (s_choice_VudZbroi.equals("Лук")) {
					s_rekomendacia = "res" + "/" + "Стрільба" + "/" + "Лук" + "/" + "MinUminna.png";
				}
			}

			getContentPane().addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent arg0) {
					stendova(s_choice_VudStrilbu);
				}
			});

			b_ekipirivka.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						desktop.browse(new URI("http://www.shooting-ua.com/arhiv_sorevnovaniy/methods_17.5.htm"));
					} catch (Exception e1) {
					}
				}
			});

		}

		hapka(s_choice_Vik);

		setVisible(true);
	}

	void stendova(String s_choice_VudStrilbu) {
		if (s_choice_VudStrilbu.equals("Стендова") && boolean_StendovaStrilba == false) {

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

			boolean_StendovaStrilba = true;
		}
	}

	public void hapka(String s_choice_Vik) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		JLabel l_Hapka = new JLabel("Вам рекомендується придбати:");
		l_Hapka.setFont(new Font("Monotype Corsiva", Font.BOLD, 50));
		l_Hapka.setForeground(Color.BLUE);
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

		// де-які важливі деталі

		b_kuputu.setBounds(0, 524, 200, 41);
		getContentPane().add(b_kuputu);

		b_misce.setBounds(397, 524, 200, 41);
		getContentPane().add(b_misce);

		b_ekipirivka.setBounds(199, 524, 200, 41);
		getContentPane().add(b_ekipirivka);

		JLabel l_rekomandacia = new JLabel();
		scrollPane_Recomandacia.setViewportView(l_rekomandacia);

		File file_vuvestuProfil = new File(s_rekomendacia);

		try {
			image_vuvestuProfil = ImageIO.read(file_vuvestuProfil);
		} catch (Exception e1) {
		}

		l_rekomandacia.setIcon(new ImageIcon(image_vuvestuProfil));

		if (s_choice_Vik.equals("до 18")) {
			b_Hkola.setBounds(594, 524, 200, 41);			
		} else {
			b_Klub.setBounds(594, 524, 200, 41);			
		}
		
		getContentPane().add(b_Hkola);
		getContentPane().add(b_Klub);

		// fon

		l_fon = new JLabel("");
		l_fon.setIcon(new ImageIcon("res/fon_Rezultat.png"));
		l_fon.setBounds(0, 0, 800, 600);
		getContentPane().add(l_fon);

	}

	public void OputuvannaZdorovja(String s_choice_Vik, String s_choice_Stat, String s_choice_Vaga,
			String s_choice_Zrist, String s_choice_Zdorovj, final String s_choice_Finansu, String s_choice_VudSportu,
			String s_choice_Uminna, final String s_choice_Vud) {

		Zdorovia(s_choice_Zdorovj, s_choice_Vik, s_choice_Vaga, s_choice_Zrist, s_choice_VudSportu);

		scrollPane_Recomandacia = new JScrollPane();
		scrollPane_Recomandacia.setBounds(0, 116, 794, 409);
		getContentPane().add(scrollPane_Recomandacia);

		JLabel l_recomendacia = new JLabel("");
		scrollPane_Recomandacia.setViewportView(l_recomendacia);
		scrollPane_Recomandacia.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if (s_choice_Vud.equals("Академічне")) {
					akademi4neVesludanna();
				}
			}
		});

		if (s_choice_VudSportu.equals("Бойові мистецтва") || s_choice_VudSportu.equals("Важка атлетика")) {

			l_komentar = new JLabel("Даний вид спорту досить невибагливий відносто інвентаря");
			l_komentar.setFont(new Font("Times New Roman", Font.BOLD, 20));
			l_komentar.setHorizontalAlignment(SwingConstants.CENTER);
			l_komentar.setBounds(0, 74, 794, 25);
			getContentPane().add(l_komentar);

			if (s_choice_VudSportu.equals("Бойові мистецтва")) {

				if (s_choice_Vud.equals("Боротьба") || s_choice_Vud.equals("Айкідо")
						|| s_choice_Vud.equals("Панкратіон") || s_choice_Vud.equals("Сумо")) {
					if (s_choice_Finansu.equals("Часто задумуюсь про свій бюджет")
							|| s_choice_Finansu.equals("Ледве зводжу кінці з кінцями")) {
						s_rekomendacia = "res" + "/" + "Бойові мистецтва" + "/" + "БоротьбаАйкідоПанкратіонСумо" + "/"
								+ "MinFinansu.png";
					}
					if (s_choice_Finansu.equals("Важко відповісти")) {
						s_rekomendacia = "res" + "/" + "Бойові мистецтва" + "/" + "БоротьбаАйкідоПанкратіонСумо" + "/"
								+ "NormFinansu.png";
					}
					if (s_choice_Finansu.equals("Для мене гроші - не проблема")
							|| s_choice_Finansu.equals("Дуже рідко відмовляю собі в чомусь")) {
						s_rekomendacia = "res" + "/" + "Бойові мистецтва" + "/" + "БоротьбаАйкідоПанкратіонСумо" + "/"
								+ "MaxFinansu.png";
					}

					b_ekipirivka.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							if (s_choice_Finansu.equals("Часто задумуюсь про свій бюджет")
									|| s_choice_Finansu.equals("Ледве зводжу кінці з кінцями")) {
								JOptionPane.showMessageDialog(null,
										"На жаль, Ваш бюджет не дозволяє Вам купувати екіпіровку.", "Увага",
										JOptionPane.WARNING_MESSAGE);
							} else {
								if (s_choice_Vud.equals("Боротьба")) {
									try {
										desktop.browse(new URI("http://adx.in.ua/g3650237-borba"));
									} catch (Exception e1) {
									}
								}
								if (s_choice_Vud.equals("Айкідо")) {
									try {
										desktop.browse(new URI("http://prom.ua/Kimono-dlya-ajkido.html"));
									} catch (Exception e1) {
									}
								}
								if (s_choice_Vud.equals("Панкратіон")) {
									try {
										desktop.browse(new URI("http://sportcombat.com.ua/catalog/pankration"));
									} catch (Exception e1) {
									}
								}
							}
							if (s_choice_Vud.equals("Сумо")) {
								JOptionPane.showMessageDialog(null,
										"Мавасі робиться методом складання 50см. тканини великої товщини.");
							}

						}
					});

				}

				if (s_choice_Vud.equals("Бокс") || s_choice_Vud.equals("Самбо") || s_choice_Vud.equals("Кікбоксинг")) {
					if (s_choice_Finansu.equals("Часто задумуюсь про свій бюджет")
							|| s_choice_Finansu.equals("Ледве зводжу кінці з кінцями")) {
						s_rekomendacia = "res" + "/" + "Бойові мистецтва" + "/" + "БоксСамбоКікбоксинг" + "/"
								+ "MinFinansu.png";
					}
					if (s_choice_Finansu.equals("Важко відповісти")) {
						s_rekomendacia = "res" + "/" + "Бойові мистецтва" + "/" + "БоксСамбоКікбоксинг" + "/"
								+ "NormFinansu.png";
					}
					if (s_choice_Finansu.equals("Для мене гроші - не проблема")
							|| s_choice_Finansu.equals("Дуже рідко відмовляю собі в чомусь")) {
						s_rekomendacia = "res" + "/" + "Бойові мистецтва" + "/" + "БоксСамбоКікбоксинг" + "/"
								+ "MaxFinansu.png";
					}

					b_ekipirivka.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							if (s_choice_Finansu.equals("Часто задумуюсь про свій бюджет")
									|| s_choice_Finansu.equals("Ледве зводжу кінці з кінцями")) {
								JOptionPane.showMessageDialog(null,
										"На жаль, Ваш бюджет не дозволяє Вам купувати екіпіровку.", "Увага",
										JOptionPane.WARNING_MESSAGE);
							} else {
								if (s_choice_Vud.equals("Бокс")) {
									try {
										desktop.browse(new URI("http://adx.in.ua/g4836866-boks-ekipirovka-forma"));
									} catch (Exception e1) {
									}
								}
								if (s_choice_Vud.equals("Самбо")) {
									try {
										desktop.browse(new URI("http://viasport.com.ua/martial-arts/sambo"));
									} catch (Exception e1) {
									}
								}
								if (s_choice_Vud.equals("Кікбоксинг")) {
									try {
										desktop.browse(new URI("http://adx.in.ua/g3650222-kikboksing"));
									} catch (Exception e1) {
									}
								}
							}
						}
					});

				}
				if (s_choice_Vud.equals("Тхеквондо") || s_choice_Vud.equals("Теквандо") || s_choice_Vud.equals("Ушу")) {
					if (s_choice_Finansu.equals("Часто задумуюсь про свій бюджет")
							|| s_choice_Finansu.equals("Ледве зводжу кінці з кінцями")) {
						s_rekomendacia = "res" + "/" + "Бойові мистецтва" + "/" + "ТхеквондоТеквандоУшу" + "/"
								+ "MinFinansu.png";
					}
					if (s_choice_Finansu.equals("Важко відповісти")) {
						s_rekomendacia = "res" + "/" + "Бойові мистецтва" + "/" + "ТхеквондоТеквандоУшу" + "/"
								+ "NormFinansu.png";
					}
					if (s_choice_Finansu.equals("Для мене гроші - не проблема")
							|| s_choice_Finansu.equals("Дуже рідко відмовляю собі в чомусь")) {
						s_rekomendacia = "res" + "/" + "Бойові мистецтва" + "/" + "ТхеквондоТеквандоУшу" + "/"
								+ "MaxFinansu.png";
					}

					b_ekipirivka.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							if (s_choice_Finansu.equals("Часто задумуюсь про свій бюджет")
									|| s_choice_Finansu.equals("Ледве зводжу кінці з кінцями")) {
								JOptionPane.showMessageDialog(null,
										"На жаль, Ваш бюджет не дозволяє Вам купувати екіпіровку.", "Увага",
										JOptionPane.WARNING_MESSAGE);
							} else {
								if (s_choice_Vud.equals("Тхеквондо")) {
									try {
										desktop.browse(new URI("http://adx.in.ua/g4748042-thekvondo-wtf"));
									} catch (Exception e1) {
									}
								}
								if (s_choice_Vud.equals("Теквандо")) {
									try {
										desktop.browse(new URI("http://adx.in.ua/g4748042-thekvondo-wtf"));
									} catch (Exception e1) {
									}
								}
								if (s_choice_Vud.equals("Ушу")) {
									try {
										desktop.browse(new URI("https://bokuto.com.ua/odejda/taichi/"));
									} catch (Exception e1) {
									}
								}
							}
						}
					});
				}

			} else { // Важка атлетика
				if (s_choice_Finansu.equals("Часто задумуюсь про свій бюджет")
						|| s_choice_Finansu.equals("Ледве зводжу кінці з кінцями")
						|| s_choice_Finansu.equals("Важко відповісти")) {
					s_rekomendacia = "res" + "/" + "Важка атлетика" + "/" + "MinFinansu.png";
				} else {
					s_rekomendacia = "res" + "/" + "Важка атлетика" + "/" + "MaxFinansu.png";
				}

				b_ekipirivka.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						if (s_choice_Finansu.equals("Часто задумуюсь про свій бюджет")
								|| s_choice_Finansu.equals("Ледве зводжу кінці з кінцями")) {
							JOptionPane.showMessageDialog(null,
									"На жаль, Ваш бюджет не дозволяє Вам купувати екіпіровку.", "Увага",
									JOptionPane.WARNING_MESSAGE);
						} else {

							try {
								desktop.browse(new URI("http://terrasport.ua/dir_heavy_weight.htm"));
							} catch (Exception e1) {
							}
						}
					}
				});
			}

		} else {

			l_komentar = new JLabel("Даний вид спорту досить вибагливий, коштовний та СЕЗОННИЙ.");
			l_komentar1 = new JLabel("Зверніть увагу! Інвентар об'ємний, необхідне місце для зберігання.");

			l_komentar.setFont(new Font("Times New Roman", Font.BOLD, 20));
			l_komentar.setHorizontalAlignment(SwingConstants.CENTER);
			l_komentar.setBounds(0, 64, 794, 25);
			getContentPane().add(l_komentar);

			l_komentar1.setFont(new Font("Times New Roman", Font.BOLD, 20));
			l_komentar1.setHorizontalAlignment(SwingConstants.CENTER);
			l_komentar1.setBounds(0, 91, 794, 25);
			getContentPane().add(l_komentar1);

			if (s_choice_VudSportu.equals("Веслування")) {
				if (s_choice_Vud.equals("Академічне")) {
					if (s_choice_Finansu.equals("Часто задумуюсь про свій бюджет")
							|| s_choice_Finansu.equals("Ледве зводжу кінці з кінцями")) {
						s_rekomendacia = "res" + "/" + "Веслування" + "/" + "Академічне" + "/" + "MinFinansu.png";
					}
					if (s_choice_Finansu.equals("Важко відповісти")) {
						s_rekomendacia = "res" + "/" + "Веслування" + "/" + "Академічне" + "/" + "NormFinansu.png";
					}
					if (s_choice_Finansu.equals("Для мене гроші - не проблема")
							|| s_choice_Finansu.equals("Дуже рідко відмовляю собі в чомусь")) {
						s_rekomendacia = "res" + "/" + "Веслування" + "/" + "Академічне" + "/" + "MaxFinansu.png";
					}
				}
				if (s_choice_Vud.equals("Байдарка")) {
					if (s_choice_Finansu.equals("Часто задумуюсь про свій бюджет")
							|| s_choice_Finansu.equals("Ледве зводжу кінці з кінцями")) {
						s_rekomendacia = "res" + "/" + "Веслування" + "/" + "Байдарка" + "/" + "MinFinansu.png";
					}
					if (s_choice_Finansu.equals("Важко відповісти")) {
						s_rekomendacia = "res" + "/" + "Веслування" + "/" + "Байдарка" + "/" + "NormFinansu.png";
					}
					if (s_choice_Finansu.equals("Для мене гроші - не проблема")
							|| s_choice_Finansu.equals("Дуже рідко відмовляю собі в чомусь")) {
						s_rekomendacia = "res" + "/" + "Веслування" + "/" + "Байдарка" + "/" + "MaxFinansu.png";
					}
				}
				if (s_choice_Vud.equals("Каное")) {
					if (s_choice_Finansu.equals("Часто задумуюсь про свій бюджет")
							|| s_choice_Finansu.equals("Ледве зводжу кінці з кінцями")) {
						s_rekomendacia = "res" + "/" + "Веслування" + "/" + "Каное" + "/" + "MinFinansu.png";
					}
					if (s_choice_Finansu.equals("Важко відповісти")) {
						s_rekomendacia = "res" + "/" + "Веслування" + "/" + "Каное" + "/" + "NormFinansu.png";
					}
					if (s_choice_Finansu.equals("Для мене гроші - не проблема")
							|| s_choice_Finansu.equals("Дуже рідко відмовляю собі в чомусь")) {
						s_rekomendacia = "res" + "/" + "Веслування" + "/" + "Каное" + "/" + "MaxFinansu.png";
					}
				}
				b_ekipirivka.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						if (s_choice_Finansu.equals("Часто задумуюсь про свій бюджет")
								|| s_choice_Finansu.equals("Ледве зводжу кінці з кінцями")) {
							JOptionPane.showMessageDialog(null,
									"На жаль, Ваш бюджет не дозволяє Вам купувати екіпіровку.", "Увага",
									JOptionPane.WARNING_MESSAGE);
						} else {
							try {
								desktop.browse(new URI("https://nicebike.ru/lodki/odegda_dlia_grebli/"));
							} catch (Exception e1) {
							}
						}
					}
				});
			} else { // Альпінізм
				if (s_choice_Finansu.equals("Часто задумуюсь про свій бюджет")
						|| s_choice_Finansu.equals("Ледве зводжу кінці з кінцями")) {
					s_rekomendacia = "res" + "/" + "Альпінізм" + "/" + "MinFinansu.png";
				}
				if (s_choice_Finansu.equals("Важко відповісти")) {
					s_rekomendacia = "res" + "/" + "Альпінізм" + "/" + "NormFinansu.png";
				}
				if (s_choice_Finansu.equals("Для мене гроші - не проблема")
						|| s_choice_Finansu.equals("Дуже рідко відмовляю собі в чомусь")) {
					s_rekomendacia = "res" + "/" + "Альпінізм" + "/" + "MaxFinansu.png";
				}

				b_ekipirivka.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						if (s_choice_Finansu.equals("Часто задумуюсь про свій бюджет")
								|| s_choice_Finansu.equals("Ледве зводжу кінці з кінцями")) {
							JOptionPane.showMessageDialog(null,
									"На жаль, Ваш бюджет не дозволяє Вам купувати екіпіровку.", "Увага",
									JOptionPane.WARNING_MESSAGE);
						} else {

							try {
								desktop.browse(new URI("http://alp.com.ua/odezjda-i-obuv"));
							} catch (Exception e1) {
							}
						}
					}
				});
			}

			getContentPane().addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent arg0) {
					if (s_choice_Vud.equals("Академічне")) {
						akademi4neVesludanna();
					}
				}
			});
		}

		hapka(s_choice_Vik);

		setVisible(true);
	}

	void akademi4neVesludanna() {
		if (boolean_Akademi4neVesluvanna == false) {

			JOptionPane.showMessageDialog(null, "Академічне веслування - командний вид спорту.");

			boolean_Akademi4neVesluvanna = true;
		}
	}

}
