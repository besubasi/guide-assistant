package tr.com.subasi.guideassistant.common.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponse<T> implements Serializable {

    T data;
    List<MessageModel> messageList;

    public ApiResponse(T data) {
        this.data = data;
    }

    public ApiResponse(List<MessageModel> messageList) {
        this.messageList = messageList;
    }

}
