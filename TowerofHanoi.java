public class TowerofHanoi{
    //a larger disc cannot be placed on a smaller disc
    //you can use three rods
    //recursive formula=2T(N-1)+1
    //T(1)=1
    //TIME COM=O(2^N)
    //SPACE COMPLEXITY=O(N)

//ALGORITHM
//MOVE N-1 DISCS FROM SOURCE TO AUXILIARY()
//MOVE Nth DISC FROM SOURCE TO DESTINATION
//MOVE N-1 DISCS FROM AUXILIARY SOURCE TO DESTINATION
public static void sH(int n,char sou,char aux,char des){
    if(n==1){
        System.out.println("Move disc 1 from "+sou+" to "+des);
        return;
    }
    sH(n-1, sou, des, aux);
    System.out.println("Move disc "+n+" from "+sou+" to "+des);
    sH(n-1, aux, sou, des);
}
public static void main(String[] args) {
    int n=3;
    sH(n, 'A', 'B', 'C');
}
}