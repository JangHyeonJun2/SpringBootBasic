package org.springframework.samples.petclinic.sample;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
class SampleControllerTest {

//	AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SampleConfig.class);
	@Autowired
	ApplicationContext ac;



	@Test
	public void testDI() {
		SampleController bean = ac.getBean(SampleController.class);
		assertThat(bean).isNotNull();
	}


}
