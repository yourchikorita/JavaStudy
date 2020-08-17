package step8.thread;
/**
 * 
 * sleep()의 매개값에는 얼마 동안 일시 정지 상태로 있을 것인지, 
 * 밀리세컨드(1/1000) 단위로 시간을 주면 됩니다. 
 * 예를 들어, Thread.sleep(3000)이면,
 *  해당 스레드는 3초가 경과할 동안 일시 정지 상태로 있게 됩니다.
 * 
 * @author EJ
 *
 */
class BGMPlay extends Thread {
	boolean play = true;

	@Override
	public void run() {

		while (play) {
			System.out.println("배경 음악이 연주되는중.....");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

public class GamePlay {

	public static void main(String[] args) {
		BGMPlay bgmPlay = new BGMPlay();

		
		bgmPlay.start();
		
		for(int i=1 ; i<=10 ; i++) {
			System.out.println("신나게 게임을 하는 중.....");
			if(i == 8) {//8초때 실행
				System.out.println("앗... 엄마다!!!");
				System.out.println("엄마가 오셔서 게임을 종료합니다. ㅜㅜ");

                bgmPlay.play = false;
				break;
			}
			try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
		}
		


	}

}
