package temperature.beans;

public class StringExample {
    public static void main(String[] args) {
       
        String firstName  = "reshma";
        String lastName = "musthafa";
        String fullName = firstName .concat(lastName);

        String upperCase = fullName.toUpperCase();
        System.out.println((" The upper case of  my name is :" + upperCase));

       
       
       
        String sentance = "hi this is reshma here currently pursuing my ug degree bsc cs aids in vetias";
        String[] words = sentance.split(" ");
        System.out.println(words.length);
        
    }
    
}
