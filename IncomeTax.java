import java.util.Scanner;
public class CWH_19_CH_04_PS {
    public static void main(String[] args) {

       System.out.println("How much your income");
        Scanner sc = new Scanner(System.in);
        int Income = sc.nextInt();
        //System.out.println(Income_5);

        if (Income <= 250000) {
            float Income_0 = Income * 0.0f;
            System.out.println("YOUR TAX AMOUNT IS:" + Income_0);
        }
        else if (Income > 250000 && Income <= 500000)
        {
            float Income_5 = (Income-250000)* 0.05f;
            System.out.println("YOUR TAX AMOUNT IS:" + Income_5);
        }
        else if (Income > 500000 && Income <= 1000000)
        {
            // Formula to calculate tax
            float Income_20 = (500000-250000)*0.05f + (Income-500000)*0.20f;
            System.out.println("YOUR TAX AMOUNT IS:" + Income_20);
        }
        else
            {
            System.out.println("rich");
        }
    }
}
