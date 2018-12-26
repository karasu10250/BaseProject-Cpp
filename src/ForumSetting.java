/* 
 * 	�ҵ{�W��:	�n��u�{�ɽ�
 * 	�½ҦѮv:	�\�h�� �դh
 * 	�p�ղզW:	�n�u�D�n�u
 *	�M�D�W��:	�߲z���R�j�v
 *	�\��W��:	�]�m�Q��
 *	�ǥ;Ǹ�:	D0611057
 *	�ǥͩm�W:	���q��
 *
 *	�̫�ק���:	2018.12.27
 */

package function;

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

public class ForumSetting {
	
	private String[] tmpStore = new String[1000];
	
	public ForumSetting() {
		
		for(int i = 0; i < tmpStore.length; i++) {
			
			tmpStore[i] = "N/A";
		}
		
		String str = null, junk = null;
		String op = null;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("�п�ܥ\��:");
		System.out.println("�s�W�N��		---1");
		System.out.println("�d�ݾ��v		---2");
		System.out.println("�����\��		---0");
		System.out.println("----------------");
		System.out.print("�п�J�\��(�п�J1��2��0): ");
		op = keyboard.nextLine();
		
		if(op.equals("1")) {
			
			String name = null;
			System.out.println("�п�J�o�����ٸ�(�Y�n�ΦW�A�Ъ�����[Enter ��]):");
			name = keyboard.nextLine();
			
			System.out.println("�п�J��r(������|)");
			str = keyboard.nextLine();
			
			str = name + " " + str;
			this.inputdata(str);
			System.out.println("----------------");
			System.out.println("��J����");
		}else if(op.equals("2")) {
			
			this.checkHistory();
			System.out.println("----------------");
			System.out.println("�d�ݧ���");
		}else if(op.equals("0")) {
			
			System.out.println("----------------");
			System.out.println("�h�X�\��");
		}else {
			
			System.out.println("��J���~�A�פ�{��!!!");
			System.exit(0);
		}
	}


	public void inputdata(String data) {
		
		Scanner textInput = null;
		
		try {
			
			textInput = new Scanner(new FileInputStream("DataBase.txt"));
		}catch(FileNotFoundException e) {
			System.out.println("�ɮ��ɦW���~�Τ��򦹵{���P�@���|!!!");
			System.exit(0);
			e.printStackTrace();
		}
		
		int count = 0;
		while(textInput.hasNextLine()) {
			
			tmpStore[count++] = textInput.nextLine();
		}
		tmpStore[count++] = data;
		textInput.close();
		
		PrintWriter textOutput = null;
		
		try {
			
			textOutput = new PrintWriter(new FileOutputStream("DataBase.txt"));
		}catch(FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		for(int i = 0; i < count; i++) {
			textOutput.println(tmpStore[i]);
		}
		textOutput.close();
	}
	
	public void checkHistory() {
		
		String tmp;
		Scanner textInput = null;
		try {
			
			textInput = new Scanner(new FileInputStream("DataBase.txt"));
		}catch(FileNotFoundException e) {
			System.out.println("�ɮ��ɦW���~�Τ��򦹵{���P�@���|!!!");
			System.exit(0);
			e.printStackTrace();
		}
		
		while(textInput.hasNextLine()) {
			
			tmp = textInput.nextLine();
			System.out.println(tmp);
		}
		textInput.close();
	}
}
