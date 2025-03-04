public class string_repeating {
    public static void main(String[] args) {
        String str  = "t6hj7ui";
        String out = convert(str);
        System.out.println(out); 
    }  
        public static String convert(String str){
            StringBuffer res = new StringBuffer();
        for(int i =0;i<str.length();i++){
            char currentchar  = str.charAt(i);

            if(Character.isDigit(currentchar)&&i>0){
                int repeatcount =Character.getNumericValue(currentchar);
                char prevchar = str.charAt(i-1);

             for(int j=1;j<repeatcount;j++){
                res.append(prevchar);  
            }
        }
        else{
            res.append(currentchar);
        }
    
}
return res.toString();
}
}
