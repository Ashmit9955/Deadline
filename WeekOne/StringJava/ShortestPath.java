import java.util.Scanner;

public class ShortestPath{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String path = sc.next();
        int xaxis = 0;
        int yaxis = 0;
        int len = path.length();
        for(int i=0; i<len; i++){
            if(path.charAt(i) == 'N'){
                yaxis++;
            }else if(path.charAt(i) == 'S'){
                yaxis--;
            }else if(path.charAt(i) == 'W'){
                xaxis--;
            }else{
                xaxis++;
            }
        }
        System.out.println(xaxis+","+yaxis);
        
        double shortestPath = Math.pow(xaxis*xaxis+ yaxis*yaxis ,0.5);
        System.out.println("This is the Shortest distance: "+shortestPath);
    }
}