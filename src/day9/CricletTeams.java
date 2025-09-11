package day9;

public class CricletTeams {

	public static void main(String[] args) {
		int players[]= {4,5,3,6};
		int teamSize=3;
		
		int maxNumberOfTeams = findmaxTeams(players,teamSize);
		System.out.println(maxNumberOfTeams);

	}

	private static int findmaxTeams(int[] players, int teamSize) {
		int first=1;
		int last=10;
		int mid;
		while(first<=last)
		{
			mid=(first+last)/2;			//mid=5
			
			if(isMidTeamsPossible(players,mid,teamSize))
			{
				if(isMidTeamsPossible(players,mid+1,teamSize))
				{
					first=mid+1;
				}
				else
				{
					return mid;
				}
			}
			else
			{
				last=mid-1;
			}
			
		}
		return 0;
		
	}

	private static boolean isMidTeamsPossible(int[] players, int mid, int teamSize) {
		int totalPlayers=mid*teamSize;				//teamSize=20     mid=5
		
		int sum=0;
		for(int i=0;i<players.length;i++)		//{4,5,3,6}			sum 0,4,9,12,17
		{
			sum+=Math.min(mid, players[i]);
		}
		
		if(sum>=totalPlayers)
			return true;
		else
			return false;
	}

}
