public class Calentador
{
   private int Temperatura;
   
   public Calentador()
   {
       Temperatura=15;
   }
   
   public int calentar()
   {
       Temperatura=Temperatura+5;
       
       return Temperatura;
   }
   
   public int enfriar ()
   {
       Temperatura=Temperatura-5;
       
       return Temperatura;
   }
   
   
}