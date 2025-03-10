package com.vanitha.github_actions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.Matchers.containsString;
import org.junit.jupiter.api.Test;

@ExtendWith(SpringExtension.class)
@WebMvcTest(HelloWorldController.class)
class GithubActionsApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void checkSuccessMessage() throws Exception
	{
		this.mockMvc
				.perform(get("/"))
				.andExpect(status().isOk())
				.andExpect(content().string(
						containsString("Yaay!! you did it XD")));
	}

}
