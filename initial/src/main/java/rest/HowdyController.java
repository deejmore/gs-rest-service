package rest;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HowdyController {


		private static final String template = "Howdy? %s!";
		private final AtomicLong counter = new AtomicLong();

		@RequestMapping("/howdy")
		public Howdy howdy(@RequestParam(value = "name", defaultValue = "mate") String name) {
			return new Howdy(counter.incrementAndGet(),String.format(template, name));
		}
	

}
