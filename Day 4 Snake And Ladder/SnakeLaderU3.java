public class SnakeLaderU3 {
	public static final int NO_PLAY = 0;
	public static final int LADDER = 1;
	public static final int SNAKE = 2;
	public static final int START = 0;
	public static void main(String[] args){
		int pos = 0;
		System.out.println("Starting position of player is: " + START);
		int roll = (int) (Math.floor(Math.random() * 10) % 6 + 1);
		System.out.println("Number on rolled dice is : " +roll);
		int con = (int) (Math.floor(Math.random() * 10) % 3);
	switch (con){
		case NO_PLAY:
			System.out.println("You are in No_Play Condition");
			System.out.println("New Position is: " + pos);
			break;
		case LADDER:
			System.out.println("You are in LADDER condition, move ahead");
                	pos = pos + roll;
                  	System.out.println("New Position is: " + pos);
                  	break;
		case SNAKE:
                	pos = pos - roll;
			System.out.println("Snake bit you");
			if ( pos >= 0)
                  		System.out.println("New Position is: " + pos);
			else
				pos = 0;
				System.out.println("New Position is: " + pos);
                  		break;
		default:
				System.out.println("Default");
				break;
			}
	}
}

