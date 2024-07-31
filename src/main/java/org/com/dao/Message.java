package org.com.dao;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * @author batal
 * @Date 31.06.2024
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {
    private String role;
    private String content;//prompt

}
