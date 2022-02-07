package project;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		System.out.println("### 프로그램의 기본환경을 설정합니다 ###");
	      Scanner scanner=new Scanner(System.in);
	      
	      System.out.print("Bingo 크기>");
	      int Bingo_Size=scanner.nextInt();
	      
	      System.out.print("Player 수 >");
	      int play_number=scanner.nextInt();
	      
	      System.out.print("Bingo 승리기준>");
	      int Bingo_win=scanner.nextInt();
	      
	      System.out.print("Bingo 게임횟수>");
	      int Game=scanner.nextInt();
	      
	      players people = new players();
	      people.game(play_number,Bingo_Size,Game, Bingo_win);

	}
}
