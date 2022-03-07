import java.math.*;

public class Main {

    public static void main(String[] args) {

        RefClassTest rfc1 = new RefClassTest();
        RefClassTest rfc2, rfc3;
        rfc2  = rfc1;
        rfc3  = rfc1;

        rfc3.strTekst = "Nieuwe tekst";

        try {
            BigInteger bi = new BigInteger("3dfg44343");
        } catch (Exception e) {
            System.out.println("error occurred");
            System.out.println(rfc1.strTekst);
            System.out.println(rfc2.strTekst);
            System.out.println(rfc3.strTekst);

            return;
        }


        System.out.println("test" + "2");
    }
}
