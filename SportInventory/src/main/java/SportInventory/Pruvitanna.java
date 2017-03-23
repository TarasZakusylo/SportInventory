package SportInventory;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Pruvitanna extends JFrame{
 
	private static final long serialVersionUID = 1L;

	public Pruvitanna(String s) {
		super(s);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Рекомендації");
		lblNewLabel.setFont(new Font("Monotype Corsiva", Font.BOLD, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 48, 794, 58);
		getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("спортивного інвентаря та");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Monotype Corsiva", Font.BOLD, 40));
		label.setBounds(0, 107, 794, 58);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("екіпіровки");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Monotype Corsiva", Font.BOLD, 40));
		label_1.setBounds(0, 164, 794, 58);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Натисніть, будь ласка, на екран для продовження");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label_2.setBounds(0, 259, 794, 58);
		getContentPane().add(label_2);
		
		JLabel lblHengehog = new JLabel("@ Hengehog");
		lblHengehog.setHorizontalAlignment(SwingConstants.CENTER);
		lblHengehog.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblHengehog.setBounds(567, 538, 227, 27);
		getContentPane().add(lblHengehog);
		
		getContentPane().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new EC1("Опитування 1");
				setVisible(false);
			}
		});
		
		setVisible(true);
		
	}
}
