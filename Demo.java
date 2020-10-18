public class Demo {
	public static void printLoop(int n){
   		for(int i = 1; i <= n; i++){
      			for(int j = i - 1; j < n; j++){
         		System.out.print(i);
      			}
      		System.out.println();
    		}
		}
	
	public static void main(String[] args) {
		int num = 0;
		if(args.length == 0)
		num = 5;
		else
		num = Integer.parseInt(args[0]);
		printLoop(num);
	}
}

