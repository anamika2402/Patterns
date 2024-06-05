import java.io.*;
class program10{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the number of rows :");
		int rows = Integer.parseInt(br.readLine());
		int k=1;
		for(int i=1; i<=rows; i++){
			for(int j=1; j<=i; j++){
				if(i%2 != 0){
					System.out.print(k+" ");
				}
				else{
					System.out.print((char)(96+k)+" ");
				}
				k++;
			}
			System.out.println();
		}
	}
}

