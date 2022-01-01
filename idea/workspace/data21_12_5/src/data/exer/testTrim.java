package data.exer;

import org.junit.Test;

/**
 * 模拟一个trim方法，去除字符串两端的空格。
 * 2. 将一个字符串进行反转。将字符串中指定部分进行反转。比如“abcdefg”反
 * 转为”abfedcg”
 * 3. 获取一个字符串在另一个字符串中出现的次数。
 * 比如：获取“ ab”在 “abkkcadkabkebfkabkskab” 中出现的次数
 *
 * @author gjx
 * @create 2021-12-05 15:56
 */


public class testTrim {

    /**
     * 模拟一个trim方法，去除字符串两端的空格。
     *
     * @param str 输入的字符串
     * @return
     */
    public String test1(String str) {

        if (str != null) {
            //记得减一
            int start = 0;//0
            int stop = str.length() - 1;//1

            //取首位
            while (str.charAt(start) == ' ' && start < str.length()-1) {
                start++;
            }
            //取末位
            while (str.charAt(stop) == ' ' && stop > 0 && stop>start) {
                stop--;
//                System.out.println("---stop");
            }
            if(str.substring(start,stop+1)==null){
                System.out.println("数组为空！");
            }
            //返回首末位置  注意左毕右开！！！！stop需要加一
            return str.substring(start, stop + 1);
/**
 * 垃圾代码。。。。
 */

//            //转化为stringbuffer
//            StringBuffer stringBuffer = new StringBuffer(str);
//            //从前删字符串
//            boolean isflage = true;
//            while (isflage) {
//                for (int i = 0; i < stringBuffer.length(); i++) {
//                    if (stringBuffer.charAt(i) == ' ') {
//                        stringBuffer.delete(i, i + 1);
//                    } else {
//                        isflage = false;
//                    }
//                }
//            }
//            //从后删字符串
//            boolean isFlage = true;
//            while (isFlage) {
//                for (int i = stringBuffer.length(); i >= 0; i--) {
//                    if (stringBuffer.charAt(i) == ' ') {
//                        stringBuffer.delete(i, i + 1);
//                    } else {
//                        isFlage = false;
//                    }
//                }
//            }
//            //转化为string类输出
//            String s = new String(stringBuffer);
//
//            return s;
        } else {
            return null;
        }
    }

    @Test
    public void stringDeam() {
        String str = "   ";
        String newstr = test1(str);
        System.out.println("--" + newstr + "----");
    }

    /**
     * 2. 将一个字符串进行反转。将字符串中指定部分进行反转。比如“abcdefg”反
     * 转为”abfedcg”
     */
    public String stringFanZhuang(String str, int start, int stop) {

        if (start < 0 & stop <= start & (stop > str.length())) {
            throw new RuntimeException("您输入的数据非法！");
        }
        if (str != null) {
            //string转化为char类型的
            char[] sbf = str.toCharArray();
            for (int i = start, j = stop; i < j; i++, j--) {
                char tmp = sbf[i];
                sbf[i] = sbf[j];
                sbf[j] = tmp;
            }
            String newstr = new String(sbf);
            return newstr;
        }
        return null;
    }

    /**
     * 2. 将一个字符串进行反转。将字符串中指定部分进行反转。比如“abcdefg”反
     * 转为”abfedcg”
     *
     * @param str   输入的字符串
     * @param start 反转的开始位置
     * @param stop  反转的结束位置
     * @return 返回反转的字符串
     */
    public String stringFanZhuang1(String str, int start, int stop) {

            if (str != null) {
            //确认长度
            if (start < 0 & stop <= start & (stop > str.length())) {
                throw new RuntimeException("您输入的数据非法！");
            }
            StringBuffer s = new StringBuffer(str.length());

            //分为三部分
            s.append(str.substring(0, start));
            //中间部分反转   截至到stop
            for (int i = stop, j = start; i >= j; i--) {
                s.append(str.charAt(i));
//                System.out.println(i);
            }
            //结尾部分  前面已经添加到了stop ，所以后面的stop需要加一！！！！
            s.append(str.substring(stop + 1));
            return s.toString();
        }
        return null;

    }


    @Test
    public void test2() {

        String str = "123456";
        String newstr = stringFanZhuang1(str, 3, 4);
        System.out.println(newstr);
    }

    /**
     * @param minstr 获取一个字符串 minstr 在另一个字符串 Str 中出现的次数。
     * @param Str    主串
     * @param minstr
     * @return 返回出现的次数
     */
    public int getcount(String minstr, String Str) {

        if (minstr.length() < Str.length()) {
            int tatol = 0;
            int index = 0;
            //indexOf 查找并返回位置，找不到返回-1
            while ((index = Str.indexOf(minstr, index)) != -1) {
                //查找需要在找到的返回数字上在加上minstr的长度 再这个长度上再去寻找
                index += minstr.length();
                tatol++;
            }
            return tatol;
        } else {
            return 0;
        }
    }

    @Test
    public void test3() {
        String minstr = "ab";
        String Str = "cdabckkcadkabkebfkabkskabc";
        int number = getcount(minstr, Str);
        System.out.println(number);
    }
}
