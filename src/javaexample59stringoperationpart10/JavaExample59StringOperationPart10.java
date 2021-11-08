
package javaexample59stringoperationpart10;


public class JavaExample59StringOperationPart10 {

    // predicate method: method tells you that a statement (påstående) is true or false
    
    public static void main(String[] args) {
        
        String str =new String("Tom goes to the school everyday.");
        
        String start1= new String("Tom");
        String start2= new String("Abcd");
        String end1= new String("everyday");
        String end2= new String("everyday.");
        
        boolean b1 = str.startsWith(start1);
        boolean b2 = str.startsWith(start2);
        boolean b3 = str.endsWith(end1);
        boolean b4 = str.endsWith(end2);
        
        System.out.println("Your string is: "+str);
        System.out.println("Your string begins with ("+start1+"): "+b1);
        System.out.println("Your string begins with ("+start2+"): "+b2);
        System.out.println("Your string ends with ("+end1+"): "+b3);
        System.out.println("Your string ends with ("+end2+"): "+b4);
    }
    
}
