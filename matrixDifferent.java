package                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     codeSignal;

public class matrixDifferent {
	public static int solution(int matrix[][]) {
		for(int i=0;i<matrix.length-1;i++) {
			for(int j=0;j<matrix[0].length-1;j++) {
				for(int k=i;k<i+2;k++) {
					for(int l=j;l<j+2;l++) {
						System.out.print(matrix[k][l]);
					}
					System.out.println();
				}
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]={
			{1,2,1},
			{2,2,2},
			{2,2,2},
			{1,2,3},
			{2,2,1}
		};
		//System.out.println(solution(arr));
		System.out.println(Math.max(9, 21));
	}

}
