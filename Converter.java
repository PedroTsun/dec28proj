public class Converter
{
    private String savedString;
        // num is a single-digit integer
    // returns a string of the single-digit num
    public static String convertToString(int num) {
        if (num == 0) {
            return "0";
        } else if (num == 1) {
            return "1!";
        } else if (num == 2) {
            return "2!";
        } else if (num == 3) {
            return "3!";
        } else if (num == 4) {
            return "4!";
        } else if (num == 5) {
            return "5!";
        } else if (num == 6) {
            return "6!";
        } else if (num == 7) {
            return "7!";
        } else if (num == 8) {
            return "8!";
        } else if (num == 9) {
            return "9!";
        }
        
        return "nada";
    }

    public static String buildString(int input) {
        int dividend = input;
        int quotient = dividend / 10;
        int remainder = dividend % 10;
        String inputInString = convertToString(remainder);

        while (quotient > 0) {
            remainder = quotient % 10;
            quotient = quotient / 10;
            inputInString = convertToString(remainder) + inputInString;

        }

        //System.out.println(inputInString);

        return inputInString;

    }

    public Converter(int num) {
        this.savedString = buildString(num);

    }

    public String getSavedString() {
        return this.savedString;
    }

   public static void main(String[] args)
   {
        Converter convertMe = new Converter(512);
        
        System.out.println(convertMe.getSavedString());
        System.out.println(convertMe.getSavedString().getClass().getName());

       // System.out.println(convertToString(4));
       //System.out.println(buildString(512));
        //System.out.println(buildString(512).getClass().getName());
       System.out.print("Hi ");
       System.out.println("there");
       System.out.print("!");
   }
}

/* https://github.com/keylaumana403/dec28project/blob/main/BuildString%20FRQ%20(U4%20Iteration).pdf
*/
