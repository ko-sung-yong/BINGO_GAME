package project;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		System.out.println("### ���α׷��� �⺻ȯ���� �����մϴ� ###");
	      Scanner scanner=new Scanner(System.in);
	      
	      System.out.print("Bingo ũ��>");
	      int Bingo_Size=scanner.nextInt();
	      
	      System.out.print("Player �� >");
	      int play_number=scanner.nextInt();
	      
	      System.out.print("Bingo �¸�����>");
	      int Bingo_win=scanner.nextInt();
	      
	      System.out.print("Bingo ����Ƚ��>");
	      int Game=scanner.nextInt();
	      
	      players people = new players();
	      people.game(play_number,Bingo_Size,Game, Bingo_win);

	}
}
