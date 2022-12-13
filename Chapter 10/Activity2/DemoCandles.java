package Activity2;

public class DemoCandles {
    public static void main(String[] args) {
        Candle c = new Candle();
        ScentedCandle sc = new ScentedCandle();

        c.setColor("Green");
        c.setHeight(5f);
        c.Show();

        System.out.println();

        sc.setColor("Red");
        sc.setHeight(5f);
        sc.setScent("Blossom");
        sc.Show();
    }
}
