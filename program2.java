import java.io.*;
class program2{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the number of rows :");
		int rows = Integer.parseInt(br.readLine());
		for(int i=1; i<=rows; i++){
			for(int j=1; j<=i; j++){
				if(i%2!=0){
					System.out.print((char)(j+96)+" ");
				}
				else{
					System.out.print("$"+" ");
				}
			}System.out.println();
		}
	}
}

		

