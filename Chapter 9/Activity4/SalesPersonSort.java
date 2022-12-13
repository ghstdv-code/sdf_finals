package Activity4;

import java.util.Scanner;

public class SalesPersonSort {
    public static void main(String[] args) {
        SalesPerson[] sp = new SalesPerson[7];
        Scanner sc = new Scanner(System.in);

        int id;
        double annualsales;
        byte x = 0;
        while(x < 7){
            System.out.println("SalesPerson Entry no #" + (x+1));    
            System.out.print("Enter SalesPerson Id: ");
            id = sc.nextInt();

            sc.nextLine();
            System.out.print("Enter SalesPerson Annual Sales: ");
            annualsales = sc.nextDouble();
            System.out.println();
            sc.nextLine();

            sp[x] = new SalesPerson();
            sp[x].SetId(id);
            sp[x].SetAnnualSales(annualsales);
            x++;
        }

        String c = "I";

        while(!c.toUpperCase().equals("X")){
            System.out.println("Sorting Options: [I]Id, [S]Annual Sales and [X]Quit");
            System.out.print("Inout Option: ");
            c = sc.nextLine();

            if(c.substring(0, 1).toUpperCase().equals("I")) { Sort(sp, "id"); Display(sp);}
            else if(c.substring(0, 1).toUpperCase().equals("S")) { Sort(sp, "sales"); Display(sp); }
            else{
                if(!c.toUpperCase().equals("X")) System.out.println("Invalid Option!");
            }
        }

        sc.close();        
    }

    static void Display(SalesPerson[] arr){
        StringBuilder sb = new StringBuilder();
        for(SalesPerson r:arr){
            sb.append("SalesPerson Id : " + r.GetId() + "\n");
            sb.append("Annual Sales   : $" + r.GetAnnualSales() + "\n\n");
        }
        System.out.println(sb.toString());
    }

    static void Sort(SalesPerson[] rc, String sortOption){
        SalesPerson r;
        for(int i = 0;i < rc.length; i++){
            for(int j = 0; j < rc.length; j++){
                switch(sortOption){
                    case "id":
                        if(rc[i].GetId() < rc[j].GetId()){
                            r = rc[i];
                            rc[i] = rc[j];
                            rc[j] = r;
                        } break;

                    case "sales":
                        if(rc[i].GetAnnualSales() < rc[j].GetAnnualSales()){
                            r = rc[i];
                            rc[i] = rc[j];
                            rc[j] = r;
                        } break;
                    }
                }
            }
        }
}
