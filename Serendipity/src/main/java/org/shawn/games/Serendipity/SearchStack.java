package org.shawn.games.Serendipity;

import com.github.bhlangonijr.chesslib.move.Move;

public class SearchStack
{
	public class SearchState
	{
		public boolean inCheck;
		public boolean ttHit;
		public int moveCount;
		public Move killer;
		public Move excludedMove;
	}
	
	private SearchState[] stack;
	
	public SearchStack(int n)
	{
		stack = new SearchState[n];
		
		for (int i = 0; i < stack.length;i ++)
		{
			stack[i] = new SearchState();
		}
	}
	
	public SearchState get(int index)
	{
		return stack[index + 2];
	}
}
