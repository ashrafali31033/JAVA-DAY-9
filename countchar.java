import java.util.*;

public class countchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.nextLine();
        int vowels=0;int cons=0;int specialchar=0;int num=0;
        s=s.toLowerCase();

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' ||ch=='u')
            {
                vowels++;
            }
            else if(ch>='a' && ch<='z')
            {
                cons++;
            }
            else if(ch>='0' && ch<='9')
            {
                num++;

            }
            else
            {
                specialchar++;
            }
        }
        System.out.println("vowels:"+vowels);
        System.out.println("consonents:"+cons);
        System.out.println("numbers"+num);
        System.out.println("special character:"+specialchar);

    }
}
