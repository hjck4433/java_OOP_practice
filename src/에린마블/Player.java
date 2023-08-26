package 에린마블;

import java.util.Scanner;

public class Player {
    private String name;
    private char gender;
    private int races;
    private int jobs;
    private int gold;
    private int abilityPoint;
    private int fire;
    private int iceFire;
    private Scanner sc = new Scanner(System.in);

    Player() {
        gold = 60000;
        abilityPoint = 0;
        fire = 0;
        iceFire = 0;
    }

    public void setName() {
        System.out.print("캐릭터의 이름을 지어 주세요 : ");
        name = sc.next();
    }
    public void setGender() {
        System.out.print("성별을 골라 주세요 (M/F) : ");
        gender = sc.next().charAt(0);
    }
    public void setRaces() {
        System.out.print("종족을  선택 하세요 [1]인간 [2]엘프 [3]자이언트 : ");
        races = sc.nextInt();
    }
    public void setJobs() {
        System.out.print("직업을 선택 하세요 [1]엘레멘탈 나이트 [2]세인트 바드 [3]다크 메이지 [4]알케믹 스팅어 [5] 랜덤 : ");
        jobs = sc.nextInt();
        if(races ==3) {
            if(jobs== 5) jobs = (int)(Math.random() * 3)+1;
            else if( jobs == 4) {
                while(true) {
                    System.out.println("자이언트는 알케믹 스팅어를 선택 할 수 없습니다.");
                    System.out.print("직업을 다시 선택 하세요 : ");
                    jobs = sc.nextInt();
                    if(jobs != 4) break;
                }
                if(jobs== 5) jobs = (int)(Math.random() * 3)+1;
            }
        }else if(jobs == 5) jobs = (int)(Math.random() * 4)+1;

    }
    public void setGold(int gold) {
        this.gold = gold;
    }
    public void setAbilityPoint(int ap) {
        abilityPoint = ap;
    }
    public void setFire(int fire) {
        this.fire = fire;
    }
    public void setIceFire(int iceFire) {
        this.iceFire = iceFire;
    }
    public String getName() {
        return name;
    }
    public int getGold() {
        return gold;
    }
    public int getAbilityPoint() {
        return abilityPoint;
    }
    public int getFire() {
        return fire;
    }
    public int getIceFire() {
        return iceFire;
    }
    public void getInfo() {
        String[] race = {"", "인간","엘프","자이언트"};
        String[] job = {"", "엘레멘탈 나이트","세인트 바드", "다크 메이지", "알케믹 스팅어"};
        System.out.println("=".repeat(7) + "캐릭터 정보" + "=".repeat(7));
        System.out.println("이름 : " + name);
        System.out.println("성별 : " + gender);
        System.out.println("종족 : " + race[races]);
        System.out.println("직업 : " + job[jobs]);
        System.out.printf("골드 : %d / AP : %d / 불타래 : %d / 얼어붙은 불타래 : %d \n",gold,abilityPoint,fire,iceFire);
    }
}
