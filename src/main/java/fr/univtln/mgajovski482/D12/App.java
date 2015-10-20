package fr.univtln.mgajovski482.D12;

import fr.univtln.mgajovski482.D12.Reservable.Equipment.AbstractEquipment;
import fr.univtln.mgajovski482.D12.Reservable.Equipment.Factory.EquipmentFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EquipmentFactory.createEquipments(100, 100);

        System.out.println(AbstractEquipment.getStaticEquipments().toString());


    }
}
