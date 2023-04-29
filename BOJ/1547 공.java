import java.util.*;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int answer=-1;
        
        int [] list = new int [4];
        list[1] = 1;
        
        for(int i=0; i<M; i++){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int tmp = list[X];
            list[X] = list[Y];
            list[Y] = tmp;
        }
        
        for (int i=1; i<4; i++){
            if(list[i]==1) answer=i;
        }
        System.out.println(answer);
    }
}
