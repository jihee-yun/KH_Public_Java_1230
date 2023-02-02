package 게임만들기;

public class GameThB extends Thread {
    private Character warrior;
    private Character wizard;

    public GameThB(Character warrior, Character wizard) {
        this.warrior = warrior;
        this.wizard = wizard;
    }

    @Override
    public void run() {
        int normal;  // 일반공격에 대한 확률 구하기
        int special; // 특수공격에 대한 확률 구하기
        boolean endGame = false; // 게임의 진행 여부를 판단하는 플래그
        while (true) {
            try {
                sleep(3300); // 게임의 진행 속도를 맞추기 위해
                normal = (int) (Math.random() * 2); // 0, 1의 값(확률 50%)
                special = (int) (Math.random() * 18); // 0 ~ 19의 값(확률 5%로 궁극기)
                if (normal == 1) {
                    System.out.println("물리공격 >> " + warrior.name + "에게 " +
                            wizard.pAttack() + "데미지를 입혔습니다.");
                    endGame = warrior.setDamage(wizard.pAttack());
                } else {
                    System.out.println("마법공격 >> " + warrior.name + "에게 " +
                            wizard.mAttack() + "데미지를 입혔습니다.");
                    endGame = warrior.setDamage(wizard.mAttack());
                }
                if (special == 10) { // 5% 확률로 궁극기 발동
                    System.out.println(wizard.name + "의 궁극기 발동!!!%$%##@$@$@#^%," +
                            warrior.name + "에게 " + wizard.ultimate() + "데미지를 입혔습니다.");
                    endGame = warrior.setDamage(wizard.ultimate());
                }
                if (endGame) System.exit(0);
            } catch (InterruptedException e) {

            }
        }
    }
}
