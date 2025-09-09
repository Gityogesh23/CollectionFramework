
public class VowelsandConsonantsCount {
    public static void main(String[] args){
String input= "interview";
int vowels=0;
int consonants=0;
//coverting string into lowercase to simplify checks
input=input.toLowerCase();
for(char c:input.toCharArray()){
    if(c>='a' && c<='z'){
        if("aeiou" .indexOf(c) != -1){
            vowels++;
        }else{
            consonants++;
        }
    }
}

System.out.println("count of Vowels are :" +vowels+ "count of Consonants : " +consonants);
    }

}
