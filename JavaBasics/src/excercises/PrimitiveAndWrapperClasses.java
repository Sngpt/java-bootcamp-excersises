package excercises;

public class PrimitiveAndWrapperClasses {
    public static void main(String[] args) {
        // Step 1: Declare primitive variables
        int i = 10;
        boolean isInteresting = false;
        // Step 2: Convert primitive variables to wrapper objects
        Integer intWrap = 10;
        Boolean boolWrap = false;

        // Step 3: Print the values of the wrapper objects
        System.out.println(intWrap);
        System.out.println(boolWrap);

        // Step 4: Convert wrapper objects back to primitive variables
        i = intWrap;
        isInteresting = boolWrap;

        // Step 5: Print the values of the primitive variables
        System.out.println(i);
        System.out.println(isInteresting);
    }
}
