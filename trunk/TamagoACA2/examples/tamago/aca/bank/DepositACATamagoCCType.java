package tamago.aca.bank;
import tamago.ext.tamagocc.TamagoCCType;
import tamago.ext.tamagocc.TamagoCCPercolator;
/*
    
 ******************************************
 *               DepositACA               *
 ******************************************
 *
 * DO NOT EDIT THIS FILE.
 * THIS FILE IS GENERATED AUTOMATICALLY BY TAMAGOCC
 * Created date : Sun Feb 19 21:04:45 CET 2012
 * authors : Hakim Belhaouari and Frederic Peschanski
 * site : http://www-poleia.lip6.fr/~belhaouari/Tamago/

*/
public class DepositACATamagoCCType
    implements tamago.ext.tamagocc.TamagoCCType
{
    // Members Variables

    // Properties

    // Methods
    public DepositACATamagoCCType ()
    {
    }


    /**
        Return the name of the entity
    */
    public String getName(){
        return "DepositACATamagoCCType";
    }


    public String getModule(){
        return "tamago.aca.bank";
    }


    /**
        Return the class of the service
    */
    public Class getImplementation(){
        return null;
    }


    public boolean isSuperType(TamagoCCType service){
        return service.isSubType(this);
    }


    public boolean isStrictSuperType(TamagoCCType service){
        return service.isStrictSubType(this);
    }


    public boolean isSubType(TamagoCCType service){
        java.util.Iterator iextends = getExtends();
        while(iextends.hasNext()) {
            TamagoCCType serv = ((TamagoCCType) iextends.next());
            if((serv.isSameType(service) || serv.isSubType(service))) {
                return true;
            }
        }return false;
    }


    public boolean isStrictSubType(TamagoCCType service){
        java.util.Iterator iextends = getExtends();
        while(iextends.hasNext()) {
            TamagoCCType serv = ((TamagoCCType) iextends.next());
            if((serv.isSameType(service) || serv.isSubType(service))) {
                return true;
            }
        }return false;
    }


    public boolean isSameType(TamagoCCType service){
        String name = getName();
        String module = getModule();
        return (module.equals(service.getModule()) && name.equals(service.getName()));
    }


    public java.util.Iterator getExtends(){
        java.util.ArrayList list = new java.util.ArrayList();
        return list.iterator();
    }


    public int getTamagoCCType(){
        return TYPE_COMPONENT;
    }


    public TamagoCCPercolator[] getAvailablePercolator(){
        TamagoCCPercolator[] renvoie = new TamagoCCPercolator[1];
        renvoie[0] = new TamagoCCPercolator("plugin");
        return renvoie;
    }
}