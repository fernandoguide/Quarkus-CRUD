package br.com.fernandoguide;

import br.com.fernandoguide.entity.Produto;
import com.github.database.rider.cdi.api.DBRider;
import com.github.database.rider.core.api.dataset.DataSet;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.junit.QuarkusTest;

@DBRider
@QuarkusTest
@QuarkusTestResource(DatabaseLifecycle.class)
public class ProdutoTest {

    @Test
    @DataSet("produtos1.yml")
    public void testUm() {
        Assert.assertEquals(1, Produto.count());
    }

}