import game.Player;

public class Helloworld {

	public static void main(String[] args) {
		
		System.out.println(Player.strClan); // ���������� ���������
		System.out.println(Player.strDescription);
		
		Player player = new Player(); //�������� ���������� ������
		Player player = new Player("����");
		
		System.out.println(player.strName );
		player.strName = "�����1";
		System.out.println(player.strName );
    //
		System.out.println( player.getLifes() );
		player.setLifes(100);
		System.out.println( player.getLifes() );
		
		Overload over = new Overload();
		
		over.setLifes(100); // ����� �����
		over.setLifes(3.1415f);
		over.setLifes("123"); //������
		
		
	}

}
