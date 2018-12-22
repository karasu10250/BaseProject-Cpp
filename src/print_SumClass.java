
public class print_SumClass {
	
	private float sum1;
	private float sum2;
	private float sum3;
	
	public print_SumClass()
	{
		sum1 = 0;
		sum2 = 0;
		sum3 = 0;
	}
	
	
	public float getSum1() {
		return sum1;
	}
	
	public void setSum1(float sum1) {
		this.sum1 = sum1;
	}

	
	public float getSum2() {
		return sum2;
	}

	public void setSum2(float sum2) {
		this.sum2 = sum2;
	}

	
	public float getSum3() {
		return sum3;
	}

	public void setSum3(float sum3) {
		this.sum3 = sum3;
	}

    
	
	public void totalSum(float[] score)
	{
		sum1 = score[8] + score[0] + score[1];
		sum2 = score[2] + score[3] + score[4];
		sum3 = score[5] + score[6] + score[7];
	}
	
	public void printEach(float[] score)
	{
		System.out.printf(String.format("%8s","I : ") + score[1] + String.format("%8s"," II : ") + score[2] + String.format("%8s"," III : ") + score[3] + "\n");
		System.out.printf(String.format("%8s","IV : ") + score[4] + String.format("%8s"," V : ") + score[5] + String.format("%8s"," VI : ") + score[6] + "\n");
		System.out.printf(String.format("%8s","VII : ") + score[7] + String.format("%8s"," VIII : ") + score[8] + String.format("%8s"," IX : ") + score[0] + "\n");
	}
	
	
	public void compare()
	{
		if(sum1 > sum2 && sum1 > sum3)
		{
			System.out.println("您屬於思考主導型，愛好知識且喜愛懷疑事物並透過思考解決問題，但必須注意");
			System.out.println("不能太過於理性而失去感性，懷疑事物也須適當，否則在交際上可能會有困難。");
		}
		else if(sum2 > sum1 && sum2 > sum3)
		{
			System.out.println("您屬於感情主導型，喜愛給予、愛好成就，以感情為驅動力，以心為中心，但必");
			System.out.println("須注意不能太過感情用事，不理性的處事往往會失去是非價值判斷的能力。");
		}
		else if(sum3 > sum1 && sum3 > sum2)
		{
			System.out.println("您屬於行動主導型，愛好力量、標準，行事喜歡以自己的經驗為驅動力，但必須");
			System.out.println("注意，在行動上有時過往的經驗不一定適用於現在的情況，要適時做出應變，以");
			System.out.println("避免造成不理想的結果。");
		}
		else if(sum1 == sum2 && sum1 != sum3)
		{
			System.out.println("您同時擁有多種屬性");
			System.out.println("您屬於思考主導型，愛好知識且喜愛懷疑事物並透過思考解決問題，但必須注意");
			System.out.println("不能太過於理性而失去感性，懷疑事物也須適當，否則在交際上可能會有困難。");
			System.out.println("------------------------");
			System.out.println("您屬於感情主導型，喜愛給予、愛好成就，以感情為驅動力，以心為中心，但必");
			System.out.println("須注意不能太過感情用事，不理性的處事往往會失去是非價值判斷的能力。");
		}
		else if(sum1 == sum3 && sum1 != sum2)
		{
			System.out.println("您同時擁有多種屬性");
			System.out.println("您屬於思考主導型，愛好知識且喜愛懷疑事物並透過思考解決問題，但必須注意");
			System.out.println("不能太過於理性而失去感性，懷疑事物也須適當，否則在交際上可能會有困難。");
			System.out.println("------------------------");
			System.out.println("您屬於行動主導型，愛好力量、標準，行事喜歡以自己的經驗為驅動力，但必須");
			System.out.println("注意，在行動上有時過往的經驗不一定適用於現在的情況，要適時做出應變，以");
			System.out.println("避免造成不理想的結果。");
		}
		else if(sum2 == sum3 && sum2 != sum1)
		{
			System.out.println("您同時擁有多種屬性");
			System.out.println("您屬於感情主導型，喜愛給予、愛好成就，以感情為驅動力，以心為中心，但必");
			System.out.println("須注意不能太過感情用事，不理性的處事往往會失去是非價值判斷的能力。");
			System.out.println("------------------------");
			System.out.println("您屬於行動主導型，愛好力量、標準，行事喜歡以自己的經驗為驅動力，但必須");
			System.out.println("注意，在行動上有時過往的經驗不一定適用於現在的情況，要適時做出應變，以");
			System.out.println("避免造成不理想的結果。");
		}
		else if(sum1 == sum2 && sum2 == sum3)
		{
			System.out.println("您同時擁有多種屬性");
			System.out.println("您屬於思考主導型，愛好知識且喜愛懷疑事物並透過思考解決問題，但必須注意");
			System.out.println("不能太過於理性而失去感性，懷疑事物也須適當，否則在交際上可能會有困難。");
			System.out.println("------------------------");
			System.out.println("您屬於感情主導型，喜愛給予、愛好成就，以感情為驅動力，以心為中心，但必");
			System.out.println("須注意不能太過感情用事，不理性的處事往往會失去是非價值判斷的能力。");
			System.out.println("------------------------");
			System.out.println("您屬於行動主導型，愛好力量、標準，行事喜歡以自己的經驗為驅動力，但必須");
			System.out.println("注意，在行動上有時過往的經驗不一定適用於現在的情況，要適時做出應變，以");
			System.out.println("避免造成不理想的結果。");
		}
	}
	
	
	
	
	public String toString()
	{
		return "第一區（VII.IX.I）" + String.format("%10s","總分 : ") + sum1 + "  (行動主導)\n" +
			   "第二區（II.III.IV）" + String.format("%6s","總分 : ") + sum2 + "  (感情主導)\n" +
			   "第二區（V.VI.VII）" + String.format("%10s","總分 : ") + sum3 + "  (思考主導)\n";
	}
	
}
