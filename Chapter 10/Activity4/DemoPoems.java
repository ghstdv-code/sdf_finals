package Activity4;

public class DemoPoems {
    public static void main(String[] args) {
        Poem poem = new Poem("Stopping by Woods On a Snowy Evening", 4);
        Couplet ptype1 = new Couplet("Sonnet III");
        Lemerick ptype2 = new Lemerick("A Wonderful Bird is the Pelican");
        Haiku ptype3 = new Haiku("The Old Pond");

        Show(poem);
        Show(ptype1);
        Show(ptype2);
        Show(ptype3);
    }

    static void Show(Poem p){
        var sb = new StringBuilder();
        sb.append("Title: "+ p.getName() +"\n");
        sb.append("Lines: "+ p.getNumberOfLines()+"\n\n");
        System.out.println(sb.toString());
    }

}
