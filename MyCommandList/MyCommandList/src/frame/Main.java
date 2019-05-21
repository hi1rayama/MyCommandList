/**
 * フレームの定義とフレームチェンジを行う
 */
package frame;

/**
 * @author hirayamakai
 *
 */
import javax.swing.JFrame;
public class Main  extends JFrame {//フレーム（ウィンドウ）を作成するためのクラス
	public String[] PanelNames = { "start", "home", "register" ,"namechange","search","edit"};//パネル名の配列
	Start start = new Start(this, PanelNames[0]);
	Home home = new Home(this, PanelNames[1]);
	Register register = new Register(this, PanelNames[2]);
	NameChange namechange = new NameChange(this, PanelNames[3]);
	Search search = new Search(this, PanelNames[4]);
	Edit edit = new Edit(this, PanelNames[5]);

	public Main() {//全てのウィンドウを追加し、非表示にする

		this.add(start);
		start.setVisible(false);
		this.add(home);
		home.setVisible(false);
		this.add(register);
		register.setVisible(false);
		this.add(namechange);
		namechange.setVisible(false);
		this.add(search);
		search.setVisible(false);
		this.add(edit);
		edit.setVisible(false);
	}




	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//スタート画面を表示したいのでスタート画面のパネルを表示する


		Main mf = new Main();
		mf.setTitle("Start");
		mf.setBounds(10, 10, 600, 300);
		mf.setDefaultCloseOperation(EXIT_ON_CLOSE);
		mf.start.setVisible(true);
		mf.setVisible(true);

	}

}
