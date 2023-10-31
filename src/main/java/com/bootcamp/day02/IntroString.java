package com.bootcamp.day02;

public class IntroString {
    public static void main(String[] args) {
        //initString();
        //stringMethods();

        String words = " codeid bootcamp java lala";
        System.out.println("total words : "+countWord(words));

        initStringBuilder();
    }


    //4
    static void initStringBuilder(){
        StringBuilder strB = new StringBuilder();
   
        String ori = "Hello Java";

        for (int i = 0; i < ori.length(); i++) {
            strB.append(ori.charAt(i));
        }
        String xx = "Cool";
        strB.append(xx);
        System.out.println(strB);
    }

    //3
    static int countWord(String words){
        int count =0;
        words = words.trim();
        for (int i = 0; i < words.length(); i++) {
            if ((Character.isSpaceChar(words.charAt(i)) || i == words.length()-1)){
                //if (!Character.isSpaceChar(words.charAt(0)))
                count++;
            }
        }

        return count;
    }

    //1
    static void initString(){
       //declare using new operator
        final String strObject = new String("Codeid");
        final String strObject2 = new String("Codeid java");
       //literal
        final String strLiteral = "java";
        final String strLiteral2="java code";

        System.out.println(strObject);

    }

    static void stringMethods() {
        String s = "aku suka java";
        System.out.println("Length s : " + s.length());

        // chartAt
        System.out.println("charAt :" + s.charAt(2));
        System.out.println("charAt :" + s.charAt(10));

        // substring
        String scut = s.substring(4, 8);
        System.out.println("substring : " + scut);

        String concat = s + " Bootcamp";
        System.out.println("concat : " + concat);

        // toUppercase
        String upperCase = s.toUpperCase();
        System.out.println("uppercase : " + upperCase);

        // tolowercase
        String lowerCase = s.toLowerCase();
        System.out.println("lowercase : " + lowerCase);

        // string format
        String str = "18";
        String str2 = String.format("%4s", str).replace(' ', '0');
        System.out.println("format : " + str2);

        // replace
        String d, e;
        d = "I am newbie in C++. C++ rocks!";
        e = d.replace("C++", "Java");
        System.out.println("replace : " + e);
    }

}
