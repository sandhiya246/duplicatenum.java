import java.util.Scanner;
public class Demo{
    public static void main(String[] args){
        System.out.println("updated dev project");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),i,j,k;
        int[] a=new int[n];
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    for(k=j;k<n-1;k++){
                        a[k]=a[k+1];
                    }
                    n--;
                    j++;
                }
            }
        }
        for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
