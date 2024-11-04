public class ex2 {
	public static void main(String[] args) {
		int altura = 4;
        int largura = 9;
        
        for (int i = 0; i < largura; i++) {
       	 System.out.print("-");
        }
        System.out.println();
        
        for (int i = 0; i < altura; i++) {
       	 System.out.print("|");
       	 for (int j = 1; j < largura - 1; j++) {
       		 System.out.print(" ");
               }
               System.out.println("|");
           }

           for (int i = 0; i < largura; i++) {
               System.out.print("-");
           }
           System.out.println();
	}
}
		      