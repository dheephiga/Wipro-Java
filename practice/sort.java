import java.util.*;
public class sort {
    public static void main(String[] args) {
        int [] arr = new int [10];
        Scanner in = new Scanner(System.in);
        ArrayList <Integer> list = new ArrayList <Integer> ();
        int flag =0;
        for(int n=0;n<arr.length;n++)
        {
            arr[n] = in.nextInt();
            list.add(arr[n]);
        }
        Collections.sort(list);
        for(int i=1;i<=arr.length;i++)
        {
            if(i== list.get(i-1))
                flag++;
            else
                System.out.println(i);
        }

       // System.out.println(arr.length);

    }
}
