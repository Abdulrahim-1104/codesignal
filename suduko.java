package codeSignal;

public class suduko {
	public static boolean is3x3(int[][] grid ,int val) {
	for(int i=0;i<grid.length;i+=3) {
		int visited[] =new int[10];
		for(int j=val;j<val+3;j++) {
			for(int k=i;k<i+3;k++) {
				int num=grid[j][k];
				if(visited[num]==1) return true;
				visited[num]=1;
			}
		}
	}
	return false;
	}
	public static boolean isDuplicate(int[][] grid,int val) {
		for(int i=0;i<grid.length;i++) {
			for(int j=i+1;j<grid.length;j++) {
				if(grid[val][i]==grid[val][j]) return true;
				if(grid[i][val]==grid[j][val]) return true;
			}
		}
		
		return false;
	}
	public static boolean solution(int[][] grid) {
		for(int i=0;i<grid.length;i++) {
			if(isDuplicate(grid,i)) return false;
			if(i%3==0 && is3x3(grid,i)) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,3,2,5,4,6,9,8,7}, 
		              {4,6,5,8,7,9,3,2,1}, 
		              {7,9,8,2,1,3,6,5,4}, 
		              {9,2,1,4,3,5,8,7,6}, 
		              {3,5,4,7,6,8,2,1,9}, 
		              {6,8,7,1,9,2,5,4,3}, 
		              {5,7,6,9,8,1,4,3,2}, 
		              {2,4,3,6,5,7,1,9,8}, 
		              {8,1,9,3,2,4,7,6,5}};
		System.out.println(solution(arr));
	}

}
