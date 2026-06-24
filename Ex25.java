public class Ex25 {
    public static void main(String[] args) {
        /*
            STRINGS :

            1. String is a sequence of characters
            2. it is present inside java.lang package
            3. it is used to store names, alpha-numeric and address etc...
            4. Strings are immutable

            How to create a String

            we've 2 ways to create a String
                1. using literal way
                2. using new keyword
            
            1. using literal way : 
                Syntax : String identifier = "data";
                Eg., : String str = "Hello";

            2. using new keyword : 
                Syntax : String identifier = new String("data");
                Eg., : String str = new String("Hello");

            String Constant Pool ( SCP ) --->
                1. SCP is a block of memory present inside heap memory
                2. it doesn't allow duplicates.
                3. whenever we create a String using literal way the memory for the String object will be given inside the SCP (1 copy)
                4. whenever we create a String using new keyword the memory for the String object will be given inside the both SCP & Heap memory (2 copy)
                5. If we try to modify the String object present inside the SCP, it doesn't effect the original String instead it'll create a new String object this  makes the String immutable. 

        */
    }
}
