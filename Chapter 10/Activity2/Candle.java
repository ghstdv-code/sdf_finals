package Activity2;

public class Candle {
    String color;
    float height;

    public void setColor(String color){this.color = color;}
    public void setHeight(float height){this.height = height;}
    
    public String getColor(){return this.color;}
    public float getHeight(){return this.height;}
    public float getPrice(){return this.height*2f;}

    public void Show(){
        var sb = new StringBuilder();
        sb.append(String.format("Color:    %s\n", this.getColor()));
        sb.append(String.format("Height:   %.1f in\n", this.getHeight()));
        sb.append(String.format("Price:    $%.1f\n", this.getPrice()));
        System.out.println(sb.toString());
    }
}
