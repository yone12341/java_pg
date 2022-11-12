package design_pattern.Memento;

public class Main {
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();
        for(int i = 0; i < 100; i++){
            System.out.println("===" + i);
            System.out.println("現状：" + gamer);

            gamer.bet();

            System.out.println("所持金は" + gamer.getMoney() + "円になりました");

            if(gamer.getMoney() > memento.getMoney()){
                System.out.println("　所持金が増えたので現在の状態を保存");
                memento = gamer.createMemento();
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("所持金が減ったので、以前の状態に戻す");
                gamer.restoreMemento(memento);
            }

            try {
                Thread.sleep(10);
            } catch (InterruptedException e){

            }

            System.out.println("");

        }
    }
}
