public class uloha_cvicenie1 {
    public static void main(String[] args){

    HelloWord();
    System.out.println(Porovnanie(2,1));

    }
    public static void HelloWord(){
        System.out.println("Hello world!");

    }

    public static int Porovnanie(int a,int b){
        if (a > b)
            return 1;
        else if (a == b)
            return 0;
        else
            return -1;

    }
}

