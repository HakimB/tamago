//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.23 at 06:50:34 PM CET 
//


package fr.lacl.tamago.aca.xmlterm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.lacl.tamago.aca.xmlterm package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Processus_QNAME = new QName("", "processus");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.lacl.tamago.aca.xmlterm
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Processus }
     * 
     */
    public Processus createProcessus() {
        return new Processus();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link Parstrong }
     * 
     */
    public Parstrong createParstrong() {
        return new Parstrong();
    }

    /**
     * Create an instance of {@link Permissions }
     * 
     */
    public Permissions createPermissions() {
        return new Permissions();
    }

    /**
     * Create an instance of {@link Atomic }
     * 
     */
    public Atomic createAtomic() {
        return new Atomic();
    }

    /**
     * Create an instance of {@link Org }
     * 
     */
    public Org createOrg() {
        return new Org();
    }

    /**
     * Create an instance of {@link Action }
     * 
     */
    public Action createAction() {
        return new Action();
    }

    /**
     * Create an instance of {@link Parweak }
     * 
     */
    public Parweak createParweak() {
        return new Parweak();
    }

    /**
     * Create an instance of {@link Obl }
     * 
     */
    public Obl createObl() {
        return new Obl();
    }

    /**
     * Create an instance of {@link Role }
     * 
     */
    public Role createRole() {
        return new Role();
    }

    /**
     * Create an instance of {@link Bans }
     * 
     */
    public Bans createBans() {
        return new Bans();
    }

    /**
     * Create an instance of {@link Term }
     * 
     */
    public Term createTerm() {
        return new Term();
    }

    /**
     * Create an instance of {@link Sod }
     * 
     */
    public Sod createSod() {
        return new Sod();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Processus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "processus")
    public JAXBElement<Processus> createProcessus(Processus value) {
        return new JAXBElement<Processus>(_Processus_QNAME, Processus.class, null, value);
    }

}
