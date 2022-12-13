package Activity3;

public class ItemSold {
    int invoiceNumber;
    String description;
    float price;

    public void setInvoiceNumber(int inum){this.invoiceNumber = inum;}
    public void setDescription(String desc){this.description = desc;}
    public void setPrice(float price){this.price = price;}

    public int getInvoiceNumber(){return this.invoiceNumber;}
    public String getDescription(){return this.description;}
    public float getPrice(){return price;}

    public void Show(){
        var sb = new StringBuilder();
        sb.append(String.format("Invoice Number:    %d\n", this.getInvoiceNumber()));
        sb.append(String.format("Description:       %s\n", this.getDescription()));
        sb.append(String.format("Price:             $%.1f\n", this.getPrice()));
        System.out.println(sb.toString());
    }
}
