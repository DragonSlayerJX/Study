import game.Player;

public class Helloworld {

	public static void main(String[] args) {
		
		System.out.println(Player.strClan); // статичесая пременная
		System.out.println(Player.strDescription);
		
		Player player = new Player(); //создание экземпляра класса
		Player player = new Player("Петя");
		
		System.out.println(player.strName );
		player.strName = "Игрок1";
		System.out.println(player.strName );
    //
		System.out.println( player.getLifes() );
		player.setLifes(100);
		System.out.println( player.getLifes() );
		
		Overload over = new Overload();
		
		over.setLifes(100); // целое число
		over.setLifes(3.1415f);
		over.setLifes("123"); //строкс
		
		
	}

}
