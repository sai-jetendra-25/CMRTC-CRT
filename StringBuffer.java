public class StringBuffer {
    public static void main(String[] args) {
        String st="MAM";
        StringBuffer s=new StringBuffer(st);
        s.reverse();
        if(st.contentEquals(s)){
            System.out.println("YES");

        }
        else System.out.println("NO");
    }
    
}