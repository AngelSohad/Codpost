package pkgswitch;
import java.util.Scanner;
public class Switch{
    public void SWH() {
        Scanner stdIn = new Scanner(System.in);
        String ds;
        System.out.print("Pasame su codigo postal:  ");
        ds = stdIn.nextLine();
        switch(ds.charAt(0)){
            case '0':
                System.out.println("Tu codigo "+ ds +" es de mi casa c;");
                break;
            case '2':
                System.out.println("Tu codigo "+ ds +" es de mi casa c;");
                break;
            case '3':
                System.out.println("Tu codigo "+ ds +" es de mi casa c;");
                break;
            case '4':
                System.out.println("Tu codigo "+ ds +" es de mi casa c;");
                break;
            case '5':
                System.out.println("Tu codigo "+ ds +" es de mi casa c;");
                break;
            case '1':
                System.out.println("Tu codigo "+ ds +" es de Polonia");
                break;
            case '6':
                System.out.println("Tu codigo "+ ds +" es de mi casa c;");
                break;
            case '7':
                System.out.println("Tu codigo "+ ds +" es de Mexico");
                break;
            case '8':
                System.out.println("Tu codigo "+ ds +" es de la UAEMEX");
                break;
            case '9':
                System.out.println("Tu codigo "+ ds +" es de la Zinancztepec");
                break;
            default:
                System.out.println("Ese no me lo se Master");
                break;
               }}
    public static void main(String[] args) {
        Switch aprob = new Switch();
        aprob.SWH();
    }
}
