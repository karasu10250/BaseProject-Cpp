/* 
 * 	課程名稱:	軟體工程導論
 * 	授課老師:	許懷中 博士
 * 	小組組名:	軟工非軟工
 *	專題名稱:	心理分析大師
 *	功能名稱:	需求分析
 *	學生學號:	D0611057
 *	學生姓名:	黃皓偉
 *
 *	最後修改日期:	2018.12.27
 */
import function.AnalyzeData;
import function.ForumSetting;
import function.InputNeed;
import function.print_SumClass;
import function.ConnectWeb;

import java.util.Scanner;

public class main {

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
		System.out.println("-------------------------") ;
		System.out.println("從分析自我中，得到未來的方向!--------------------1") ;
		System.out.println("與人盡情暢談，抒發自己的心情~--------------------2") ;
		System.out.print("請輸入您想使用的功能^^: ");
		op = keyboard.nextLine();
		
		System.out.print("");
		if(op.equals("1")) {
			
			String [] data = new String[4];
			double[] outcome = new double[9];
			
			InputNeed basicData = new InputNeed();
			AnalyzeData moreData_analyzing = new AnalyzeData();
			print_SumClass output = new print_SumClass();
			ConnectWeb hyperlink = new ConnectWeb();

			data = basicData.transfer();
			moreData_analyzing.readQuestionFirst(data);
			outcome = moreData_analyzing.calculatingScore(data);
			output.print(outcome);
			hyperlink.sendWeb(output.compare());
		}else if(op.equals("2")) {
			
			ForumSetting text = new ForumSetting();
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
				System.out.println("----------個人功能----------");
				System.out.println("輸入需求(D0642089負責)-----1");
				System.out.println("分析資料(D0611057負責)-----2");
				System.out.println("輸出要求(D0650028負責)-----3");
				System.out.println("參考資料( D0642089          ");
				System.out.println("          D0611057負責)---4");
				System.out.println("設置討論(D0611057負責)-----5");
				System.out.print("請輸入功能: ");
				op = keyboard.nextLine();
				System.out.println("") ;
				switch(op) {
				
					case "1":
						
						InputNeed test_1 = new InputNeed();
						break;
					case "2":
						
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
						
						test_2.readQuestionFirst(test_2_basicData);
						text_2_outcome = test_2.calculatingScore(test_2_basicData);
						
						System.out.println("分析結果:");
						for(int i = 1; i < text_2_outcome.length; i++) {
							
							System.out.println("第" + i + "型: " + text_2_outcome[i]);
						}
						System.out.println("第9型: " + text_2_outcome[0]);
						break;
					case "3":
						
						print_SumClass test_3 = new print_SumClass();
						double[] text_3_predata = new double[9];
						
						for(int i = 0; i < text_3_predata.length; i++) {
							text_3_predata[i] = 60;
						}
						
						test_3.print(text_3_predata);
						break;
					case "4":
						
						ConnectWeb test_5 = new ConnectWeb();
						
						System.out.print("請輸入數字(0~7): ");
						op = keyboard.nextLine();
						
						System.out.println("------------------------------------------------------------------------------------------");
						if(op.equals("1")) {
							
							test_5.sendWeb(1);
						}else if(op.equals("2")) {
							
							test_5.sendWeb(2);
						}else if(op.equals("3")) {
							
							test_5.sendWeb(3);
						}else if(op.equals("4")) {
							
							test_5.sendWeb(4);
						}else if(op.equals("5")) {
							
							test_5.sendWeb(5);
						}else if(op.equals("6")) {
							
							test_5.sendWeb(6);
						}else if(op.equals("7")) {
							
							test_5.sendWeb(7);
						}else {
							
							System.out.println("輸入錯誤，終止程式!!!") ;
							System.exit(0);
						}
						break;
					case "5":
						
						ForumSetting text = new ForumSetting();
						break;
					default:
						
						System.out.println("輸入錯誤，終止程式!!!") ;
						System.exit(0);
				}
				
			}else {
				
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
				System.out.println("D0642089_黃丞彣:");
				System.out.println("1. 撰寫分組與修改分組作業");
				System.out.println("2. 參與討論專題內容");
				System.out.println("3. 負責輸入需求參考資料等2項功能");
				System.out.println("4. 整合專題程式之檢查 + 提供意見");
				
				System.out.println("------------------------");
				System.out.println("D0611057_黃皓偉:");
				System.out.println("1. 撰寫分組與修改分組作業");
				System.out.println("2. 參與討論專題內容");
				System.out.println("3. 負責設置討論、分析需求與參考資料等3項功能");
				System.out.println("4. 負責統合專題程式(main class撰寫 + 修改別人的程式XDD)");
				
				System.out.println("------------------------");
				System.out.println("D0650028_曾偉翔:");
				System.out.println("1. 參與討論專題內容");
				System.out.println("2. 負責輸出需求等1項功能");
				
				System.out.println("------------------------");
				System.out.println("D0649710_吳弼庭:");
				System.out.println("1. 參與討論專題內容");
				
			}else {
				
				System.out.println("哈哈哈!!!輸入錯誤") ;
				System.exit(0);
			}
		}else {
			
			System.out.println("輸入錯誤，終止程式!!!") ;
			System.exit(0);
		}
		
	}

}
