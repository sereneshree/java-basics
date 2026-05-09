public class StrBfrIntl {
    public static void main(String a[]){

        StringBuffer sb=new StringBuffer("bhagyashree");  // it will add more space in the character rather than using that 16 character space
        System.out.println(sb.capacity());  // provides the actual capacity of the string it can hold character of
        System.out.println(sb.length()); // gives the length of the string provided by the user
        sb.append(" karn"); // adds value to the previous string rather than making one another new object to store it 
        sb.deleteCharAt(1); // deletes a character from any specified index
        System.out.print(sb);
    }
}
