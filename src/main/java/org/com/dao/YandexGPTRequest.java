package org.com.dao;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
/**
 * @author batal
 * @Date 31.06.2024
 */


@Data
public class YandexGPTRequest {

    private String model;
    private List<Message> messages;

    public YandexGPTRequest(String model, String prompt) {
        this.model = model;
        this.messages = new ArrayList<>();
        this.messages.add(new Message("user",prompt));
    }
}
