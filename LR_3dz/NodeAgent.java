package LR_3dz;

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.List;

@Data
@XmlRootElement(name = "nodeAgent")
@XmlAccessorType(XmlAccessType.FIELD)
public class NodeAgent {
    @XmlAttribute
    private String id;

    @XmlAttribute
    private boolean isInitiator;

    @XmlElement(name = "targetAgent")
    private String targetAgentId;

    @XmlElementWrapper(name = "neighbors")
    @XmlElement(name = "neighbor")
    private List<Neighbor> neighbors;

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Neighbor {
        @XmlAttribute
        private String id;

        @XmlAttribute
        private int weight;
    }

    public void initiateSearch() {
        if (isInitiator) {
            System.out.println("Initiating search for agent " + targetAgentId);
            // Отправка сообщений соседям
            for (Neighbor neighbor : neighbors) {
                sendSearchMessage(neighbor.getId(), targetAgentId, 0);
            }
        }
    }

    private void sendSearchMessage(String neighborId, String targetAgentId, int currentWeight) {
        // Логика отправки сообщения соседу
        System.out.println("Sending search message to " + neighborId + " with current weight " + currentWeight);
    }

    public void processSearchRequest(String senderId, String targetAgentId, int currentWeight) {
        System.out.println("Processing search request from " + senderId + " for agent " + targetAgentId);
        // Проверка, является ли текущий агент искомым
        if (this.id.equals(targetAgentId)) {
            System.out.println("Target agent found! Sending back to initiator.");
            // Отправка обратно сообщения об успешном нахождении
            sendBackMessage(senderId, currentWeight);
        } else {
            // Передача сообщения дальше
            for (Neighbor neighbor : neighbors) {
                if (!neighbor.getId().equals(senderId)) {
                    sendSearchMessage(neighbor.getId(), targetAgentId, currentWeight + neighbor.getWeight());
                }
            }
        }
    }

    private void sendBackMessage(String senderId, int currentWeight) {
        // Логика отправки сообщения обратно инициатору
        System.out.println("Sending back message to " + senderId + " with total weight " + currentWeight);
    }

    public void processBackMessage(String senderId, int totalWeight) {
        System.out.println("Processing back message from " + senderId + " with total weight " + totalWeight);
        // Логика обработки сообщения об успешном нахождении
        System.out.println("Path found with total weight: " + totalWeight);
    }
}