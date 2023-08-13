public class secondPlayer extends firstPlayer{
    private int hp;
    private boolean vest;
    public secondPlayer(String name, String gun, int hp,boolean vest) {
        super(name, gun, hp);
        this.hp=hp;
        this.vest = vest;
    }
    @Override
    public void hitByMp40() {

        if(vest){
             this.hp -=40;
             System.out.println(getName()+" player loss 40 ."+ " current hp is "+ this.hp);
         }
        if(!vest){
            this.hp-=60;
            System.out.println(getName()+" player loss hp 60. "+" current hp is "+this.hp);
        }
        if (this.hp<=0){
            this.hp=0;
            System.out.println("player is dead ......");
        }
    }

    @Override
    public void hitmp40WithSkin() {
        if(vest){
            this.hp -=50;
            System.out.println(getName()+" player loss 50 ."+ " current hp is "+ this.hp);
        }
        if(!vest){
            this.hp-=80;
            System.out.println(getName()+" player loss hp 70. "+" current hp is "+this.hp);
        }
        if (this.hp<=0){
            this.hp=0;
            System.out.println("player is dead ......");
        }
    }
}