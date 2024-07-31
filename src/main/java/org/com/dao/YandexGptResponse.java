package org.com.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author batal
 * @Date 31.06.2024
 */
public class YandexGptResponse {
    private List<Choice> choices;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Choice {
        private String text;
    }
    public String getResponseText() {
        return choices != null && !choices.isEmpty() ? choices.get(0).getText() : "";
    }
}
