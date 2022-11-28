import java.util.Scanner;

public class Christmas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter day");
        int day = input.nextInt();
        String song;
        String lyric = "";
        String dayOfChristmas = "";

        switch (day) {

            case 12 --> dayOfChristmas = "Twelfth":

            case 11 --> dayOfChristmas = "Eleventh":

            case 10 --> dayOfChristmas = "Tenth":

            case 9 --> dayOfChristmas = "Ninth":

            case 8 --> dayOfChristmas = "Eight":

            case 7 --> dayOfChristmas = "Seventh":

            case 6 --> dayOfChristmas = "Sixth":

            case 5 --> dayOfChristmas = "Fifth":

            case 4 --> dayOfChristmas = "Fourth":

            case 3 --> dayOfChristmas = "Third":

            case 2 --> dayOfChristmas = "Second":

            case 1 --> dayOfChristmas = "First":

        }
 song = "On the " + dayOfChristmas + " day of Christmas, my true love sent to me \n";

        switch (day){

            case 12:
                lyric = "Twelve drummers drumming \n";
                song = song + lyric;
            case 11:
                lyric = "Eleven pipers piping \n";
                song = song + lyric;
            case 10:
                lyric = "Ten lords a-leaping \n";
                song = song + lyric;
            case 9:
                lyric = "Nine ladies dancing \n";
                song = song + lyric;
            case 8:
                lyric = "Eight maids a-milking \n";
                song = song + lyric;
            case 7:
                lyric = "Seven swans a-swimming \n";
                song = song + lyric;
            case 6:
                lyric = "Six geese a-laying \n";
                song = song + lyric;
            case 5:
                lyric = "Five golden rings \n";
                song = song + lyric;
            case 4:
                lyric = "Four calling birds \n";
                song = song + lyric;
            case 3:
                lyric = "Three french hens \n";
                song = song + lyric;
            case 2:
                lyric = "Two turtle doves, and \n";
                song = song + lyric;
            case 1:
                lyric = "A partridge in a pear tree \n";
                song = song + lyric;

        }
        System.out.println(song);
        
    }
}


