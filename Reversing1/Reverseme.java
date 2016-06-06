//public domain
package reverseme;

import java.util.Scanner;

/**
 *
 * @author 622990
 */
public class Reverseme {
static final String flag = "minictf{gnisrever_ev0l_I}";
static final String solution = "thisisthes0lution1234";
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your answer?");
        String input = scan.next();
        //from most correct to least correct
        if(input.equals(solution))
        {
            System.out.println("Correct! Here's the flag:  " + flag);
        }
        else if(input.startsWith(solution.substring(0, solution.length() - 4)))
        {
            System.out.println("Very close! what's a horrible 4 digit password?");
        }
        else if(input.startsWith(solution.substring(0, solution.length() - 4).replace('0', 'o')))
        {
            System.out.println("Closer! change that 'o'!");
        }
        else if(input.startsWith(solution.substring(0, solution.length() - 12)))
        {
            System.out.println("You're doing good! How do you solve a problem?");
        }
        else
        {
            System.out.println("Nope! This isn't the solution! Remeber, no caps!");
            //or is it? ;)
        }
    }
}
