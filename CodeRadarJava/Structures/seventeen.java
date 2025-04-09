import java.util.Scanner;

class Movie{
    String movie;
    String type;
    float price;
}

public class seventeen{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float VIP = 0;
        float Standard = 0;
        float Premium = 0;

        Movie arr[] = new Movie[n];
        for(int i=0; i<n; i++){
            arr[i] = new Movie();
            arr[i].movie = sc.next();
            arr[i].type = sc.next();
            arr[i].price = sc.nextFloat();
        }
        for(int i=0; i<n; i++){
            if(arr[i].type.equals("Premium")){
                Premium+= arr[i].price;
            }else if(arr[i].type.equals("Standard")){
                Standard+= arr[i].price;
            }else if(arr[i].type.equals("VIP")){
                VIP+= arr[i].price;
            }
        }

        System.out.printf("Standard: %.2f, Premium: %.2f, VIP: %.2f",Standard,Premium,VIP);
    }
}