package biaodashizuoye;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
将一个字符串中所有由4个字母组成的单词打印出来。 利用正则表达式的获取功能
 */
public class Test3 {
    public static void main(String[] args) {
        String str = "da jia zhu yi le,ming tian bu fang jia,xie xie!";
        //想要获取由4个字母组成的单词。
        //刚才的功能返回的都是一个结果，只有split返回的是数组，但是它是把规则作为分隔符，不会获取符合规则的内容。
        //这时我们要用到一些正则对象。
        String reg = "\\b[a-z]{4}\\b";
        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(str);
        while(m.find())
        {
            System.out.println(m.start()+"...."+m.end());
            System.out.println("sub:"+str.substring(m.start(),m.end()));
        }
//		System.out.println(m.find());//将规则对字符串进行匹配查找。

    }
}
