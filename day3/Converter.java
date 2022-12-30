public class Converter
{
    String savedString; // attribute

    public Converter() {

    }

    public Converter(int num) {
        this.savedString = buildString(num);

    }

    public static String convertToString(int num) {
        if(num == 0) {
            return " zero ";
        } else if (num == 1) {
            return " one ";
        } else if (num == 2) {
            return " two ";
        } else if (num == 3) {
            return " three ";
        } else if (num == 4) {
            return " four ";
        } else if (num == 5) {
            return " five ";
        } else if (num == 6) {
            return " six ";
        } else if (num == 7) {
            return " seven ";
        } else if (num == 8) {
            return " eight ";
        } else if (num == 9) {
            return " nine ";
        }
        return "problem";
    }

    public static String buildString(int input) {   // change int back to String
        int dividend = input;
        int remainder = dividend % 10;
        int quotient = dividend / 10;
        String builtString = convertToString(remainder);
// input = 7, 7/ 10 = 0, 7 % 10 = 7
// input 27 / 10 = 2, remainder = 7
        while (quotient > 0 ) {
            remainder = quotient % 10;
            builtString =  convertToString(remainder) + builtString;
            quotient = quotient / 10;

        }
        return builtString;

        //System.out.println(builtString);
        //System.out.println(quotient);
        //return quotient;
    }

   public static void main(String[] args)
   {
    Converter testCase = new Converter(512);

       //System.out.print("Hi ");
       //System.out.println("there");
       System.out.print(testCase.savedString);
       //testCase.buildString(512);
   }
}