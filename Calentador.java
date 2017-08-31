/**
 * @author Omar navarro
 */
public class Calentador
{
   private int Temperatura;//valor de la temperatura del calentador.
   private int max;//valor maximo al que puede llegar el calentador.
   private int min;//valor minimo al que puede llegar el calentador.
   private int incremento;//valor del incremento de el metodo calentar y enfriar.
   
   /**
    * Es el constructor de objeto calentador que se incializa en 15.
    * asi como las variables de min y max, toman valor de que le da el usuario.
    */
   public Calentador(int max,int min)
   {
       this.max=max;
       this.min=min;
       Temperatura=15;
       incremento=0;
   }
   
   /**
    * Esta funcion @return regresa la temperatura aumentando en 5 grados
    * mientras no sobrepase el valor de max que antes se le pidio a el usuario.
    */
   public int calentar()
   {
       if (Temperatura<=max)
       {
          Temperatura=Temperatura+incremento;
          return Temperatura;
       }
       return 0;
   }
   
   /**
    * esta funcion @return regresa la temperatura pero decrementando en 5
    * sin que se decremente mas que el minimo que dio el usuario.
    */
   public int enfriar ()
   {
       if (Temperatura>=min)
       {
           Temperatura=Temperatura-incremento;
           return Temperatura;
       }
       return 0;
   }
  
   /**
    * este metodo va a modificar el incremento para que el usuario tenga mayor control sobre el calentador.
    */
   public int modificIncre(int modificado)
   {
       if(modificado>=1)
       {
           incremento=modificado;
       
           return incremento;
        }
        return 0;
   }
   
}