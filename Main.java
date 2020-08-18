import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the length of the array");
  int y=0;
  int n=sc.nextInt();
  int arr[]=new int[n];
  for (int x=0;x<=n-1;x++) {
    System.out.print("enter the numbers of the array");
     arr[x]=sc.nextInt();
  }
  boolean proceed=false;
for (int j=0;j<n-1;j++) {
        for (int i=0;i<n-j-1;i++) {
    if (arr[i]>arr[i+1]) {
      y=arr[i+1];
      arr[i+1]=arr[i];
      arr[i]=y;
      proceed=true;
    } else {
      continue;
    }
  }
  if (proceed=false) {
    break;
  }

}
for (int s=0;s<=n-1;s++) {
  System.out.print(arr[s]+",");
}
  }
}
