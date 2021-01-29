package animeCharacterQuery;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class listPage extends JFrame {

	private JPanel contentPane;
	private JTextField searchWord;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					listPage frame = new listPage();
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
	public listPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		searchWord = new JTextField();
		searchWord.setBounds(40, 40, 400, 35);
		contentPane.add(searchWord);
		searchWord.setColumns(10);
		
		JList characterInfo = new JList();
		characterInfo.setBounds(40, 132, 400, 590);
		contentPane.add(characterInfo);
		
		JScrollPane scrollCharacterInfo = new JScrollPane();
		scrollCharacterInfo.setBounds(38, 132, 402, 590);
		contentPane.add(scrollCharacterInfo);
		
		JButton searchButton = new JButton("search");
		searchButton.setBackground(Color.WHITE);
		searchButton.setFont(new Font("Courier", Font.PLAIN, 14));
		searchButton.setBounds(452, 40, 149, 35);
		contentPane.add(searchButton);
		
		JLabel sortingMech = new JLabel("sorting mechanism");
		sortingMech.setFont(new Font("Courier", Font.PLAIN, 14));
		sortingMech.setBounds(452, 132, 149, 35);
		contentPane.add(sortingMech);
		
		JButton setSort = new JButton("sort");
		setSort.setFont(new Font("Courier", Font.PLAIN, 14));
		setSort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		setSort.setBounds(452, 179, 149, 35);
		contentPane.add(setSort);
		
		JLabel searchSuggestion = new JLabel("Most Searched/Recent Search");
		searchSuggestion.setFont(new Font("Courier", Font.PLAIN, 14));
		searchSuggestion.setBounds(40, 87, 400, 33);
		contentPane.add(searchSuggestion);
	}
}