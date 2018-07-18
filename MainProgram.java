/**
	 * The code by Mutombo Jean-Vincent
	 * Encription and Decription Of Text (String) Using one key for both 
**/
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import java.awt.TextArea;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainProgram extends JFrame implements ActionListener{

	private JPanel mainContentPane;
	private JPanel panelEncription;
	private JPanel panelDecription;
	private TextArea textAreaPlainText0;
	private TextArea textAreaCipherText0;
	private TextArea textAreaCipherText1;
	private TextArea textAreaPlainText1;
	private JButton btnEncription;
	private JButton btnDecription;

	//variables for processing Encriprion-Decription
	public static String userPlainText="";
	public static String userCipherText="";
	public static String cipherText="";
	public static String plainText="";

	//Array which play the role of the Key
	public static final int Chain[]={99999901};
    
    public static void main(String[] args){
    	
    	MainProgram me = new MainProgram();
    	me.setVisible(true);
    	me.setResizable(false);

    }
	
	public MainProgram() {
		//The code for handling the window
		super("Encription and Decription Program Using Private Key");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 820, 443);
		mainContentPane = new JPanel();
		mainContentPane.setForeground(Color.RED);
		mainContentPane.setBackground(new Color(165, 42, 42));
		setContentPane(mainContentPane);
		SpringLayout sl_mainContentPane = new SpringLayout();
		mainContentPane.setLayout(sl_mainContentPane);
		
		//The code for handling disposition of the Encription Panel
		panelEncription = new JPanel();
		sl_mainContentPane.putConstraint(SpringLayout.WEST, panelEncription, 10, SpringLayout.WEST, mainContentPane);
		sl_mainContentPane.putConstraint(SpringLayout.SOUTH, panelEncription, 379, SpringLayout.NORTH, mainContentPane);
		sl_mainContentPane.putConstraint(SpringLayout.EAST, panelEncription, -408, SpringLayout.EAST, mainContentPane);
		panelEncription.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(128, 0, 0)));
		panelEncription.setBackground(new Color(205, 133, 63));
		mainContentPane.add(panelEncription);
		
		//The code for handling disposition of the Decription Panel
		panelDecription = new JPanel();
		sl_mainContentPane.putConstraint(SpringLayout.NORTH, panelEncription, 0, SpringLayout.NORTH, panelDecription);
		sl_mainContentPane.putConstraint(SpringLayout.NORTH, panelDecription, 5, SpringLayout.NORTH, mainContentPane);
		sl_mainContentPane.putConstraint(SpringLayout.EAST, panelDecription, -10, SpringLayout.EAST, mainContentPane);
		sl_mainContentPane.putConstraint(SpringLayout.SOUTH, panelDecription, 379, SpringLayout.NORTH, mainContentPane);
		panelDecription.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(128, 0, 0)));
		panelDecription.setBackground(new Color(255, 99, 71));
		sl_mainContentPane.putConstraint(SpringLayout.WEST, panelDecription, -386, SpringLayout.EAST, mainContentPane);
		SpringLayout sl_panelEncription = new SpringLayout();
		panelEncription.setLayout(sl_panelEncription);
		mainContentPane.add(panelDecription);
		
		//The code for handling disposition of the PlainText's TextArea for the encription
		textAreaPlainText0 = new TextArea();
		textAreaPlainText0.setFont(new Font("Tahoma", Font.BOLD, 16));
		sl_panelEncription.putConstraint(SpringLayout.NORTH, textAreaPlainText0, 12, SpringLayout.NORTH, panelEncription);
		sl_panelEncription.putConstraint(SpringLayout.WEST, textAreaPlainText0, 12, SpringLayout.WEST, panelEncription);
		sl_panelEncription.putConstraint(SpringLayout.SOUTH, textAreaPlainText0, 118, SpringLayout.NORTH, panelEncription);
		sl_panelEncription.putConstraint(SpringLayout.EAST, textAreaPlainText0, 356, SpringLayout.WEST, panelEncription);
		panelEncription.add(textAreaPlainText0);
		
		//The code for handling disposition of the CipherText's TextArea for the encription
		textAreaCipherText0 = new TextArea();
		textAreaCipherText0.setFont(new Font("Tahoma", Font.BOLD, 16));
		sl_panelEncription.putConstraint(SpringLayout.NORTH, textAreaCipherText0, -129, SpringLayout.SOUTH, panelEncription);
		sl_panelEncription.putConstraint(SpringLayout.WEST, textAreaCipherText0, 0, SpringLayout.WEST, textAreaPlainText0);
		sl_panelEncription.putConstraint(SpringLayout.SOUTH, textAreaCipherText0, -10, SpringLayout.SOUTH, panelEncription);
		sl_panelEncription.putConstraint(SpringLayout.EAST, textAreaCipherText0, -18, SpringLayout.EAST, panelEncription);
		panelEncription.add(textAreaCipherText0);

		//The code for handling disposition and design of the Encription JButton
		btnEncription = new JButton("Encript");
		btnEncription.setForeground(new Color(255, 0, 0));
		sl_panelEncription.putConstraint(SpringLayout.NORTH, btnEncription, 42, SpringLayout.SOUTH, textAreaPlainText0);
		sl_panelEncription.putConstraint(SpringLayout.SOUTH, btnEncription, -36, SpringLayout.NORTH, textAreaCipherText0);
		sl_panelEncription.putConstraint(SpringLayout.WEST, btnEncription, 102, SpringLayout.WEST, panelEncription);
		sl_panelEncription.putConstraint(SpringLayout.EAST, btnEncription, -87, SpringLayout.EAST, panelEncription);
		btnEncription.setFont(new Font("Tahoma", Font.BOLD, 22));
		SpringLayout sl_panelDecription = new SpringLayout();
		panelDecription.setLayout(sl_panelDecription);
		panelEncription.add(btnEncription);
		

		//The code for handling disposition of the PlainText's TextArea for the decription		
		textAreaCipherText1 = new TextArea();
		textAreaCipherText1.setFont(new Font("Tahoma", Font.BOLD, 16));
		sl_panelDecription.putConstraint(SpringLayout.NORTH, textAreaCipherText1, 10, SpringLayout.NORTH, panelDecription);
		sl_panelDecription.putConstraint(SpringLayout.WEST, textAreaCipherText1, 10, SpringLayout.WEST, panelDecription);
		sl_panelDecription.putConstraint(SpringLayout.SOUTH, textAreaCipherText1, 119, SpringLayout.NORTH, panelDecription);
		sl_panelDecription.putConstraint(SpringLayout.EAST, textAreaCipherText1, -12, SpringLayout.EAST, panelDecription);
		panelDecription.add(textAreaCipherText1);

		//The code for handling disposition of the CipherText's TextArea for the decription
		textAreaPlainText1 = new TextArea();
		textAreaPlainText1.setFont(new Font("Tahoma", Font.BOLD, 16));
		sl_panelDecription.putConstraint(SpringLayout.NORTH, textAreaPlainText1, -128, SpringLayout.SOUTH, panelDecription);
		sl_panelDecription.putConstraint(SpringLayout.WEST, textAreaPlainText1, 10, SpringLayout.WEST, panelDecription);
		sl_panelDecription.putConstraint(SpringLayout.SOUTH, textAreaPlainText1, -10, SpringLayout.SOUTH, panelDecription);
		sl_panelDecription.putConstraint(SpringLayout.EAST, textAreaPlainText1, 0, SpringLayout.EAST, textAreaCipherText1);
		panelDecription.add(textAreaPlainText1);
		
		//The code for handling disposition and design of the Decription JButton
		btnDecription = new JButton("Decript");
		sl_panelDecription.putConstraint(SpringLayout.NORTH, btnDecription, -77, SpringLayout.NORTH, textAreaPlainText1);
		sl_panelDecription.putConstraint(SpringLayout.WEST, btnDecription, -256, SpringLayout.EAST, panelDecription);
		sl_panelDecription.putConstraint(SpringLayout.SOUTH, btnDecription, -36, SpringLayout.NORTH, textAreaPlainText1);
		sl_panelDecription.putConstraint(SpringLayout.EAST, btnDecription, -88, SpringLayout.EAST, panelDecription);
		btnDecription.setForeground(new Color(0, 0, 255));
		btnDecription.setFont(new Font("Tahoma", Font.BOLD, 22));
		panelDecription.add(btnDecription);
		
		//The code for adding ActionEvent to our two buttons
		btnEncription.addActionListener(this);
		btnDecription.addActionListener(this);
	}

	public static String getEncripted(String userPlainText){

		String result="";
		int stringlength = userPlainText.length();
		char character;
		int charKey=0;

		for (int i =0; i < stringlength; i++) {

			if(charKey >= Chain.length - 1) charKey=0;
			character = userPlainText.charAt(i);
			character += Chain[charKey];
			result += character;
			charKey++;
			
		}

		return result;
	}
	public static String getDecripted(String userCipherText){

		String result="";
		int stringlength = userCipherText.length();
		char character;
		int charKey=0;

		for (int i = 0; i < stringlength; i++) {

			if(charKey >= Chain.length - 1) charKey=0;
			character = userCipherText.charAt(i);
			character -= Chain[charKey];
			result += character;
			charKey++;
			
		}

		return result;
	}

	public void actionPerformed(ActionEvent e){
		Object source=e.getSource();

		if( source==btnEncription){
			
			userPlainText = textAreaPlainText0.getText();
			cipherText = getEncripted(userPlainText);
			textAreaCipherText0.setText(cipherText);
			//DataWriter.write(cipherText);

		}
		if (source==btnDecription) {
			
			userCipherText = textAreaCipherText1.getText();
			plainText = getDecripted(userCipherText);
			textAreaPlainText1.setText(plainText);
			//DataWriter.write(plainText);
		}
	}	
}