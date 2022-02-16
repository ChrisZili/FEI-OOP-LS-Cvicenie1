public class APP {
    public static void main(String[] args) {

//        System.out.println("Hello world");
//        int celeCislo = 5;
//        long celeVacsieCislo = 5L;
//        float desatinneCislo = 2.2f;
//        double dlhsieDesatinneCislo = 5.5;
//        char znak = 'a';
//        String retazec = "retazec";
////        boolean bool = False;
//
//        int podiel = 2/3;
//        System.out.println(podiel);
//
//        int zvysok = 2%3;
//        System.out.println(zvysok);

//        int cislo = Integer.parseInt(args[0]);
//        if(cislo == 0) {
//            System.out.println("je to nula");
//        } else {
//            System.out.println("Nieje to nulu");
//        }
//        int cislo = 2;
//        for(int i = 1;i < 4;i++){
//            switch (i) {
//                case 1:
//                    System.out.println("cislo je jedna");
//                    break;
//                case 2:
//                    System.out.println("Cislo je 2");
//                    break;
//                default:
//                    System.out.println("cislo je ine ako jedna a dva");
//
//            }
//        }
        int[] pole = new int[10];
        for (int i = 0; i < pole.length; i++) {
            pole[i] = i;
            APP.vypis(pole[i]);
        }
    }
    public static void vypis(int cislo){
        System.out.println(cislo);
    }
}
