package Patterns;
class Asciicodepat1{
    public static void main(String[] args) {
        int n = 5;
        char a = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((char) (a + j));
            }
            System.out.println();
        }
    }
}
