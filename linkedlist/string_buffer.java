public class string_buffer {
    public static void main(String[] args) {
        StringBuffer string = new StringBuffer();
        string.append("Hello-");
        string.append("world!");
        String str = string.toString();  // store  at  string
        System.out.println(str);

        StringBuilder sb = new StringBuilder();
        sb.append("SAHIL");
        sb.append(" Patel");
        String s=sb.toString();
        System.out.println(s);
    }
}
