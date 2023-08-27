package 에린마블;

public class Marble {
    private String name;
    private boolean isGame;
    private int dice;
    private int boardNum;
    private final int ENDNUM = 32;
    Marble(Player p) {
        name = p.getName();
        System.out.println(name + "님 에린마블을 시작합니다.");
        isGame = true;
        boardNum = 0;
    }
    public void setIsGame(boolean isGame) { // 보드게임 진행 여부 결정
        this.isGame = isGame;
    }
    public boolean isGame() { // 보드게임이 진행되는지 확인
        return isGame;
    }
    public void getStatus(Player p) {
        System.out.printf("골드 : %d / AP : %d / 불타래 : %d / 얼어붙은 불타래 : %d \n",p.getGold(),p.getAbilityPoint(),p.getFire(),p.getIceFire());
    }
    public void rollDice(int selN, Player p) { // 주사위를 선택해서 돌리는 경우
        if(selN == 7) {
            System.out.println("100골드가 차감 됩니다");
            p.setGold (-100);
            dice = (int)(Math.random() * 6) + 1;
        }else {
            dice = selN;
            System.out.println((dice + 1) + "00골드가 차감 됩니다");
            p.setGold (-(dice + 1) * 100);
        }
        movePlayer();
        checkGift(p);
    }
    public void movePlayer() { // 주사위 수 만큼 이동
        boardNum += dice;
        System.out.println(dice + "이/가 나왔습니다!");
        if(boardNum >= 32) System.out.println("시작지점으로 돌아왔습니다!");
        else System.out.println(dice + "만큼 이동합니다. 현재 위치는 " + boardNum + "입니다.");
    }
    public void checkGift(Player p) {
        if(boardNum == 9 || boardNum == 16 || boardNum ==25){
            System.out.println(name + "은/는 선물상자를 발견했다!!!!");
            int giftNum = (int) (Math.random() * 4) + 1;
            switch(giftNum) {
                case 1:
                    System.out.println("불타래 10개 획득!");
                    p.setFire(10);
                    break;
                case 2:
                    System.out.println("10000골드 획득!");
                    p.setGold(10000);
                    break;
                case 3:
                    System.out.println("얼어붙은 불타래 1개 획득!");
                    p.setIceFire(1);
                    break;
                case 4:
                    System.out.println("AP 10 획득!");
                    p.setAbilityPoint(10);
                    break;
            }
        }
    }
    public boolean finishLine() {
        if(boardNum >= ENDNUM) {
            System.out.println("한 바퀴 일주해서 피곤하네요. 내일 다시 여행해요. zzz");
            isGame = false;
            boardNum = 0;
            return true;
        }
        return false;
    }

}
