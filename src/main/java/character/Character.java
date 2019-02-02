package character;

public abstract class Character {
  String name;
  int hp;
  int power;
  int agility;
  public abstract void attack();

  public String getName() {
    return this.name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getHp() {
    return this.hp;
  }
  public void setHp(int hp) {
    this.hp = hp;
  }
  public int getPower() {
    return this.power;
  }
  public void setPower(int power) {
    this.power = power;
  }
  public int getAgility() {
    return this.power;
  }
  public void setAgility(int agility) {
    this.agility = agility;
  }

}
