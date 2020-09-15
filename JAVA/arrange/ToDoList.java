 import java.util.Arrays; 



 public class ToDoList

 {



    private String[] doList; 

    private int numberOfStrings;

    private static final int DEFAULT_INITIAL_CAPACITY = 25; 

   



    public ToDoList()

    {

       

       doList = new String[1];

       numberOfStrings =0;



    }//end defualt constructor





    public ToDoList(int capacity)

    {

        doList = new String[capacity];

        numberOfStrings = 0;

    }





    //사용자가 해야할일을 스트링으로 받는 메소드

    public void add(String task)

    {

      

      ensureCapacity();

      doList[numberOfStrings] = task; //할당

      numberOfStrings++; // numberOfStrings 증가

      updatingMessage();

    }



    //어레이가 꽉차는지 확인하여 어레이를 한칸 늘린다.

    public void ensureCapacity()

    {

      

      if(numberOfStrings == doList.length)

      doList = Arrays.copyOf(doList, 1 + doList.length);     

    }





    //현재 어레이 사이즈를 리턴

    public int getCurrentSize()

    {

        return numberOfStrings;

    }



    //어레이가 비어있는지 확인

    private boolean isEmpty()

    {

         return numberOfStrings ==0;

    }





     public void remove(int give)

     { 

        

        int givenIndex = give - 1; 

        ensureCapacity();

        doList[givenIndex] = null;

        for(int index = givenIndex; index < numberOfStrings; index++)

        {

        

        

        doList[index] = doList[index+1]; 

        updatingMessage(); 



        }// end for    



          numberOfStrings--;

     }// end remove



    //모든 배열에 있는 값을 지운다.

    public void clear()

    {

      if(!isEmpty())

      for(int index =0; index < doList.length; index++)

      {

 

          doList[index] = null;

          numberOfStrings--;       

          

      }

           updatingMessage();

    

    }// end clear()

  

     

    public void replace(int givenIndex1, int givenIndex2)

    {



       int index1 = givenIndex1 -1;

       int index2 = givenIndex2 -1;

      

       ensureCapacity(); 



       doList[doList.length-1] = doList[index1]; 

       doList[index1] = doList[index2];      

       doList[index2] = doList[doList.length-1];

       updatingMessage();

    }



   //doList 배열을 출력

   public void display()

   {



      if(numberOfStrings==0)

      System.out.println("You don't have To-Do-List");



   

      else

      System.out.println("------- Your To Do List --------");



     for(int index=0; index< numberOfStrings; index++)

     {

 

       System.out.println(index + 1 + ". " + doList[index]); 



     }

    

      System.out.println();

      System.out.println();



   }





  private void updatingMessage()

  {

     System.out.println("updating.......");

       System.out.println();

   

  }

    

 }// end class





메인 클라스



import java.util.Scanner;





public class ToDoListDemo

{



   public static void main (String args[])

   {



      Scanner keyboard = new Scanner(System.in);

      int select = 0;



      String doing;

      int num1, num2;

      ToDoList myList = new ToDoList();





      System.out.println("----To Do List Management-----");



      while(select !=6)

      {

       System.out.println("Select number what do you want");

       System.out.println("1: add\n2: remove\n3: replace\n4: clear\n5: View Size\n6 : EXIT");



       select = keyboard.nextInt();



         switch(select)

         {



       

        

           case 1:

           System.out.println("Enter the do list");

           doing = keyboard.next();

           myList.add(doing);

           myList.display();

           break;



           case 2:

           System.out.println("Enter the remove number");

           System.out.println();

           myList.display();

           num1 = keyboard.nextInt();

           myList.remove(num1);

           myList.display();

           break;



           case 3:

           

           System.out.println();

           myList.display();

           System.out.println("Enter the replace two index ");

           num1 = keyboard.nextInt();

           num2 = keyboard.nextInt();

           myList.replace(num1, num2);

           myList.display();

           break;



           case 4:

    

           System.out.println();

           myList.clear();

           System.out.println("Clear success");

           break;



           case 5:

          

           System.out.println();

           System.out.println("Size is " + myList.getCurrentSize());

           break;

 

           default:

           System.out.println("You entered Wrong number!");

           break;



         }// end switch





       }// end while

   

   }// end main



}// end class
