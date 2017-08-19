


/**
 * Created by BalaH-RiG on 8/15/2017.
 */
package javaapplication1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Winners implements Comparable {
    String name;
    long time;
    int size;

    public Winners(String name, long time, int size) {
        this.name = name;
        this.time = time;
        this.size = size;
    }

    public static void writeArray() throws IOException {
        try {
            ArrayList<Winners> winners = new ArrayList<Winners>();
            Scanner reader = new Scanner(new File("winners.txt"));
            while(reader.hasNextLine()) {
                //Line 1


                //Line 2,3
                String name = reader.next();
                System.out.println(name);

                long time = reader.nextLong();
                System.out.println(time);
                int size = reader.nextInt();
                reader.nextLine();
                winners.add(new Winners(name, time,size));

            }
            GameWindow.winnerList = winners;
            reader.close();
        } catch (FileNotFoundException e) {
            try {
                new FileOutputStream("winners.txt", false).close();
                writeArray();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Winners.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void saveLeaderBoard() {
        try {
            PrintWriter pw = new PrintWriter(new File("winners.txt"));
            for (int i = 0; i < GameWindow.winnerList.size(); i++) {

                pw.println(GameWindow.winnerList.get(i).toString());

            }
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public String toLeaderString() {
        long hours = time / 3600;
        long remainder = time - hours * 3600;
        long mins = remainder / 60;
        remainder -= mins * 60;
        long secs = remainder;

        String time = hours+"h : "+mins+"m : "+secs+"s";
        return name + "\t" + "\t"+"\t"+ time;


    }
    public String toString()
    {
        return name + " " + time + " " + size;
    }
    public boolean equals(Object othr)
    {
        
        return GameWindow.name.equals(((Winners)othr).name);
    }
    public int compareTo(Object arg0) {
        return Long.compare(this.time, ((Winners) arg0).time);


    }
}
