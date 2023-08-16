public class Uppercase {

    public static void main(String args[])
    {
        String str="hey there this is me"; //declare the string

        StringBuilder st=new StringBuilder(""); //declare the setbuilder of type variable

        // char ch=Character.toUpperCase(str.charAt(0)); //converting the first letter to uppercase
        // st.append(ch); //appending that character

        // for(int i=1;i<str.length();i++)
        // {
        //     if(str.charAt(i)==' ' && i<str.length()-1){
        //         st.append(str.charAt(i));
        //         i++;
        //         st.append(Character.toUpperCase(str.charAt(i)));
        //     }
        //     else{
        //         st.append(str.charAt(i));
        //     }
        // }

        char ch=str.charAt(0);

        st.append(Character.toUpperCase(ch));

        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i)==' ' && i<str.length()-1)
            {
                st.append(str.charAt(i));
                i++;
                st.append(Character.toUpperCase(str.charAt(i)));
            }else{
                st.append(str.charAt(i));
            }

        }

        System.out.print(st.toString());
    }
    
}

//convert the every first letter to uppercase
