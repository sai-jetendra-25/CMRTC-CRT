public class DiffArray {
    public static void main(String[] args) {
        Object[]arr=new Object[5];
        arr[0]=10;
        arr[1]=21.4f;
        arr[2]='a';
        arr[3]="Hello world";
        arr[4]=new Product("CDDDR","AA",22332,12);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        

        

        

    }
    
}
