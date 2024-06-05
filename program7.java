import java.io.*;
class program7{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the number of rows :");
		int rows = Integer.parseInt(br.readLine());
		char ch='a';
		for(int i=1; i<=rows; i++){
			int k=1;
			for(int j=1; j<=i; j++){
				if(k%2!=0){
					System.out.print(i+" ");
				}
				else{
					System.out.print(ch+" ");
					ch++;
				}
				k++;
			}
			System.out.println();
		}
	}
}


