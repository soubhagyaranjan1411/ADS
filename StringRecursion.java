public class StringRecursion {
    public static void generatepermu(String str,String perm){
        if(str.isEmpty()){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++){
            Character c=str.charAt(i);
            String rem=str.substring(0,i)+str.substring(i+1);
            generatepermu(rem, perm+c);
        }
    }
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println("Permutations of "+str+" are:");
        generatepermu(str, "");
    }
}
//784 509
//344,78,348