public class OOPSBANNER4{

    public static void main(String[] args) {

        // Define pattern for each letter
        String[][] banner = {
                {" *** ", "*   *", "*   *", "*   *", " *** "},   // O
                {"***  ", "*  * ", "***  ", "*    ", "*    "},   // P
                {"***  ", "*  * ", "***  ", "*    ", "*    "},   // P
                {" ****", "*    ", " *** ", "    *", "**** "}    // S
        };

        // Loop row-wise
        for (int row = 0; row < banner[0].length; row++) {

            String[] currentRow = new String[banner.length];

            for (int col = 0; col < banner.length; col++) {
                currentRow[col] = banner[col][row];
            }

            // Join and print row
            System.out.println(String.join("  ", currentRow));
        }
    }
}
