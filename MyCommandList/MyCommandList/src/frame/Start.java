/**
 * Start画面の作成
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
public class Start extends JPanel implements ActionListener{
   private JButton b1,b2,b3,exit,reset;
	private JLabel start_title;
    public Main frame;
    String str;

	public Start(Main m, String p_name) {//スタート画面の作成
		frame = m;
		str = p_name;
		this.setName(p_name);
		this.setLayout(null);
		this.setSize(800, 400);


		 start_title = new JLabel("My Command List");
		start_title.setBounds(250, 20, 400, 100);
		start_title.setFont(new Font("ＭＳ ゴシック", Font.BOLD, 32));


        b1 = new JButton("1");
        b1.setBounds(40, 150, 200, 60);

        b2 = new JButton("2");
        b2.setBounds(300, 150, 200, 60);

        b3 = new JButton("3");
        b3.setBounds(560, 150, 200, 60);

        exit = new JButton("終了");
        exit.setBounds(400, 300, 200, 60);

        reset= new JButton("初期化");
        reset.setBounds(140, 300, 200, 60);

        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(exit);
        this.add(reset);
        this.add(start_title);

    	b1.addActionListener(this);
    	b2.addActionListener(this);
    	b3.addActionListener(this);
    	exit.addActionListener(this);
    	reset.addActionListener(this);


	}

	public void actionPerformed(ActionEvent e) {//ボタンが押された時の処理など

		if (e.getSource() == b1) {
    		//検索画面に移動する
            frame.PanelChange((JPanel)this,frame.PanelNames[1],b1.getText());
    	}else if(e.getSource()==b2) {
    		 frame.PanelChange((JPanel)this,frame.PanelNames[1],b2.getText());

    	}else if( e.getSource() == b3) {
    		 frame.PanelChange((JPanel)this,frame.PanelNames[1],b3.getText());

    	}
    	else if(e.getSource()==exit) {
    		//このボタンが押されたらこのアプリケーションを終了する
            System.exit(0);
    	}

	}

}
