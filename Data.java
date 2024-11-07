import java.util.*;



class Data {

    public static void main(String[] args) {
        int[] PriceOfPen = new int[5];
        Scanner in = new Scanner(System.in);

        for(int i=0; i<PriceOfPen.length;i++){
            PriceOfPen[i] = in.nextInt();
        }

        for(int i=0; i<PriceOfPen.length; i++){
            System.out.print(PriceOfPen[i] + " ");
        }
    }
    
}
