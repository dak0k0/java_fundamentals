package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all relational operators below. These include:
 *
 * less than, less than or equal to, greater than, greater than or equal to, and equal to
 *
 */
class RelationalOperators {

    public static void main(String[] args) {

        // example of "less than"
        int a = 1;
        int b = 2;
        if (a < b){
            System.out.println("a is less than b");
        }

        // write your code below
        operations(10,5);
        operations(3,6);
        operations(6,6);
        operations2(1,100);
        operations2(67,4);
        operations2(6,6);
    }

    public static void operations(int a, int b) {

        if (a == b){
            System.out.println(a + " is equal to " + b);
        }
        if (a < b){
            System.out.println(a + " is less than " + b);
        }
        if (a > b){
            System.out.println(a + " is greater than " + b);
        }
    }

    public static void operations2(int a, int b) {
        boolean alreadyPrinted = false;
        if (a >= b){
            System.out.println(a + " is greater than or equal to " + b);
            alreadyPrinted = true;
        }
        if (a <= b & !alreadyPrinted){
            System.out.println(a + " is less than or equal to " + b);
        }
    }
}

