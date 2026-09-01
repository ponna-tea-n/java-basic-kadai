package kadai_018;

public class KatoExec_Chapter18 {

  public static void main(String[] args) {

    KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();
    taro.setGivenName();
    taro.execIntroduce();

    System.out.println();

    KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();
    ichiro.setGivenName();
    ichiro.execIntroduce();

    System.out.println();

    KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();
    hanako.setGivenName();
    hanako.execIntroduce();

    System.out.println();
  }

}
