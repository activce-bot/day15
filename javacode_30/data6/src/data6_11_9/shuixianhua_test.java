/*
 * 閹垫挸宓冨缈犵舶閼鸿鲸鏆�
 * 娑撳缍呴弫棰侀嚋娴ｅ秴宕勬担宥囨娴ｅ秶娈戠粩瀣煙閸滃瞼鐡戞禍搴＄暊閺堫剝闊�
 * 秋水仙数
 */

package data6_11_9;

public class shuixianhua_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("缁夊鎸夋禒娆愭殶娑擄拷:");
		int gei,shi,bai,tmp;
		for(int i=100;i<1000;i++) {
			gei=i%10;
			shi=(i/10)%10;
			bai=i/100;
			tmp=gei*gei*gei+shi*shi*shi+bai*bai*bai;
			if(i == tmp) {
				System.out.println(i);
			}
		}
	}

}
