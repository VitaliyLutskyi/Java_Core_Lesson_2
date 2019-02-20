package Les1;

public class Java_data_types {
	public static void main(String[] args) {
		boolean a = true;
		char b = 'a';
		byte c = 1;
		short d = 2;
		int e = 3;
		long f = 4L;
		float g = 2.1F;
		double h = 3.2;
		
		System.out.println("boolean values are: false	true");
		System.out.println("char min value is: '"+ Character.MIN_VALUE+ "'"+ "\t\t\tchar max value is: '"+ Character.MAX_VALUE+ "'");
		System.out.println("byte min value is: "+ Byte.MIN_VALUE+ "\t\t\tbyte max value is: "+ Byte.MAX_VALUE);
		System.out.println("short min value is: "+ Short.MIN_VALUE+ "\t\tshort max value is: "+ Short.MAX_VALUE);
		System.out.println("int min value is: "+ Integer.MIN_VALUE+ "\t\tint max value is: "+ Integer.MAX_VALUE);
		System.out.println("long min value is: "+ Long.MIN_VALUE+ "\tlong max value is: "+ Long.MAX_VALUE);
		System.out.println("float min value is: "+ Float.MIN_VALUE+ "\t\tfloat max value is: "+ Float.MAX_VALUE);
		System.out.println("double min value is: "+ Double.MIN_VALUE+ "\t\tdouble max value is: "+ Double.MAX_VALUE);
		
		int min_value;
		int max_value;
		int [] arr = new int [20];
		for(int i=0; i<arr.length; i++) 
			arr[i]=i*i-i-5;
		min_value=max_value=arr[0];
		System.out.println("\nArray is:");
		for(int i=0; i<arr.length; i++) {
			if (arr[i] > max_value)
				max_value = arr[i];
			if (arr[i] < min_value)
				min_value = arr[i];
			System.out.print("\t"+ arr[i]);
		}
		System.out.println("\nMin value in array: "+ min_value);
		System.out.println("Max value in array: "+ max_value);
	}
}
