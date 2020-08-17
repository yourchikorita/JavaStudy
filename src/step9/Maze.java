package step9;

import java.util.Vector;

class Node{
	int x = -1;
	int y = -1;
	int dir = 0; //"북 , 동 , 남 , 서"
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getDir() {
		return dir;
	}
	public void setDir(int dir) {
		this.dir = dir;
	}
	
	
}


public class Maze {

	public static void main(String[] args) {
		// 아래 와 같은 미로가 있다. 0 == 길 , 1 == 벽 2 == 시작 ,  3 == 도착 
				// 2가 3까지 도착하면 도착지 출력 
				// 힌트 : 
				// 1. 시작 위치를 노드로 생성후  배열에 저장 		
				// 2. 현재 위치를 지나온길로 체크한다. 
				// 3. 북 동 남 서  : 현재위치에서 4방향으로 검사를 한다.(새로운길찾기) 
				// 4. 3번의 과정에서 갈수있는 길을 발견하면  새로운 노드를 만들고 위치를 저장후 배열에 저장 
				// 5. 방향 검사가 다끝나면 배열에서 삭제 
				// 6. 도착이면 종료 
				// 7. 배열에서 새로은 길을 꺼내서 2~6반복 
				
				final int MAPSIZE  = 5;
				final int NORTH = 0;
				final int EAST = 1;
				final int SOUTH = 2;
				final int WEST = 3;		
				final int NONE = 4;
				int map[][] = {
						{1,2,0,0,1},
						{1,1,0,1,1},
						{0,1,0,0,0},
						{0,0,0,1,1},
						{3,1,0,0,0}
				};
				int mark[][] = new int[MAPSIZE][MAPSIZE];					
				Vector<Node> nodeList = new Vector<>();		//지나온 흔적
				Node node = new Node();		
				
				for(int i = 0; i < MAPSIZE; i++) {
					for(int j = 0; j < MAPSIZE; j++) {
						if(map[i][j] == 2) {
							node.y = i;
							node.x = j;
							node.dir = 0;
						}
					}
				}
				nodeList.add(node);//출구
				
				//show
				for(Node n : nodeList) {
					System.out.print(n.getY()+","+n.getX()+"@");
				}
				System.out.println();
		
				boolean run = true;
				while(run) {
					if(nodeList.size() == 0) {//map에 2가 없다면
						System.out.println("출구가 없습니다. ");
						run = false;
						break;
					}
					node = nodeList.get(0);	
					mark[node.y][node.x] = 1;
					System.out.println("===========================");
					while(true) {						
						if(node.dir >= NONE) {
							nodeList.remove(0);
							break;
						}				
						int yy = node.y;
						int xx = node.x;
						if(node.dir == NORTH) {
							yy = node.y - 1;
						}else if(node.dir == EAST) {
							xx = node.x + 1;
						}else if(node.dir == SOUTH) {
							yy = node.y + 1;
						}else if(node.dir == WEST) {
							xx = node.x - 1;
						}		
						node.dir += 1;
						if(yy < 0 || yy >= MAPSIZE || xx < 0 || xx >= MAPSIZE) {
							continue;
						}else if(mark[yy][xx] == 1) {
							continue;
						}else if(mark[yy][xx] == 0 && map[yy][xx] == 0) {			
							System.out.println(yy + " " + xx);					
							Node newNode = new Node();
							newNode.dir = NORTH;
							newNode.y = yy;
							newNode.x = xx;
							nodeList.add(newNode);					
						}
						else if(map[yy][xx] == 3) {
							System.out.println("도착점 : " + yy + " " + xx);		
							run = false;	
						}
					}						
				}		

	}

}
