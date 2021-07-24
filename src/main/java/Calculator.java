public class Calculator {
    public int add(int a,int b){
       return a+b;
    }

    public Object divide(int a,int b){

        if(b==0)
        {
            return null;
        }
        else
        {
            return a/b;
        }
    }


}
