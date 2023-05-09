package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = true;
        boolean b = false;
        if (a | b){
            System.out.println("a or b is true");
        }

        // write your code below

        boolean c = true;
        boolean d = true;
        if (c & d){
            System.out.println("both c and d are true");
        }

        boolean e = false;
        boolean f = true;
        if (!e && f){
            System.out.println("e is false");
        }

        boolean g = false;
        boolean h = true;
        if (g || h){
            System.out.println("at least h is true");
        }

        boolean i = true;
        boolean j = false;
        if (i ^ j){
            System.out.println("only one of i or j is true");
        }
    }

}

