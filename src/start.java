/* 
 * 	課程名稱:	軟體工程導論
 * 	授課老師:	許懷中 博士
 * 	小組組名:	軟工非軟工
 *	專題名稱:	心理分析大師
 *	功能名稱:	需求分析
 *	學生學號:	D0611057
 *	學生姓名:	黃皓偉
 *
 *	最後修改日期:	2018.12.28
 */
import function.AnalyzeData;
import function.ForumSetting;
import function.InputNeed;
import function.print_SumClass;
import function.ConnectWeb;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class start {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		String op = null, password = null;
		
		System.out.println("[心理分析大師]") ;
		System.out.println("  ┏┓　　　┏┓") ;
		System.out.println("┏┛┻━━━┛┻┓") ;
		System.out.println("┃　　　　　　　┃ 　") ;
		System.out.println("┃　　　━　　　┃");
		System.out.println("┃　┳┛　┗┳　┃") ;
		System.out.println("┃　　　　　　　┃") ;
		System.out.println("┃　　　┻　　　┃") ;
		System.out.println("┃　　　　　　　┃");
		System.out.println("┗━┓　　　┏━┛") ;
		System.out.println("　　┃　　　┃放鬆情緒") ;
		System.out.println("　　┃　　　┃才能了解自己！") ;
		System.out.println("　　┃　　　┗━━━┓");
		System.out.println("　　┃　　　┗━━━┓") ;
		System.out.println("　　┃　　　　　　　┣┓") ;
		System.out.println("　　┃　　　　　　　┣┓") ;
		System.out.println("　　┃　　　　　　　┏┛");
		System.out.println("　　┗┓┓┏━┳┓┏┛") ;
		System.out.println("　　　┃┫┫　┃┫┫") ;
		System.out.println("　　　┗┻┛　┗┻┛ ") ;
		System.out.println("-----------------------------------------") ;
		System.out.println("從分析自我中，得到未來的方向!--------------------1") ;
		System.out.println("與人盡情暢談，抒發自己的心情~--------------------2") ;
		System.out.println("看看過去的我，何造就現在的我?--------------------3") ;
		System.out.print("請輸入您想使用的功能^^: ");
		op = keyboard.nextLine();
		
		System.out.print("");
		if(op.equals("1")) {
			
			String[] data = new String[4];
			double[] outcome = new double[9];
			String name = null;
			
			System.out.println("") ;
			System.out.println("請輸入名稱: (按[Enter]可匿名，但不能查看歷史測驗紀錄)") ;
			name = keyboard.nextLine();
			
			InputNeed basicData = new InputNeed();
			data = basicData.transfer();
			
			AnalyzeData moreData_analyzing = new AnalyzeData();
			moreData_analyzing.readQuestionFirst();
			outcome = moreData_analyzing.calculatingScore(data);
			
			print_SumClass output = new print_SumClass();
			output.print(outcome);
			
			ConnectWeb hyperlink = new ConnectWeb();
			hyperlink.sendWeb(output.compare());
			
			String[] dataStore = new String[1000];
			if(!name.equals("\n")) {
				
				Scanner textInput = null;
				String temp = null;
				
				try {
					
					textInput = new Scanner(new FileInputStream("personalList.txt"), "Big-5");
					
					int count = 0;
					while(textInput.hasNextLine()) {
						
						temp = textInput.nextLine();		
						if(temp.equals(name)) {
							
							break;
						}else {
							
							dataStore[count++] = temp; 
						}
					}
					
					dataStore[count++] = name;
					dataStore[count++] = moreData_analyzing.putData(outcome);
				//	textInput.close();
					
					
					PrintWriter textOutput = null;
					try {
						
						textOutput = new PrintWriter(new FileOutputStream("personalList.txt"));
						for(int i = 0; i < count; i++) {
							
							textOutput.println(dataStore[i]);
						}
						textOutput.close();
					}catch(FileNotFoundException e) {
						
						System.out.println("檔案檔名錯誤或不跟此程式同一路徑!!!");
						System.exit(0);
					//	e.printStackTrace();
					}
				}catch(FileNotFoundException e) {
					
					System.out.println("檔案檔名錯誤或不跟此程式同一路徑!!!");
					System.exit(0);
				//	e.printStackTrace();
				}
			}
		}else if(op.equals("2")) {
			
			ForumSetting text = new ForumSetting();
		}else if(op.equals("3")){
			
			String searchName = null;
			double[] thisOutcome = new double[9];
			
			System.out.print("請輸入名稱(注意!!!必須確認有輸入過): ");
			searchName = keyboard.nextLine();
			
			String tmpData = null;
			Scanner textInput = new Scanner(System.in);
			boolean flag = false;
			try {
				
				textInput = new Scanner(new FileInputStream("personalList.txt"), "UTF-8");
				
				while(textInput.hasNextLine()) {
					
					tmpData = textInput.nextLine();
					
					if(tmpData.equals(searchName)) {
						
						for(int i = 0; i < thisOutcome.length; i++) {
							
							thisOutcome[i] = textInput.nextDouble();
						}
						flag = true;
						break;
					}
				}
				if(!flag) {
					
					System.out.print("騙我，明明就沒有這個資料QQ");
				}else {
					
					print_SumClass lookData = new print_SumClass();
					lookData.print(thisOutcome);
					
					ConnectWeb lookLink = new ConnectWeb();
					lookLink.sendWeb(lookData.compare());
				}

			}catch(FileNotFoundException e) {
				
				System.out.println("檔案檔名錯誤或不跟此程式同一路徑!!!");
				System.exit(0);
			//	e.printStackTrace();
			}
		}else if(op.equals("99")){
			
			System.out.print("請輸入製作此程式之組名: ") ;
			password = keyboard.nextLine();
			
			if(password.equals("軟工非軟工")) {
				
				System.out.print("被你發現了XDD，個人測試功能開啟") ;
				System.out.println("") ;
				System.out.println("***********小劇場***********") ;
				System.out.println("今天要專題Demo？") ;
				System.out.println(" 　　 　  ∩∩") ;
				System.out.println("　　（´･ω･）") ;
				System.out.println(" 　 ＿|　⊃／(＿＿_") ;
				System.out.println(" 　／ └-(＿＿＿／") ;
				System.out.println(" 沒關係，我不是第一組要Demo的") ;
				System.out.println("　　 ⊂⌒／ヽ-、＿") ;
				System.out.println("　／⊂_/＿＿＿＿ ／") ;
				System.out.println("　￣￣￣￣￣￣￣") ;
				System.out.println("但如果他們Demo很快呢?") ;
				System.out.println(" 　　　   ∩∩") ;
				System.out.println("　　（´･ω･）") ;
				System.out.println("　 ＿|　⊃／(＿＿_") ;
				System.out.println("   ／ └-(＿＿＿／") ;
				System.out.println(" 　￣￣￣￣￣￣￣") ;
				System.out.println("我猜不會啦~~") ;
				System.out.println("　　 ⊂⌒／ヽ-、＿") ;
				System.out.println("　／⊂_/＿＿＿＿ ／") ;
				System.out.println("　￣￣￣￣￣￣￣") ;
				
				System.out.println("***********小劇場***********");
				
				boolean flag1 = false, flag2 = false, flag3 = false, flag4 = false, flag5 = false;
				while(true) {
						
					System.out.println("----------個人功能Demo----------");
					System.out.println("輸入需求(D0642089負責)-----1");
					System.out.println("分析資料(D0611057負責)-----2");
					System.out.println("輸出要求(D0650028負責)-----3");
					System.out.println("參考資料( D0642089          ");
					System.out.println("          D0611057負責)---4");
					System.out.println("設置討論(D0611057負責)-----5");
					System.out.println("結束Dmod----------------0");
					if(flag1 && flag2 && flag3 && flag4 && flag5) {
						
						System.out.println("神秘功能------------------(20181227)");
					}
					
					System.out.print("請輸入功能: ");
					op = keyboard.nextLine();
					System.out.println("") ;
					
					if(op.equals("1")) {
						
						InputNeed test_1 = new InputNeed();
						flag1 = true;
					}else if(op.equals("2")) {
						
						AnalyzeData test_2 = new AnalyzeData();
						String[] test_2_basicData = new String[4];
						double[] text_2_outcome = new double[9];
						
						System.out.println("前置條件:");
						test_2_basicData[0] = "男";
						test_2_basicData[1] = "天秤座";
						test_2_basicData[2] = "異性戀";
						test_2_basicData[3] = "A";
						System.out.println("性別: " + test_2_basicData[0] + 
										 "\n星座: " + test_2_basicData[1] + 
										 "\n性向: " + test_2_basicData[2] + 
										 "\n血型: " + test_2_basicData[3]);
						System.out.println("");
						
						test_2.readQuestionFirst();
						text_2_outcome = test_2.calculatingScore(test_2_basicData);
						
						System.out.println("分析結果:");
						for(int i = 1; i < text_2_outcome.length; i++) {
							
							System.out.println("第" + i + "型: " + text_2_outcome[i]);
						}
						System.out.println("第9型: " + text_2_outcome[0]);
						flag2 = true;
					}else if(op.equals("3")) {
						
						print_SumClass test_3 = new print_SumClass();
						double[] text_3_predata = new double[9];
						
						for(int i = 0; i < text_3_predata.length; i++) {
							text_3_predata[i] = 60;
						}
						
						test_3.print(text_3_predata);
						flag3 = true;
					}else if(op.equals("4")) {
						
						ConnectWeb test_4 = new ConnectWeb();
						
						System.out.print("請輸入數字(1~7): ");
						op = keyboard.nextLine();
						
						System.out.println("------------------------------------------------------------------------------------------");
						if(op.equals("1")) {
							
							test_4.sendWeb(1);
						}else if(op.equals("2")) {
							
							test_4.sendWeb(2);
						}else if(op.equals("3")) {
							
							test_4.sendWeb(3);
						}else if(op.equals("4")) {
							
							test_4.sendWeb(4);
						}else if(op.equals("5")) {
							
							test_4.sendWeb(5);
						}else if(op.equals("6")) {
							
							test_4.sendWeb(6);
						}else if(op.equals("7")) {
							
							test_4.sendWeb(7);
						}else {
							
							System.out.println("輸入錯誤，終止程式!!!") ;
							System.exit(0);
						}
						flag4 = true;
					}else if(op.equals("5")) {
						
						ForumSetting text_5 = new ForumSetting();
						flag5 = true;
					}else if(op.equals("0")){
						
						System.out.println("完成Demo，結束程式") ;
						System.exit(0);
					}else if(op.equals("20181227")) {
						
						String ans = null;
						System.out.println("請舉一個[軟工導論]提到[敏捷開發]之應用(全英文小寫): ");
						ans = keyboard.nextLine();
						
						if(ans.equals("scrum") || ans.equals("extreme programming") || ans.equals("extremeprogramming") || ans.equals("kanba")) {
							
							System.out.println("") ;
							System.out.println("恭喜XDDD") ;
							System.out.println("軟工不軟工之GitHub網站: https://github.com/karasu10250/BaseProject-Cpp");
						}else {
							
							System.out.println("你沒有認真聽講喔，只能關閉程式了!!!");
						}
					}else {	
						
						System.out.println("輸入錯誤，請再次輸入!!!") ;
					}		
				}	
			}else{	
				System.out.println("真可惜，輸入錯誤，終止程式>_") ;
				System.exit(0);
			}
		}else if(op.equals("hjhsu")) {
			
			System.out.print("請輸入該老師的職位: ") ;
			password = keyboard.nextLine();
			
			if(password.equals("教授")) {
				
				System.out.println("                      _o軟o工o_");
				System.out.println("                      o8888888o");
				System.out.println("                      88\" . \"88");
				System.out.println("                      (| -_- |)");
				System.out.println("                      0\\  =  /0");
				System.out.println("                    ___/`---'\\___");
				System.out.println("                  .' \\\\|     |# '.");
				System.out.println("                 / \\\\|||  :  |||# \\");
				System.out.println("                / _||||| -:- |||||- \\");
				System.out.println("               |   | \\\\\\  -  #/ |   |");
				System.out.println("               | \\_|  ''\\---/''  |_/ |");
				System.out.println("               \\  .-\\__  '-'  ___/-. /");
				System.out.println("             ___'. .'  /--.--\\  `. .'___");
				System.out.println("          .\"\" '<  `.___\\_<|>_/___.' >' \"\".");
				System.out.println("         | | :  `- \\`.;`\\ _ /`;.`/ - ` : | |");
				System.out.println("         \\  \\ `_.   \\_ __\\ /__ _/   .-` /  /");
				System.out.println("     =====`-.____`.___ \\_____/___.-`___.-'=====");
				System.out.println("                       `=---='");
				System.out.println("     ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("         佛祖保佑                                  學期High pass!!!");
				
				System.out.println("------------------------");
				System.out.println("分工名單") ;
				System.out.println("------------------------");
				System.out.println("D0642089_黃丞文三:");
				System.out.println("1. 撰寫分組與修改分組作業");
				System.out.println("2. 參與討論專題內容");
				System.out.println("3. 負責輸入需求參考資料等2項功能");
				System.out.println("4. 整合專題程式之檢查 + 提供意見");
				System.out.println("5. 提供Coding 標準意見");
				
				System.out.println("------------------------");
				System.out.println("D0611057_黃皓偉:");
				System.out.println("1. 撰寫分組與修改分組作業");
				System.out.println("2. 參與討論專題內容");
				System.out.println("3. 負責設置討論、分析需求與參考資料等3項功能");
				System.out.println("4. 負責統合專題程式(main class撰寫 + 修改別人的程式XDD)");
				System.out.println("5. 製作Coding 標準 + 提供意見");
				
				System.out.println("------------------------");
				System.out.println("D0650028_曾偉翔:");
				System.out.println("1. 參與討論專題內容");
				System.out.println("2. 負責輸出需求等1項功能");
				
				System.out.println("------------------------");
				System.out.println("D0649710_吳弓百弓庭:");
				System.out.println("1. 參與討論專題內容");
				
			}else {
				
				System.out.println("哈哈哈!!!輸入錯誤") ;
				System.exit(0);
			}
		}else if(op.equals("-1")){
			
			System.out.println("圖案改造自: https://gist.github.com/edokeh/7580064") ;
		}else {
			
			System.out.println("輸入錯誤，終止程式!!!") ;
			System.exit(0);
		}
	//	keyboard.close();
	}

}
