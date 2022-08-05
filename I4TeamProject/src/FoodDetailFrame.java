import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

public class FoodDetailFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FoodDetailFrame frame = new FoodDetailFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FoodDetailFrame() {
		setTitle("상세 정보");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 350);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel menuImgPanel = new JPanel();
		menuImgPanel.setBackground(Color.WHITE);
		menuImgPanel.setBounds(23, 55, 169, 175);
		contentPane.add(menuImgPanel);
		
		JTextPane detailPane = new JTextPane();
		detailPane.setBackground(Color.WHITE);
		detailPane.setForeground(Color.BLACK);
		detailPane.setBounds(225, 55, 234, 175);
		contentPane.add(detailPane);
		
		JLabel priceLabel = new JLabel("New label");
		priceLabel.setFont(new Font("굴림", Font.PLAIN, 14));
		priceLabel.setBounds(334, 267, 81, 27);
		contentPane.add(priceLabel);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\hi\\Desktop\\장바구니35.png"));
		btnNewButton.setBounds(424, 259, 35, 35);
		contentPane.add(btnNewButton);
		
		JLabel nameLabel = new JLabel("New label");
		nameLabel.setFont(new Font("굴림", Font.PLAIN, 15));
		nameLabel.setBounds(12, 10, 113, 27);
		contentPane.add(nameLabel);
	}
}
