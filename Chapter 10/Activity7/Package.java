package Activity7;

public class Package {
    private float weight;
    private char shipMethod;
    protected double shippingCost;
   
    Package(float weight, char method){
        this.weight = weight;
        this.shipMethod = method;
        computeCost();
    }

    private void computeCost() {
        if(weight >= 1 && weight <= 8){
            switch(shipMethod){
                case 'A' -> this.shippingCost = 2.0;
                case 'T' -> this.shippingCost = 1.5;
                case 'M' -> this.shippingCost = 0.5;
            }
        }
        else if(weight >= 9 && weight <= 16){
            switch(shipMethod){
                case 'A' -> this.shippingCost = 3.0;
                case 'T' -> this.shippingCost = 2.35;
                case 'M' -> this.shippingCost = 1.5;
            }
        }
        else if(weight >= 17){
            switch(shipMethod){
                case 'A' -> this.shippingCost = 4.5;
                case 'T' -> this.shippingCost = 3.25;
                case 'M' -> this.shippingCost = 2.15;
            }
        }
    }

    public void Display(){
        var sb = new StringBuilder();
        sb.append(String.format("\nWeight: %.1f oz\n", weight));
        String method = "";
        switch(shipMethod){
            case 'A' -> method = "Air";
            case 'T' -> method = "Truck";
            case 'M' -> method = "Mail";
        }
        sb.append(String.format("Shipping Method: %s\n", method));
        sb.append(String.format("Shipping Cost: $%.2f\n", shippingCost));
        System.out.println(sb.toString());
    }
}
