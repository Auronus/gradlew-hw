import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.UUID;

public class EntityTest {

    @Test
    public void testNullId() {
        MyEntity myEntity = new MyEntity("testEntity");
        Assertions.assertNull(myEntity.getId());
    }
    @Test
    public void testSetId() {
        MyEntity myEntity = new MyEntity("testEntity");
        UUID id = UUID.randomUUID();
        myEntity.setId(id);

        Assertions.assertNull(myEntity.getId());
        Assertions.assertSame(id, myEntity.getId());
    }

    @Test
    public void testSetName() {
        String testName = "testEntity";
        MyEntity myEntity = new MyEntity(testName);
        Assertions.assertSame(testName, myEntity.getName());
    }
}
