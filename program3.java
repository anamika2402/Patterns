import java.io.*;
class program3{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the number of rows :");
		int rows = Integer.parseInt(br.readLine());
		for(int i=1; i<=rows; i++){
			int ch= 64+rows;
			for(int j=1; j<=i; j++){
				System.out.print((char)ch+" ");
				ch--;
			
			}
			System.out.println();
		}
	}
}

		
