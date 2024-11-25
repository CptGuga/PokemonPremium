package tests;

import pokemoncatcher.Ash;

public class AshTests {

    public static void main(String[] args) {
        traversePathEmpty();
        traversePathInvalid();
        traversePathBig();
        traversePathOverlapped();
    }

    private static void traversePathEmpty() {
        System.out.println("Test Case: Empty Input");
        
        Ash ash = new Ash();

        String input = "";
        int result = ash.traversePath(input);
        int expected = 1;

        assertEquals(result, expected);
    }

    private static void traversePathInvalid() {
        System.out.println("Test Case: Invalid Input");

        Ash ash = new Ash();

        String input = "NE???SO";
        int result = ash.traversePath(input);
        int expected = -1;

        assertEquals(result, expected);
    }

    private static void traversePathBig() {
        System.out.println("Test Case: Big Input");

        Ash ash = new Ash();

        String input = "NNNNNNNNNESSSSSSSSSENNNNNNNNNESSSSSSSSSENNNNNNNNNESSSSSSSSSENNNNNNNNNESSSSSSSSSENNNNNNNNNESSSSSSSSS";
        int result = ash.traversePath(input);
        int expected = 100;

        assertEquals(result, expected);
    }

    private static void traversePathOverlapped() {
        System.out.println("Test Case: Overlapped Input");

        Ash ash = new Ash();

        String input = "ENOSENOSNESONESO";
        int result = ash.traversePath(input);
        int expected = 4;

        assertEquals(result, expected);
    }

    private static void assertEquals(Object o1, Object o2) {
        if (o1 == o2){
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
    }
}
