package character;

public abstract class CharacterService {
  public CharacterService() {
    Human fighter = new Human();
    Human robber = new Human();
    Enemy mob = new Enemy();
    Enemy boss = new Enemy();

    fighter.setName("ふぁいたー");
    fighter.setHp(5000);
    fighter.setPower(5000);
    fighter.setAgility(5000);
    abRoller.setName("腹筋ローラー");
    abRoller.setPrice(1000);
    itemlist.add(abRoller);
    dumbbell.setName("ダンベル");
    dumbbell.setPrice(7000);
    itemlist.add(dumbbell);
    mat.setName("ヨガマット");
    mat.setPrice(2500);
    itemlist.add(mat);

  }


}
