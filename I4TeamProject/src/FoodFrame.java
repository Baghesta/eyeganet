import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.Panel;
import javax.swing.Box;
import javax.swing.Icon;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JTextPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;
import javax.swing.border.LineBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class FoodFrame extends JFrame {
	private JPanel contentPane;
	private JTextField txtFieldOrderMessage;
	private JTable orderTable;
	/*
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FoodFrame frame = new FoodFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/*
	 * Create the frame.
	 */
	public FoodFrame() {
		setBackground(Color.WHITE);
		setTitle("먹거리 주문");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 650);
		
		JMenuBar menuBar = new JMenuBar();
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(30, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLayeredPane bestMenuPan = new JLayeredPane();
		bestMenuPan.setBounds(0, 22, 784, 127);
		bestMenuPan.setBorder(null);
		contentPane.add(bestMenuPan);
		bestMenuPan.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(75, 0, 100, 100);
		bestMenuPan.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(250, 0, 100, 100);
		bestMenuPan.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setBounds(434, 0, 100, 100);
		bestMenuPan.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setBackground(Color.WHITE);
		btnNewButton_3.setBounds(609, 0, 100, 100);
		bestMenuPan.add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("메뉴1");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 14));
		lblNewLabel.setBounds(75, 103, 74, 18);
		bestMenuPan.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("메뉴2");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(250, 103, 74, 18);
		bestMenuPan.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("메뉴4");
		lblNewLabel_3.setFont(new Font("굴림", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(609, 103, 74, 18);
		bestMenuPan.add(lblNewLabel_3);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\hi\\Desktop\\장바구니27.png"));
		btnNewButton_4.setBounds(153, 102, 22, 22);
		bestMenuPan.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setIcon(new ImageIcon("C:\\Users\\hi\\Desktop\\장바구니27.png"));
		btnNewButton_5.setBounds(328, 102, 22, 22);
		bestMenuPan.add(btnNewButton_5);
		
		JLabel lblNewLabel_2 = new JLabel("메뉴3");
		lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(434, 103, 74, 18);
		bestMenuPan.add(lblNewLabel_2);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.setBounds(511, 102, 22, 23);
		bestMenuPan.add(btnNewButton_6);
		btnNewButton_6.setIcon(new ImageIcon("C:\\Users\\hi\\Desktop\\장바구니27.png"));
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.setBounds(687, 102, 22, 22);
		bestMenuPan.add(btnNewButton_7);
		btnNewButton_7.setIcon(new ImageIcon("C:\\Users\\hi\\Desktop\\장바구니27.png"));
		
		JLabel lblNewLabel_4 = new JLabel("인기 상품");
		lblNewLabel_4.setBounds(6, 0, 67, 25);
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setBackground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("굴림", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_4);
		
		JPanel orderListPane = new JPanel();
		orderListPane.setBounds(577, 182, 198, 319);
		orderListPane.setBorder(null);
		orderListPane.setBackground(Color.WHITE);
		contentPane.add(orderListPane);
		orderListPane.setLayout(null);
		
		JPanel totalPane = new JPanel();
		totalPane.setBorder(new LineBorder(SystemColor.inactiveCaption, 2));
		totalPane.setBackground(Color.WHITE);
		totalPane.setBounds(12, 270, 177, 39);
		orderListPane.add(totalPane);
		totalPane.setLayout(null);
		
		JLabel lblNewLabel_30 = new JLabel("총 금액 :");
		lblNewLabel_30.setBounds(6, 3, 69, 33);
		totalPane.add(lblNewLabel_30);
		lblNewLabel_30.setFont(new Font("굴림", Font.PLAIN, 17));
		
		JLabel lblNewLabel_31 = new JLabel("New label");
		lblNewLabel_31.setFont(new Font("굴림", Font.PLAIN, 17));
		lblNewLabel_31.setBounds(76, 3, 95, 33);
		totalPane.add(lblNewLabel_31);
		
		JScrollPane orderListlPane = new JScrollPane();
		orderListlPane.setBounds(0, 0, 198, 263);
		orderListlPane.getViewport().setBackground(Color.WHITE);
		orderListPane.add(orderListlPane);
		
		orderTable = new JTable();
		orderTable.setBorder(new LineBorder(SystemColor.inactiveCaption, 2));
		orderTable.setBackground(Color.WHITE);
		orderTable.setRowHeight(23);
		orderTable.setShowVerticalLines(false);
		orderTable.setShowHorizontalLines(false);
		orderTable.setModel(new DefaultTableModel(
			new Object[][] {
				{"\uAE30\uBCF8 \uD56B\uB3C4\uADF8", "2,300\uC6D0", null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"\uC0C1\uD488 \uC774\uB984", "\uAC00\uACA9", "\uC218\uB7C9", "\uC0AD\uC81C"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				true, true, true, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		orderTable.getColumnModel().getColumn(0).setPreferredWidth(114);
		orderTable.getColumnModel().getColumn(1).setPreferredWidth(74);
		orderTable.getColumnModel().getColumn(2).setPreferredWidth(37);
		orderTable.getColumnModel().getColumn(3).setPreferredWidth(36);
		orderListlPane.setViewportView(orderTable);
		
		JPanel orderPay = new JPanel();
		orderPay.setBounds(577, 511, 195, 90);
		orderPay.setBorder(null);
		orderPay.setBackground(Color.WHITE);
		contentPane.add(orderPay);
		orderPay.setLayout(null);
		
		JComboBox cbBoxCash = new JComboBox();
		cbBoxCash.setBackground(Color.WHITE);
		cbBoxCash.setModel(new DefaultComboBoxModel(new String[] {"현금", "50,000원", "10,000원", "5,000원", "1,000원", "금액에 맞게"}));
		cbBoxCash.setToolTipText("");
		cbBoxCash.setBounds(18, 14, 68, 21);
		orderPay.add(cbBoxCash);
		
		JRadioButton rdbtnCash = new JRadioButton("");
		rdbtnCash.setBackground(Color.WHITE);
		rdbtnCash.setFont(new Font("굴림", Font.PLAIN, 11));
		rdbtnCash.setBounds(-1, 14, 18, 20);
		orderPay.add(rdbtnCash);
		JRadioButton rdbtnCard = new JRadioButton("카드");
		rdbtnCard.setBackground(Color.WHITE);
		rdbtnCard.setFont(new Font("굴림", Font.PLAIN, 11));
		rdbtnCard.setBounds(86, 14, 47, 23);
		orderPay.add(rdbtnCard);
		JRadioButton rdbtnAccTrans = new JRadioButton("계좌이체");
		rdbtnAccTrans.setBackground(Color.WHITE);
		rdbtnAccTrans.setBounds(129, 14, 69, 23);
		orderPay.add(rdbtnAccTrans);
		rdbtnAccTrans.setFont(new Font("굴림", Font.PLAIN, 11));
		
		txtFieldOrderMessage = new JTextField();
		txtFieldOrderMessage.setBackground(Color.WHITE);
		txtFieldOrderMessage.setForeground(Color.LIGHT_GRAY);
		txtFieldOrderMessage.setFont(new Font("굴림", Font.PLAIN, 11));
		txtFieldOrderMessage.setText("주문시 요청사항 입력");
		txtFieldOrderMessage.setBounds(8, 50, 115, 24);
		orderPay.add(txtFieldOrderMessage);
		txtFieldOrderMessage.setColumns(10);
		
		JButton btnOrder = new JButton("주문");
		btnOrder.setFont(new Font("Gulim", Font.PLAIN, 12));
		btnOrder.setBounds(128, 50, 59, 24);
		orderPay.add(btnOrder);
		
		JTabbedPane menuTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		menuTabbedPane.setBounds(10, 159, 555, 442);
		menuTabbedPane.setBackground(Color.WHITE);
		contentPane.add(menuTabbedPane);
		
		JPanel allMenu = new JPanel();
		allMenu.setLayout(null);
		allMenu.setBorder(null);
		allMenu.setBackground(Color.WHITE);
		menuTabbedPane.addTab("전체 보기", null, allMenu, null);
		
		JButton btnNewButton_14_1 = new JButton("");
		btnNewButton_14_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton btnNewButton_14_1 = (JButton) e.getSource();
				if(btnNewButton_14_1.getText().equals("Click"))
					System.out.print("babo");
				
			}
		});
		btnNewButton_14_1.setBounds(20, 20, 90, 90);
		allMenu.add(btnNewButton_14_1);
		
		JButton btnNewButton_15_1 = new JButton("");
		btnNewButton_15_1.setBackground(Color.WHITE);
		btnNewButton_15_1.setBounds(160, 20, 90, 90);
		allMenu.add(btnNewButton_15_1);
		
		JButton btnNewButton_16_1 = new JButton("");
		btnNewButton_16_1.setBackground(Color.WHITE);
		btnNewButton_16_1.setBounds(295, 20, 90, 90);
		allMenu.add(btnNewButton_16_1);
		
		JButton btnNewButton_17_1 = new JButton("");
		btnNewButton_17_1.setBackground(Color.WHITE);
		btnNewButton_17_1.setBounds(434, 20, 90, 90);
		allMenu.add(btnNewButton_17_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("New label");
		lblNewLabel_5_1.setForeground(Color.BLACK);
		lblNewLabel_5_1.setFont(new Font("굴림", Font.PLAIN, 13));
		lblNewLabel_5_1.setBounds(20, 112, 66, 18);
		allMenu.add(lblNewLabel_5_1);
		
		JButton btnNewButton_18_1 = new JButton("");
		btnNewButton_18_1.setIcon(new ImageIcon("C:\\Users\\hi\\Desktop\\장바구니27.png"));
		btnNewButton_18_1.setBackground(Color.WHITE);
		btnNewButton_18_1.setBounds(88, 117, 22, 22);
		allMenu.add(btnNewButton_18_1);
		
		JLabel lblNewLabel_6_1 = new JLabel("New label");
		lblNewLabel_6_1.setFont(new Font("굴림", Font.PLAIN, 13));
		lblNewLabel_6_1.setBounds(159, 112, 66, 18);
		allMenu.add(lblNewLabel_6_1);
		
		JButton btnNewButton_19_1 = new JButton("");
		btnNewButton_19_1.setIcon(new ImageIcon("C:\\Users\\hi\\Desktop\\장바구니27.png"));
		btnNewButton_19_1.setBackground(Color.WHITE);
		btnNewButton_19_1.setBounds(228, 117, 22, 22);
		allMenu.add(btnNewButton_19_1);
		
		JLabel lblNewLabel_7_1 = new JLabel("New label");
		lblNewLabel_7_1.setFont(new Font("굴림", Font.PLAIN, 13));
		lblNewLabel_7_1.setBounds(295, 112, 66, 18);
		allMenu.add(lblNewLabel_7_1);
		
		JButton btnNewButton_20_1 = new JButton("");
		btnNewButton_20_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_20_1.setIcon(new ImageIcon("C:\\Users\\hi\\Desktop\\장바구니27.png"));
		btnNewButton_20_1.setBackground(Color.WHITE);
		btnNewButton_20_1.setBounds(363, 117, 22, 22);
		allMenu.add(btnNewButton_20_1);
		
		JLabel lblNewLabel_8_1 = new JLabel("New label");
		lblNewLabel_8_1.setFont(new Font("굴림", Font.PLAIN, 13));
		lblNewLabel_8_1.setBounds(434, 112, 66, 18);
		allMenu.add(lblNewLabel_8_1);
		
		JButton btnNewButton_21_1 = new JButton("");
		btnNewButton_21_1.setIcon(new ImageIcon("C:\\Users\\hi\\Desktop\\장바구니27.png"));
		btnNewButton_21_1.setBackground(Color.WHITE);
		btnNewButton_21_1.setBounds(502, 117, 22, 22);
		allMenu.add(btnNewButton_21_1);
		
		JButton btnNewButton_22_1 = new JButton("");
		btnNewButton_22_1.setBackground(Color.WHITE);
		btnNewButton_22_1.setBounds(20, 150, 90, 90);
		allMenu.add(btnNewButton_22_1);
		
		JButton btnNewButton_23_1 = new JButton("");
		btnNewButton_23_1.setBackground(Color.WHITE);
		btnNewButton_23_1.setBounds(20, 280, 90, 90);
		allMenu.add(btnNewButton_23_1);
		
		JLabel lblNewLabel_9_1 = new JLabel("New label");
		lblNewLabel_9_1.setFont(new Font("굴림", Font.PLAIN, 13));
		lblNewLabel_9_1.setBounds(20, 242, 66, 18);
		allMenu.add(lblNewLabel_9_1);
		
		JButton btnNewButton_24_1 = new JButton("");
		btnNewButton_24_1.setIcon(new ImageIcon("C:\\Users\\hi\\Desktop\\장바구니27.png"));
		btnNewButton_24_1.setBackground(Color.WHITE);
		btnNewButton_24_1.setBounds(88, 248, 22, 22);
		allMenu.add(btnNewButton_24_1);
		
		JButton btnNewButton_25_1 = new JButton("");
		btnNewButton_25_1.setBackground(Color.WHITE);
		btnNewButton_25_1.setBounds(160, 150, 90, 90);
		allMenu.add(btnNewButton_25_1);
		
		JLabel lblNewLabel_10_1 = new JLabel("New label");
		lblNewLabel_10_1.setFont(new Font("굴림", Font.PLAIN, 13));
		lblNewLabel_10_1.setBounds(160, 242, 66, 18);
		allMenu.add(lblNewLabel_10_1);
		
		JButton btnNewButton_26_1 = new JButton("");
		btnNewButton_26_1.setIcon(new ImageIcon("C:\\Users\\hi\\Desktop\\장바구니27.png"));
		btnNewButton_26_1.setBackground(Color.WHITE);
		btnNewButton_26_1.setBounds(228, 248, 22, 22);
		allMenu.add(btnNewButton_26_1);
		
		JLabel lblNewLabel_11_1 = new JLabel("New label");
		lblNewLabel_11_1.setFont(new Font("굴림", Font.PLAIN, 13));
		lblNewLabel_11_1.setBounds(20, 372, 66, 18);
		allMenu.add(lblNewLabel_11_1);
		
		JButton btnNewButton_27_1 = new JButton("");
		btnNewButton_27_1.setIcon(new ImageIcon("C:\\Users\\hi\\Desktop\\장바구니27.png"));
		btnNewButton_27_1.setBackground(Color.WHITE);
		btnNewButton_27_1.setBounds(88, 380, 22, 22);
		allMenu.add(btnNewButton_27_1);
		
		JButton btnNewButton_28_1 = new JButton("");
		btnNewButton_28_1.setBackground(Color.WHITE);
		btnNewButton_28_1.setBounds(295, 150, 90, 90);
		allMenu.add(btnNewButton_28_1);
		
		JLabel lblNewLabel_12_1 = new JLabel("New label");
		lblNewLabel_12_1.setFont(new Font("굴림", Font.PLAIN, 13));
		lblNewLabel_12_1.setBounds(295, 242, 66, 18);
		allMenu.add(lblNewLabel_12_1);
		
		JButton btnNewButton_29_1 = new JButton("");
		btnNewButton_29_1.setIcon(new ImageIcon("C:\\Users\\hi\\Desktop\\장바구니27.png"));
		btnNewButton_29_1.setBackground(Color.WHITE);
		btnNewButton_29_1.setBounds(363, 248, 22, 22);
		allMenu.add(btnNewButton_29_1);
		
		JButton btnNewButton_30_1 = new JButton("");
		btnNewButton_30_1.setBackground(Color.WHITE);
		btnNewButton_30_1.setBounds(434, 150, 90, 90);
		allMenu.add(btnNewButton_30_1);
		
		JLabel lblNewLabel_13_1 = new JLabel("New label");
		lblNewLabel_13_1.setFont(new Font("굴림", Font.PLAIN, 13));
		lblNewLabel_13_1.setBounds(434, 242, 66, 18);
		allMenu.add(lblNewLabel_13_1);
		
		JButton btnNewButton_31_1 = new JButton("");
		btnNewButton_31_1.setIcon(new ImageIcon("C:\\Users\\hi\\Desktop\\장바구니27.png"));
		btnNewButton_31_1.setBackground(Color.WHITE);
		btnNewButton_31_1.setBounds(502, 248, 22, 22);
		allMenu.add(btnNewButton_31_1);
		
		JButton btnNewButton_32_1 = new JButton("");
		btnNewButton_32_1.setBackground(Color.WHITE);
		btnNewButton_32_1.setBounds(160, 280, 90, 90);
		allMenu.add(btnNewButton_32_1);
		
		JLabel lblNewLabel_14_1 = new JLabel("New label");
		lblNewLabel_14_1.setFont(new Font("굴림", Font.PLAIN, 13));
		lblNewLabel_14_1.setBounds(160, 372, 66, 18);
		allMenu.add(lblNewLabel_14_1);
		
		JButton btnNewButton_33_1 = new JButton("");
		btnNewButton_33_1.setIcon(new ImageIcon("C:\\Users\\hi\\Desktop\\장바구니27.png"));
		btnNewButton_33_1.setBackground(Color.WHITE);
		btnNewButton_33_1.setBounds(228, 380, 22, 22);
		allMenu.add(btnNewButton_33_1);
		
		JButton btnNewButton_34_1 = new JButton("");
		btnNewButton_34_1.setBackground(Color.WHITE);
		btnNewButton_34_1.setBounds(295, 280, 90, 90);
		allMenu.add(btnNewButton_34_1);
		
		JLabel lblNewLabel_15_1 = new JLabel("New label");
		lblNewLabel_15_1.setFont(new Font("굴림", Font.PLAIN, 13));
		lblNewLabel_15_1.setBounds(295, 372, 66, 18);
		allMenu.add(lblNewLabel_15_1);
		
		JButton btnNewButton_35_1 = new JButton("");
		btnNewButton_35_1.setIcon(new ImageIcon("C:\\Users\\hi\\Desktop\\장바구니27.png"));
		btnNewButton_35_1.setBackground(Color.WHITE);
		btnNewButton_35_1.setBounds(363, 380, 22, 22);
		allMenu.add(btnNewButton_35_1);
		
		JButton btnNewButton_36_1 = new JButton("");
		btnNewButton_36_1.setBackground(Color.WHITE);
		btnNewButton_36_1.setBounds(434, 280, 90, 90);
		allMenu.add(btnNewButton_36_1);
		
		JLabel lblNewLabel_16_1 = new JLabel("New label");
		lblNewLabel_16_1.setFont(new Font("굴림", Font.PLAIN, 13));
		lblNewLabel_16_1.setBounds(434, 372, 66, 18);
		allMenu.add(lblNewLabel_16_1);
		
		JButton btnNewButton_37_1 = new JButton("");
		btnNewButton_37_1.setIcon(new ImageIcon("C:\\Users\\hi\\Desktop\\장바구니27.png"));
		btnNewButton_37_1.setBounds(502, 380, 22, 22);
		allMenu.add(btnNewButton_37_1);
		
		JLabel lblNewLabel_32 = new JLabel("New label");
		lblNewLabel_32.setForeground(Color.DARK_GRAY);
		lblNewLabel_32.setBounds(20, 129, 57, 15);
		allMenu.add(lblNewLabel_32);
		
		JLabel lblNewLabel_33 = new JLabel("New label");
		lblNewLabel_33.setForeground(Color.DARK_GRAY);
		lblNewLabel_33.setBounds(160, 129, 57, 15);
		allMenu.add(lblNewLabel_33);
		
		JLabel lblNewLabel_34 = new JLabel("New label");
		lblNewLabel_34.setForeground(Color.DARK_GRAY);
		lblNewLabel_34.setBounds(295, 129, 57, 15);
		allMenu.add(lblNewLabel_34);
		
		JLabel lblNewLabel_35 = new JLabel("New label");
		lblNewLabel_35.setForeground(Color.DARK_GRAY);
		lblNewLabel_35.setBounds(434, 129, 57, 15);
		allMenu.add(lblNewLabel_35);
		
		JLabel lblNewLabel_36 = new JLabel("New label");
		lblNewLabel_36.setForeground(Color.DARK_GRAY);
		lblNewLabel_36.setBounds(20, 259, 57, 15);
		allMenu.add(lblNewLabel_36);
		
		JLabel lblNewLabel_37 = new JLabel("New label");
		lblNewLabel_37.setForeground(Color.DARK_GRAY);
		lblNewLabel_37.setBounds(160, 259, 57, 15);
		allMenu.add(lblNewLabel_37);
		
		JLabel lblNewLabel_38 = new JLabel("New label");
		lblNewLabel_38.setBounds(295, 259, 57, 15);
		allMenu.add(lblNewLabel_38);
		
		JLabel lblNewLabel_39 = new JLabel("New label");
		lblNewLabel_39.setForeground(Color.DARK_GRAY);
		lblNewLabel_39.setBounds(434, 259, 57, 15);
		allMenu.add(lblNewLabel_39);
		
		JLabel lblNewLabel_40 = new JLabel("New label");
		lblNewLabel_40.setForeground(Color.DARK_GRAY);
		lblNewLabel_40.setBounds(20, 389, 57, 15);
		allMenu.add(lblNewLabel_40);
		
		JLabel lblNewLabel_42 = new JLabel("New label");
		lblNewLabel_42.setForeground(Color.DARK_GRAY);
		lblNewLabel_42.setBounds(160, 389, 57, 15);
		allMenu.add(lblNewLabel_42);
		
		JLabel lblNewLabel_41 = new JLabel("New label");
		lblNewLabel_41.setForeground(Color.DARK_GRAY);
		lblNewLabel_41.setBounds(294, 389, 57, 15);
		allMenu.add(lblNewLabel_41);
		
		JLabel lblNewLabel_43 = new JLabel("New label");
		lblNewLabel_43.setForeground(Color.DARK_GRAY);
		lblNewLabel_43.setBounds(434, 389, 57, 15);
		allMenu.add(lblNewLabel_43);
		
		JPanel mealMenu = new JPanel();
		mealMenu.setBorder(null);
		mealMenu.setBackground(Color.WHITE);
		menuTabbedPane.addTab("식사류", null, mealMenu, null);
		mealMenu.setLayout(null);
		
		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.setBackground(Color.WHITE);
		btnNewButton_8.setBounds(20, 20, 90, 90);
		mealMenu.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("");
		btnNewButton_9.setBackground(Color.WHITE);
		btnNewButton_9.setBounds(160, 20, 90, 90);
		mealMenu.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("");
		btnNewButton_10.setBackground(Color.WHITE);
		btnNewButton_10.setBounds(295, 20, 90, 90);
		mealMenu.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("");
		btnNewButton_11.setBackground(Color.WHITE);
		btnNewButton_11.setBounds(434, 20, 90, 90);
		mealMenu.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("");
		btnNewButton_12.setBackground(Color.WHITE);
		btnNewButton_12.setBounds(20, 150, 90, 90);
		mealMenu.add(btnNewButton_12);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setFont(new Font("굴림", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(20, 112, 66, 18);
		mealMenu.add(lblNewLabel_5);
		
		JButton btnNewButton_13 = new JButton("");
		btnNewButton_13.setIcon(new ImageIcon("C:\\Users\\hi\\Desktop\\장바구니27.png"));
		btnNewButton_13.setBounds(88, 117, 22, 22);
		mealMenu.add(btnNewButton_13);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setFont(new Font("굴림", Font.PLAIN, 13));
		lblNewLabel_6.setBounds(160, 112, 66, 18);
		mealMenu.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setFont(new Font("굴림", Font.PLAIN, 13));
		lblNewLabel_7.setBounds(295, 112, 66, 18);
		mealMenu.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setFont(new Font("굴림", Font.PLAIN, 13));
		lblNewLabel_8.setBounds(434, 112, 66, 18);
		mealMenu.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setFont(new Font("굴림", Font.PLAIN, 13));
		lblNewLabel_9.setBounds(20, 242, 66, 18);
		mealMenu.add(lblNewLabel_9);
		
		JButton btnNewButton_14 = new JButton("");
		btnNewButton_14.setIcon(new ImageIcon("C:\\Users\\hi\\Desktop\\장바구니27.png"));
		btnNewButton_14.setBounds(228, 117, 22, 22);
		mealMenu.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("");
		btnNewButton_15.setIcon(new ImageIcon("C:\\Users\\hi\\Desktop\\장바구니27.png"));
		btnNewButton_15.setBounds(363, 117, 22, 22);
		mealMenu.add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("");
		btnNewButton_16.setIcon(new ImageIcon("C:\\Users\\hi\\Desktop\\장바구니27.png"));
		btnNewButton_16.setBounds(502, 117, 22, 22);
		mealMenu.add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_17.setIcon(new ImageIcon("C:\\Users\\hi\\Desktop\\장바구니27.png"));
		btnNewButton_17.setBounds(88, 248, 22, 22);
		mealMenu.add(btnNewButton_17);
		
		JLabel lblNewLabel_44 = new JLabel("New label");
		lblNewLabel_44.setForeground(Color.DARK_GRAY);
		lblNewLabel_44.setBounds(20, 129, 57, 15);
		mealMenu.add(lblNewLabel_44);
		
		JLabel lblNewLabel_45 = new JLabel("New label");
		lblNewLabel_45.setForeground(Color.DARK_GRAY);
		lblNewLabel_45.setBounds(160, 129, 57, 15);
		mealMenu.add(lblNewLabel_45);
		
		JLabel lblNewLabel_46 = new JLabel("New label");
		lblNewLabel_46.setForeground(Color.DARK_GRAY);
		lblNewLabel_46.setBounds(295, 129, 57, 15);
		mealMenu.add(lblNewLabel_46);
		
		JLabel lblNewLabel_47 = new JLabel("New label");
		lblNewLabel_47.setForeground(Color.DARK_GRAY);
		lblNewLabel_47.setBounds(434, 129, 57, 15);
		mealMenu.add(lblNewLabel_47);
		
		JLabel lblNewLabel_48 = new JLabel("New label");
		lblNewLabel_48.setForeground(Color.DARK_GRAY);
		lblNewLabel_48.setBounds(20, 259, 57, 15);
		mealMenu.add(lblNewLabel_48);
		
		JPanel ramenMenu = new JPanel();
		ramenMenu.setBorder(null);
		ramenMenu.setBackground(Color.WHITE);
		menuTabbedPane.addTab("라면류", null, ramenMenu, null);
		ramenMenu.setLayout(null);
		
		JButton btnNewButton_18 = new JButton("");
		btnNewButton_18.setBounds(20, 20, 90, 90);
		ramenMenu.add(btnNewButton_18);
		
		JButton btnNewButton_19 = new JButton("");
		btnNewButton_19.setBounds(160, 20, 90, 90);
		ramenMenu.add(btnNewButton_19);
		
		JButton btnNewButton_20 = new JButton("");
		btnNewButton_20.setBounds(295, 20, 90, 90);
		ramenMenu.add(btnNewButton_20);
		
		JButton btnNewButton_21 = new JButton("");
		btnNewButton_21.setBounds(434, 20, 90, 90);
		ramenMenu.add(btnNewButton_21);
		
		JButton btnNewButton_22 = new JButton("");
		btnNewButton_22.setBounds(20, 150, 90, 90);
		ramenMenu.add(btnNewButton_22);
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setFont(new Font("굴림", Font.PLAIN, 13));
		lblNewLabel_10.setBounds(20, 112, 66, 18);
		ramenMenu.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setFont(new Font("굴림", Font.PLAIN, 13));
		lblNewLabel_11.setBounds(160, 112, 66, 18);
		ramenMenu.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("New label");
		lblNewLabel_12.setFont(new Font("굴림", Font.PLAIN, 13));
		lblNewLabel_12.setBounds(295, 112, 66, 18);
		ramenMenu.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("New label");
		lblNewLabel_13.setFont(new Font("굴림", Font.PLAIN, 13));
		lblNewLabel_13.setBounds(434, 112, 66, 18);
		ramenMenu.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("New label");
		lblNewLabel_14.setFont(new Font("굴림", Font.PLAIN, 13));
		lblNewLabel_14.setBounds(20, 242, 66, 18);
		ramenMenu.add(lblNewLabel_14);
		
		JButton btnNewButton_23 = new JButton("");
		btnNewButton_23.setIcon(new ImageIcon("C:\\Users\\hi\\Desktop\\장바구니27.png"));
		btnNewButton_23.setBounds(88, 117, 22, 22);
		ramenMenu.add(btnNewButton_23);
		
		JButton btnNewButton_24 = new JButton("");
		btnNewButton_24.setIcon(new ImageIcon("C:\\Users\\hi\\Desktop\\장바구니27.png"));
		btnNewButton_24.setBounds(228, 117, 22, 22);
		ramenMenu.add(btnNewButton_24);
		
		JButton btnNewButton_25 = new JButton("");
		btnNewButton_25.setIcon(new ImageIcon("C:\\Users\\hi\\Desktop\\장바구니27.png"));
		btnNewButton_25.setBounds(363, 117, 22, 22);
		ramenMenu.add(btnNewButton_25);
		
		JButton btnNewButton_26 = new JButton("");
		btnNewButton_26.setIcon(new ImageIcon("C:\\Users\\hi\\Desktop\\장바구니27.png"));
		btnNewButton_26.setBounds(502, 117, 22, 22);
		ramenMenu.add(btnNewButton_26);
		
		JButton btnNewButton_27 = new JButton("");
		btnNewButton_27.setForeground(Color.DARK_GRAY);
		btnNewButton_27.setIcon(new ImageIcon("C:\\Users\\hi\\Desktop\\장바구니27.png"));
		btnNewButton_27.setBounds(88, 248, 22, 22);
		ramenMenu.add(btnNewButton_27);
		
		JLabel lblNewLabel_49 = new JLabel("New label");
		lblNewLabel_49.setForeground(Color.DARK_GRAY);
		lblNewLabel_49.setBounds(20, 129, 57, 15);
		ramenMenu.add(lblNewLabel_49);
		
		JLabel lblNewLabel_50 = new JLabel("New label");
		lblNewLabel_50.setForeground(Color.DARK_GRAY);
		lblNewLabel_50.setBounds(160, 129, 57, 15);
		ramenMenu.add(lblNewLabel_50);
		
		JLabel lblNewLabel_51 = new JLabel("New label");
		lblNewLabel_51.setForeground(Color.DARK_GRAY);
		lblNewLabel_51.setBounds(295, 129, 57, 15);
		ramenMenu.add(lblNewLabel_51);
		
		JLabel lblNewLabel_52 = new JLabel("New label");
		lblNewLabel_52.setForeground(Color.DARK_GRAY);
		lblNewLabel_52.setBounds(434, 129, 57, 15);
		ramenMenu.add(lblNewLabel_52);
		
		JLabel lblNewLabel_53 = new JLabel("New label");
		lblNewLabel_53.setForeground(Color.DARK_GRAY);
		lblNewLabel_53.setBounds(20, 259, 57, 15);
		ramenMenu.add(lblNewLabel_53);
		
		JPanel snackMenu = new JPanel();
		snackMenu.setBackground(Color.WHITE);
		menuTabbedPane.addTab("간식류", null, snackMenu, null);
		snackMenu.setLayout(null);
		
		JButton btnNewButton_28 = new JButton("");
		btnNewButton_28.setBackground(Color.WHITE);
		btnNewButton_28.setIcon(new ImageIcon("C:\\Users\\hi\\Desktop\\기본_핫도그90.png"));
		btnNewButton_28.setBounds(20, 20, 90, 90);
		snackMenu.add(btnNewButton_28);
		
		JButton btnNewButton_29 = new JButton("");
		btnNewButton_29.setBackground(Color.WHITE);
		btnNewButton_29.setBounds(160, 20, 90, 90);
		snackMenu.add(btnNewButton_29);
		
		JButton btnNewButton_30 = new JButton("");
		btnNewButton_30.setBackground(Color.WHITE);
		btnNewButton_30.setBounds(295, 20, 90, 90);
		snackMenu.add(btnNewButton_30);
		
		JButton btnNewButton_31 = new JButton("");
		btnNewButton_31.setBackground(Color.WHITE);
		btnNewButton_31.setBounds(434, 20, 90, 90);
		snackMenu.add(btnNewButton_31);
		
		JButton btnNewButton_32 = new JButton("");
		btnNewButton_32.setBackground(Color.WHITE);
		btnNewButton_32.setBounds(20, 150, 90, 90);
		snackMenu.add(btnNewButton_32);
		
		JLabel lblNewLabel_15 = new JLabel("기본 핫도그");
		lblNewLabel_15.setFont(new Font("굴림", Font.PLAIN, 13));
		lblNewLabel_15.setBounds(15, 112, 69, 18);
		snackMenu.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("New label");
		lblNewLabel_16.setFont(new Font("굴림", Font.PLAIN, 13));
		lblNewLabel_16.setBounds(160, 112, 66, 18);
		snackMenu.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("New label");
		lblNewLabel_17.setFont(new Font("굴림", Font.PLAIN, 13));
		lblNewLabel_17.setBounds(295, 112, 66, 18);
		snackMenu.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("New label");
		lblNewLabel_18.setFont(new Font("굴림", Font.PLAIN, 13));
		lblNewLabel_18.setBounds(434, 112, 66, 18);
		snackMenu.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("New label");
		lblNewLabel_19.setFont(new Font("굴림", Font.PLAIN, 13));
		lblNewLabel_19.setBounds(20, 242, 66, 18);
		snackMenu.add(lblNewLabel_19);
		
		JButton btnNewButton_33 = new JButton("");
		btnNewButton_33.setIcon(new ImageIcon("C:\\Users\\hi\\Desktop\\장바구니27.png"));
		btnNewButton_33.setBounds(98, 117, 22, 22);
		snackMenu.add(btnNewButton_33);
		
		JButton btnNewButton_34 = new JButton("");
		btnNewButton_34.setIcon(new ImageIcon("C:\\Users\\hi\\Desktop\\장바구니27.png"));
		btnNewButton_34.setBounds(228, 117, 22, 22);
		snackMenu.add(btnNewButton_34);
		
		JButton btnNewButton_35 = new JButton("");
		btnNewButton_35.setIcon(new ImageIcon("C:\\Users\\hi\\Desktop\\장바구니27.png"));
		btnNewButton_35.setBounds(363, 117, 22, 22);
		snackMenu.add(btnNewButton_35);
		
		JButton btnNewButton_36 = new JButton("");
		btnNewButton_36.setIcon(new ImageIcon("C:\\Users\\hi\\Desktop\\장바구니27.png"));
		btnNewButton_36.setBounds(502, 117, 22, 22);
		snackMenu.add(btnNewButton_36);
		
		JButton btnNewButton_37 = new JButton("");
		btnNewButton_37.setIcon(new ImageIcon("C:\\Users\\hi\\Desktop\\장바구니27.png"));
		btnNewButton_37.setBounds(88, 248, 22, 22);
		snackMenu.add(btnNewButton_37);
		
		JLabel lblNewLabel_54 = new JLabel("2,300원");
		lblNewLabel_54.setForeground(Color.DARK_GRAY);
		lblNewLabel_54.setBounds(20, 129, 57, 15);
		snackMenu.add(lblNewLabel_54);
		
		JLabel lblNewLabel_55 = new JLabel("New label");
		lblNewLabel_55.setForeground(Color.DARK_GRAY);
		lblNewLabel_55.setBounds(160, 129, 57, 15);
		snackMenu.add(lblNewLabel_55);
		
		JLabel lblNewLabel_56 = new JLabel("New label");
		lblNewLabel_56.setForeground(Color.DARK_GRAY);
		lblNewLabel_56.setBounds(295, 129, 57, 15);
		snackMenu.add(lblNewLabel_56);
		
		JLabel lblNewLabel_57 = new JLabel("New label");
		lblNewLabel_57.setForeground(Color.DARK_GRAY);
		lblNewLabel_57.setBounds(434, 129, 57, 15);
		snackMenu.add(lblNewLabel_57);
		
		JLabel lblNewLabel_58 = new JLabel("New label");
		lblNewLabel_58.setForeground(Color.DARK_GRAY);
		lblNewLabel_58.setBounds(20, 259, 57, 15);
		snackMenu.add(lblNewLabel_58);
		
		JPanel beverageMenu = new JPanel();
		beverageMenu.setBackground(Color.WHITE);
		menuTabbedPane.addTab("음료류", null, beverageMenu, null);
		beverageMenu.setLayout(null);
		
		JButton btnNewButton_39 = new JButton("");
		btnNewButton_39.setBackground(Color.WHITE);
		btnNewButton_39.setBounds(20, 20, 90, 90);
		beverageMenu.add(btnNewButton_39);
		
		JButton btnNewButton_40 = new JButton("");
		btnNewButton_40.setBackground(Color.WHITE);
		btnNewButton_40.setBounds(160, 20, 90, 90);
		beverageMenu.add(btnNewButton_40);
		
		JButton btnNewButton_41 = new JButton("");
		btnNewButton_41.setBackground(Color.WHITE);
		btnNewButton_41.setBounds(295, 20, 90, 90);
		beverageMenu.add(btnNewButton_41);
		
		JButton btnNewButton_42 = new JButton("");
		btnNewButton_42.setBackground(Color.WHITE);
		btnNewButton_42.setBounds(434, 20, 90, 90);
		beverageMenu.add(btnNewButton_42);
		
		JButton btnNewButton_43 = new JButton("");
		btnNewButton_43.setBackground(Color.WHITE);
		btnNewButton_43.setBounds(20, 150, 90, 90);
		beverageMenu.add(btnNewButton_43);
		
		JLabel lblNewLabel_20 = new JLabel("New label");
		lblNewLabel_20.setFont(new Font("굴림", Font.PLAIN, 13));
		lblNewLabel_20.setBounds(20, 112, 66, 18);
		beverageMenu.add(lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel("New label");
		lblNewLabel_21.setFont(new Font("굴림", Font.PLAIN, 13));
		lblNewLabel_21.setBounds(160, 112, 66, 18);
		beverageMenu.add(lblNewLabel_21);
		
		JLabel lblNewLabel_22 = new JLabel("New label");
		lblNewLabel_22.setFont(new Font("굴림", Font.PLAIN, 13));
		lblNewLabel_22.setBounds(295, 112, 66, 18);
		beverageMenu.add(lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel("New label");
		lblNewLabel_23.setFont(new Font("굴림", Font.PLAIN, 13));
		lblNewLabel_23.setBounds(434, 112, 66, 18);
		beverageMenu.add(lblNewLabel_23);
		
		JLabel lblNewLabel_24 = new JLabel("New label");
		lblNewLabel_24.setFont(new Font("굴림", Font.PLAIN, 13));
		lblNewLabel_24.setBounds(20, 242, 66, 18);
		beverageMenu.add(lblNewLabel_24);
		
		JButton btnNewButton_44 = new JButton("");
		btnNewButton_44.setIcon(new ImageIcon("C:\\Users\\hi\\Desktop\\장바구니27.png"));
		btnNewButton_44.setBounds(88, 117, 22, 22);
		beverageMenu.add(btnNewButton_44);
		
		JButton btnNewButton_45 = new JButton("");
		btnNewButton_45.setIcon(new ImageIcon("C:\\Users\\hi\\Desktop\\장바구니27.png"));
		btnNewButton_45.setBounds(228, 117, 22, 22);
		beverageMenu.add(btnNewButton_45);
		
		JButton btnNewButton_46 = new JButton("");
		btnNewButton_46.setIcon(new ImageIcon("C:\\Users\\hi\\Desktop\\장바구니27.png"));
		btnNewButton_46.setBounds(363, 117, 22, 22);
		beverageMenu.add(btnNewButton_46);
		
		JButton btnNewButton_47 = new JButton("");
		btnNewButton_47.setForeground(Color.DARK_GRAY);
		btnNewButton_47.setIcon(new ImageIcon("C:\\Users\\hi\\Desktop\\장바구니27.png"));
		btnNewButton_47.setBounds(502, 117, 22, 22);
		beverageMenu.add(btnNewButton_47);
		
		JButton btnNewButton_48 = new JButton("");
		btnNewButton_48.setIcon(new ImageIcon("C:\\Users\\hi\\Desktop\\장바구니27.png"));
		btnNewButton_48.setBounds(88, 248, 22, 22);
		beverageMenu.add(btnNewButton_48);
		
		JLabel lblNewLabel_59 = new JLabel("New label");
		lblNewLabel_59.setForeground(Color.DARK_GRAY);
		lblNewLabel_59.setBounds(20, 129, 57, 15);
		beverageMenu.add(lblNewLabel_59);
		
		JLabel lblNewLabel_60 = new JLabel("New label");
		lblNewLabel_60.setForeground(Color.DARK_GRAY);
		lblNewLabel_60.setBounds(160, 129, 57, 15);
		beverageMenu.add(lblNewLabel_60);
		
		JLabel lblNewLabel_61 = new JLabel("New label");
		lblNewLabel_61.setForeground(Color.DARK_GRAY);
		lblNewLabel_61.setBounds(295, 129, 57, 15);
		beverageMenu.add(lblNewLabel_61);
		
		JLabel label = new JLabel("New label");
		label.setBounds(434, 129, 57, 15);
		beverageMenu.add(label);
		
		JLabel lblNewLabel_62 = new JLabel("New label");
		lblNewLabel_62.setForeground(Color.DARK_GRAY);
		lblNewLabel_62.setBounds(20, 259, 57, 15);
		beverageMenu.add(lblNewLabel_62);
		
		JPanel toppingMenu = new JPanel();
		toppingMenu.setBackground(Color.WHITE);
		menuTabbedPane.addTab("토핑", null, toppingMenu, null);
		toppingMenu.setLayout(null);
		
		JButton btnNewButton_49 = new JButton("");
		btnNewButton_49.setBackground(Color.WHITE);
		btnNewButton_49.setBounds(20, 20, 90, 90);
		toppingMenu.add(btnNewButton_49);
		
		JButton btnNewButton_50 = new JButton("");
		btnNewButton_50.setBackground(Color.WHITE);
		btnNewButton_50.setBounds(160, 20, 90, 90);
		toppingMenu.add(btnNewButton_50);
		
		JButton btnNewButton_51 = new JButton("");
		btnNewButton_51.setBackground(Color.WHITE);
		btnNewButton_51.setBounds(295, 20, 90, 90);
		toppingMenu.add(btnNewButton_51);
		
		JButton btnNewButton_52 = new JButton("");
		btnNewButton_52.setBackground(Color.WHITE);
		btnNewButton_52.setBounds(434, 20, 90, 90);
		toppingMenu.add(btnNewButton_52);
		
		JButton btnNewButton_53 = new JButton("");
		btnNewButton_53.setBackground(Color.WHITE);
		btnNewButton_53.setBounds(20, 150, 90, 90);
		toppingMenu.add(btnNewButton_53);
		
		JLabel lblNewLabel_25 = new JLabel("New label");
		lblNewLabel_25.setFont(new Font("굴림", Font.PLAIN, 13));
		lblNewLabel_25.setBounds(20, 112, 66, 18);
		toppingMenu.add(lblNewLabel_25);
		
		JLabel lblNewLabel_26 = new JLabel("New label");
		lblNewLabel_26.setFont(new Font("굴림", Font.PLAIN, 13));
		lblNewLabel_26.setBounds(160, 112, 66, 18);
		toppingMenu.add(lblNewLabel_26);
		
		JLabel lblNewLabel_27 = new JLabel("New label");
		lblNewLabel_27.setFont(new Font("굴림", Font.PLAIN, 13));
		lblNewLabel_27.setBounds(295, 112, 66, 18);
		toppingMenu.add(lblNewLabel_27);
		
		JLabel lblNewLabel_28 = new JLabel("New label");
		lblNewLabel_28.setFont(new Font("굴림", Font.PLAIN, 13));
		lblNewLabel_28.setBounds(434, 112, 66, 18);
		toppingMenu.add(lblNewLabel_28);
		
		JLabel lblNewLabel_29 = new JLabel("New label");
		lblNewLabel_29.setFont(new Font("굴림", Font.PLAIN, 13));
		lblNewLabel_29.setBounds(20, 242, 66, 18);
		toppingMenu.add(lblNewLabel_29);
		
		JButton btnNewButton_54 = new JButton("");
		btnNewButton_54.setIcon(new ImageIcon("C:\\Users\\hi\\Desktop\\장바구니27.png"));
		btnNewButton_54.setBounds(88, 117, 22, 22);
		toppingMenu.add(btnNewButton_54);
		
		JButton btnNewButton_55 = new JButton("");
		btnNewButton_55.setIcon(new ImageIcon("C:\\Users\\hi\\Desktop\\장바구니27.png"));
		btnNewButton_55.setBounds(228, 117, 22, 22);
		toppingMenu.add(btnNewButton_55);
		
		JButton btnNewButton_56 = new JButton("");
		btnNewButton_56.setIcon(new ImageIcon("C:\\Users\\hi\\Desktop\\장바구니27.png"));
		btnNewButton_56.setBounds(363, 117, 22, 22);
		toppingMenu.add(btnNewButton_56);
		
		JButton btnNewButton_57 = new JButton("");
		btnNewButton_57.setIcon(new ImageIcon("C:\\Users\\hi\\Desktop\\장바구니27.png"));
		btnNewButton_57.setBounds(502, 117, 22, 22);
		toppingMenu.add(btnNewButton_57);
		
		JButton btnNewButton_58 = new JButton("");
		btnNewButton_58.setIcon(new ImageIcon("C:\\Users\\hi\\Desktop\\장바구니27.png"));
		btnNewButton_58.setBounds(88, 248, 22, 22);
		toppingMenu.add(btnNewButton_58);
		
		JLabel lblNewLabel_63 = new JLabel("New label");
		lblNewLabel_63.setBounds(20, 129, 57, 15);
		toppingMenu.add(lblNewLabel_63);
		
		JLabel lblNewLabel_64 = new JLabel("New label");
		lblNewLabel_64.setForeground(Color.DARK_GRAY);
		lblNewLabel_64.setBounds(160, 129, 57, 15);
		toppingMenu.add(lblNewLabel_64);
		
		JLabel lblNewLabel_65 = new JLabel("New label");
		lblNewLabel_65.setForeground(Color.DARK_GRAY);
		lblNewLabel_65.setBounds(295, 129, 57, 15);
		toppingMenu.add(lblNewLabel_65);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setForeground(Color.DARK_GRAY);
		label_1.setBounds(434, 129, 57, 15);
		toppingMenu.add(label_1);
		
		JLabel lblNewLabel_66 = new JLabel("New label");
		lblNewLabel_66.setForeground(Color.DARK_GRAY);
		lblNewLabel_66.setBounds(20, 259, 57, 15);
		toppingMenu.add(lblNewLabel_66);
		
		JScrollPane scrollPane = new JScrollPane();
		menuTabbedPane.addTab("New tab", null, scrollPane, null);
		
	}
	private static class __Tmp {
		private static void __tmp() {
			  javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
		}
	}
}
