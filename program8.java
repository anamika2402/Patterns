import java.io.*;
class program8{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the number of rows :");
		int rows = Integer.parseInt(br.readLine());
		int k=1;
		for(int i=1; i<=rows; i++){
			int ch=96+k;
			int l=1;
			for(int j=1; j<=i; j++){
				if(l%2!=0){
					System.out.print(l+" ");
				}
				else{
					System.out.print((char)(ch)+" ");
				}
				ch++;
				l++;
				k++;
			}
			System.out.println();
		}
	}
}
