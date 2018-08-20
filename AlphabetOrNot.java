import java.util.*;
public class test {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter a letter :");
	char ch[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	char c = in.next().charAt(0);
	for(int i=0;i<ch.length;i++) {
		if(c==ch[i])
			{System.out.println("Alphabet");break;}
		else
			{System.out.println("No");break;}
	}
}
}
