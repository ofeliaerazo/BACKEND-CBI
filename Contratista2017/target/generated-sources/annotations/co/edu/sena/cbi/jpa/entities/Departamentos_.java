package co.edu.sena.cbi.jpa.entities;

import co.edu.sena.cbi.jpa.entities.Ciudades;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-06T08:36:44")
@StaticMetamodel(Departamentos.class)
public class Departamentos_ { 

    public static volatile SingularAttribute<Departamentos, String> id;
    public static volatile ListAttribute<Departamentos, Ciudades> ciudadesList;
    public static volatile SingularAttribute<Departamentos, String> nombre;

}