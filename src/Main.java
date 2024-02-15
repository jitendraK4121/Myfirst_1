public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        int arr[] = new int[10];
        for (int i=0;i<10;i++){
            arr[i]= i;
        }
         for (int a: arr) // EXAMPLE OF FOR-EACH LOOP
        {
            System.out.println(a);
        }
    }
}