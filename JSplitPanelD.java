
import javax.swing.JFrame;
import javax.swing.*;


class JSplitPanelD {
	static JFrame frame;
	static JTextArea t1, t2;
	public static void main(String[] args) {
		frame = new JFrame("Split pane frame");

		t1 = new JTextArea(10, 10);
		t2 = new JTextArea(10, 10);
		t1.setText("This is first pane");
		t2.setText("This is second pane");
		JPanel p1 = new JPanel();
		JPanel p = new JPanel();
		p1.add(t1);
		p.add(t2);
		JSplitPane jp = new JSplitPane(SwingConstants.VERTICAL, p1, p);
		jp.setOrientation(SwingConstants.VERTICAL);
		frame.setSize(300, 200);
		frame.add(jp);
		frame.setVisible(true);
	}
}