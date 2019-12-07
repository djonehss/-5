package syfour;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInput;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

/**
 * 主要实现功能：实现一个学生选课的图
 * 
 * 形界面
 */
public class SyfiveFrame extends JFrame {

	// 定义组件
	private static final long serialVersionUID = 1L;
	private JPanel

	contentPane;
	private JTextField tfName, tfNum, allInfo;
	private

	JRadioButton rb1, rb2;
	private JCheckBox cb1, cb2, cb3;
	private

	JComboBox<String> t1, t2, t3;

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		EventQueue.invokeLater

		(new Runnable() {
			public void run() {
				try {

					SyfiveFrame frame = new SyfiveFrame();// 创建一个窗口
					frame.setVisible(true);

					// 让该窗口实例可见
				} catch (Exception

				e) {
					e.printStackTrace();
				}

			}
		});
//      CourseSelectionFrame frame=new CourseSelectionFrame();
//      frame.setVisible(true);
	}

	/**
	 * 窗口属性的设置，内部
	 * 
	 * 组件的初始化
	 */
	public SyfiveFrame() {
		setTitle("\u5B9E\u9A8C\u4E94\u5B66\u751F\u9009\u8BFE\u7CFB\u7EDF"); // 标题

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置关闭时推出JVM

		setSize(500, 400); // 设置窗口大小

		setLocationRelativeTo(null); // 设置窗体居中
		contentPane = new JPanel(); // 内容面板

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		contentPane.setLayout(new BorderLayout(0, 0)); // 设置布局

		setContentPane(contentPane);
		JPanel panel = new JPanel(new

		GridLayout(5, 1, 5, 10)); // 5行1列的表格布局
		panel.setBorder(new

		TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		contentPane.add(panel, BorderLayout.CENTER); // 给panel添加边框
		// 第一行
		JPanel panel_1 = new JPanel();

		panel.add(panel_1);
		panel_1.setLayout(null);
		JLabel label = new JLabel("姓名");
		label.setBounds(70, 9, 24, 15);
		panel_1.add(label);
		tfName = new JTextField();
		tfName.setBounds(104, 6, 66, 21);
		tfName.setText("\u9EC4\u751F\u751F");
		panel_1.add(tfName);
		tfName.setColumns(10);
		JLabel label_2 = new JLabel("学号");
		label_2.setBounds(180, 9, 24, 15);
		panel_1.add(label_2);
		tfNum = new JTextField();
		tfNum.setBounds(214, 6, 77, 21);
		tfNum.setText("2019322185");
		tfNum.setColumns(10);
		panel_1.add(tfNum);
		rb1 = new JRadioButton("男");
		rb1.setBounds(296, 5, 37, 23);
		panel_1.add(rb1);
		rb1.setSelected(true); // 设置单选按钮中，默认选中的按钮
		rb2 = new JRadioButton("女");
		rb2.setBounds(338, 5, 37, 23);
		panel_1.add(rb2);
		ButtonGroup bts = new ButtonGroup(); // 单选按钮需要加入到同一个ButonGroup中才能生效
		bts.add(rb1);
		bts.add(rb2);

		// 第二行
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		panel_2.setLayout(null);
		cb1 = new JCheckBox("离散数学");
		cb1.setBounds(100, 5, 73, 23);
		panel_2.add(cb1);

		t1 = new JComboBox<String>();
		t1.setBounds(284, 6, 63, 21);
		t1.setModel(new DefaultComboBoxModel(new String[] {"\u5F20\u8001\u5E08", "\u9EC4\u8001\u5E08", "\u5218\u8001\u5E08"}));
		panel_2.add(t1);
		// 第三行
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		panel_3.setLayout(null);
		cb2 = new JCheckBox("高等数学");
		cb2.setBounds(102, 5, 73, 23);

		panel_3.add(cb2);
		t2 = new JComboBox<String>();
		t2.setBounds(283, 6, 63, 21);

		t2.setModel(new DefaultComboBoxModel(new String[] {"\u5F20\u8001\u5E08", "\u5218\u8001\u5E08", "\u738B\u8001\u5E08"}));
		panel_3.add(t2);
		// 第四行
		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
		panel_4.setLayout(null);
		cb3 = new JCheckBox(" JAVA");
		cb3.setBounds(105, 5, 71, 23);

		panel_4.add(cb3);
		t3 = new JComboBox<String>();
		t3.setBounds(283, 6, 63, 21);
		t3.setModel(new DefaultComboBoxModel(new String[] {"\u738B\u8001\u5E08", "\u82CF\u8001\u5E08", "\u7A0B\u8001\u5E08"}));
		panel_4.add(t3);
		// 第五行
		JPanel panel_5 = new JPanel();
		panel.add(panel_5);
		panel_5.setLayout(null);
		JButton jbOk = new JButton("确定");
		jbOk.setBounds(61, 5, 57, 23);
		panel_5.add(jbOk);
		JButton jbRest = new JButton("\u9000\u8BFE");
		jbRest.setBounds(175, 5, 67, 23);
		panel_5.add(jbRest);
	
	
		JButton btnNewButton = new JButton("查看选课情况");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			SyfiveCourse cou1 = null;
			cou1 = new SyfiveCourse();
			cou1.show();
			}
		});
		btnNewButton.setBounds(280, 5, 122, 23);
		panel_5.add(btnNewButton);
		// 添加选课信息

		JPanel panelSouth = new JPanel();
		contentPane.add

		(panelSouth, BorderLayout.SOUTH);
		JLabel labe = new JLabel("\u5F53\u524D\u9009\u8BFE\u4FE1\u606F");
		labe.setHorizontalAlignment(SwingConstants.LEFT);

		panelSouth.add(labe);
		allInfo = new JTextField();

		allInfo.setColumns(30);
		panelSouth.add(allInfo);
		// 添加标题

		JPanel panelNorth = new JPanel();
		contentPane.add

		(panelNorth, BorderLayout.NORTH);
		JLabel labelTitle = new JLabel("学生选课系统");
		labelTitle.setForeground(Color.DARK_GRAY);

		labelTitle.setFont(new Font("宋体", Font.BOLD, 20));

		panelNorth.add(labelTitle);

		// 给确定按钮添加事件处理代码

		jbOk.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				StringBuilder info = new StringBuilder();
				String

				name = tfName.getText();
				String num = tfNum.getText();

				String sex;
				if (rb1.isSelected()) {

					sex = "男";
				} else {
					sex = "女";

				}
				info.append(name + num + sex);
				if

				(cb1.isSelected()) {
					String c = cb1.getText();

					String t = t1.getSelectedItem().toString();

					info.append(":" + c + t);
				}
				if (cb2.isSelected()) {
					
					String c = cb2.getText();
					String

					t = t2.getSelectedItem().toString();
					info.append("," + c

							+ t);
				}
				if (cb3.isSelected()) {

					String c = cb3.getText();
					String t = t3.getSelectedItem().toString();
					info.append("," + c + t);
				}
				allInfo.setText(info.toString());
				// 把学生信息和选课信息放到文本框中
				String setall = info.toString();
		        try {
		        	FileWriter writer = new FileWriter("D://1.txt", true);
		        	writer.write(setall);
		        	writer.flush();
		        	writer.close();
		        } catch (IOException e2) {
		            e2.printStackTrace();
		        }
				JOptionPane.showMessageDialog(null, "添加成功!");
				
				// 把学生信息和选课信息放到文件中

			}
		});

		// 给重填按钮设置事件处理代码

		jbRest.addActionListener(new ActionListener() {

			@Override

			public void actionPerformed(ActionEvent e) {

				tfName.setText("");
				tfNum.setText("");

				rb1.setSelected(true);
				cb1.setSelected(false);

				t1.setSelectedIndex(0);
				cb2.setSelected(false);

				t2.setSelectedIndex(0);
				allInfo.setText("");
				  File file =new File("D://1.txt");
			        try {
			            if(!file.exists()) {
			                file.createNewFile();
			            }
			            FileWriter fileWriter =new FileWriter("D://1.txt");
			            fileWriter.write("");
			            fileWriter.flush();
			            fileWriter.close();
			        } catch (IOException a) {
			            a.printStackTrace();
			        }
				JOptionPane.showMessageDialog(null, "退课成功!");
				
			}
		});
	}
}