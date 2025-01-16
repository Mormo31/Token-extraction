public class Token-Extraction
{


    public static void main(String args[])
    {




        if (args.length != 1)
        {
            System.out.println("usage:  Lab4 \"STRING IN QUOTES\"");
            System.exit(0);
        }




        String str = args[0];


        if (str.length() == 0)
        {
            System.out.println();
            System.exit(0);


        }


            int START = 0;
            int END = str.indexOf(' ');


            while(END>0)
            {


               String s = str.substring(START,END);
               System.out.println("[" + s + "]");


               START = END + 1;
               END = str.indexOf(' ', START);


            }


            String s = str.substring(START);
            System.out.println("[" + s + "]");








    }
}


