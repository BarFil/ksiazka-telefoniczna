package Telefon;

class Osoba extends Wpis{
  String imie;
  String nazwisko;
  public Osoba(String i,String n, String a, String b, String u)
  {
    imie=i;
    nazwisko=n;
    telefon=new NrTelefoniczny(a,b);
	ulica = u;
  }
  public void opis()
  {
    System.out.print(imie+" ");
    System.out.println(nazwisko);
    System.out.println(telefon.wyswietl());
    System.out.println(ulica+"\n");
  }
}