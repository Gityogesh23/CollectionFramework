//String Rotation check -->Rotation string check -refer below
public class StringRotation {
    public static boolean areRotations(String s1,String s2){

        if(s1.length()!=s2.length()){
             return false;
            }
        else{
            //concatenate s1 with s1
            String doubled=s1+s1;
            return doubled.contains(s2);
        }
    }
    public static void main(String[]args){
    System.out.println(areRotations("abcd","cdab"));//true

    System.out.println(areRotations("abcde","cdabe")); //false

    System.out.println(areRotations("vwxy","zyxw"));//false

    System.out.println(areRotations("abcd","defg"));//false

    System.out.println(areRotations("vwxy","zyxwu"));//false

    }
}
