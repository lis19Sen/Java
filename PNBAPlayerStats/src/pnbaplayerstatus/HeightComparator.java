package pnbaplayerstatus;

import java.util.Comparator;

public class HeightComparator implements Comparator<Player>{

	@Override
	public int compare(Player player1, Player player2) {
		// TODO Auto-generated method stub
		Double heightComparator = 100 *(player1.getHeight() - player2.getHeight());
		int result = heightComparator.intValue();
		return result;
	}

}
