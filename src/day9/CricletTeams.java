package day9;

import java.util.Scanner;

public class CricletTeams {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of countries");
		int size=sc.nextInt();
		
		int players[]= new int[size];
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter number of players from country " + (i+1));
			players[i]=sc.nextInt();
		}
		
		System.out.println("Enter Team Size");
		int teamSize=sc.nextInt();

		
		int maxNumberOfTeams = findmaxTeams(players,teamSize);
		System.out.println(maxNumberOfTeams);
	}

	private static int findmaxTeams(int[] players, int teamSize) {
		int first=1;
		int last=100;
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
		int totalPlayers=mid*teamSize;				//teamSize=24    mid=5
		
		int sum=0;
		for(int i=0;i<players.length;i++)		//{4,5,3,6}			sum 0,4,9,12,18
		{
			sum+=Math.min(mid, players[i]);
		}
		
		if(sum>=totalPlayers)
			return true;
		else
			return false;
	}

}
