 
public class inverted {
		public static void main(String[] args) {
			int a, b,c;
			for (a=5;a>=1;a--) {
				
				for (b=5;b>a ; b--) {
				}
				for (c=1; c<=b; c++) {
					System.out.print("* ");
				}
				System.out.println(); 
			}
		}
}
