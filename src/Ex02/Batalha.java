package Ex02;
import Ex01.*;

public class Batalha {
	private static String ATTACK = "attack";
	private static String DEFENSE = "defense";
	
	public static String event() {
		if (Math.random() < 0.5)
			return ATTACK;
		else return DEFENSE;
}
	public static int selecAtaque() {
		double rand = Math.random();
		if (rand >= 0 && rand < 0.25)
			return 0;
		else if (rand >= 0.25 && rand < 0.5)
			return 1;
		else if (rand >= 0.5 && rand < 0.75)
			return 2;
		else
			return 3;
	}
	private static Mestre criaMestre(String nome, int HP) {
		Golpes[] golpes = new Golpes[3];
		
		golpes[0] = new Golpes("Força", 20, 2);
		golpes[1] = new Golpes("Ataque com Sabre", 50, 3);
		golpes[2] = new Golpes("Telecinese", 30, 2);
		golpes[3] = new Golpes("Soco", 25, 3);
		
		Mestre mJedi = new Mestre(HP);
		
		mJedi.setNome(nome);
		
		mJedi.addGolpe(golpes[0]);
		mJedi.addGolpe(golpes[1]);
		mJedi.addGolpe(golpes[2]);
		mJedi.addGolpe(golpes[3]);
		
		return mJedi;		
	}
	
	private static Lorde criaLorde(String nomeSith, int HP) {
		Golpes[] golpes = new Golpes[3];
		
		golpes[0] = new Golpes("Força", 10, 2);
		golpes[1] = new Golpes("Ataque com Sabre", 60, 3);
		golpes[2] = new Golpes("Telecinese", 20, 2);
		golpes[3] = new Golpes("Thunder", 40, 2);
		
		Lorde lSith = new Lorde(nomeSith, HP);
				
		lSith.addGolpe(golpes[0]);
		lSith.addGolpe(golpes[1]);
		lSith.addGolpe(golpes[2]);
		lSith.addGolpe(golpes[3]);
		
		return lSith;
	}
	
	private static void battle(String jedi, String sith) {
		
		String sithAction;
		String jediAction;
		Mestre mestreJedi = criaMestre(jedi, 500);
		Lorde lordeSith = criaLorde(sith, 500);
		
		while (mestreJedi.getHP() > 0 && lordeSith.getHP() > 0) {
			//bla bla bla whiska sache
		}
		if(mestreJedi.getHP() > 0) {
			System.out.println(jedi + " venceu esta batalha!");
		}
		else {
			System.out.println(sith + " venceu esta batalha!");
		}
	}
	
}