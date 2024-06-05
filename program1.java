import java.io.*;
class program1{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of rows:");
		int rows = Integer.parseInt(br.readLine());
		for(int i=1; i<=rows; i++){
			for(int j=1; j<=i; j++){
				System.out.print(rows*rows+" ");
			}
			System.out.println();
		}
	}
}


