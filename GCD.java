public class GCD{
  private int a;
  private int b;

  public GCD(int aa, int bb){
    a=aa;
    b=bb;
  }
  public GCD(){
    a=1;
    b=1;
  }

  public int recurse(){
    if(b==0)return a;
      else return (recurse(b, a%b));
  }
}