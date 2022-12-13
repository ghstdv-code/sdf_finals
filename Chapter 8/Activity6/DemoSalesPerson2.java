package Activity6;

public class DemoSalesPerson2 {
    public static void main(String[] args) {
        int def_id = 111;
        double def_sales = 20000;
        SalesPerson[] sp = new SalesPerson[10];
        for(int i = 0; i < 10; i++)
            sp[i] = new SalesPerson(def_id++, def_sales+=5000);
        
        for(SalesPerson spm: sp)
            System.out.println(spm.GetId() + " - $" + spm.GetAnnualSales());
    }
}
