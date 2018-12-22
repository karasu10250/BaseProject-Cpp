
public class print {

	public static void main(String[] args) {
		
		
		
		float[] score = new float[9];
		print_SumClass Print = new print_SumClass();
		
		score[0] = 60;
		score[1] = 90;
		score[2] = 60;
		score[3] = 60;
		score[4] = 60;
		score[5] = 60;
		score[6] = 60;
		score[7] = 60;
		score[8] = 60;
		
		System.out.println("==========測驗結果==========");
		Print.printEach(score);
		Print.totalSum(score);
		System.out.print(Print);
		
		System.out.println("============建議============");
		Print.compare();
		
		System.out.println("==========評分依據==========");
		

		System.out.println("[性別 ]\r\n" + "不具意義\r\n" + "[性向 ]\r\n" + "不具意義\r\n" + "[血型 ]\r\n" + "A(活潑 ) II.IV");
		System.out.println("B(安靜 ) I.VIII\r\n" + "AB(興奮 ) IV.V.VI.IX\r\n" + "O(抑鬱 ) III.VII");
		System.out.println("[星座 ]\r\n" + "I : 天蠍 .獅子\r\n" + "II : 水瓶 .天秤\r\n" + "III : 雙子\r\n" + "IV : 處女");
		System.out.println("V : 魔羯\r\n" + "VI : 巨蟹.雙魚\r\n" + "VII : 牡羊\r\n" + "VIII : 金牛\r\n" + "XI : 射手");
		System.out.println("------------------------");
		System.out.println("VIII.IX.I 同區");
		System.out.println("II.III.IV 同區");
		System.out.println("V.VI.VII  同區");
		
	}

}
