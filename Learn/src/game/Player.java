package game;

public class Player {
	
	public String strName = "Player";
    protected String strWeapon = "M4A1-S";
    private int nLifes; // = 0
	
    public final int MAX_LIFES = 100; // не измен€емое значение
    
    public static String strClan = "York";
    public static String strDescription = "ћой класс дл€ игрока";
    
    public Player() {
		// TODO Auto-generated constructor stub
	nLifes = 100;
    }
    
    public Player(String name) {
		// TODO Auto-generated constructor stub
	nLifes = 100;
	strName = name;
    }
    
    public int getLifes() {
		return nLifes;
	}
	public void setLifes(int nLifes) {
		if (nLifes > MAX_LIFES)
			nLifes = MAX_LIFES;
		if (nLifes < 0)
			nLifes = 0;
		this.nLifes = nLifes;
	}		
}
