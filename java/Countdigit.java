 public class Countdigit {
        public static void main(String[] args) {
            int num = 2234567;
    
            int count = 0;
            while (num != 1) {
                count = count + 1;
                System.out.println(num);
                num = num /10;
            }
            System.out.println(count);
        }
    }
 


