package Array;

public class MinElementArray {
    public static void main(String[] args) {
       int array[] = {1,3,12,52,32,1,0,-2};
       int min = array[0];
       for (int ele : array) {
           if (min> ele) {
               min = ele;
           }
       }

       System.out.println("min Ele is " + min);
    }
    
}
