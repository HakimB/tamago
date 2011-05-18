package tamago.aca;
/*
    
 ******************************************
 *              VBanqueComp              *
 ******************************************
 *
 * DO NOT EDIT THIS FILE.
 * THIS FILE IS GENERATED AUTOMATICALLY BY TAMAGOCC
 * Created date : Mon Feb 14 14:41:50 CET 2011
 * authors : Hakim Belhaouari and Frederic Peschanski
 * site : http://www-poleia.lip6.fr/~belhaouari/Tamago/

*/
public interface VBanqueCompContainer
    extends tamago.aca.VBanqueComp, tamago.ext.tamagocc.TamagoCCContainer
{
    // Members Variables

    // Properties
    /**
        Getter of the property temp
    */
    public int getTemp();
    /**
        Getter of the property balance
    */
    public int getBalance();

    // Methods
    public void modify(tamago.ext.aca.Quad quad) throws tamago.TamagoException;


    public void deposit(tamago.ext.aca.Quad quad) throws tamago.TamagoException;


    public void validate(tamago.ext.aca.Quad quad) throws tamago.TamagoException;
}