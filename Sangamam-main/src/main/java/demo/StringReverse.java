package demo;

import java.util.Arrays;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "mohan";
		char a[] = name.toCharArray();
		for(int i = a.length -1 ; i >=0; i--) {
			System.out.print(a[i]);
		}
		String newname = Arrays.toString(a);
		System.out.println(newname);

	}

}
