package Activity3;

import java.util.Scanner;

public class RecordingSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Recording[] rc = new Recording[5];
        String title, artist;
        int time;

        for(int i = 0; i < 5; i++){
            rc[i] = new Recording();
            System.out.println("Entry #" + (i+1));
            System.out.print("Input Song Title: ");
            title = sc.nextLine();

            System.out.print("Input Song Artist: ");
            artist = sc.nextLine();

            System.out.print("Input Song Length in seconds: ");
            time = sc.nextInt();
            sc.nextLine();

            rc[i].SetTitle(title);
            rc[i].SetArtist(artist);
            rc[i].SetTimeInS(time);

            System.out.println();
        }

        String c = "T";

        while(!c.toUpperCase().equals("X")){
            System.out.println("Sorting Options: [T]Song Title, [A]Song Artist, [L]Song Length and [X]Quit");
            System.out.print("Input Option: ");
            c = sc.nextLine();

            if(c.substring(0, 1).toUpperCase().equals("T")) { Sort(rc, "title"); Display(rc);}
            else if(c.substring(0, 1).toUpperCase().equals("A")) { Sort(rc, "artist"); Display(rc); }
            else if(c.substring(0, 1).toUpperCase().equals("L")) { Sort(rc, "length"); Display(rc);}
            else{
                if(!c.toUpperCase().equals("X") || !c.substring(0, 1).toUpperCase().equals("T") || !c.substring(0, 1).toUpperCase().equals("A") || !c.substring(0, 1).toUpperCase().equals("L")) System.out.println("Invalid Option!");
            }
        }

        sc.close();
    }

    static void Display(Recording[] arr){
        StringBuilder sb = new StringBuilder();
        for(Recording r:arr){
            sb.append("Title  :" + r.GetTitle() + "\n");
            sb.append("Artist :" + r.GetArtist() + "\n");
            sb.append("Length :" + r.GetTimeInS() + "s\n\n");
        }
        System.out.println(sb.toString());
    }

    static void Sort(Recording[] rc, String sortOption){
        Recording r;
        for(int i = 0;i < rc.length; i++){
            for(int j = 0; j < rc.length; j++){
                switch(sortOption){
                    case "title":
                        if(rc[i].GetTitle().compareTo(rc[j].GetTitle()) < 0){
                            r = rc[i];
                            rc[i] = rc[j];
                            rc[j] = r;
                        } break;

                    case "artist":
                        if(rc[i].GetArtist().compareTo(rc[j].GetArtist()) < 0){
                            r = rc[i];
                            rc[i] = rc[j];
                            rc[j] = r;
                        } break;

                    case "length":
                        if(rc[i].GetTimeInS() < rc[j].GetTimeInS()){
                            r = rc[i];
                            rc[i] = rc[j];
                            rc[j] = r;
                        } break;
                }
               
            }
        }
    }
}
