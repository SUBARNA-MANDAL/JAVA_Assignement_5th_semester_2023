class Main { 
	public static void main(String[] args) { 
		//int i1 = null;
		char c1 = 'J';
		//float f1 = null; 
		double d1 = 24.11;

		// using Autoboxing
		Integer I1 = null;
		Character C1 = c1;
		Float F1 = null;
		Double D1 = d1;
		System.out.println("Primitive to wrapper class conversion:"); 
		System.out.println(I1 + " " + C1 + " " + F1 + " " + D1); 

		// without Autoboxing
		Integer I2 = Integer.valueOf(11); 
		Character C2 =Character.valueOf(c1); 
		Float F2 = Float.valueOf(34.32F); 
		Double D2 = Double.valueOf(d1); 
		System.out.println("Primitive to wrapper class conversion:"); 
		System.out.println(I2 + " " + C2 + " " + F2 + " " + D2); 


		// Store Wrapper objects into primitive types
		Integer I3 = 55; 
		Character C3 = 'A'; 
		Float F3 = 24.55F; 
		Double D3 = 34.34;

		int i2 = I3.intValue(); 
		char c2 = C3.charValue(); 
		float f2 = F3.floatValue(); 
		double d2 = D3.doubleValue();
		System.out.println("Wrapper class to Primitive conversion:"); 
		System.out.println(i2 + " " + c2 + " " + f2 + " " + d2);


		char[] arr = {'J','a','y',' ','5'}; 
		System.out.println("Individual characters are:"); 
		for(int i=0;i<arr.length;i++){ 
			if(arr[i]>='A' && arr[i]<='Z'){ 
				System.out.println(arr[i] + " is uppercase.");
			} 
			else if(arr[i]>='a' && arr[i]<='z'){ 
				System.out.println(arr[i] + " is lowercase."); 
			} 
			else if(arr[i]>=0 && arr[i]<=9){ 
				System.out.println(arr[i] + " is digit."); 
			} 
			else if(arr[i]==' '){ 
				System.out.println(arr[i] + " is whitespace."); 
			} 
			else{ 
				System.out.println(arr[i] + " is special character."); 
			}
		}
	}
}