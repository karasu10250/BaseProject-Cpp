
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
		
		System.out.println("==========���絲�G==========");
		Print.printEach(score);
		Print.totalSum(score);
		System.out.print(Print);
		
		System.out.println("============��ĳ============");
		Print.compare();
		
		System.out.println("==========�����̾�==========");
		

		System.out.println("[�ʧO ]\r\n" + "����N�q\r\n" + "[�ʦV ]\r\n" + "����N�q\r\n" + "[�嫬 ]\r\n" + "A(���� ) II.IV");
		System.out.println("B(�w�R ) I.VIII\r\n" + "AB(���� ) IV.V.VI.IX\r\n" + "O(���{ ) III.VII");
		System.out.println("[�P�y ]\r\n" + "I : ���� .��l\r\n" + "II : ���~ .�ѯ�\r\n" + "III : ���l\r\n" + "IV : �B�k");
		System.out.println("V : �]�~\r\n" + "VI : ����.����\r\n" + "VII : �d��\r\n" + "VIII : ����\r\n" + "XI : �g��");
		System.out.println("------------------------");
		System.out.println("VIII.IX.I �P��");
		System.out.println("II.III.IV �P��");
		System.out.println("V.VI.VII  �P��");
		
	}

}
