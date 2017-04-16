package SportInventory;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class Map extends JFrame {

	private static final long serialVersionUID = 1L;

	Desktop desktop = Desktop.getDesktop();

	public Map(final String s_VudSportu, int i_Hkola_Klub) {
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
		l_luck.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					desktop.browse(new URI(
							"https://yandex.ua/maps/20222/lutsk/?ll=25.352568%2C50.755493&spn=0.04311914000000172%2C0.04309851000000009&from=1org_near&z=13&mode=search&text=%D0%A4%D1%96%D1%82%D0%BD%D0%B5%D1%81&sll=25.329136%2C50.750835&sspn=0.192604%2C0.067084"));

				} catch (Exception e1) {
				}
			}
		});
		l_luck.setBounds(92, 98, 84, 88);
		getContentPane().add(l_luck);

		JLabel l_Rivne = new JLabel("");
		l_Rivne.setBounds(175, 106, 56, 97);
		getContentPane().add(l_Rivne);
		l_Rivne.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					desktop.browse(new URI(
							"https://yandex.ua/maps/10355/rivne/?ll=26.241064%2C50.617167&spn=0.04311914000000172%2C0.04309851000000009&from=1org_near&z=13&mode=search&text=%D0%A4%D1%96%D1%82%D0%BD%D0%B5%D1%81&sll=26.248274%2C50.613672&sspn=0.148659%2C0.083774"));
				} catch (Exception e1) {
				}
			}
		});

		JLabel l_Jutomur = new JLabel("");
		l_Jutomur.setBounds(238, 117, 92, 117);
		getContentPane().add(l_Jutomur);
		l_Jutomur.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					desktop.browse(new URI(
							"https://yandex.ua/maps/10343/zhytomyr/?ll=28.673107%2C50.257934&spn=0.04311914000000172%2C0.04309851000000009&from=1org_near&z=13&mode=search&text=%D0%A4%D1%96%D1%82%D0%BD%D0%B5%D1%81&sll=28.673107%2C50.257934&sspn=0.148659%2C0.084409&sctx=CAAAAAEAdXKG4o4%2FOkBHPNnNjE5JQLXGoBNCB8M%2Ff05BfjZytT8AAAAABQAAAAAAAAABR4c6Zi2O9oZDUAAAAb3%2Ffz8AAAAAAAAAAA%3D%3D"));
				} catch (Exception e1) {
				}
			}
		});

		JLabel l_Kiev = new JLabel("");
		l_Kiev.setBounds(328, 128, 56, 149);
		getContentPane().add(l_Kiev);
		l_Kiev.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					desktop.browse(new URI(
							"https://yandex.ua/maps/143/kyiv/?ll=30.531012%2C50.448412&spn=0.04311914000000172%2C0.04309851000000009&from=1org_near&z=12&mode=search&text=%D0%A4%D1%96%D1%82%D0%BD%D0%B5%D1%81&sll=30.531012%2C50.448412&sspn=0.385208%2C0.135037&sctx=CAAAAAEAdXKG4o4%2FOkBHPNnNjE5JQLXGoBNCB8M%2Ff05BfjZytT8AAAAABQAAAAAAAAABR4c6Zi2O9oaPAAAAAVj%2Ffz8AAAAAAAAAAA%3D%3D"));
				} catch (Exception e1) {
				}
			}
		});

		JLabel l_Kiev1 = new JLabel("");
		l_Kiev1.setBounds(380, 183, 56, 51);
		getContentPane().add(l_Kiev1);
		l_Kiev1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					desktop.browse(new URI(
							"https://yandex.ua/maps/143/kyiv/?ll=30.531012%2C50.448412&spn=0.04311914000000172%2C0.04309851000000009&from=1org_near&z=12&mode=search&text=%D0%A4%D1%96%D1%82%D0%BD%D0%B5%D1%81&sll=30.531012%2C50.448412&sspn=0.385208%2C0.135037&sctx=CAAAAAEAdXKG4o4%2FOkBHPNnNjE5JQLXGoBNCB8M%2Ff05BfjZytT8AAAAABQAAAAAAAAABR4c6Zi2O9oaPAAAAAVj%2Ffz8AAAAAAAAAAA%3D%3D"));
				} catch (Exception e1) {
				}
			}
		});

		JLabel l_Cernigiv = new JLabel("");
		l_Cernigiv.setBounds(380, 64, 105, 122);
		getContentPane().add(l_Cernigiv);
		l_Cernigiv.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					desktop.browse(new URI(
							"https://yandex.ua/maps/966/chernihiv/?ll=31.289390%2C51.505372&spn=0.04311914000000172%2C0.04309851000000009&from=1org_near&z=13&mode=search&text=%D0%A4%D1%96%D1%82%D0%BD%D0%B5%D1%81&sll=31.289390%2C51.505372&sspn=0.192604%2C0.065991&sctx=CAAAAAEAdXKG4o4%2FOkBHPNnNjE5JQLXGoBNCB8M%2Ff05BfjZytT8AAAAABQAAAAAAAAABR4c6Zi2O9obGAwAAAfT%2Bfz8AAAAAAAAAAA%3D%3D"));
				} catch (Exception e1) {
				}
			}
		});

		JLabel l_Summy = new JLabel("");
		l_Summy.setBounds(473, 74, 118, 122);
		getContentPane().add(l_Summy);
		l_Summy.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					desktop.browse(new URI(
							"https://yandex.ua/maps/965/sumy/?ll=34.804303%2C50.906091&spn=0.04311914000000172%2C0.04309851000000009&from=1org_near&z=13&mode=search&text=%D0%A4%D1%96%D1%82%D0%BD%D0%B5%D1%81&sll=34.804303%2C50.906091&sspn=0.148659%2C0.083249&sctx=CAAAAAEAdXKG4o4%2FOkBHPNnNjE5JQLXGoBNCB8M%2Ff05BfjZytT8AAAAABQAAAAAAAAABR4c6Zi2O9oZIUAAAAcb9fz8AAAAAAAAAAA%3D%3D"));
				} catch (Exception e1) {
				}
			}
		});

		JLabel l_Lviv = new JLabel("");
		l_Lviv.setBounds(39, 199, 97, 75);
		getContentPane().add(l_Lviv);
		l_Lviv.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					desktop.browse(new URI(
							"https://yandex.ua/maps/144/lviv/?ll=24.013827%2C49.819218&spn=0.04311914000000172%2C0.04309851000000009&from=1org_near&z=13&mode=search&text=%D0%A4%D1%96%D1%82%D0%BD%D0%B5%D1%81&sll=24.013827%2C49.819218&sspn=0.192604%2C0.068417&sctx=CAAAAAEAdXKG4o4%2FOkBHPNnNjE5JQLXGoBNCB8M%2Ff05BfjZytT8AAAAABQAAAAAAAAABR4c6Zi2O9oYxUAAAAZP9fz8AAAAAAAAAAA%3D%3D"));
				} catch (Exception e1) {
				}
			}
		});

		JLabel l_Ternopol = new JLabel("");
		l_Ternopol.setBounds(148, 216, 46, 97);
		getContentPane().add(l_Ternopol);
		l_Ternopol.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					desktop.browse(new URI(
							"https://yandex.ua/maps/10357/ternopil/?ll=25.610939%2C49.550476&spn=0.04311914000000172%2C0.04309851000000009&from=1org_near&z=13&mode=search&text=%D0%A4%D1%96%D1%82%D0%BD%D0%B5%D1%81&sll=25.610939%2C49.550476&sspn=0.192604%2C0.068799&sctx=CAAAAAEAdXKG4o4%2FOkBHPNnNjE5JQLXGoBNCB8M%2Ff05BfjZytT8AAAAABQAAAAAAAAABR4c6Zi2O9oZ1KAAAAXL9fz8AAAAAAAAAAA%3D%3D"));
				} catch (Exception e1) {
				}
			}
		});

		JLabel l_Hmelnuckuy = new JLabel("");
		l_Hmelnuckuy.setBounds(196, 199, 56, 117);
		getContentPane().add(l_Hmelnuckuy);
		l_Hmelnuckuy.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					desktop.browse(new URI(
							"https://yandex.ua/maps/961/khmelnytskyi/?ll=26.991498%2C49.422239&spn=0.04311914000000172%2C0.04309851000000009&from=1org_near&z=14&mode=search&text=%D0%A4%D1%96%D1%82%D0%BD%D0%B5%D1%81&sll=26.991498%2C49.422239&sspn=0.096302%2C0.034490&sctx=CAAAAAEAdXKG4o4%2FOkBHPNnNjE5JQLXGoBNCB8M%2Ff05BfjZytT8AAAAABQAAAAAAAAABR4c6Zi2O9obBAwAAAVD9fz8AAAAAAAAAAA%3D%3D"));
				} catch (Exception e1) {
				}
			}
		});

		JLabel l_Vinnisa = new JLabel("");
		l_Vinnisa.setBounds(248, 235, 92, 112);
		getContentPane().add(l_Vinnisa);
		l_Vinnisa.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
					try {
						desktop.browse(new URI(
								"https://yandex.ua/maps/963/vinnytsia/?ll=28.479095%2C49.225388&spn=0.04311914000000172%2C0.04309851000000009&from=1org_near&z=13&mode=search&text=%D0%A4%D1%96%D1%82%D0%BD%D0%B5%D1%81&sll=28.479095%2C49.225388&sspn=0.192604%2C0.069258&sctx=CAAAAAEAdXKG4o4%2FOkBHPNnNjE5JQLXGoBNCB8M%2Ff05BfjZytT8AAAAABQAAAAAAAAABR4c6Zi2O9oY2XwAAAQ39fz8AAAAAAAAAAA%3D%3D"));
					} catch (Exception e1) {
					}				
			}
		});

		JLabel l_Cerkasu = new JLabel("");
		l_Cerkasu.setBounds(338, 262, 68, 51);
		getContentPane().add(l_Cerkasu);
		l_Cerkasu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					desktop.browse(new URI(
							"https://yandex.ua/maps/10363/cherkasy/?ll=32.047596%2C49.432187&spn=0.04311914000000172%2C0.04309851000000009&from=1org_near&z=13&mode=search&text=%D0%A4%D1%96%D1%82%D0%BD%D0%B5%D1%81&sll=32.047596%2C49.432187&sspn=0.192604%2C0.068966&sctx=CAAAAAEAdXKG4o4%2FOkBHPNnNjE5JQLXGoBNCB8M%2Ff05BfjZytT8AAAAABQAAAAAAAAABR4c6Zi2O9ob6YAAAAcr8fz8AAAAAAAAAAA%3D%3D"));
				} catch (Exception e1) {
				}
			}
		});

		JLabel l_Cerkasu1 = new JLabel("");
		l_Cerkasu1.setBounds(396, 235, 78, 63);
		getContentPane().add(l_Cerkasu1);
		l_Cerkasu1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					desktop.browse(new URI(
							"https://yandex.ua/maps/10363/cherkasy/?ll=32.047596%2C49.432187&spn=0.04311914000000172%2C0.04309851000000009&from=1org_near&z=13&mode=search&text=%D0%A4%D1%96%D1%82%D0%BD%D0%B5%D1%81&sll=32.047596%2C49.432187&sspn=0.192604%2C0.068966&sctx=CAAAAAEAdXKG4o4%2FOkBHPNnNjE5JQLXGoBNCB8M%2Ff05BfjZytT8AAAAABQAAAAAAAAABR4c6Zi2O9ob6YAAAAcr8fz8AAAAAAAAAAA%3D%3D"));
				} catch (Exception e1) {
				}
			}
		});

		JLabel l_Poltava = new JLabel("");
		l_Poltava.setBounds(458, 199, 105, 88);
		getContentPane().add(l_Poltava);
		l_Poltava.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					desktop.browse(new URI(
							"https://yandex.ua/maps/964/poltava/?ll=34.543779%2C49.587883&spn=0.04311914000000172%2C0.04309851000000009&from=1org_near&z=13&mode=search&text=%D0%A4%D1%96%D1%82%D0%BD%D0%B5%D1%81&sll=34.543779%2C49.587883&sspn=0.192604%2C0.068746&sctx=CAAAAAEAdXKG4o4%2FOkBHPNnNjE5JQLXGoBNCB8M%2Ff05BfjZytT8AAAAABQAAAAAAAAABR4c6Zi2O9obEAwAAAYf8fz8AAAAAAAAAAA%3D%3D"));
				} catch (Exception e1) {
				}
			}
		});

		JLabel l_Harkiv = new JLabel("");
		l_Harkiv.setBounds(566, 187, 118, 111);
		getContentPane().add(l_Harkiv);
		l_Harkiv.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					desktop.browse(new URI(
							"https://yandex.ua/maps/147/kharkiv/?ll=36.242823%2C49.989373&spn=0.04311914000000172%2C0.04309851000000009&from=1org_near&z=12&mode=search&text=%D0%A4%D1%96%D1%82%D0%BD%D0%B5%D1%81&sll=36.242823%2C49.989373&sspn=0.385208%2C0.136350&sctx=CAAAAAEAdXKG4o4%2FOkBHPNnNjE5JQLXGoBNCB8M%2Ff05BfjZytT8AAAAABQAAAAAAAAABR4c6Zi2O9oayYAAAAa37fz8AAAAAAAAAAA%3D%3D"));
				} catch (Exception e1) {
				}
			}
		});

		JLabel l_Lugansk = new JLabel("");
		l_Lugansk.setBounds(702, 216, 78, 131);
		getContentPane().add(l_Lugansk);
		l_Lugansk.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JOptionPane.showMessageDialog(null, "Вибачте, на даний момент цей регіон недоступний.");
			}
		});

		JLabel l_Ujgorod = new JLabel("");
		l_Ujgorod.setBounds(10, 287, 84, 65);
		getContentPane().add(l_Ujgorod);
		l_Ujgorod.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					desktop.browse(new URI(
							"https://yandex.ua/maps/10358/uzhhorod/?ll=22.291145%2C48.613956&spn=0.04311914000000172%2C0.04309851000000009&from=1org_near&z=14&mode=search&text=%D0%A4%D1%96%D1%82%D0%BD%D0%B5%D1%81&sll=22.291145%2C48.613956&sspn=0.096302%2C0.035058&sctx=CAAAAAEAdXKG4o4%2FOkBHPNnNjE5JQLXGoBNCB8M%2Ff05BfjZytT8AAAAABQAAAAAAAAABR4c6Zi2O9oZ2KAAAAdP6fz8AAAAAAAAAAA%3D%3D"));
				} catch (Exception e1) {
				}
			}
		});

		JLabel l_IF = new JLabel("");
		l_IF.setBounds(90, 280, 61, 88);
		getContentPane().add(l_IF);
		l_IF.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					desktop.browse(new URI(
							"https://yandex.ua/maps/10345/ivano-frankivsk/?ll=24.734114%2C48.916685&spn=0.04311914000000172%2C0.04309851000000009&from=1org_near&z=13&mode=search&text=%D0%A4%D1%96%D1%82%D0%BD%D0%B5%D1%81&sll=24.734114%2C48.916685&sspn=0.192604%2C0.069692&sctx=CAAAAAEAdXKG4o4%2FOkBHPNnNjE5JQLXGoBNCB8M%2Ff05BfjZytT8AAAAABQAAAAAAAAABR4c6Zi2O9oY0UAAAAaD6fz8AAAAAAAAAAA%3D%3D"));
				} catch (Exception e1) {
				}
			}
		});

		JLabel l_Cernivci = new JLabel("");
		l_Cernivci.setBounds(147, 314, 92, 51);
		getContentPane().add(l_Cernivci);
		l_Cernivci.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					desktop.browse(new URI(
							"https://yandex.ua/maps/10365/chernivtsi/?ll=25.954630%2C48.275870&spn=0.04311914000000172%2C0.04309851000000009&from=1org_near&z=14&mode=search&text=%D0%A4%D1%96%D1%82%D0%BD%D0%B5%D1%81&sll=25.954630%2C48.275870&sspn=0.096302%2C0.035294&sctx=CAAAAAEAdXKG4o4%2FOkBHPNnNjE5JQLXGoBNCB8M%2Ff05BfjZytT8AAAAABQAAAAAAAAABR4c6Zi2O9oY0UAAAAX%2F6fz8AAAAAAAAAAA%3D%3D"));
				} catch (Exception e1) {
				}
			}
		});

		JLabel l_Kirovograd = new JLabel("");
		l_Kirovograd.setBounds(380, 297, 118, 50);
		getContentPane().add(l_Kirovograd);
		l_Kirovograd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					desktop.browse(new URI(
							"https://yandex.ua/maps/20221/kropyvnytskyi/?ll=32.256679%2C48.508499&spn=0.04311914000000172%2C0.04309851000000009&from=1org_near&z=13&mode=search&text=%D0%A4%D1%96%D1%82%D0%BD%D0%B5%D1%81&sll=32.256679%2C48.508499&sspn=0.192604%2C0.070263&sctx=CAAAAAEAdXKG4o4%2FOkBHPNnNjE5JQLXGoBNCB8M%2Ff05BfjZytT8AAAAABQAAAAAAAAABR4c6Zi2O9ob9TgAAAVH5fz8AAAAAAAAAAA%3D%3D"));
				} catch (Exception e1) {
				}
			}
		});

		JLabel l_Dnipro = new JLabel("");
		l_Dnipro.setBounds(497, 300, 146, 47);
		getContentPane().add(l_Dnipro);
		l_Dnipro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					desktop.browse(new URI(
							"https://yandex.ua/maps/141/dnipro/?ll=34.978924%2C48.438719&spn=0.04311914000000172%2C0.04309851000000009&from=1org_near&z=12&mode=search&text=%D0%A4%D1%96%D1%82%D0%BD%D0%B5%D1%81&sll=34.978924%2C48.438719&sspn=0.385208%2C0.140721&sctx=CAAAAAEAdXKG4o4%2FOkBHPNnNjE5JQLXGoBNCB8M%2Ff05BfjZytT8AAAAABQAAAAAAAAABR4c6Zi2O9oZSXwAAAXf4fz8AAAAAAAAAAA%3D%3D"));
				} catch (Exception e1) {
				}
			}
		});

		JLabel l_Dnipro1 = new JLabel("");
		l_Dnipro1.setBounds(469, 344, 84, 35);
		getContentPane().add(l_Dnipro1);
		l_Dnipro1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					desktop.browse(new URI(
							"https://yandex.ua/maps/141/dnipro/?ll=34.978924%2C48.438719&spn=0.04311914000000172%2C0.04309851000000009&from=1org_near&z=12&mode=search&text=%D0%A4%D1%96%D1%82%D0%BD%D0%B5%D1%81&sll=34.978924%2C48.438719&sspn=0.385208%2C0.140721&sctx=CAAAAAEAdXKG4o4%2FOkBHPNnNjE5JQLXGoBNCB8M%2Ff05BfjZytT8AAAAABQAAAAAAAAABR4c6Zi2O9oZSXwAAAXf4fz8AAAAAAAAAAA%3D%3D"));
				} catch (Exception e1) {
				}
			}
		});

		JLabel l_Doneck = new JLabel("");
		l_Doneck.setBounds(634, 287, 78, 131);
		getContentPane().add(l_Doneck);
		l_Doneck.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JOptionPane.showMessageDialog(null, "Вибачте, на даний момент цей регіон недоступний.");
			}
		});

		JLabel l_Odessa1 = new JLabel("");
		l_Odessa1.setBounds(279, 352, 84, 173);
		getContentPane().add(l_Odessa1);
		l_Odessa1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					desktop.browse(new URI(
							"https://yandex.ua/maps/145/odesa/?ll=30.696551%2C46.440057&spn=0.04311914000000172%2C0.04309851000000009&from=1org_near&z=12&mode=search&text=%D0%A4%D1%96%D1%82%D0%BD%D0%B5%D1%81&sll=30.696551%2C46.440057&sspn=0.385208%2C0.146205&sctx=CAAAAAEAdXKG4o4%2FOkBHPNnNjE5JQLXGoBNCB8M%2Ff05BfjZytT8AAAAABQAAAAAAAAABR4c6Zi2O9oaRAAAAAWr3fz8AAAAAAAAAAA%3D%3D"));
				} catch (Exception e1) {
				}
			}
		});

		JLabel l_Odessa = new JLabel("");
		l_Odessa.setBounds(362, 382, 34, 88);
		getContentPane().add(l_Odessa);
		l_Odessa.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					desktop.browse(new URI(
							"https://yandex.ua/maps/145/odesa/?ll=30.696551%2C46.440057&spn=0.04311914000000172%2C0.04309851000000009&from=1org_near&z=12&mode=search&text=%D0%A4%D1%96%D1%82%D0%BD%D0%B5%D1%81&sll=30.696551%2C46.440057&sspn=0.385208%2C0.146205&sctx=CAAAAAEAdXKG4o4%2FOkBHPNnNjE5JQLXGoBNCB8M%2Ff05BfjZytT8AAAAABQAAAAAAAAABR4c6Zi2O9oaRAAAAAWr3fz8AAAAAAAAAAA%3D%3D"));
				} catch (Exception e1) {
				}
			}
		});

		JLabel l_Mukolaiv = new JLabel("");
		l_Mukolaiv.setBounds(396, 359, 45, 88);
		getContentPane().add(l_Mukolaiv);
		l_Mukolaiv.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					desktop.browse(new URI(
							"https://yandex.ua/maps/148/mykolaiv/?ll=32.009505%2C46.959925&spn=0.04311914000000172%2C0.04309851000000009&from=1org_near&z=13&mode=search&text=%D0%A4%D1%96%D1%82%D0%BD%D0%B5%D1%81&sll=32.009505%2C46.959925&sspn=0.192604%2C0.072397&sctx=CAAAAAEAdXKG4o4%2FOkBHPNnNjE5JQLXGoBNCB8M%2Ff05BfjZytT8AAAAABQAAAAAAAAABR4c6Zi2O9oaUAAAAASf3fz8AAAAAAAAAAA%3D%3D"));
				} catch (Exception e1) {
				}
			}
		});

		JLabel l_Mukolaiv1 = new JLabel("");
		l_Mukolaiv1.setBounds(429, 360, 56, 58);
		getContentPane().add(l_Mukolaiv1);
		l_Mukolaiv1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					desktop.browse(new URI(
							"https://yandex.ua/maps/148/mykolaiv/?ll=32.009505%2C46.959925&spn=0.04311914000000172%2C0.04309851000000009&from=1org_near&z=13&mode=search&text=%D0%A4%D1%96%D1%82%D0%BD%D0%B5%D1%81&sll=32.009505%2C46.959925&sspn=0.192604%2C0.072397&sctx=CAAAAAEAdXKG4o4%2FOkBHPNnNjE5JQLXGoBNCB8M%2Ff05BfjZytT8AAAAABQAAAAAAAAABR4c6Zi2O9oaUAAAAASf3fz8AAAAAAAAAAA%3D%3D"));
				} catch (Exception e1) {
				}
			}
		});

		JLabel l_Mukolaiv2 = new JLabel("");
		l_Mukolaiv2.setBounds(361, 344, 68, 35);
		getContentPane().add(l_Mukolaiv2);
		l_Mukolaiv2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					desktop.browse(new URI(
							"https://yandex.ua/maps/148/mykolaiv/?ll=32.009505%2C46.959925&spn=0.04311914000000172%2C0.04309851000000009&from=1org_near&z=13&mode=search&text=%D0%A4%D1%96%D1%82%D0%BD%D0%B5%D1%81&sll=32.009505%2C46.959925&sspn=0.192604%2C0.072397&sctx=CAAAAAEAdXKG4o4%2FOkBHPNnNjE5JQLXGoBNCB8M%2Ff05BfjZytT8AAAAABQAAAAAAAAABR4c6Zi2O9oaUAAAAASf3fz8AAAAAAAAAAA%3D%3D"));
				} catch (Exception e1) {
				}
			}
		});

		JLabel l_Herson = new JLabel("");
		l_Herson.setBounds(439, 425, 118, 41);
		getContentPane().add(l_Herson);
		l_Herson.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					desktop.browse(new URI(
							"https://yandex.ua/maps/962/kherson/?ll=32.601805%2C46.651600&spn=0.04311914000000172%2C0.04309851000000009&from=1org_near&z=13&mode=search&text=%D0%A4%D1%96%D1%82%D0%BD%D0%B5%D1%81&sll=32.601805%2C46.651600&sspn=0.192604%2C0.072816&sctx=CAAAAAEAdXKG4o4%2FOkBHPNnNjE5JQLXGoBNCB8M%2Ff05BfjZytT8AAAAABQAAAAAAAAABR4c6Zi2O9obFYAAAARb3fz8AAAAAAAAAAA%3D%3D"));
				} catch (Exception e1) {
				}
			}
		});

		JLabel l_Herson1 = new JLabel("");
		l_Herson1.setBounds(473, 382, 68, 36);
		getContentPane().add(l_Herson1);
		l_Herson1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					desktop.browse(new URI(
							"https://yandex.ua/maps/962/kherson/?ll=32.601805%2C46.651600&spn=0.04311914000000172%2C0.04309851000000009&from=1org_near&z=13&mode=search&text=%D0%A4%D1%96%D1%82%D0%BD%D0%B5%D1%81&sll=32.601805%2C46.651600&sspn=0.192604%2C0.072816&sctx=CAAAAAEAdXKG4o4%2FOkBHPNnNjE5JQLXGoBNCB8M%2Ff05BfjZytT8AAAAABQAAAAAAAAABR4c6Zi2O9obFYAAAARb3fz8AAAAAAAAAAA%3D%3D"));
				} catch (Exception e1) {
				}
			}
		});

		JLabel l_Zaporija = new JLabel("");
		l_Zaporija.setBounds(545, 352, 98, 95);
		getContentPane().add(l_Zaporija);
		l_Zaporija.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					desktop.browse(new URI(
							"https://yandex.ua/maps/960/zaporizhia/?ll=35.159377%2C47.831009&spn=0.04311914000000172%2C0.04309851000000009&from=1org_near&z=12&mode=search&text=%D0%A4%D1%96%D1%82%D0%BD%D0%B5%D1%81&sll=35.159377%2C47.831009&sspn=0.385208%2C0.142406&sctx=CAAAAAEAdXKG4o4%2FOkBHPNnNjE5JQLXGoBNCB8M%2Ff05BfjZytT8AAAAABQAAAAAAAAABR4c6Zi2O9oY7UAAAAV72fz8AAAAAAAAAAA%3D%3D"));
				} catch (Exception e1) {
				}
			}
		});

		JLabel l_Simferopol = new JLabel("");
		l_Simferopol.setBounds(442, 479, 190, 86);
		getContentPane().add(l_Simferopol);
		l_Simferopol.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JOptionPane.showMessageDialog(null, "Вибачте, на даний момент цей регіон недоступний.");
			}
		});

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Zakkk\\Desktop\\map.jpg"));
		// label.setIcon(new ImageIcon("res/map.jpg"));
		label.setBounds(0, 0, 794, 565);
		getContentPane().add(label);

		setVisible(true);
	}
}
