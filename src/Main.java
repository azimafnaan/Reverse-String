public class Main {
    public static void main(String[] args) {
        String name = "Azim";
        int len = name.length();
        String reverse = "";
        for (int i = len - 1; i >= 0; i--) {
            reverse = reverse + name.charAt(i);
        }
        System.out.println("Reverse of " + name + " is  " + reverse);
    }
}