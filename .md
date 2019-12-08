实验目的
===============================
分析学生选课系统

使用GUI窗体及其组件设计窗体界面

完成学生选课过程业务逻辑编程

基于文件保存并读取数据

处理异常


实验要求
============================
1、设计GUI窗体，支持学生注册、课程新加、学生选课、学生退课、打印学生选课列表等操作。

2、基于事件模型对业务逻辑编程，实现在界面上支持上述操作。

3、针对操作过程中可能会出现的各种异常，做异常处理

4、基于输入/输出编程，支持学生、课程、教师等数据的读写操作。

实验准备
===========================
window 10主机

jdk 12.0

eclipse

eclipse builder

实验过程
================================
首先创建主窗体
```java
public class SyfiveFrame extends JFrame {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater

		(new Runnable() {
			public void run() {
				try {
					SyfiveFrame frame = new SyfiveFrame()
					frame.setVisible(true)      //显示窗体
				} catch (Exception
				e) {
					e.printStackTrace();
				}
			}
		});
	}
}
```
给按钮添加事件监听
```java
//确认按钮
jbOk.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				StringBuilder info = new StringBuilder();
				String
				name = tfName.getText();
				String num = tfNum.getText();
				String sex;
				if (rb1.isSelected()) {
					sex = "��";
				} else {
					sex = "Ů";
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
					String t = t2.getSelectedItem().toString();
					info.append("," + c + t);
				}
				if (cb3.isSelected()) {
					String c = cb3.getText();
					String t = t3.getSelectedItem().toString();
					info.append("," + c + t);
				}
				allInfo.setText(info.toString());
				String setall = info.toString();
		        try {
		        	FileWriter writer = new FileWriter("D://1.txt", true);//文件写入
		        	writer.write(setall);
		        	writer.flush();
		        	writer.close();
		        } catch (IOException e2) {
		            e2.printStackTrace();
		        }
				JOptionPane.showMessageDialog(null, "��ӳɹ�!");
			}
		});
    ```
 //退课按钮
 ```java
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
				JOptionPane.showMessageDialog(null, "�˿γɹ�!");		
			}
		});
    ```
    //查询按钮
    ```java
    JButton btnNewButton = new JButton("�鿴ѡ�����");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			SyfiveCourse cou1 = null;
			cou1 = new SyfiveCourse();
			cou1.show();
			}
		});
  ```
  //文件读取
 ```java
  try {
            BufferedReader bufferedReader =new BufferedReader(new FileReader("D://1.txt"));
            String str =textField.getText();
            while(null !=(str=bufferedReader.readLine())) {
            	
            	textField.setText(str);
       
            }
        }catch (IOException e) {
            e.printStackTrace();
            	
       }
```
流程图
======================
![lct](https://github.com/djonehss/-5/blob/master/lct.png)

运行结果图
============================
![1](https://github.com/djonehss/-5/blob/master/ck.png)
![2](https://github.com/djonehss/-5/blob/master/tk.png)
![3](https://github.com/djonehss/-5/blob/master/wxxr.png)
![4](https://github.com/djonehss/-5/blob/master/xk.png)

实验感想
==============================
通过这次综合性实验学到很多新的东西，比如JavaGUI界面方面完全可以运用可视化builder插件完成，唯一不好的方面在于他重写上面
如果不更改原值，别人很难发现找到你的原值是什么在哪里，哪里对应哪里，但是再添加组件方面确实很方面只需要自己来找，拖拽组件
双击即可找到它并自动添加事件监听。再数据输出输入方面自己需要再努力学习，再做完这个实验后，我还是没能成功的将数据序列化，
完全没有搞懂，所以也没有添加上，整体会感觉程序很简陋，没有达到自己的预期，但是相信自己会搞明白，再搞明白后自己会认真的再，
重新优化自己的此次实验。
