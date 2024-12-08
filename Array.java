import java.util.ArrayList;


public class Array {
    public static void main(String[] args) {
        
        // Scanner sc = new Scanner(System.in); 

            String [] Cars = new String[3];

             Cars[0]="SIF";
             Cars[1]="SUV";
             Cars[2]="Jagvar";
             

        System.out.println();

        for (int i=0; i<Cars.length;i++){
            System.out.println(Cars[i]);
        }

        //2D Arrays

        String[][] Letter = new String[3][3];

         Letter[0][0]="a";
         Letter[0][1]="b";
         Letter[0][2]="c";
         Letter[1][0]="d";
         Letter[1][1]="e";
         Letter[1][2]="f";
         Letter[2][0]="g";
         Letter[2][1]="h";
         Letter[2][2]="j";
         

        // for(int i=0 ; i < Letter.length; i++){
        //     System.out.println( );
        //     for (int j=0; j < Letter[i].length ; j++ ){
        //         System.out.print(Letter[i][j] + " ");
        //     }
        // }


        String name ="Aditya";
       // boolean result= name.equals("Aditya");
        //char result = name.charAt(0);
        //int result = name.indexOf("i");
        //String result = name.toUpperCase();
        // String result = name.toLowerCase();
        String result = name.replace('o' , 'a');
        System.out.println(result);


 
        ArrayList<String> food= new ArrayList <String> ();
        
        food.add("pizza");
        food.add("idali");
        food.add("Dosa");

        food.set(0,"Roti");
        food.remove(2);
        food.clear();


        for(int i=0; i< food.size();i++){
            System.out.println(food.get(i));
        }

        ArrayList<ArrayList<String>> CommonList = new ArrayList();

        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("maggi");
        bakeryList.add("Butter");
        bakeryList.add("Panner");

        ArrayList<String> ProductList = new ArrayList();
        ProductList.add("Phone");
        ProductList.add("Tv");
        ProductList.add("Car");

        ArrayList<String> BasicList = new ArrayList();
        BasicList.add("Orange");
        BasicList.add("Mango");
        BasicList.add("Grapes");

        CommonList.add(bakeryList);
        CommonList.add(ProductList);
        CommonList.add(BasicList);

        System.out.println(CommonList.get(2).get(2));

        ArrayList<String> animals = new ArrayList<>();

        animals.add("Cat");
        animals.add("Cow");
        animals.add("Fish");
         
        for (String i :animals){
            System.out.println(i);
        }



    }

}
