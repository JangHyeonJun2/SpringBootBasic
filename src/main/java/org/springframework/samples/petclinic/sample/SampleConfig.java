package org.springframework.samples.petclinic.sample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SampleConfig {

	@Bean
	public SampleController sampleController() {
		System.out.println("SampleConfig.sampleController");
		return new SampleController();
	}
}
