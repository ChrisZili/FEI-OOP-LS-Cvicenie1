public class uloha_cvicenie1 {
    public static void main(String[] args){

    helloWord();
    System.out.println(porovnanie(2,1));

    }
    public static void helloWord(){
        System.out.println("Hello world!");

    }

    public static int porovnanie(int a,int b){
        if (a > b)
            return 1;
        else if (a == b)
            return 0;
        else
            return -1;

    }
}

