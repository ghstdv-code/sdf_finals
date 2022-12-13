package Activity3;

public class DemoItemsAndPetSold {
    public static void main(String[] args) {
        ItemSold is = new ItemSold();
        PetSold ps = new PetSold();

        is.setInvoiceNumber(20212101);
        is.setDescription("With wings");
        is.setPrice(120f);
        is.Show();

        ps.setInvoiceNumber(20212102);
        ps.setDescription("Fluffy");
        ps.setPrice(500.25f);
        ps.setIsVaccinated(true);
        ps.setIsNeutered(false);
        ps.setIsHouseBroken(true);
        ps.Show();
    }

}
