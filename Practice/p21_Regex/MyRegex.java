package Practice.p21_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Write your code here
class MyRegex {
    //    String pattern = "^(\\d{1,3})\\.\1\\.\1\\.\1$";
    String oTo255 = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
    String pattern = oTo255 + "\\." + oTo255 + "\\." + oTo255 + "\\." + oTo255;
}
//Other solutions include:

//class myRegex {
//    String from0To255 = "(25[0-5]|2[0-4][0-9]|[01]?[0-9]?[0-9])";
//    public String pattern = String.format("%s.%s.%s.%s", from0To255, from0To255, from0To255, from0To255);
//}

///*
//     [01]?\\d{1,2}   matches numbers 0-199.
//     2[0-4]\\d       matches numbers 200-249
//     25[0-5]         matches numbers 250-255
//*/
//class MyRegex {
//    String num = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
//    String pattern = num + "." +  num + "." +  num + "." + num;
//}

//    String zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
//    public String pattern = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;

// https://regex101.com/