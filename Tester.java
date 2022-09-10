public class Tester{
    public static void main(String[] args){
        
        //A stack is: First in, last out
        //stack works like a real stack. For our purposes, make a java class
        
        //A queue is: First in, first out
        //same as stack but push adds to back instead of top, and pop takes from front

        //Binary search tree:
        //pops the most extreme value
        //each value links/points to more values (called children) going up is called parent
        //two children max
        //smaller go left, larger goes right. Same, choose in advance whether left or right
        //works like a linked list






        int TestCasesPassed = 0;
        int TotalTestCases = 0;

        //StackTestCases

        //test for initialization
        TotalTestCases++;
        Stack t1 = new Stack(25);
        TestCasesPassed++;

        //test for size zero (Should be legal)
        TotalTestCases++;
        Stack zero = new Stack(0);
        TestCasesPassed++;

        //test error for no given size
        TotalTestCases++;
        try{
            Stack noSize = new Stack();
        } catch(Exception RuntimeException){
            TestCasesPassed++;
        }

        //test push
        TotalTestCases++;
        Stack P = new Stack(5);
        P.push(5);
        TestCasesPassed++;

        //test pop
        TotalTestCases++;
        int temp = P.pop();
        if (temp == 5){
            TestCasesPassed++;
        }

        //test basic function
        TotalTestCases++;
        for(int i = 1; i<11; i++){
            t1.push(i);
        }
        String out = "";
        for(int i = 1; i<11; i++){
            out += t1.pop();
        }
        try{
            t1.pop();
        }catch(Exception RuntimeException){
            if(out.equals("10987654321")){
                TestCasesPassed++;
            }
        }
        out = "";

        //test for underflow
        TotalTestCases++;
        try{
            t1.pop();
        }catch(Exception RuntimeException){
            TestCasesPassed++;
        }

        //test overflow
        TotalTestCases++;
        try{
            for(int i = 1; i<30; i++){
                t1.push(i);
            }
        }catch(Exception runtimeException){
            TestCasesPassed++;
        }

        //test function right before overflow
        Stack t2 = new Stack(5);

        TotalTestCases++;
        for(int i = 1; i<6; i++){
            t2.push(i);
        }
        out = "";
        for(int i = 1; i<6; i++){
            out += t2.pop();
        }
        try{
            t2.pop();
        }catch(Exception RuntimeException){
            if(out.equals("54321")){
                TestCasesPassed++;
            }
        }
        out = "";

        //test for function when going back and forth
        TotalTestCases++;
        Stack t3 = new Stack(40);
        t3.push(5);
        t3.push(1225);
        t3.push(900);
        t3.push(51);
        t3.push(70);
        t3.push(1);
        t3.push(0);
        t3.push(-8);
        out += t3.pop();
        out += t3.pop();
        out += t3.pop();
        t3.push(70);
        t3.push(1);
        t3.push(89);
        out += t3.pop();
        out += t3.pop();
        out += t3.pop();
        if(out.equals("-80189170")){
            TestCasesPassed++;
        }
        out="";
        
        System.out.println("Tests passed: "+TestCasesPassed+"/"+TotalTestCases);
    }
}