import java.util.Scanner;

public class ColorSelector {

    private enum Colors {
        W("White"),
        B("Black"),
        O("Orange"),
        Y("Yellow"),
        P("Purple"),
        R("Red"),
        G("Green");

        private String customColor;

        private Colors(String customColor){
            this.customColor = customColor;
        }

        public String getCustomColor(){
            return customColor;
        }

    }

    public static String getUserColor(){
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Select color (W - White, B - Black, O - Orange, P - Purple, R - Red, G - Green, Y - Yellow)");
            String color = scanner.nextLine().trim().toUpperCase();
            try {
                Colors enumColor = Colors.valueOf(color);
                switch (enumColor){
                    case W:
                        return "White";
                    case B:
                        return "Black";
                    case O:
                        return "Orange";
                    case P:
                        return "Purple";
                    case R:
                        return  "Red";
                    case G:
                        return "Green";
                    case Y:
                        return "Yellow";
                    default:
                        System.out.println("Wrong color name. Please try again");
                }
            } catch (IllegalArgumentException e){
                System.out.println("Wrong color name. Please try again");
            }

        }
    }
}
