public class firstPlayer {
    private String name;
    private String gun;
    private int hp;
    public firstPlayer(String name, String gun, int hp) {
        this.name = name;
        this.gun = gun;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGun() {
        return gun;
    }

    public void setGun(String gun) {
        this.gun = gun;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }



    @Override
    public String toString() {
        return "firstPlayer{" +
                "name='" + name + '\'' +
                ", gun='" + gun + '\'' +
                ", hp=" + hp +
                '}';
    }
    public void hitByMp40(){
        this.hp -=60;
        if(this.hp<=0){
            this.hp=0;
            System.out.println(getName()+" player is dead " + this.hp);
        }
         else System.out.println(getName()+" player loss hp 60 . the current hp is "+ this.hp);


    }
    public void hitmp40WithSkin(){
        this.hp -=80;
        if (this.hp<=0){
            this.hp=0;
            System.out.println("player is dead "+this.hp);
        }
        else System.out.println(getName()+" player loss hp 80 . the current hp is "+ this.hp);

    }
}

