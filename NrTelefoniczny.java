package Telefon;

class NrTelefoniczny implements Comparable<NrTelefoniczny>{
  String NrKierunkowy;
  String NrTelefonu;

  public NrTelefoniczny(String a, String b)
  {
    NrKierunkowy=a;
    NrTelefonu=b;
  }
  public String wyswietl()
  {
    return NrKierunkowy+NrTelefonu;
  }
  public int compareTo(NrTelefoniczny nr)
  {
    int result=this.NrKierunkowy.compareTo(nr.NrKierunkowy);
    if(result==0)
    {
    	result=this.NrTelefonu.compareTo(nr.NrTelefonu);
    }
    return result;
  }
}