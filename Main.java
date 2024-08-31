import javax.swing.*;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int row=5;
        int col=5;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=row-i;k++){
                System.out.print(" ");
            }
            System.out.println();


        }

    }
}