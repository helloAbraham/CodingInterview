import javax.swing.*;

public class PermutationDemo {

    public static void main(String[] args) {

        PermutationExm pm = new PermutationExm();

        /** We can use this way or
        String first = "tom";
        String second = "mdtbc";

        System.out.println();

        **/

        String inputOne =  JOptionPane.showInputDialog("Please Enter a String " );
        String inputTwo =  JOptionPane.showInputDialog("Please Enter another String " );

        JOptionPane.showMessageDialog(null, "Your input is permutation: "
                                       + pm.permutation(inputOne, inputTwo));
    }
}
