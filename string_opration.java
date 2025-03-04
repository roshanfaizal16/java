class string_opration{
    public static void main(String[] args) {
        string_opration m  = new string_opration();
        m.stringbuilder();
        m.stringbuffer();
        m.string();
    }
    public void string(){
          String str2 = "malayalam";
          String rev = "";
          for( int i = str2.length()-1;i>=0;i--){
               rev = rev +str2.charAt(i);
          }
          if(str2.equals(rev.toString())){
            System.out.println(str2+"is a palindrome");
          }
          else{
            System.out.println(str2+"is not a palindrome");
          }
    }
    public void stringbuilder(){
        String str = "1234321";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        if(str.equals(sb.toString())){
            System.out.println(str+"   "+"is a palindrome");
        }
        else{
            System.out.println(str+"  "+"is not a palindrome");
        }
    }
    public void stringbuffer(){
        String str2 = "malayalam";
        StringBuffer sb1= new StringBuffer(str2);
        sb1.reverse();
        if(str2.equals(sb1.toString())){
            System.out.println(str2+"is a palindrome");
        }
        else{
            System.out.println(str2+"is not a palindrome");
        }
    }
    }
