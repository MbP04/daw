import java.util.Arrays;
public class ejemplo1 {
	public static void main(String[] args){
		//int a[][] = new int[3][3];
		int [][] b = {{1,2,3},
				      {4,5,6},
				      {7,8,9}};
		
		for (int i=0;i<=2;i++){
			for (int j=0;j<=2;j++){
					System.out.println(i+","+j+"   :    "+b[i][j]);			
			}
			
		}
		
		
		
	}
}