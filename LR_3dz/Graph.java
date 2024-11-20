package LR_3dz;

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.List;

@Data
@XmlRootElement(name = "graph")
@XmlAccessorType(XmlAccessType.FIELD)
public class Graph {
    @XmlElementWrapper(name = "nodes")
    @XmlElement(name = "node")
    private List<Node> nodes;

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Node {
        @XmlAttribute
        private String id;

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
    }
}