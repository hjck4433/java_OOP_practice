package 에린마블;

import java.util.Scanner;

public class ErinnMarbleMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("캐릭터를 생성하시겠습니까? (yes/no) : ");
        String newPlayer = sc.next();
        Player player = new Player();
        if(newPlayer.equalsIgnoreCase("yes")) {
            player.setName();
            player.setGender();
            player.setRaces();
            player.setJobs();
            player.getInfo();
        }
        System.out.print("에린마블에 참여하시겠습니까? (yes/no) : ");
        String start = sc.next();
        if(start.equalsIgnoreCase("yes")) {
            Marble marble = new Marble(player);
            while(true) {
                // 주사위 던지기
                System.out.println("주사위 던지는 방법을 선택하실 수 있습니다. 1 ~ 6 선택 시 200~700골드가 차감됩니다. 랜덤은 100골드 차감됩니다.");
                System.out.print("[1] ~ [6] 또는 [7] 랜덤 선택 : ");
                int selN = sc.nextInt();
                marble.rollDice(selN);
                marble.getStatus();
                player.setGold(marble.getGold());
                if(marble.finishLine()) break;
                System.out.print("계속 하시겠습니까? (yes/no) : ");
                start = sc.next();
                if(start.equalsIgnoreCase("no")) {
                    marble.setIsGame(false);
                    break;
                }
            }
        }

    }
}
