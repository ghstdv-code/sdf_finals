package Activity6;

public class SalesPerson {
    int Id;
    double AnnualSales;

    SalesPerson(){

    }

    SalesPerson(int id, double annualsales){
        this.Id = id;
        this.AnnualSales = annualsales; 
    }
    public int GetId(){
        return this.Id;
    } 

    public double GetAnnualSales(){
        return this.AnnualSales;
    }

    public void SetId(int id){
        this.Id = id;
    }

    public void SetAnnualSales(double annualsales){
        this.AnnualSales = annualsales; 
    }
}
