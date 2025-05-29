import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
class User{
    String username;
    String password;
  
    User(){}
    User(String username,String password){
            this.username=username;
        this.password=password;
        
    }

    public String getUserName(){ 
    return this.username=username;
    }
    public String getPassword(){
        return this.password=password;

    }
}
        public class ListToMapDemo {
            public static void main(String[] args) {
                //Without duplicate object=>cox Map doen't allow duplicates so see next scenario ,
                //prefer always that second Scenario
                List<User>users=Arrays.asList(
                    new User("1","Alice" ),
                    new User("2","John"),
                    new User("3","Rafa"),
                    new User("4","John"),
                    new User("2","Djokovic"),
                    new User("4","Rogger"));
                
                  Map<String,String> mapList= users.stream()
                                                    .collect(Collectors.toMap(
                                                        User::getUserName,
                                                        User::getPassword,
                                                        (existing,duplicate)->existing
                                                    ));  
        
                System.out.println("List to map conversion Here :"+mapList);                                                                            
            }
        }
    
/* 
public class ListToMapDemo {
    public static void main(String[] args) {
        //Without duplicate object=>cox Map doen't allow duplicates so see next scenario ,
        //prefer always that second Scenario
        List<User>users=Arrays.asList(
            new User("1","Alice" ),
            new User("2","John"),
            new User("3","Rafa"),
            new User("4","Rogger"));
        
          Map<String,String> mapList= users.stream()
                                            .collect(Collectors.toMap(
                                                User::getUserName ,
                                                User::getPassword
                                            ));  

        System.out.println("List to map conversion Here :"+mapList);                                                                            
    }
}
*/