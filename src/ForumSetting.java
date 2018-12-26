/* 
 * 	課程名稱:	軟體工程導論
 * 	授課老師:	許懷中 博士
 * 	小組組名:	軟工非軟工
 *	專題名稱:	心理分析大師
 *	功能名稱:	設置討論
 *	學生學號:	D0611057
 *	學生姓名:	黃皓偉
 *
 *	最後修改日期:	2018.12.27
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
		
		System.out.println("請選擇功能:");
		System.out.println("新增意見		---1");
		System.out.println("查看歷史		---2");
		System.out.println("結束功能		---0");
		System.out.println("----------------");
		System.out.print("請輸入功能(請輸入1或2或0): ");
		op = keyboard.nextLine();
		
		if(op.equals("1")) {
			
			String name = null;
			System.out.println("請輸入發言的稱號(若要匿名，請直接按[Enter 鍵]):");
			name = keyboard.nextLine();
			
			System.out.println("請輸入文字(文明社會)");
			str = keyboard.nextLine();
			
			str = name + " " + str;
			this.inputdata(str);
			System.out.println("----------------");
			System.out.println("輸入完成");
		}else if(op.equals("2")) {
			
			this.checkHistory();
			System.out.println("----------------");
			System.out.println("查看完成");
		}else if(op.equals("0")) {
			
			System.out.println("----------------");
			System.out.println("退出功能");
		}else {
			
			System.out.println("輸入錯誤，終止程式!!!");
			System.exit(0);
		}
	}


	public void inputdata(String data) {
		
		Scanner textInput = null;
		
		try {
			
			textInput = new Scanner(new FileInputStream("DataBase.txt"));
		}catch(FileNotFoundException e) {
			System.out.println("檔案檔名錯誤或不跟此程式同一路徑!!!");
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
			System.out.println("檔案檔名錯誤或不跟此程式同一路徑!!!");
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
