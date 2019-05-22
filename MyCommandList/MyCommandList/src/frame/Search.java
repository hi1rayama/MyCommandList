/**
 * コマンド検索画面
 */
package frame;

import java.awt.Font;
/**
 * @author hirayamakai
 *
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Search extends JPanel implements ActionListener{
	private JButton left_b,right_b,edit_b,delete_b,return_b,search_b;
	private JLabel search_word,command_name,explain,result;
	private JTextField text1,text2,text3;
	public Main frame;

	public Search(Main m, String p_name) {//スタート画面の作成
		frame = m;
		this.setName(p_name);
		this.setLayout(null);
		this.setSize(800, 400);

		search_word = new JLabel("検索語（部分一致）：");
		search_word.setBounds(100, 10, 200, 20);
		search_word.setFont(new Font("ＭＳ ゴシック", Font.PLAIN, 14));

		result=new JLabel("------------------------------結果------------------------------");
		result.setBounds(150, 80, 600, 20);

		command_name = new JLabel("コ マ ン ド 名：");
		command_name.setBounds(100, 120, 100, 20);
		command_name.setFont(new Font("ＭＳ ゴシック", Font.PLAIN, 14));

		explain = new JLabel("　説　明　：");
		explain.setBounds(100, 170, 100, 20);
		explain.setFont(new Font("ＭＳ ゴシック", Font.PLAIN, 14));

		text1 = new JTextField(null);
		text1.setBounds(250, 10, 200, 20);

		text2 = new JTextField(null);
		text2.setBounds(250, 120, 200, 20);

		text3 = new JTextField(null);
		text3.setBounds(250, 170, 500, 20);

		search_b = new JButton("検索");
		search_b.setBounds(500, 10, 160, 20);

		left_b = new JButton("＜");
		left_b.setBounds(10, 300, 50, 40);


		right_b = new JButton("＞");
		right_b.setBounds(100, 300, 50, 40);

		edit_b = new JButton("このコマンドを編集");
		edit_b.setBounds(200, 300, 160, 40);

		delete_b = new JButton("このコマンドを削除");
		delete_b.setBounds(400, 300, 160, 40);

		return_b = new JButton("戻る");
		return_b.setBounds(600, 300, 160, 40);



		this.add(search_word);
		this.add(result);
		this.add(command_name);
		this.add(explain);
		this.add(text1);
		this.add(text2);
		this.add(text3);
		this.add(search_b);
		this.add(left_b);
		this.add(right_b);
		this.add(edit_b);
		this.add(return_b);
		this.add(delete_b);

		left_b.addActionListener(this);
		right_b.addActionListener(this);
		edit_b.addActionListener(this);
		return_b.addActionListener(this);
		search_b.addActionListener(this);
		delete_b.addActionListener(this);
		return_b.addActionListener(this);


	}

	public void actionPerformed(ActionEvent e) {//ボタンが押された時の処理など
		if (e.getSource() == left_b) {
			/*
			 * 閲覧（右）処理のメソッドを入れる
			 */

		}else if(e.getSource()==right_b) {
			/*
			 * 閲覧（左）処理のメソッドを入れる
			 */

		}else if( e.getSource() == edit_b) {
			frame.PanelChange((JPanel)this,frame.PanelNames[5],"編集");

		}else if(e.getSource()==search_b) {
			/*
			 * 検索処理のメソッドを入れる
			 */

		}else if( e.getSource() == delete_b) {
			/*
			 * コマンド消去処理のメソッドを入れる
			 */

		}
		else if(e.getSource()==return_b) {
			frame.PanelChange((JPanel)this,frame.PanelNames[1],frame.title);
		}


	}

}
