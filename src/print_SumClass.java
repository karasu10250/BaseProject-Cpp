
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
			System.out.println("�z�ݩ��ҥD�ɫ��A�R�n���ѥB�߷R�h�èƪ��óz�L��ҸѨM���D�A�������`�N");
			System.out.println("����ӹL��z�ʦӥ��h�P�ʡA�h�èƪ��]���A��A�_�h�b��ڤW�i��|���x���C");
		}
		else if(sum2 > sum1 && sum2 > sum3)
		{
			System.out.println("�z�ݩ�P���D�ɫ��A�߷R�����B�R�n���N�A�H�P�����X�ʤO�A�H�߬����ߡA����");
			System.out.println("���`�N����ӹL�P���ΨơA���z�ʪ��B�Ʃ����|���h�O�D���ȧP�_����O�C");
		}
		else if(sum3 > sum1 && sum3 > sum2)
		{
			System.out.println("�z�ݩ��ʥD�ɫ��A�R�n�O�q�B�зǡA��Ƴ��w�H�ۤv���g�笰�X�ʤO�A������");
			System.out.println("�`�N�A�b��ʤW���ɹL�����g�礣�@�w�A�Ω�{�b�����p�A�n�A�ɰ��X���ܡA�H");
			System.out.println("�קK�y�����z�Q�����G�C");
		}
		else if(sum1 == sum2 && sum1 != sum3)
		{
			System.out.println("�z�P�ɾ֦��h���ݩ�");
			System.out.println("�z�ݩ��ҥD�ɫ��A�R�n���ѥB�߷R�h�èƪ��óz�L��ҸѨM���D�A�������`�N");
			System.out.println("����ӹL��z�ʦӥ��h�P�ʡA�h�èƪ��]���A��A�_�h�b��ڤW�i��|���x���C");
			System.out.println("------------------------");
			System.out.println("�z�ݩ�P���D�ɫ��A�߷R�����B�R�n���N�A�H�P�����X�ʤO�A�H�߬����ߡA����");
			System.out.println("���`�N����ӹL�P���ΨơA���z�ʪ��B�Ʃ����|���h�O�D���ȧP�_����O�C");
		}
		else if(sum1 == sum3 && sum1 != sum2)
		{
			System.out.println("�z�P�ɾ֦��h���ݩ�");
			System.out.println("�z�ݩ��ҥD�ɫ��A�R�n���ѥB�߷R�h�èƪ��óz�L��ҸѨM���D�A�������`�N");
			System.out.println("����ӹL��z�ʦӥ��h�P�ʡA�h�èƪ��]���A��A�_�h�b��ڤW�i��|���x���C");
			System.out.println("------------------------");
			System.out.println("�z�ݩ��ʥD�ɫ��A�R�n�O�q�B�зǡA��Ƴ��w�H�ۤv���g�笰�X�ʤO�A������");
			System.out.println("�`�N�A�b��ʤW���ɹL�����g�礣�@�w�A�Ω�{�b�����p�A�n�A�ɰ��X���ܡA�H");
			System.out.println("�קK�y�����z�Q�����G�C");
		}
		else if(sum2 == sum3 && sum2 != sum1)
		{
			System.out.println("�z�P�ɾ֦��h���ݩ�");
			System.out.println("�z�ݩ�P���D�ɫ��A�߷R�����B�R�n���N�A�H�P�����X�ʤO�A�H�߬����ߡA����");
			System.out.println("���`�N����ӹL�P���ΨơA���z�ʪ��B�Ʃ����|���h�O�D���ȧP�_����O�C");
			System.out.println("------------------------");
			System.out.println("�z�ݩ��ʥD�ɫ��A�R�n�O�q�B�зǡA��Ƴ��w�H�ۤv���g�笰�X�ʤO�A������");
			System.out.println("�`�N�A�b��ʤW���ɹL�����g�礣�@�w�A�Ω�{�b�����p�A�n�A�ɰ��X���ܡA�H");
			System.out.println("�קK�y�����z�Q�����G�C");
		}
		else if(sum1 == sum2 && sum2 == sum3)
		{
			System.out.println("�z�P�ɾ֦��h���ݩ�");
			System.out.println("�z�ݩ��ҥD�ɫ��A�R�n���ѥB�߷R�h�èƪ��óz�L��ҸѨM���D�A�������`�N");
			System.out.println("����ӹL��z�ʦӥ��h�P�ʡA�h�èƪ��]���A��A�_�h�b��ڤW�i��|���x���C");
			System.out.println("------------------------");
			System.out.println("�z�ݩ�P���D�ɫ��A�߷R�����B�R�n���N�A�H�P�����X�ʤO�A�H�߬����ߡA����");
			System.out.println("���`�N����ӹL�P���ΨơA���z�ʪ��B�Ʃ����|���h�O�D���ȧP�_����O�C");
			System.out.println("------------------------");
			System.out.println("�z�ݩ��ʥD�ɫ��A�R�n�O�q�B�зǡA��Ƴ��w�H�ۤv���g�笰�X�ʤO�A������");
			System.out.println("�`�N�A�b��ʤW���ɹL�����g�礣�@�w�A�Ω�{�b�����p�A�n�A�ɰ��X���ܡA�H");
			System.out.println("�קK�y�����z�Q�����G�C");
		}
	}
	
	
	
	
	public String toString()
	{
		return "�Ĥ@�ϡ]VII.IX.I�^" + String.format("%10s","�`�� : ") + sum1 + "  (��ʥD��)\n" +
			   "�ĤG�ϡ]II.III.IV�^" + String.format("%6s","�`�� : ") + sum2 + "  (�P���D��)\n" +
			   "�ĤG�ϡ]V.VI.VII�^" + String.format("%10s","�`�� : ") + sum3 + "  (��ҥD��)\n";
	}
	
}
