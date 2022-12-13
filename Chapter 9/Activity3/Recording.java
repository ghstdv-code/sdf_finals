package Activity3;

public class Recording {
    private String Title, Artist;
    private int TimeInS;

    public void SetTitle(String title){
        this.Title = title;
    }

    public void SetArtist(String artist){
        this.Artist = artist;
    }

    public void SetTimeInS(int time){
        this.TimeInS = time;
    }

    public String GetTitle(){
        return this.Title;
    }

    public String GetArtist(){
        return this.Artist;
    }

    public int GetTimeInS(){
        return this.TimeInS;
    }

}
