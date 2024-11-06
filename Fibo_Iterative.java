// LP-III DAA (2024-25)
// Assignment 1 : Write a non-recursive and recursive program to calculate
// Fibonacci numbers and analyze their time and space complexity

class Fibo_Iterative{
    public static void main(String args[]){
        Fibo(10);

    }
    public static void Fibo(int n){
        int num1=0;
        int num2=1;
        int res;
        System.out.println(num1+"\n"+num2+" ");
        for(int i=2;i<n;i++){
            res=num1+num2;
            System.out.println(res);
            num1=num2;
            num2=res;
        }

    }
}

// Time Complexity Analysis:
// The time complexity of the iterative approach is O(n), where n is the number of terms in the Fibonacci series. This is because we have a single loop that iterates n times.
// Space Complexity Analysis:
// The space complexity is O(1) as it uses a constant amount of space (only a few variables).