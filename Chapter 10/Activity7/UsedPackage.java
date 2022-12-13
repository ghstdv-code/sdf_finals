package Activity7;

import java.util.Scanner;

public class UsedPackage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Package pkg;
        InsuredPackage ipkg;
        char pkgshipMethod, c;
        float pkgWeight;

        System.out.println("[R]Regular Package and [I]Insured Package");
        System.out.print("Input your option >> ");
        c = sc.next().toUpperCase().charAt(0);

        System.out.print("Package Weight >> ");
        pkgWeight = sc.nextFloat();

        System.out.print("Shipping Method [A]Air, [T]Truck and [M]Mail >> ");
        pkgshipMethod = sc.next().toUpperCase().charAt(0);
        
        sc.close();

        if(c == 'R'){
            pkg = new Package(pkgWeight, pkgshipMethod);
            pkg.Display();
        }
        else if(c == 'I'){
            ipkg = new InsuredPackage(pkgWeight, pkgshipMethod);
            ipkg.Display();
        }
    }
}
