public class Main {
    public static void main(String[] args) {
        firstPlayer player1=new firstPlayer("vicky","Mp40",200);
       secondPlayer player2=new secondPlayer("yoga","mp5",200,true);
        System.out.println(player2);

        player1.hitByMp40();
        player1.hitByMp40();
        player1.hitmp40WithSkin();
        player2.hitmp40WithSkin();
        player2.hitmp40WithSkin();
        player2.hitByMp40();








    }
}