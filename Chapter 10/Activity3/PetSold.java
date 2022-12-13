package Activity3;

public class PetSold extends ItemSold {
    boolean vaccinated, neutered, housebroken;
    public void setIsVaccinated(boolean vac){this.vaccinated = vac;}
    public void setIsNeutered(boolean neut){this.neutered = neut;}
    public void setIsHouseBroken(boolean hb){this.housebroken = hb;}

    public boolean getIsVaccinated(){return this.vaccinated;}
    public boolean getIsNeutered(){return this.neutered;}
    public boolean getIsHouseBroken(){return this.housebroken;}

    public void Show(){
        var sb = new StringBuilder();
        sb.append(String.format("Invoice Number:    %d\n", this.getInvoiceNumber()));
        sb.append(String.format("Description:       %s\n", this.getDescription()));
        sb.append(String.format("Price:             $%.1f\n", this.getPrice()));
        sb.append(String.format("Vaccinated:        %S\n", this.getIsVaccinated() == true ? "YES" : "NO"));
        sb.append(String.format("Neutered:          %s\n", this.getIsNeutered()== true ? "YES" : "NO"));
        sb.append(String.format("House Broken:      %s\n", this.getIsHouseBroken()== true ? "YES" : "NO"));
        System.out.println(sb.toString());
    }
}
