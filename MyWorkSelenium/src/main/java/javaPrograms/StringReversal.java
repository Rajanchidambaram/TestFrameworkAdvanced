package javaPrograms;

import javax.print.DocFlavor.CHAR_ARRAY;

public class StringReversal {

	public static void main(String[] args) {

		/*StringBuilder strb=new StringBuilder();
		strb.append("Raja");
		
		strb.append("Ra");
		System.out.println(strb);
		System.out.println(strb.reverse());
		
		System.out.println(strb.insert(3, "wert"));*/
	
	
	/*String st= "Rajan";
	char[] srcString=st.toCharArray();
	char[] destStr= st.toCharArray();
	int strLength=st.length();
	int j=0;
	int i=strLength;
	while(i>0&&j<=strLength) {
	i--;
		char m=srcString[i];
		destStr[j]=m;
		System.out.println(destStr[j]);
		j++;
			
		}
		String str=String.valueOf(destStr);
		System.out.println(str);
*/
	
	String a= "Rajan";
	String b="";
	
	for(int i=a.length()-1;i>=0;i--)
	{
		b=b+a.charAt(i);
		System.out.println(b);	
	}		
		
		
	}

}
