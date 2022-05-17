package Telefon;

class Firma extends Wpis{
  String nazwa;
  public Firma(String n, String a, String b, String u)
  {
    nazwa=n;
    telefon=new NrTelefoniczny(a,b);
    ulica=u;
  }
  public void opis()
  {
    System.out.println(nazwa);
    System.out.println(telefon.wyswietl());
    System.out.println(ulica+"\n");
  }
}