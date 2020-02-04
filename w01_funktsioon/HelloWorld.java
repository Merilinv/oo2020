package oo2020.w01_funktsioon;

public class HelloWorld{   // class name alway the same as .java file name
    
    public static void main(String[] args){ 
        //static - belongs to object, 
        //void - empty main, doesnt return, 
        //public - [] - array, 
        //args - String array argument name
        System.out.println("Hello world!");

        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        //byte,short,int (32 bit),long,float,double,char, boolean

        String myName = "Merilin";
        System.out.println(myName);

        System.out.println(1+1); // operators: * / - % 

        //i++ i=i+1
        //++i 
        int number = 5;
        System.out.println(number++); // print nr, then 5+1 = 6
        System.out.println(++number); // 6+1=7, then print nr

        if(number < 10 && number > 0){
            System.out.println("jah");
        }

        int counter = 0;
        boolean flag = true;
        while(flag){
            counter++;
            if(counter == 10){
                System.out.println("i´m out");
                flag = false;
            }
        }

        int counterTwo = 0;
        do{
            counterTwo++;
        }while(counterTwo == 10);

        
        int[] numberArray = new int[] {1, 2, 3, 4, 6}; 
        //for each
        for(int element: numberArray){
            System.out.println(element);
        }
        //for
        for(int i=0; i < numberArray.length; i++){
            System.out.println(numberArray[i]);
        }

        HelloWorld helloWorld = new HelloWorld(); //class Helloworld type
        helloWorld.printSomething(5);
        //printSomething();

        
        System.out.println(name());
    }
    void printSomething(int number){ //static needed to call function if no class
        //int number = 5;
        System.out.println(20%number); 
    }

    static String name(){
        return "Võrk";
    }
}

//git status
//git add --all
//git commit -m "Minu esimene commit"
//git config user.email ...
//git config usern.name ...
//git push