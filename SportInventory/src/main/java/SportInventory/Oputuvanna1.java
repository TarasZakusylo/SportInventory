package SportInventory;

import javax.swing.JFrame;

public class Oputuvanna1 extends JFrame {

	private static final long serialVersionUID = 1L;

	int i_Vik ;
	int i_Vaga ; 
	double d_Zrist ; 
	
	public Oputuvanna1(String Finansu, String s_choice_Stat, String s_choice_Vaga, String s_choice_Zrist,
			String s_choice_Zdorovj, String s_choice_Finansu, String s_choice_VudSportu, String s_choice_Uminna) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		System.out.println(1);

		setVisible(true);
	}
	
	public Oputuvanna1(String s_choice_Vik, String s_choice_Stat, String s_choice_Vaga, String s_choice_Zrist,
			String s_choice_Zdorovj, String s_choice_Finansu, String s_choice_VudSportu, String s_choice_Uminna, String s_choice_Komanda) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		System.out.println(2);
		
		int i_Navantagenna = 0 ;
		
		// Zdorovj
		
		if(s_choice_Zdorovj.equals("Впевнений у своєму здоров'ї") || s_choice_Zdorovj.equals("Здоровий, але недавно втратив форму")){
			i_Navantagenna = 10;
		}
		if(s_choice_Zdorovj.equals("Маю сумніви") || s_choice_Zdorovj.equals("Мені варто більше звертати увагу на це")){
			i_Navantagenna = 5 ; 
		}
		if(s_choice_Zdorovj.equals("Жахливий стан")){
			i_Navantagenna = 0 ;
		}
 
		// Vik
		
		if (s_choice_Vik.equals("понад 51")){
			 i_Navantagenna = i_Navantagenna-5 ;
		}
		
        // Vaga
		
		if (s_choice_Vaga.equals("до 50")){
		  i_Vaga = 50 ; 
		}
		if (s_choice_Vaga.equals("від 51 до 55")){
			i_Vaga = 53 ; 
		}
		if (s_choice_Vaga.equals("від 56 до 60")){
			i_Vaga = 58 ; 
		}
		if (s_choice_Vaga.equals("від 61 до 65")){
			i_Vaga =  63 ; 
		}
		if (s_choice_Vaga.equals("від 66 до 70")){
			i_Vaga =  68 ; 
		}
		if (s_choice_Vaga.equals("від 71 до 75")){
			i_Vaga =  73 ; 
		}
		if (s_choice_Vaga.equals("від 76 до 80")){
			i_Vaga =  78 ; 
		}
		if (s_choice_Vaga.equals("від 81 до 85")){
			i_Vaga =  83 ; 
		}
		if (s_choice_Vaga.equals("від 86 до 90")){
			i_Vaga =  88 ; 
		}
		if (s_choice_Vaga.equals("від 91 до 95")){
			i_Vaga =  93; 
		}
		if (s_choice_Vaga.equals("від 96 до 100")){
			i_Vaga =  98 ; 
		}
		if (s_choice_Vaga.equals("від 101 до 105")){
			i_Vaga =  103 ; 
		}
		if (s_choice_Vaga.equals("від 106 до 110")){
			i_Vaga =  108 ; 
		}
		if (s_choice_Vaga.equals("від 111 до 115")){
			i_Vaga =  113 ; 
		}
		if (s_choice_Vaga.equals("від 116 до 120")){
			i_Vaga =  118 ; 
		}
		if (s_choice_Vaga.equals("від 121 до 125")){
			i_Vaga =  123 ; 
		}
		if (s_choice_Vaga.equals("від 126 до 130")){
			i_Vaga =  128 ; 
		}
		if (s_choice_Vaga.equals("від 131 до 135")){
			i_Vaga =  133 ; 
		}
		if (s_choice_Vaga.equals("від 136 до 140")){
			i_Vaga =  138 ; 
		}
		if (s_choice_Vaga.equals("від 141 до 145")){
			i_Vaga =   143; 
		}
		if (s_choice_Vaga.equals("від 146 до 150")){
			i_Vaga =  148 ; 
		}
		if (s_choice_Vaga.equals("понад 151")){
			i_Vaga =  155 ; 
		}
 
		//Zrist		
		
		if (s_choice_Zrist.equals("до 120 см.")){
			d_Zrist =  1.20 ; 
		}
		if (s_choice_Zrist.equals("від 121 до 130 см.")){
			d_Zrist =  1.25 ; 
		}
		if (s_choice_Zrist.equals("від 131 до 140 см.")){
			d_Zrist =  1.35 ; 
		}
		if (s_choice_Zrist.equals("від 141 до 150 см.")){
			d_Zrist =  1.45 ; 
		}
		if (s_choice_Zrist.equals("від 151 до 160 см.")){
			d_Zrist =  1.55 ; 
		}
		if (s_choice_Zrist.equals("від 161 до 170 см.")){
			d_Zrist =  1.65 ; 
		}
		if (s_choice_Zrist.equals("від 171 до 180 см.")){
			d_Zrist =  1.75 ; 
		}
		if (s_choice_Zrist.equals("від 181 до 190 см.")){
			d_Zrist =  1.85 ; 
		}
		if (s_choice_Zrist.equals("від 191 до 200 см.")){
			d_Zrist =  1.95 ; 
		}
		if (s_choice_Zrist.equals("від 201 до 210 см.")){
			d_Zrist =  2.05 ; 
		}
		if (s_choice_Zrist.equals("понад 211 см.")){
			d_Zrist =  2.15 ; 
		}
		
		// IMT
		
		if( i_Vaga/(d_Zrist*d_Zrist) >= 29){			
			i_Navantagenna = i_Navantagenna-5 ;
		}
		if( i_Vaga/(d_Zrist*d_Zrist) <= 17){			
			i_Navantagenna = i_Navantagenna-5 ;
		}
		
		// Finansu
 		
		if (s_choice_Finansu.equals("Для мене гроші - не проблема")|| s_choice_Finansu.equals("Дуже рідко відмовляю собі в чомусь")){
			
		}
		if (s_choice_Finansu.equals("Важко відповісти")){
			
		}
		if (s_choice_Finansu.equals("Часто задумуюсь про свій бюджет")|| s_choice_Finansu.equals("Ледве зводжу кінці з кінцями")){
			
		}
		
		
		System.out.println(i_Vaga/(d_Zrist*d_Zrist));
		System.out.println(i_Navantagenna);

		setVisible(true);
	}

}
