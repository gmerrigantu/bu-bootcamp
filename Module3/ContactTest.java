import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach; 
 
public class ContactTest { 

  Contact c;

  @BeforeEach
  void setup() {
    c = new Contact("Ada Lovelace", "+1 617 555 0101");
  }
 
  @Test 
  void constructor_setsNameCorrectly() { 
     
    assertEquals("Ada Lovelace", c.getName()); 
  } 
 
  @Test
  void constructor_setsPhoneCorrectly() { 
    assertEquals("+1 617 555 0101", c.getPhone()); 
  } 
 
  @Test
  void getName_returnsExactString_notTransformed() { 
    assertEquals("Ada Lovelace", c.getName());
  } 
 
  @Test
  void toString_containsName() { 
    assertTrue(c.toString().contains("Ada "));
  } 
 
  @Test
  void toString_containsPhone() {
    assertTrue(c.toString().contains("555"));
  }

  @Test
  void twoContacts_withSameName_areIndependentObjects() {
    Contact other = new Contact("Ada Lovelace", "+1 617 555 0202");

    other.setPhone("+1 555 000 0000");

    assertEquals("Ada Lovelace", c.getName());
    assertEquals("+1 617 555 0101", c.getPhone());
    assertEquals("+1 555 000 0000", other.getPhone());
  }

  @Test
  void setName_onOneContact_doesNotAffectAnotherContact() {
    Contact other = new Contact("Ada Lovelace", "+1 617 555 0202");

    other.setName("Grace Hopper");

    assertEquals("Ada Lovelace", c.getName());
    assertEquals("Grace Hopper", other.getName());
  }
} 