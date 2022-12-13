package Activity2;

public class ScentedCandle extends Candle {
    String scent;
    float height;

    public void setHeight(float height){this.height = height;}
    public void setScent(String scent){this.scent = scent;}
    public String getScent(){return this.scent;}
    public float getPrice(){return this.height*3f;}

    public void Show(){
        var sb = new StringBuilder();
        sb.append(String.format("Color:    %s\n", this.getColor()));
        sb.append(String.format("Height:   %.1f in\n", this.height));
        sb.append(String.format("Scent:    %s\n", this.getScent()));
        sb.append(String.format("Price:    $%.1f\n", this.getPrice()));
        System.out.println(sb.toString());
    }
}
