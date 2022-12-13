package Activity7;

public class InsuredPackage extends Package{

    InsuredPackage(float weight, char method) {
        super(weight, method);
        addInsurance();
    }
    private void addInsurance() {
        if(super.shippingCost >= 0.0 && super.shippingCost <= 1.0) super.shippingCost += 2.45;
        else if(super.shippingCost > 1.0 && super.shippingCost <= 3.0) super.shippingCost += 3.95;
        else if(super.shippingCost > 3.0) super.shippingCost += 5.55;
    }
}
