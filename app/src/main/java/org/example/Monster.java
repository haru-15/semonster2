
import java.util.Random;

public class Monster {
  String name;
  int rare;// 1:normal,2:uncommon,3:rare,4:ultra rare

  public static void Monster(int number) {
    this.name = this.summonMonster(number);
    this.rare = number;
  }

  String summonMonster(int mnumber) {
    String monsters[] = { "スライム", "サハギン", "ドラゴン", "デュラハン", "シーサーペント" };
    return monsters[mnumber];
  }

  @Override
  public String toString() {

    return this.name + ":レア度[" + this.rare + "]";
  }
}
