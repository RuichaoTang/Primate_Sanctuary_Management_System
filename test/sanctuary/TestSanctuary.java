package sanctuary;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class TestSanctuary {

    @org.junit.Test
    public void testMonkeyCreate(){
        // successfully create a monkey
        Monkeys mon1 = new Monkeys("Abby", Species.GUEREZA, Sex.MALE,56,66,4, Foods.FRUITS);
        assertEquals("Abby",mon1.getName());
        assertEquals(Species.GUEREZA,mon1.getSpecie());
        assertEquals(Sex.MALE,mon1.getSex());
        assertEquals(56,mon1.getSize());
        assertEquals(66,mon1.getWeight());
        assertEquals(4,mon1.getAge());
        assertEquals(Foods.FRUITS,mon1.getFavFood());
        assertFalse(mon1.getHealthy());

        // test exception when invalid monkey is attempted
        assertThrows(IllegalArgumentException.class, ()->new Monkeys("Bond",null,null,56,4,3,null));
        assertThrows(IllegalArgumentException.class, ()->new Monkeys("Apple",Species.SPIDER,Sex.MALE,-4,4,3,Foods.INSECT));

    }

    @org.junit.Test
    public void testMonkeyToIsolation(){
        // test monkey can be added to the isolation succcessfully
        Sanctuary sanc = new Sanctuary();
        Monkeys mon1 = new Monkeys("Abby",Species.GUEREZA,Sex.MALE,56,66,4,Foods.FRUITS);
        sanc.receiveNewMonkey(mon1);
        assertEquals("[Abby]", sanc.getIsolation().printAll());

        Monkeys mon2 = new Monkeys("Zbby",Species.GUEREZA,Sex.MALE,56,66,4,Foods.FRUITS);
        Monkeys mon3 = new Monkeys("Bbby",Species.GUEREZA,Sex.MALE,56,66,4,Foods.FRUITS);
        Monkeys mon4 = new Monkeys("Cbby",Species.GUEREZA,Sex.MALE,56,66,4,Foods.FRUITS);
        Monkeys mon5 = new Monkeys("Dbby",Species.GUEREZA,Sex.MALE,56,66,4,Foods.FRUITS);
        Monkeys mon6 = new Monkeys("Ebby",Species.GUEREZA,Sex.MALE,56,66,4,Foods.FRUITS);
        Monkeys mon7 = new Monkeys("Fbby",Species.GUEREZA,Sex.MALE,56,66,4,Foods.FRUITS);
        Monkeys mon8 = new Monkeys("Gbby",Species.GUEREZA,Sex.MALE,56,66,4,Foods.FRUITS);
        Monkeys mon9 = new Monkeys("Hbby",Species.GUEREZA,Sex.MALE,56,66,4,Foods.FRUITS);
        Monkeys mon10 = new Monkeys("Ibby",Species.GUEREZA,Sex.MALE,56,66,4,Foods.FRUITS);
        Monkeys mon11 = new Monkeys("Jbby",Species.GUEREZA,Sex.MALE,56,66,4,Foods.FRUITS);
        Monkeys mon12 = new Monkeys("Kbby",Species.GUEREZA,Sex.MALE,56,66,4,Foods.FRUITS);
        Monkeys mon13 = new Monkeys("Lbby",Species.GUEREZA,Sex.MALE,56,66,4,Foods.FRUITS);
        Monkeys mon14 = new Monkeys("Mbby",Species.GUEREZA,Sex.MALE,56,66,4,Foods.FRUITS);
        Monkeys mon15 = new Monkeys("Nbby",Species.GUEREZA,Sex.MALE,56,66,4,Foods.FRUITS);
        Monkeys mon16 = new Monkeys("Obby",Species.GUEREZA,Sex.MALE,56,66,4,Foods.FRUITS);
        Monkeys mon17 = new Monkeys("Pbby",Species.GUEREZA,Sex.MALE,56,66,4,Foods.FRUITS);
        Monkeys mon18 = new Monkeys("Qbby",Species.GUEREZA,Sex.MALE,56,66,4,Foods.FRUITS);
        Monkeys mon19 = new Monkeys("Rbby",Species.GUEREZA,Sex.MALE,56,66,4,Foods.FRUITS);
        Monkeys mon20 = new Monkeys("Sbby",Species.GUEREZA,Sex.MALE,56,66,4,Foods.FRUITS);
        sanc.receiveNewMonkey(mon2);
        sanc.receiveNewMonkey(mon3);
        sanc.receiveNewMonkey(mon4);
        sanc.receiveNewMonkey(mon5);
        sanc.receiveNewMonkey(mon6);
        sanc.receiveNewMonkey(mon7);
        sanc.receiveNewMonkey(mon8);
        sanc.receiveNewMonkey(mon9);
        sanc.receiveNewMonkey(mon10);
        sanc.receiveNewMonkey(mon11);
        sanc.receiveNewMonkey(mon12);
        sanc.receiveNewMonkey(mon13);
        sanc.receiveNewMonkey(mon14);
        sanc.receiveNewMonkey(mon15);
        sanc.receiveNewMonkey(mon16);
        sanc.receiveNewMonkey(mon17);
        sanc.receiveNewMonkey(mon18);
        sanc.receiveNewMonkey(mon19);
        sanc.receiveNewMonkey(mon20);
        // test successfully add 20 monkey into the isolation
        assertEquals("[Abby, Zbby, Bbby, Cbby, Dbby, Ebby, Fbby, Gbby, Hbby, Ibby, Jbby, Kbby, Lbby, Mbby, Nbby, Obby, Pbby, Qbby, Rbby, Sbby]", sanc.getIsolation().printAll());

        // test exception when adding the 21st monkey into the isolation
        Monkeys mon21 = new Monkeys("Ybby",Species.GUEREZA,Sex.MALE,56,66,4,Foods.FRUITS);
        assertThrows(IllegalArgumentException.class,() ->sanc.receiveNewMonkey(mon21) );

    }

    @org.junit.Test
    public void testMoveToEnclosure(){
        // test exception when moving an unhealthy monkey to the enclosure
        Sanctuary sanc = new Sanctuary();
        Monkeys mon1 = new Monkeys("Abby",Species.GUEREZA,Sex.MALE,56,66,4,Foods.FRUITS);
        sanc.receiveNewMonkey(mon1);
        assertThrows(IllegalArgumentException.class,()->sanc.moveToEnclosure(mon1));

        // test that a healthy monkey can be moved to the enclosure
        sanc.giveMedical(mon1);
        sanc.moveToEnclosure(mon1);
        assertEquals("[Name:Abby Sex:MALE Favourite Food:FRUITS]",sanc.getEnclosure(Species.GUEREZA).printAll());
    }

    @org.junit.Test
    public void testReportSpecies(){
        Sanctuary sanc = new Sanctuary();
        Monkeys mon1 = new Monkeys("Abby",Species.GUEREZA,Sex.MALE,56,66,4,Foods.FRUITS);
        // add a monkey into this sanctuary
        sanc.receiveNewMonkey(mon1);
        Monkeys mon2 = new Monkeys("Sandy",Species.GUEREZA,Sex.FEMALE,48,56,2,Foods.EGGS);
        sanc.receiveNewMonkey(mon2);
        Monkeys mon3 = new Monkeys("Brian",Species.HOWLER,Sex.MALE,38,26,1,Foods.SEEDS);
        sanc.receiveNewMonkey(mon3);
        Monkeys mon4 = new Monkeys("Yang",Species.SAKI,Sex.MALE,38,26,1,Foods.SEEDS);
        sanc.receiveNewMonkey(mon4);
        Set<Species> set1 = new HashSet<>();
        set1.add(Species.GUEREZA);
        set1.add(Species.HOWLER);
        set1.add(Species.SAKI);
        // test the species report is correct
        assertEquals(set1,sanc.reportSpecies());
    }

    @Test
    public void testListOfGivenEnclosure(){
        Sanctuary sanc = new Sanctuary();
        Monkeys mon1 = new Monkeys("Abby",Species.GUEREZA,Sex.MALE,56,66,4,Foods.FRUITS);
        // add a monkey into this sanctuary
        sanc.receiveNewMonkey(mon1);
        Monkeys mon2 = new Monkeys("Sandy",Species.GUEREZA,Sex.FEMALE,48,56,2,Foods.EGGS);
        sanc.receiveNewMonkey(mon2);
        Monkeys mon3 = new Monkeys("Brian",Species.HOWLER,Sex.MALE,38,26,1,Foods.SEEDS);
        sanc.receiveNewMonkey(mon3);

        // Move monkeys into the enclosures
        sanc.giveMedical(mon1);
        sanc.moveToEnclosure(mon1);
        sanc.giveMedical(mon2);
        sanc.moveToEnclosure(mon2);
        sanc.giveMedical(mon3);
        sanc.moveToEnclosure(mon3);

        // test list for given enclosures
        sanc.printMonkeysInEnclosure(Species.GUEREZA);
        assertEquals("[Name:Abby Sex:MALE Favourite Food:FRUITS, Name:Sandy Sex:FEMALE Favourite Food:EGGS]",sanc.printMonkeysInEnclosure(Species.GUEREZA));
        sanc.printMonkeysInEnclosure(Species.HOWLER);
        assertEquals("[Name:Brian Sex:MALE Favourite Food:SEEDS]",sanc.printMonkeysInEnclosure(Species.HOWLER));
        // when the enclosure is empty
        assertEquals("[]",sanc.printMonkeysInEnclosure(Species.SAKI));

    }

    @Test
    public void testNameOrder(){
        Sanctuary sanc = new Sanctuary();
        Monkeys mon1 = new Monkeys("Abby",Species.GUEREZA,Sex.MALE,56,66,4,Foods.FRUITS);
        Monkeys mon2 = new Monkeys("Zbby",Species.GUEREZA,Sex.MALE,56,66,4,Foods.FRUITS);
        Monkeys mon3 = new Monkeys("Bbby",Species.GUEREZA,Sex.MALE,56,66,4,Foods.FRUITS);
        Monkeys mon4 = new Monkeys("Cbby",Species.GUEREZA,Sex.MALE,56,66,4,Foods.FRUITS);
        Monkeys mon5 = new Monkeys("Dbby",Species.GUEREZA,Sex.MALE,56,66,4,Foods.FRUITS);
        Monkeys mon6 = new Monkeys("Ebby",Species.GUEREZA,Sex.MALE,56,66,4,Foods.FRUITS);
        Monkeys mon7 = new Monkeys("Fbby",Species.GUEREZA,Sex.MALE,56,66,4,Foods.FRUITS);
        Monkeys mon8 = new Monkeys("Gbby",Species.GUEREZA,Sex.MALE,56,66,4,Foods.FRUITS);
        Monkeys mon9 = new Monkeys("Hbby",Species.GUEREZA,Sex.MALE,56,66,4,Foods.FRUITS);
        Monkeys mon10 = new Monkeys("Ibby",Species.GUEREZA,Sex.MALE,56,66,4,Foods.FRUITS);
        Monkeys mon11 = new Monkeys("Jbby",Species.GUEREZA,Sex.MALE,56,66,4,Foods.FRUITS);
        Monkeys mon12 = new Monkeys("Kbby",Species.GUEREZA,Sex.MALE,56,66,4,Foods.FRUITS);
        Monkeys mon13 = new Monkeys("Lbby",Species.GUEREZA,Sex.MALE,56,66,4,Foods.FRUITS);
        Monkeys mon14 = new Monkeys("Mbby",Species.GUEREZA,Sex.MALE,56,66,4,Foods.FRUITS);
        Monkeys mon15 = new Monkeys("Nbby",Species.GUEREZA,Sex.MALE,56,66,4,Foods.FRUITS);
        Monkeys mon16 = new Monkeys("Obby",Species.GUEREZA,Sex.MALE,56,66,4,Foods.FRUITS);
        Monkeys mon17 = new Monkeys("Pbby",Species.GUEREZA,Sex.MALE,56,66,4,Foods.FRUITS);
        Monkeys mon18 = new Monkeys("Qbby",Species.GUEREZA,Sex.MALE,56,66,4,Foods.FRUITS);
        Monkeys mon19 = new Monkeys("Rbby",Species.GUEREZA,Sex.MALE,56,66,4,Foods.FRUITS);
        Monkeys mon20 = new Monkeys("Sbby",Species.GUEREZA,Sex.MALE,56,66,4,Foods.FRUITS);
        sanc.receiveNewMonkey(mon5);
        sanc.receiveNewMonkey(mon6);
        sanc.receiveNewMonkey(mon7);
        sanc.receiveNewMonkey(mon8);
        sanc.receiveNewMonkey(mon16);
        sanc.receiveNewMonkey(mon17);
        sanc.receiveNewMonkey(mon18);
        sanc.receiveNewMonkey(mon19);
        sanc.receiveNewMonkey(mon20);
        sanc.receiveNewMonkey(mon9);
        sanc.receiveNewMonkey(mon10);
        sanc.receiveNewMonkey(mon11);
        sanc.receiveNewMonkey(mon12);
        sanc.receiveNewMonkey(mon13);
        sanc.receiveNewMonkey(mon14);
        sanc.receiveNewMonkey(mon15);
        sanc.receiveNewMonkey(mon1);
        sanc.receiveNewMonkey(mon2);
        sanc.receiveNewMonkey(mon3);
        sanc.receiveNewMonkey(mon4);
        assertEquals("[Abby, Bbby, Cbby, Dbby, Ebby, Fbby, Gbby, Hbby, Ibby, Jbby, Kbby, Lbby, Mbby, Nbby, Obby, Pbby, Qbby, Rbby, Sbby, Zbby]",sanc.printAllMonkeys());
    }

}