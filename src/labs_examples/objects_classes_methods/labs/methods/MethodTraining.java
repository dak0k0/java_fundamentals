package labs_examples.objects_classes_methods.labs.methods;

import java.util.ArrayList;

public class MethodTraining {


    public static void main(String[] args) {

        // test method overloading
        System.out.println("Testing method overloading:");
        System.out.println(multiply(3,5));
        System.out.println(multiply(3,5,7));


        // test pass by value vs pass by reference
        System.out.println("Testing pass by value vs pass by reference:");

        System.out.println("Pass by value:");
        int number = 1;
        System.out.println(number);
        passByValue(number);
        System.out.println(number);

        System.out.println("Pass by reference:");
        int[] array = {1,2,3,4,5};
        System.out.println(array[0]);
        passByReference(array);
        System.out.println(array[0]);

        // test largest of four numbers
        System.out.println("Testing largest of four numbers:");
        System.out.println(largestOfFourNumbers(2,7,2,1));

        // test number of consonants in a string
        System.out.println("Testing the number of consonants in a string");
        System.out.println(numConsonants("hello world"));

        // test isPrime
        System.out.println("Testing isPrime");
        System.out.println(isPrime(7));
        System.out.println(isPrime(6));
        System.out.println(isPrime(101));

        // test bounds
        System.out.println("Testing bounds");
        int[] intArray = {1,4,2,6,4};
        for(int i = 0; i < 2; i++){
            System.out.print(arrayBounds(intArray)[i] + " ");
        }
        System.out.println();

        // test divisibility
        System.out.println("Testing divisibility");
        System.out.println(divisibility(36,4,3));

        // test reverseArray
        System.out.println("Testing array reversing");
        int[] array2 = {1,2,3,4,5,6,7};
        System.out.print("Array: ");
        for(int num:array2){
            System.out.print(num + " ");
        }
        reverseArray(array2);
        System.out.println();
        System.out.print("Reversed Array: ");
        for(int num:array2){
            System.out.print(num + " ");
        }
    }

    // method overloading
    public static int multiply(int a, int b){
        return a * b;
    }
    public static int multiply(int a, int b, int c){
        return a * b * c;
    }

    // difference between "pass by value" and "pass by reference"
    public static void passByValue(int arg){
        arg += 10;
    }
    public static void passByReference(int[] arg){
        arg[0] += 10;
    }

    public static int largestOfFourNumbers(int a, int b, int c, int d){
        int largest = a;
        if (b > largest){
            largest = b;
        }
        if (c > largest){
            largest = c;
        }
        if (d > largest){
            largest = d;
        }
        return largest;
    }

    public static int numConsonants(String str){
        String consonants = "bcdfghjklmnpqrstvwxyz";
        int total = 0;
        for(int i = 0; i < str.length(); i++){
            for(int j = 0; j < consonants.length(); j++){
                if(str.charAt(i) == consonants.charAt(j)){
                    total++;
                    break;
                }
            }
        }
        return total;
    }

    public static boolean isPrime(int arg){
        boolean prime = true;
        for(int i = 2; i < arg; i++){
            if(arg % i == 0){
                prime = false;
                break;
            }
        }
        return prime;
    }

    public static int[] arrayBounds(int...nums){
        int smallest = nums[0];
        int largest = nums[0];
        for(int num : nums){
            if(num < smallest){
                smallest = num;
            }
            if(num > largest){
                largest = num;
            }
        }
        return new int[]{smallest, largest};
    }

    public static ArrayList<Integer> divisibility(int maxNum, int divisor1, int divisor2){
        int divisor = divisor1 * divisor2;
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 0; i <= maxNum; i++){
            if(i % divisor == 0){
                numbers.add(i);
            }
        }
        return numbers;
    }

    public static void reverseArray(int[] array){
        for(int i = 0; i < array.length / 2; i++){
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
}
