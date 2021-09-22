import app.config.AppConfig;
import app.model.AnimalsCage;
import app.model.Timer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class MainTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void mainTest() {
        Timer timer = new Timer();
        long time = 0;
        for (int i = 0; i < 5; i++) {
            AnimalsCage bean =
                    applicationContext.getBean(AnimalsCage.class);
            if (i == 0) {
                time = timer.getTime();
                continue;
            }
            Assert.assertEquals("Тест провален, не корректная реализация бинов.", time, timer.getTime().longValue());
            System.out.println(time);
        }
    }
}
