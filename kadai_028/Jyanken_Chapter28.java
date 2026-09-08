package kadai_028;

import java.util.HashMap;
import java.util.Scanner;


public class Jyanken_Chapter28 {

	
	//自分の手を取得
	public String getMyChoice() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
	
		//ユーザーの入力を取得
		String myChoice = scanner.nextLine();
		
		//入力が正しいか確認
		while (!myChoice.equals("r") 
				&& !myChoice.equals("s") 
				&& !myChoice.equals("p")) {
			
			System.out.println("r、s、pのいずれかを入力してください");
		
			myChoice = scanner.nextLine();
		}	
		
		//入力が正しい場合は、入力された手を返す
		return myChoice;
	}
	
	
	//相手の手を取得
	public String getRandom() {
		
		//r,s,pの選択肢をつくる
		String[]	choices = {"r", "s", "p"};
		
		//0,1,2のいずれかの乱数を生成
		int randomNumber = (int) Math.floor(Math.random() * 3);
		
		return choices[randomNumber];
		
		
	}
	
	//じゃんけんをする
	public void playGame() {
		
		//自分の手を取得
		String myChoice = getMyChoice();
		//相手の手を取得
		String randomChoice = getRandom();
		
		//勝敗判定
		judge(myChoice, randomChoice);
		
	}
	
	public void judge(String myChoice, String randomChoice) {
		
		//入力エラー設定
		if (!isValidChoice(myChoice) || !isValidChoice(randomChoice)) {
			System.out.println("入力エラーです");
			return;
		}
		
		
		//r,s,pの手を日本語に変換するためのマップを作成
		HashMap<String, String> choices = new HashMap<>();
		
		choices.put("r", "グー");
		choices.put("s", "チョキ");
		choices.put("p", "パー");
		
		//自分の手と相手の手を日本語に変換
		System.out.println("自分の手は" + choices.get(myChoice)
		+ "相手の手は" + choices.get(randomChoice));
		
		
		//勝敗を判定する
		if (myChoice.equals(randomChoice)) {
			System.out.println("あいこです");
		} else if ((myChoice.equals("r") && randomChoice.equals("s")) 
				|| (myChoice.equals("s") && randomChoice.equals("p")) 
				|| (myChoice.equals("p") && randomChoice.equals("r"))) {
			
			System.out.println("あなたの勝ちです");
			
		} else {
		
			System.out.println("あなたの負けです");
		}
		
	}
	
	private boolean isValidChoice(String choice) {
		return choice.equals("r") || choice.equals("s") || choice.equals("p");
	}
}


