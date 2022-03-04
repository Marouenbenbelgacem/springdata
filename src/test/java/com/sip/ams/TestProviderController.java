package com.sip.ams;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.io.ObjectInputStream.GetField;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.sip.ams.controllers.ProviderController;

@WebMvcTest
public class TestProviderController {
	@Autowired
	private MockMvc mockMvc;

//	@Autowired
	//private ProviderController providerController;

	@Test
	public void test1Provider() throws Exception {

		this.mockMvc.perform(get("http://127.0.0.1:85/provider/list")).andExpect(status().isOk())
				.andExpect(content().string(containsString("Finland")));
	}

	/*
	 * @Test public void test2() throws Exception {
	 * this.mockMvc.perform(get("127.0.0.1:85/provider/list")).andDo(print()).
	 * andExpect(status().isOk())
	 * .andExpect(content().string(containsString("Hello, World"))); }
	 */
}
