package tamago.aca.bank;
/*
    
 ******************************************
 *             DepositService             *
 ******************************************
 *
 * DO NOT EDIT THIS FILE.
 * THIS FILE IS GENERATED AUTOMATICALLY BY TAMAGOCC
 * Created date : Thu Feb 23 23:47:02 CET 2012
 * authors : Hakim Belhaouari and Frederic Peschanski
 * site : http://code.google.com/p/tamago/

*/
public interface DepositService
    extends tamago.aca.core.ACASecurity, tamago.ext.tamagocc.TamagoCCService
{
    // Members Variables

    // Properties
    /**
        Getter of the property acaInitialised
    */
    public boolean getAcaInitialised();
    /**
        Setter of the property acaInitialised
    */
    public void setAcaInitialised(boolean acaInitialised);
    /**
        Getter of the property opNumber
    */
    public int getOpNumber();

    // Methods
    public void check(tamago.ext.aca2.ACA aca) throws tamago.TamagoException;


    public void validate_director(tamago.ext.aca2.ACA aca) throws tamago.TamagoException;


    public void validate(tamago.ext.aca2.ACA aca) throws tamago.TamagoException;


    public void init() throws tamago.TamagoException;


    public void deposit(tamago.ext.aca2.ACA aca) throws tamago.TamagoException;


    public void register(tamago.ext.aca2.ACA aca) throws tamago.TamagoException;


    public void cancel(tamago.ext.aca2.ACA aca) throws tamago.TamagoException;
}