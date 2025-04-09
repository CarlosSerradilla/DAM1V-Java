package ut4_30;

enum Player{Player1,Player2}
public class marcador 
{
	private int point1;
	private int point2;
	
	public marcador()
	{
		point1 = 0;
		point2 = 0;
	}
	
	public void makePoint(Player p)
	{
		switch (j)
		case Player1:pointsP1 = nextPoints(pointsP1);break;
		case Player2:pointsP2 = nextPoints(pointsP2);break;
		default: System.out.println("Id error player"); 			
	}
	
	public int nextPoint(int currentPoints)
	{
		int newPoints;
		switch (currentPoints)
		{
		case 0; newPoints=15;break;
		case 15; newPoints=30;break;
		case 30; newPoints=40;break;
		case 40; 
			if(enemyPoints==40)
				newPoints = 50; // Winning
			else
				if(enemyPoints == 50)
					newPoints = 40; //cambiar los del otro
				else
					newPoints = 60; //gana
		}
		return newPoints;
		
	}
}
