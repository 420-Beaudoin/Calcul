/**
 * @author France Beaudoin
 */
public class Calcul {

    public static int addition(int n1, int n2){
        return n1 + n2;
    }

    public static int soustraction(int n1, int n2){
        return n1 - n2;
    }

    public static int multiplication(int n1, int n2){
        return n1 * n2;
    }

    public static double division(int n1, int n2){
        if (n2 != 0)
            return n1 / n2;
        else
            return 0;
    }
}
