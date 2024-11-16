import java.util.Scanner;

class PenguinLanguage {
    public static boolean GLASN(char c){
        return "aeiouAEIOUуеыаоэяиюУЕЫАОЭЯИЮ".indexOf(c) != -1;
    }
    public static String CPS(String text){
        StringBuilder penguinText = new StringBuilder();

        for(char c: text.toCharArray()){
            if(GLASN(c)){
                penguinText.append("ob").append(c);
            }else{
                penguinText.append(c);
            }
        }
        return penguinText.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст для перевода: ");
        String IAMNOTPENGUIN = scanner.nextLine();

        String YOU_PENGUIN = CPS(IAMNOTPENGUIN);
        System.out.println("Результат перевода: " + YOU_PENGUIN);

        scanner.close();
    }
}