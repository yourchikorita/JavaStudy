package step1_10.whileEx; 

import java.util.Scanner;

public class DunjeonGame {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
 

        /* [던전게임]

         * 장소 : 마을 , 상점 , 던전

         * 마을 : 휴식 가능

         * 상점 : 무기 강화 가능

         * 던전 : 몬스터 잡기 가능 (사망하면 게임이 종료되고 데이터 사라짐)

         * 기본 HP = 100, 공격력 = 5

         * 닉네임 설정 가능

         */

        int HP = 100;
 

        int 공격력 = 5;


        System.out.println("[던전 게임]에 오신것을 환영합니다.");


        System.out.println("게임 내에서 사용할 닉네임을 입력하세요. (숫자만 가능합니다)");


        int name = scan.nextInt();

 

        System.out.println(name + "님 환영합니다.");

 

        System.out.println("==게임 설명==");

 

        System.out.println("[던전게임] 내에서는 마을, 상점, 던전이 있습니다.");

 

        System.out.println("{마을}에서는 체력을 회복할 수 있습니다.");

 

        System.out.println("{상점}에서는 무기를 강화하실 수 있습니다.");

 

        System.out.println("{던전}에서는 몬스터를 잡아서 돈을 벌 수 있습니다.");

 

        System.out.println("[주의] 만약 {던전}에서 사망하면 게임이 종료되고 데이터가 사라집니다.");

 

        System.out.println(" ");

 

        System.out.println("게임 시작");

 

        int start = 0;

 

        int place = 0;

 

        int place2 = 0;

 

        int money = 200;

 

        int 공격력2 = 1;

 

        while (start == 0) {

 

            System.out.println("어디로 이동하시겠습니까?");

 

            System.out.println("1. 마을");

 

            System.out.println("2. 상점");

 

            System.out.println("3. 던전");

 

            place = scan.nextInt();

 

            if (place < 1 || place > 3) {

 

                System.out.println("다시 선택해주세요.");

 

            }

 

            if (place == 1) {

 

                if (place2 == 1) {

 

                    System.out.println("이미 마을에 있습니다.");

 

                    System.out.println(" ");

 

                }else {

 

                    System.out.println("마을로 이동합니다.");

 

                    System.out.println(" ");

 

                    place2 = 1;

 

                    int a = 0;

 

                    while (a == 0) {

 

                        System.out.println("마을에 도착하였습니다.");

 

                        System.out.println(" ");

 

                        System.out.println("무엇을 하시겠습니까?");

 

                        System.out.println("1. 체력 회복");

 

                        System.out.println("2. 다른 곳으로 이동하기");

 

                        int village2 = scan.nextInt();

 

                        if (village2 == 1) {

 

                            if (HP == 100) {

 

                                System.out.println("이미 체력이 다 차있습니다.");

 

                                System.out.println(" ");

 

                            }else {

 

                                System.out.println("체력을 회복합니다.");

 

                                HP = 100;

 

                                System.out.println(" ");

 

                                System.out.println("체력이 회복되었습니다.");

 

                            }

 

                        }if (village2 == 2) {

 

                            a = 1;

 

                }if (village2 < 1 || village2 > 2) {

 

                            System.out.println("다시 선택해주세요.");

 

                        }

 

                    }

 

                }

 

            }if (place == 2) {

 

                if (place2 == 2) {

 

                    System.out.println("이미 상점에 있습니다.");

 

                    System.out.println(" ");

 

                }else {

 

                    int e = 0;

 

                    while (e == 0) {

 

                        place2 = 2;

 

                        System.out.println("상점에 도착하였습니다.");

 

                        System.out.println("무엇을 하시겠습니까?");

 

                        System.out.println("1. 무기 강화");

 

                        System.out.println("2. 다른 곳으로 이동하기");

 

                        int store = scan.nextInt();

 

                        if (store == 1) {

 

                            int p = 0;

 

                            while (p == 0) {

 

                                System.out.println("");

 

                                System.out.println("==메뉴==");

 

                                System.out.println("1. 무기 강화");

 

                                System.out.println("2. 뒤로 가기");

 

                                int choice = scan.nextInt();

 

                                if (choice > 2 || choice < 1) {

 

                                    System.out.println("다시 선택해주세요.");

 

                                }if (choice == 1) {

 

                                    if (공격력2 * 50 > money) {

 

                                        System.out.println("돈이 부족합니다.");

 

                                        System.out.println("던전에서 돈을 구해오세요.");

 

                                    }else {

 

                                        System.out.println("무기가 강화 되었습니다.");

 

                                        money = money - 공격력2 * 50;

 

                                        공격력 += 10;

 

                                        공격력2 += 1;

 

                                        System.out.println("공격력은 " + 공격력 + "이고, ");

 

                                        System.out.println("잔돈은 " + money + "코인 입니다.");

 

                                    }

 

                                }if (choice == 2) {

 

                                    p = 1;

 

                                }

 

                            

 

                            }

 

                        }

 

                        if (store == 2) {

 

                            e = 1;

 

                        }

 

                    }

 

                }

 

            }

 

            if (place == 3) {

 

                if (place2 == 3) {

 

                    System.out.println("이미 던전에 있습니다.");

 

                }else {

 

                    int t = 0;

 

                    while (t == 0) {

 

                    int enemyHP = 100;

 

                    place2 = 3;

 

                    System.out.println(" ");

 

                    System.out.println("던전에 도착하였습니다.");

 

                    System.out.println(" ");

 

                    System.out.println("무엇을 하시겠습니까?");

 

                    System.out.println("1. 몬스터 잡기.");

 

                    System.out.println("2. 다른 곳으로 이동하기.");

 

                    int fight = scan.nextInt();

 

                    if (fight > 2 || fight < 1) {

 

                        System.out.println("다시 선택해주세요.");

 

                    } if (fight == 1) {

 

                        while (enemyHP > 0) {

 

                        System.out.println("몬스터의 체력은 " + enemyHP + "남았습니다.");

 

                        System.out.println(" ");

 

                        enemyHP = enemyHP - 공격력;

 

                        }

 

                        System.out.println("몬스터를 잡았습니다.");

 

                        System.out.println("50 코인을 획득하였습니다.");

 

                        System.out.println("HP가 10 줄어들었습니다.");

 

                        HP = HP - 10;

 

                        System.out.println("HP는 " + HP + "남았습니다.");

 

                        money += 50;

 

                        if (HP <= 0) {

 

                            System.out.println("HP가 0이 되어서 사망하였습니다.");

 

                            System.out.println("데이터가 사라졌습니다.");

 

                            System.out.println("게임이 종료됩니다.");

 

                            t = 1;

 

                            start = 1;

 

                        }

 

                    } if (fight == 2) {

 

                        t = 1;

 

                    }

 

                }

 

            }

 

        }

 

    }

 

            

 

        

 

    }

 

 

 

}
