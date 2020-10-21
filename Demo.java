public class Demo {

	public static String arrToString(int[] arr){
  		String str = "{";
  		for(int i = 0; i < arr.length; i++){
    			str += arr[i];
    			if(i != arr.length - 1)
   				str += ", ";
		}
  		str += "}";
  		return str;
	}


	public static String arrayDeepToString(int[][] arr){
  		String str = "{";
  		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				if(j == 0)
					str += "{";
  				str += arr[i][j];
    				if(j != arr[i].length - 1)
    					str += ", ";
				else if(i != arr.length - 1)
					str += "}, ";
				else
					str += "}";
			}
   		 }
  		str += "}";
  		return str;
	}

	
	public static int[][] create2DArray(int rows, int cols, int maxValue){
		int[][] arr = new int[rows][cols];
		double target = 0.0;
		int num = 0;
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				num = 0;
				target = Math.random();
				for(int n = 1; n <= maxValue + 1; n++){
					if(target < ( 1.0 * n / (maxValue + 1))){
						arr[i][j] = num;
						break;
					}
					num += 1;
				}
				
			}
		}
		return arr;
	}


	public static int[][] create2DArray(int[][] arr, int maxValue){
		double target = 0.0;
		int num = 0;
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				num = 0;
				target = Math.random();
				for(int n = 1; n <= maxValue + 1; n++){
					if(target < ( 1.0 * n / (maxValue + 1))){
						arr[i][j] = num;
						break;
					}
					num += 1;
				}
				
			}
		}
		return arr;
	}


	public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue){
		int[][] arr = new int[rows][];
		double target = 0.0;
		int num = 0;
		for(int i = 0; i < arr.length; i++){
			num = 0;
			target = Math.random();
			for(int n = 1; n <= maxValue + 1; n++){
				if(target < ( 1.0 * n / (cols + 1))){
					arr[i] = new int[num];
					break;
				}
				num += 1;
			}
		}
		return create2DArray(arr, maxValue);


	}	
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

