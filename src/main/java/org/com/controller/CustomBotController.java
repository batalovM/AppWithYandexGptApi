package org.com.controller;

import org.com.dao.YandexGPTRequest;
import org.com.dao.YandexGptResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
/**
 * @author batal
 * @Date 31.06.2024
 */
@RestController
@RequestMapping("/bot")
public class CustomBotController {
    @Value("${openai.model}")
    private String model;

    @Value(("${openai.api.url}"))
    private String apiURL;

    @Autowired
    private RestTemplate template;

    @GetMapping("/chat")
    public String chat(@RequestParam("prompt") String prompt){
        YandexGPTRequest request=new YandexGPTRequest(model, prompt);
        YandexGptResponse yaGptResponse = template.postForObject(apiURL, request, YandexGptResponse.class);
        return yaGptResponse.getResponseText();
    }
}
