package Activity6;

public class DemoSalesPerson {
    public static void main(String[] args) {
        SalesPerson[] sp = new SalesPerson[10];
        for(int i = 0; i < 10; i++)
            sp[i] = new SalesPerson(9999, 0);
        
        for(SalesPerson spm: sp)
            System.out.println(spm.GetId() + " - $" + spm.GetAnnualSales());
    }
}
